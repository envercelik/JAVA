package B05InterfaceAndAbstractClass.P2Examples.Example5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(4,"Enver Çelik");
        Student student2 = new Student(2,"Ahmet Çelik");
        Student student3 = new Student(3,"Zeynep Çelik");
        Student student4 = new Student(1,"Defne Çelik");

        Student[] students = new Student[]{student1 ,student2 , student3 , student4};

        Arrays.sort(students);

        for (Student student:students) {
            System.out.println(student);
        }


    }
}
/*

Student sınıfına Comparable interface sini implemente ederek sıralanabilir özelliği kattık.

*Arrays.sort() methodu Student sınıfındaki compareTo methodunu otomatik olarak çağırır.

*/