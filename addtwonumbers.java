import java.util.*;
public class addtwonumbers{
    static int sum(int a, int b){
        return a+b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        int result = sum(x, y);
        System.out.println("The sum of " + x + " and " + y + " is: " + result);
    }
}
    
    
