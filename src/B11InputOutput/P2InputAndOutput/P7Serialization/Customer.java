package B11InputOutput.P2InputAndOutput.P7Serialization;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 10000;
    private String name;


    public Customer(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Customer name : " + this.name;
    }




}
