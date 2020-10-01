package B05InterfaceAndAbstractClass.P2Examples.Example2;

public class SignUpManager {

    IUserCheckService checkService;

    public SignUpManager(IUserCheckService checkService) {
        this.checkService = checkService;
    }

    public void signUp(User user) {

        if (checkService.checkUser(user)) {
            System.out.println("new user created : " + user.getName());
        } else {
            System.out.println("error");
        }


    }

}
