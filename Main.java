

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
public class Main {
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
}