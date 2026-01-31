class Animal {
    Animal() {
        System.out.println("Hello from Animal");
    }
}
class Dog extends Animal {
    Dog() {
        super(); 
        System.out.println("Hello from Dog");
    }
    void sound() {
        System.out.println("Hii");
    }
}
public class code5 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();
    }
}