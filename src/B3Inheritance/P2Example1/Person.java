package B3Inheritance.P2Example1;

//super class
public class Person {

    private String id;
    private String nameSurname;
    private String phoneNumber;

    public Person(String id, String nameSurname, String phoneNumber) {
        this.id = id;
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
    }



    public void showInformation() {
        System.out.println("Name Surname : " + nameSurname);
        System.out.println("Phone number : " + phoneNumber);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
