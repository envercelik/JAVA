package B03Inheritance.P2Example1;

//sub class
public class Customer extends Person {

    private String email;

    public Customer(String id, String nameSurname, String phoneNumber, String email) {
        super(id, nameSurname, phoneNumber);
        this.email = email;
    }



    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Email : " + email);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
