package B05InterfaceAndAbstractClass.P3AbstractClass;

public class Main {
}


/*

Abstract Class


- Base class ta gövdesiz abstract methodlarım olsun. Ve bu classi extend eden classlar bu methodları kendine göre yazmak
  zorunda olsun. Ayrıca base class ta gövdesi olan metodlarım da olsun istiyorsam bingo abstract class lazım.

- Kalıtım hiyerarşisinde alt sınıftan üst sınıflara gidildikçe daha genel ve soyut yapıya doğru gidilir.
  Abstract classlar ile bir yapı ve düzen kurulur.

-Abstract classlardan nesne üretilmez.
Canlı -> Hayvan -> Köpek  hiyerarşisinde Canlı sınıfından bir nesne üretmek anlamsızdır. Canlı ama hangi canlı ?
                           bitki mi ? hayvan mı ?
Bir nesne üretemesek dahi yerine göre üst sınıfları abstract tanımlamak mantıklıdır. Hem polymorphic yapıdan
faydalanır hem ortak alanları üst bir sınıfta toplar ve alt sınıfları bu alanları oluşturmaya zorlarız.
(Bu sayede daha düzenli ve kontrollü bir yapı kurmuş oluruz.)

-Abstract classlar genelden özele bir yapı kurmamıza olanak tanır.

Ayrıntılar :

- Bir class da abstract metdolarımız olması için sınıfın abstract tanımlanması gerekir.

-static ve final olmayan özellikler eklenebilir.

-Gövdesi olan metodlar tanımlanabilir.

-alt classlar base classin contructorını yazmak zorundadır.

-abstract class lar interfaceler gibi implement edilmez extend edilirler.(sadece 1 abstract class extend edilebilir)

-Bir methodu yazdığımızda içeriğini yazamıyorsak o method abstract olmalı ve sınıfıda abstract yapmalıyız.

-interface ile abstract class arasındaki önemli farklardan biri interfaclerin birbirinden bağımsız
 sınıflara implemente edilmesidir. Abstract class da ise sınıflar arasında bir ortaklık söz konusu olmalıdır.

-Interface ve abstract classların genel amacı yeni isteklere karşılık verebilen zorluk çıkarmadan genişleyebilen
 yapı kurmaktır.



*/
