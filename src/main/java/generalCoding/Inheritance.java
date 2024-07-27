package generalCoding;

public class Inheritance {

    static class Animal{
        String color;
    }

     static class Cat extends Animal{
        void meow(){
            System.out.println("Meow Meow");
        }
    }
}
