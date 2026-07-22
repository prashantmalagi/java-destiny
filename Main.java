public class Main {

    float x;

    public Main(float x) {
        this.x = x;   
    }

    public static void main(String[] args) {

        Main myObj = new Main(5.75f);

        System.out.println("Value of x = " + myObj.x);
    }
}