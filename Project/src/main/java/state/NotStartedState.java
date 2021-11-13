package state;

import project.Work;

public class NotStartedState implements State {
    Work p;
    public NotStartedState(Work p) {
        this.p = p;
    }

    @Override
    public void startProject() {
        p.setState(p.getProgressingState());
        System.out.println("Project start.");
    }

    @Override
    public void verifiedAndFinish() {
        System.out.println("Error, project not started yet.");
    }

    @Override
    public void verifiedAndRework() {
        System.out.println("Error, project not started yet.");
    }
}
