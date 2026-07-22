/* public class main {

    static void myMethod(java.lang.String fname) {
        System.out.println(fname + " Refsnes");
    }

    public static void Main(java.lang.String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
} */
/* public class main {

    static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        checkLeapYear(2024);
        checkLeapYear(2023);
        checkLeapYear(1900);
        checkLeapYear(2000);
    }
} */
/* public class main {

    static int getSalary(String person) {
        if (person.equals("Owner")) {
            return 100000;
        } else if (person.equals("Manager")) {
            return 60000;
        } else {
            return 30000;
        }
    }

    public static void main(String[] args) {

        System.out.println("Owner Salary: " + getSalary("Owner"));
        System.out.println("Manager Salary: " + getSalary("Manager"));
        System.out.println("Employee Salary: " + getSalary("Employee"));
    }
} */
/* public class main {

    static void display() {
        System.out.println("No parameters");
    }

    static void display(String name) {
        System.out.println("Name: " + name);
    }

    static void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        display();
        display("prashanth");
        display("prashanth", 21);
    }
} */

import java.util.HashSet;

public class RemoveDuplicate {

    public static java.lang.String removeDuplicates(java.lang.String str) {

        HashSet<Character> set = new HashSet<>();
        java.lang.StringBuffer sb = new java.lang.StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(java.lang.String[] args) {

        java.lang.String str = "java to java";

        System.out.println("Original String : " + str);
        System.out.println("After Removing Duplicates : " + removeDuplicates(str));
    }
}