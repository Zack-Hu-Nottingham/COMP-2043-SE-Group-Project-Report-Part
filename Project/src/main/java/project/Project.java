package project;

public class Project extends Work {
    Template t;

    public Project(String name) {
        super(name);
    }

    public void chooseTemplate(Template t) {
        this.t = t;
    }


}
