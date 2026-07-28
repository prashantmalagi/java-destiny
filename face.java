
interface Shape {
        double calculateArea();
        double calculatePerimeter(); 
    }

    class Circle implements Shape {
        double radius;

        public Circle(String color, double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Rectangle implements Shape {
        double length, width;

        public Rectangle(String rectColor, double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    public class face {
        public static void main(String[] args) {
            Shape circle = new Circle(color, 5);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            Shape rectangle = new Rectangle(rectColor, 4, 6);
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        }
    }