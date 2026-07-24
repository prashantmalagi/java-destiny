class Animal {

    void move() {
        System.out.println("Animal is moving.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    @Override 
    void move() {
        // move method from Base class is overridden in this method
        System.out.println("Dog is running.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();  // Calls Dog's overridden version -> "Dog is running."
        d.eat();   // Inherited from Animal -> "Animal is eating."
        d.bark();  // Dog's own method -> "Dog is barking."
    }
}
