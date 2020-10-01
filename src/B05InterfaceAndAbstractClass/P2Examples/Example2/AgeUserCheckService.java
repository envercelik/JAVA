package B05InterfaceAndAbstractClass.P2Examples.Example2;

public class AgeUserCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {

        if (user.getAge() >= 18) {
            System.out.println("age valid");
            return true;
        }

        return false;
    }
}
