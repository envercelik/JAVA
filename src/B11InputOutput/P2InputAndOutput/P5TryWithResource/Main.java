package B11InputOutput.P2InputAndOutput.P5TryWithResource;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P5TryWithResource\\file.txt")) {

            fileWriter.write("Enver Çelik\n");
            fileWriter.write("Fırat Çelik\n");


        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}


/*

- Dosya kapatma işlemini otomatik hale getirir. Bu sayede try-cath bloğuna ayrıca finally bloğu yazmak zorunda kalmayız.
  Ve daha okunaklı bir kodumuz olur.

-Bu yapıyı kulllanbilmek için dosya okuma-yazma yapan sınıfın Closeable interfacesini implemente etmesi gerekir.

*FileWriter bu sınıfı implemente eder.

*/