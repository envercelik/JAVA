package B05InterfaceAndAbstractClass.P2Examples.Example2;

public class Main {

    public static void main(String[] args) {

        User user = new User(1 ,40 , "Enver");

        //SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
        signUpManager.signUp(user);


    }

}
