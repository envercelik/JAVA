package B3Inheritance.P1Inheritance1;


public class Main {

    public static void main(String[] args) {



    }


}


/*

Inheritance :

-Ortak özellik ve methodların üst sınıfda toplanıp alt sınıflarca kullanılmasıdır.
 Bir alt class üst class in sahip olduğu tüm özellik ve methodlara sahiptir.
 Basitçe bir ana iskelet class berleyip bu classtan yeni classlar türetip özeleştirmektir.

- Örneğin musteri bir kişidir. Aynı zamanda çalışan da bir kişidir. Bu iki class ana class olan kişi
  classindan türetilebilir. Çünkü musteri ve çalışanin bir çok ortak özellik ve methodu  vardır.
  örneğin isim,soyisim,kimlik no , telefon no ...  gibi. Bu özellikler bir üst sınıfta toplanarak kod tekrarının
  önüne geçilmiş olur.

-Inheritance nin en önemli özelliği üst sınıfın referansının alt sınıf referanslarını tutabilmesidir (polymorphism)

-Diğer önemli özelliği ise üst sınıfın istenen metodunun alt sınıfta tekrar yazılarak özelleştirilmesidir. (override)
 *eğer bir methodun override edilmesini istemiyorsak onu final anahtar kelimesi ile tanımlamak zorundayız.



Ayrıntılar :

-Java da her class deafult olarak object sınıfının bir alt sınıfıdır.

- super   : üst sınıfa ait method veya değişkenlere erişmek/çağırmak için kullanılır.

- super() : üst sınıfa ait contructor ı çağırmak için kullanılır.
  *alt sınıf üst sınıfa ait constructori çağırmak zorundadır.


-Java da her sınıf default olarak Object sınıfından extend edilmiştir. Bir sınıf oluştruduğumuzda o sınıfa hiçbir
 özellik veya metod yazmasak dahi Object sınıfından gelen bazı özellik ve metodlara sahiptir.

-Bir method super anahtar kelimesi ile çağrılırsa kesinlikle üst class a ait olan method çağrılır. Eğer super
 anahtar kelimesi ile çağrılmassa java önce alt class a bakar method override edilmiş mi ? Eğer override edilmişse
 çalıştırır. Eğer edilmemişse üst classa bakar.

-Bir class sadece bir classi extend edebilir.

-Static veya final methodlar override edilemezler. Java bu durumda doğrudan süper class taki methodu çalıştırır.
 Hangi methodu çalıştıracağı compiler time da belli olduğundan bu olaya early binding denir.


- Static ve final olmayan methodlar override edilebilirler. Java hangi methodu çağıracağını alt sınıftan
  üst sınıfa doğru arar.Java hangi methodu çalıştıracağına runtime da karar verdiğinden bu olaya late binding denir.


Tavsiyeler  :

-Nesne tabanlı programlamanın en önemli özelliği değişime direnmeyen programlar yazmaktır. Yani mevcut yapıyı bozmadan
programa yeni özellikler eklenebilmelidir. (sustainability - sürdürülebilirlik)

-Birbirinin alternatifi durumlarda if-else kullanılmamalıdır. (spagetti code)


*/