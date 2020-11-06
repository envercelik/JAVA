package B11InputOutput.P3Examples.E03;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student  Name :" + this.name;
    }
}
