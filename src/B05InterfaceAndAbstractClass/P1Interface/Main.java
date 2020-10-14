package B05InterfaceAndAbstractClass.P1Interface;

public class Main {


}

/*
interface :

- interface kendini implemente eden sınıflara bir arayüz sunan classlara benzeyen abstract (soyut) bir yapıdır.
  İçerisinde gövdesi olmayan methodlar bulunur ve interfaceyi implemente eden sınıflar bu metdodları override
  edip kendine özel yazmak zorundadır. Bir nevi bir çatı veya sözleşme görevi görür. Başka bir bakış açısıyla
  bir class bir interfaceyi implemente ediyorsa ben bu interfacenin kurallarına uyuyorum ben sendenim olmasını
  istediğin yeteneklere sahibim der.

- interfacelerde classlarda olduğu gibi polimorphism bulunur.

-Bir class birden fazla interfaceyi implemente edebilir.

-interfacelerden  nesne oluşturulamaz ama alt sınıflarının nesnelerinin referansı olabilir. Dikkat edilmesi gereken
 nokta alt sınıf kendine özel bir method tanımlamışsa interface referansı bu methodu çağıramaz. (typecasting gerekir.)

-interfacelerde sadece final - static değişkenler tanımlanabilir.

-interfaceler varsayılan olarak abstractır.Mehodlar ise varsayılan olarak abstract ve publictir.


-Eğer sub classlar aynı türde ama ortak özellikleri azsa veya çok farklılaşmışsa inheritance yapısı yerine interface
 yapısı tercih edilebilir.

-Eğer bir classa birden fazla implementasyon yapmak istoyorsak interface tercih edilir. Çünkü java da çoklu kalıtıma
 izin verilmez.

-interfacelere default anahtar kelimesi ile gövdeli method tanımlanabilir. Default methodlar override edilmek zorunda
 değildir. (java 8 ve sonrası)

 -interfacelerde gövdeli static methodlar bulunabilir (java 8 ve sonrası)

-interfaceler içerisinde static veya initialize bloklar tanımlanamaz.

-bir interface başka bir interfaceden kalıtılabilir.


 */