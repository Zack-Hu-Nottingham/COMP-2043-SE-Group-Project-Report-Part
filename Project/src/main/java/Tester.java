import project.*;
import user.CompanyUser;

public class Tester {
    public static void main(String[] args) {
        Project homeDecoration = new Project("Zack's home decoration project");
        homeDecoration.modifyDescription("Zack is the owner of the house and Josh is the home decoration project" +
                " manager and he lead a project team");


        CompanyUser worker1 = new CompanyUser();
        homeDecoration.addmember()
//    homeDecoration.modifyDescription("");
    }

}
