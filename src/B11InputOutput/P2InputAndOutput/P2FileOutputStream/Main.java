package B11InputOutput.P2InputAndOutput.P2FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P2FileOutputStream\\file.txt" ,true);

            fileOutputStream.write(69);
            fileOutputStream.write(110);
            fileOutputStream.write(118);
            fileOutputStream.write(101);
            fileOutputStream.write(114);

            byte[] myName = {69,110,118,101,114};



            fileOutputStream.write(myName);






        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {

                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }

            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }



    }
}

/*

FileOutputStream --> default olarak dosyayı üzerine yazma modunda açar. (true paratresi geçersek sona ekleme yapar.)

-verileri byte olarak okur yazar.

*/