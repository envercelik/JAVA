package B3Inheritance.P12Details2;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Cat("Tom");  //implicit

       // Cat cat =  animal; //hata : compiler time da java animal ın bir kedi oldoğunu bilmiyor
        //çözüm :
        Cat cat = (Cat) animal; //explicit : Javaya animal ın bir kedi nesnesi olduğunu soyledik (downcasting)




        Animal animal2 = new Bird("Tweety");
        //animal2.fly();  Hata java : java animal2 nin bir kuş nesnesi olduğuna runtime da karar verdiğinden
                                       //suan bilmiyor. Bu nedenle fly methodunu tanımıyor
        //çözüm:
        ((Bird)animal2).fly(); //javaya abi bu bird kesin yani dedik (downcasting)


        Cat cat1 = new Cat("tom");
        Bird bird = new Bird("tweety");

        speak(bird);
        speak(cat1);

        eat(bird);
        eat(cat1);

    }

    //polymorphism olmasa bu şekilde tanımlamak zorunda kalırdık.
    //Bunun yerine sayHello methodu animal classinda tanımlanıp alt classlara override edilebilir.

    public static void speak(Object animal) {

        if (animal instanceof Cat) {

            Cat cat = (Cat) animal;
            cat.sayHello();
            // or -->  ((Cat) animal).sayHello();

        } else if (animal instanceof Bird)
        {
            ((Bird) animal).sayHello();
        }
    }

    //polymorphism ile : eat methodu üst sınıfta tanımlanıp override edildi.
    public static void eat(Animal animal) {
        animal.eat();
    }

}

class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

}



class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void fly () {
        System.out.println("Bird is flying");
    }


    public void sayHello () {
        System.out.println("Bird say hello");
    }

    @Override
    public void eat() {
        System.out.println("bird eats");
    }
}


class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void sayHello () {
        System.out.println("Cat say hello");
    }

    @Override
    public void eat() {
        System.out.println("cat eats");
    }
}


/*

Early binding : Static veya final methodlar override edilemezler. Örneğin üst sınıfta yazılan static bir method
                alt sınıfta aynı şekil tanımlansa bile java üst class a ait olan methodu çalıştırır. Javanın hangi
                methodu çalıştıracağı compiler time da belli olduğundan bu duruma early binding (erken bağlama) denir.


Late binding : Üst class referansına alt classlardan bir nesne atandığında java compiler time da bunun hangi nesne
                olduğunu bilmez. Hangi nesne olduğuna runtime da karar verir.
                Bu duruma late(dynamic) binding denir.

*/