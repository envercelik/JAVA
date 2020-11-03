package B11InputOutput.P2InputAndOutput.P1InputOutput;

public class Main {
    public static void main(String[] args) {




    }
}

/*
Java I/O : Veri okumak-yazmak için kullanılan bir java API dir. (Application Programming Interface).
*içerisinde veri okumak-yazmak için kullanışlı bir çok sınıf bulunur.


-input-output işlemlerini hızlandırmak için streamler kullanılır. (verileri 1-0 a dönüştürür)
 *System.out,System.err,System.in  javanın hazır streamleridir.

-System.out  içerisinde file,console,socket... e verileri 1-0 olarak yazan bir çok hazır sınıf bulunduran
 abstract bir classtir.

-System.in aynı mantıkla veri okuyan abstract classtir.

 *System.out.println()   System.out stream ini kullanırken Scanner ise System.in stream ini kullanır.

Yapı :

 (abstract)       (somut)
-InputStream ---> FileInputStream
             ---> ByteArrayInputStream
             ---> PipedInputStream
             ---> ObjectInputStream
             ---> FilterInputStream ----> DataInputStream
                                    ----> BufferedInputStream
                                    ----> PushBackInputStream

*Genel olarak aynı işi yapsalar bile farkli özelliklere sahiptirler.


OutputStream ---> FileOutputStream
             ---> ByteArrayOutputStream
             ---> PipedOutputStream
             ---> ObjectOutputStream
             ---> FilterOutputStream ----> DataOutputStream
                                     ----> BufferedOutputStream
                                     ----> PrintStream






*/