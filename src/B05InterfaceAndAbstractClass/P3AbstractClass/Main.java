package B05InterfaceAndAbstractClass.P3AbstractClass;

public class Main {
}


/*

Abstract Class


- Base class ta gövdesiz abstract methodlarım olsun. Ve bu classi extend eden classlar bu methodları kendine göre yazmak
  zorunda olsun. Ayrıca base class ta gövdesi olan metodlarım da olsun istiyorsam bingo abstract class lazım.



Ayrıntılar :

- Bir class da abstract metdolarımız olması için sınıfın abstract tanımlanması gerekir.

- Abstract classlardan nesne oluşturulmaz. (nesne oluştururken abstract metdoları override ederek oluşturulabilir ama
  önerilmez.)
  *Şunu düşünmeliyiz. Bir sınıf abstract ise ondan nesne oluşturmaya ihtiyacım olmamalı veya anlamsız olmalı.

-static ve final omayan özellikler eklenebilir.

-Gövdesi olan metodlar tanımlanabilir.

-alt classlar base classin contructorını yazmak zorundadır.

-abstract class lar interfaceler gibi implement edilmez extend edilirler.(sadece 1 abstract class extend edilebilir)

-interface ile abstract class arasındaki önemli farklardan biri interfaclerin birbirinden bağımsız
 sınıflara implemente edilmesidir. Abstract class da ise ortak alanlar olmalı çünkü miras alınıyor. (mantık olarak)



*/
