package B11InputOutput.P2InputAndOutput.P7Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P7Serialization\\customer.bin";

        Customer customer1 = new Customer("Enver Çelik");


        objectSerialize(customer1,path);

        Customer customer2 = (Customer) objectDeserialize(path);
        System.out.println(customer2);






    }

    public static void objectSerialize(Customer customer , String path) {



        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {

            objectOutputStream.writeObject(customer);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static Object objectDeserialize(String path) {

        Object object = null;

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {

            object = objectInputStream.readObject();



        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }

}




/*

-Serialization bir API dir.

-Bir java nesnesini bir byte dizisine dönüştürür. (serialization)

-Bir byte dizisine dönüştürülmüş nesneyi eski haline çevirir. (deserialization)

-Bu sayede bir java nesnesini bir dosyaya yazabilir - veya bir dosyadan okuyabiliriz.

*Bir objenin serileştirilebilmesi için Serializable interfacesini implemente etmesi gerekir.

Bir nesneyi serileştirmek için ObjectOutputStream kullanılır.


Pojenin ilerde paket olmamasını istiyorsak class imiza bir serialVersionUID atamamız gerekir. Eğer class güncellenirse
verison da değiştirilir.
Verison atamassak ne olur ? Örneğin bir nesneyi serileştirdik diyelim daha sonra classi güncelleyip nesneyi
tekrardan dosyadan okuyalım. Bu classin referansına  deserilization ettiğimiz bu nesneyi atayamayız çünkü
artık bu sınıfın örnekleri faklı.
Bu nedenle bir sınıfa serialVersionUID atanır ve java bu sayede bir classin değiştiğini anlar.





*/