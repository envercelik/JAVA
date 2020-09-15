package B2Classes.Example3;

public class Customer {

    private int number;
    private String name;
    private String email;
    private String phoneNumber;
    private Account account;


    public Customer(int number, String name, String email, String phoneNumber , Account account) {

        setNumber(number);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setAccount(account);

    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {



        return "Customer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                account.toString() +
                '}';
    }
}
