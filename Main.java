/* public class Main {

    float x;

    public Main(float x) {
        this.x = x;   
    }

    public static void main(String[] args) {

        Main myObj = new Main(5.75f);

        System.out.println("Value of x = " + myObj.x);
    }
} */
/* class Main {
    public static void main(String[] args) {
        GetSet obj = new GetSet(); // Object banaya
        
        obj.setName("Good Morning "); // Setter se value set ki
        System.out.println(obj.getName()); // Getter se value print ki
    }
} */

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("a is equal to b");
        } else if(a > b){
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
    }
}
