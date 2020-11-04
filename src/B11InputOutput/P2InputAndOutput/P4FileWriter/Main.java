package B11InputOutput.P2InputAndOutput.P4FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileWriter fileWriter = null;


        try {
            fileWriter = new FileWriter("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P4FileWriter\\file.txt" ,true);


            fileWriter.write("Enver Çelik\n");
            fileWriter.write("Fırat Çelik\n");



        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }



        FileReader fileReader = null;

        try {

            fileReader = new FileReader("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P4FileWriter\\file.txt");

            Scanner reader = new Scanner(fileReader);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }


    }







}

/*

FileInputStream ile FileOutputStream verileri dönüştürüp okuma-yazma yaptıkları için bazen (mesela txt dosyalarında) bunları
kullanmak mantıklı olmaz.
Örneğin mp4 verileri byte olarak tutulduğundan bu durumda FileInputStream-FileOutputStream kullanmak mantıklıdır.

FileWriter-FileReader ise dönüştürme yapmadan okuma-yazma yapmak için kullanılır. (txt uzantılı dosyalar için kullanışlıdır)

*FileReader ile bir satır okumak için herhangi bir method bulunmaz.Verileri byte byte okuyabliriz (sanırsam). Veya
 FileReader nesnemizi bir Scanner nesnesine parametre olarak göndererek satır satır dosya okuyabiliriz
 *System.in --> consoldan okur   FileReader --> dosyadan okur



*/