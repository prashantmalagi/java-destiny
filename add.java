import java.util.*;

public class add{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add: ");

        int n = sc.nextInt();
        System.out.print("Enter the elements: ");

        for(int i = 1; i <= n; i++){
            sum += sc.nextInt();
        }
        System.out.println("The sum of the elements is: " + sum);
    }
}