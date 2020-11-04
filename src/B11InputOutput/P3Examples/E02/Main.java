package B11InputOutput.P3Examples.E02;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> mp3Datas = new ArrayList<>();

    public static void main(String[] args) {

        readMp3File();
        writeMp3File();
        System.out.println("copying...");



    }

    public static void readMp3File() {

        FileInputStream fileInputStream = null;
        int i=0;


        try {
            fileInputStream = new FileInputStream("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P3Examples\\E02\\ToBlossomBlue.mp3");

            while ((i = fileInputStream.read()) != -1) {
                mp3Datas.add(i);
            }


        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {

                if (fileInputStream != null) {
                    fileInputStream.close();
                }

            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }


    }

    public static void writeMp3File() {
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P3Examples\\E02\\CopiedMp3\\copy.mp3");

            for (int mp3data : mp3Datas) {
                fileOutputStream.write(mp3data);

            }

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


