package B03Inheritance.P11Details1;


public class Main {

    public static void main(String[] args) {

        Person person = new Person("Enver");
        Person person2 = new Person("Engin");

        System.out.println("person hash code : " + person.hashCode());
        System.out.println("person2 hash code :" + person2.hashCode());


        String result = person.toString();
        System.out.println(result);
        System.out.println(person);

        System.out.println(person.equals(person2));
        person2 = person;
        System.out.println(person.equals(person2));






        Customer customer = new Customer("firat");
        Customer customer2 = new Customer("engin");

        System.out.println(customer);
        System.out.println(customer2);

        System.out.println(customer.equals(customer2));

        Customer customer3 = new Customer("enver");
        Customer customer4 = new Customer("enver");

        System.out.println(customer3.equals(customer4));

    }




}



/*

Java da her nesne object sınıfının alt nesnesidir. extends Object yazmasak dahi java ekler.

Object sınıfından gelen  methodlar :

clone  : nesneyi kopyalar.
equals : parametre olarak verilen referansın kendisine eşit olup olmadığını kontrol eder. (aynı nesneyi mi tutuyor)
hashcode : Nesnenin hash kodunu döndürür (nesnenin id si)
toString : print fonksiyonuna nesnenin referansı verildiğinde tostring metodu çalışır.

Object sınıfından gelen methodlar override edilerek daha kullanışlı bir hale getirilebilir.

instance of : Bir nesnenin bir sınıfın örneği olup olmadığını kontrol eder.


*/