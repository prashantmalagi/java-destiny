class Car {
    void start() {
        System.out.println("Car is starting.");
    }
}

class BMW extends Car {
    void luxury() {
        System.out.println("BMW is a luxury car.");
    }
}

class Audi extends Car {
    void speed() {
        System.out.println("Audi is a fast car.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.start();
        b.luxury();

        Audi a = new Audi();
        a.start();
        a.speed();
    }
