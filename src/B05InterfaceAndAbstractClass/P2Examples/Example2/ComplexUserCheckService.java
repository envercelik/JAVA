package B05InterfaceAndAbstractClass.P2Examples.Example2;

public class ComplexUserCheckService implements IUserCheckService{


    @Override
    public boolean checkUser(User user) {

        if (user.getAge() >= 18 && user.getName().startsWith("E")) {
            System.out.println("Age valid");
            System.out.println("Name valid");
            return true;
        }

        return false;
    }
}
