package B11InputOutput.P2InputAndOutput.P3FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P2FileOutputStream\\file.txt");

            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            System.out.println((char) fileInputStream.read());



            while (fileInputStream.read() != -1) {
                System.out.println((char) fileInputStream.read());
            }







        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileInputStream != null) {

                try {
                    fileInputStream.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }





    }
}

/*
Verileri byte olarak okur yazar.

skip()  : istenen sayıda karakteri atlar.

read() : tek karakter okur ve ilerler. Dosyanın sonuna geldiğinde ise -1 döner


*/
