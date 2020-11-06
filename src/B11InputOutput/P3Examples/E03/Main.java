package B11InputOutput.P3Examples.E03;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P3Examples\\E03\\students.bin";

        Student[] studentArray = {new Student("Enver Çelik"), new Student("Fırat Çelik"), new Student("Defne Çelik")};

        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(studentArray));


        //Writing

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {

            out.writeObject(studentArray);
            out.writeObject(studentArrayList);

        } catch (IOException e) {
            e.printStackTrace();
        }



        //Reading and Writing Console


        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))){
            //yazıldığı sırada okunmalıdır.
            Student[] studentArray2 = (Student[]) in.readObject();
            ArrayList<Student> studentArrayList2 = (ArrayList<Student>) in.readObject();



            //writing console

            for (Student student: studentArray2) {
                System.out.println(student);
            }

            System.out.println("--------------------------------------");

            for (Student student : studentArrayList2) {

                System.out.println(student);
            }







        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }







    }

}
/*
Array sınıfı ve ArrayList sınıfı Serializable interfacesini implemente ettiklerinden serileştirlebilirler.



*/
