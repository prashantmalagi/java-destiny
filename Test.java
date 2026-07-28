import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            System.out.print("Enter the color of the circle: ");
            String color = scanner.next();

            Shape s1 = new Circle(color, radius);

            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            System.out.print("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();

            System.out.print("Enter the color of the rectangle: ");
            String rectColor = scanner.next();

            Shape s2 = new Rectangle(rectColor, width, height);

            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }
    }
}
