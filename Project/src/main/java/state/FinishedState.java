package state;

import project.Project;
import project.Work;

public class FinishedState implements State {
    Work p;
    public FinishedState(Work p) {
        this.p = p;
    }

    @Override
    public void startProject() {
        System.out.println("Error, project is finished");
    }

    @Override
    public void verifiedAndFinish() {
        System.out.println("Error, project is finished");
    }

    @Override
    public void verifiedAndRework() {
        System.out.println("Error, project is finished");
    }
}
