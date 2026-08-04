
import java.util.Scanner;



/*public class accesselmarray {
    int myNumbers[] = {10, 20, 30, 40, 50};
    public static void main(String[] args) {
        accesselmarray myObj = new accesselmarray();
        System.out.println(myObj.myNumbers[2]);
    }
}
*/
/* public class accesselmarray {
    int nums[] = {10,20,30};
    public static void main(String[] args) {
        accesselmarray myObj = new accesselmarray();
        System.out.println(Arrays.toString(myObj.nums));
    System.out.println(myObj.nums[1]);
        for(int num :myObj.nums){
            System.out.print(num);
        }
    }
    } */
/* public class multidimention {
    public static void main(String[] args) {
        int num[][] = {{25,50,75,100},{125,150,175,200}};
        for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                System.out.println(num[i][j]);
            }
        }
    }
}  */
/* public class Array {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 2},
            {3, 6, 8},
            {1, 2, 3},
            {3, 2, 1}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
} */
 
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size[] = new int[n];

        for(int i=0;i<n;i++){
            size[i] = sc.nextInt();
        }

        if (isAscending(size)){
            System.out.println("The array is in ascending order.");
        } else {
            System.out.println("The array is not in ascending order.");
        }
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
        