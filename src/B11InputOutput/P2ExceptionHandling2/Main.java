package B11InputOutput.P2ExceptionHandling2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2ExceptionHandling2\\numbers.txt"));
            String line = null;


            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                reader.close();
            } catch (Exception exception) {

            }

        }

        System.out.println("Total : " + total);

    }
}

/*

Javada bazı kodları try-cath bloğuna almak zorunludur. Bu exception türlerine checked exception denir.
Örneğin dosya açma .

-Tyr cath bloğu içine almak yerine alternatif olarak methodun bir Exception fırlatabileceği
 method bloglar parantezinden hemen önce throws exception_adi ile belirtilebilir. Böylece method çağrıldğı yerde
 try-cath bloğuna alınmak zorunda kalınır.

*/