package B12Concurrency.P1Concurrency;

public class Main {
}

/*
Multitasking :

-Birden fazla prosses in aynı anda çalıştırılmasıdır. (örneğin spotify ve chrome tarayıcının aynı anda çalışması)

*Bellekte her prosses e fakli bellek alanı (heap) ayrılır . Ve prosesler birbirinin bellek alanına erişemezler.


Multithreading :

-Bir proses içerisinde birden fazla ünitenin (thread) aynı anda çalıştırılmasıdır. Proses içinde prosesler gibi düşünülebilir.
 Örneğin spotify da şarkı dinlerken aynı anda listeye şarkı eklenebilir.

-Bu şekilde birden fazla thread in aynı anda çalıştırılmasına concurrency (eş zamanlılık) denir.

*Her java programı bir prosestir ve en az bir thread e sahiptir. (main thread otomatik oluşturulur.)

*Bir proses içerisindeki thread ler birbirinin bellek alanına erişebilirler. Ayrıca her threadin kendine özel bir thread
 stack i bulunur.

*Threadlerin çalıştırılma sırası tamamen jvm ve işletim sistemine bağlıdır. (kafalarına göre takılıyorlar)


Not : Aslında aynı anda çalışma diye birşey yoktur. İşlemci işlemler arasında çok hızlı bir şekilde geçiş yapar.
      Biz aynı anda çalışıyormuş gibi algılarız. (işte bunlar hep algı operasyonu :))





 */

