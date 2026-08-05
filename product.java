import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 1;
        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum *= arr[i];
        }
        System.out.println("The product of the array is: " + sum);
        
    }
    
    
}
