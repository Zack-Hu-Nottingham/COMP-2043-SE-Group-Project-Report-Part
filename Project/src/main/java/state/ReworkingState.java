package state;

import project.Work;

public class ReworkingState implements State {
    Work p;
    public ReworkingState(Work p) {
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
        System.out.println("Error, project is reworking.");
    }
}
