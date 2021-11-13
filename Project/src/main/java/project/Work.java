package project;

import state.*;
import user.CompanyUser;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Work {
    String name;
    String description;
    ArrayList<CompanyUser> participantList = new ArrayList<CompanyUser>();
    CompanyUser personInCharge;

    public Work(String name) {
        this.name = name;

        notStartedState = new NotStartedState(this);
        progressingState = new ProgressingState(this);
        reworkingState = new ReworkingState(this);
        finishedState = new FinishedState(this);
        state = notStartedState;
    }

    public void addMember(CompanyUser u) {
        participantList.add(u);
    }
    public void deleteMember(CompanyUser u) { participantList.remove(u); }
    public void setPersonInCharge(CompanyUser personInCharge) {
        this.personInCharge = personInCharge;
    }
    public void modifyDescription(String description) { this.description = description; }


    Calendar startTime, endTime;

    public void setStartTime(int year, int month, int day) {
        startTime.set(year, month, day);
    }
    public void setEndTime(int year, int month, int day) {
        endTime.set(year, month, day);
    }


    State state;
    State notStartedState;
    State progressingState;
    State reworkingState;
    State finishedState;


    public State getProgressingState() {
        return progressingState;
    }
    public State getReworkingState() {
        return reworkingState;
    }
    public State getFinishedState() {
        return finishedState;
    }


    public void start() {
        state.startProject();
    }
    public void verifyAndRework() { state.verifiedAndRework(); }
    public void verifyAndFinish() {
        state.verifiedAndFinish();
    }

    public void setState(State state) {
        this.state = state;
    }


}
