package state;

import project.Work;

public class ProgressingState implements State {
    Work p;
    public ProgressingState(Work p) {
        this.p = p;
    }

    @Override
    public void startProject() {
        System.out.println("Error, project already progressing.");
    }

    @Override
    public void verifiedAndFinish() {
        p.setState(p.getFinishedState());
    }

    @Override
    public void verifiedAndRework() {
        p.setState(p.getReworkingState());
    }
}
