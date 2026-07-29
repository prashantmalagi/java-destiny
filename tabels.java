import java.util.*;
public class tabels {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
