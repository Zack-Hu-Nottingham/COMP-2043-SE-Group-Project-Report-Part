package user;

public abstract class User {
    private String name;


    private String phoneNum;
    private String email;

    private String accountType = null;
    int accessLevel = -1;

    User(String name, int accessLevel) {
        this.name = name;
        if (accessLevel == 0) {
            accountType = "Admin";
        } else if (accessLevel == 1) {
            accountType = "Manager";
        } else if (accessLevel == 2) {
            accountType = "HouseOwner";
        } else if (accessLevel == 3) {
            accountType = "Worker";
        } else if (accessLevel == 4) {
            accountType = "Material manager";
        } else {
            System.out.println("Unexpected accessLevel");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
