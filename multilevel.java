public class multilevel {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();
        child.print();
    }
}

class GrandParent {
    void display() {
        System.out.println("I am GrandParent");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("I am Child");
    }
}
