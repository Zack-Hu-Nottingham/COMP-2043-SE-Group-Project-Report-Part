package state;

public interface State {
    void startProject();
    void verifiedAndFinish();
    void verifiedAndRework();
}
