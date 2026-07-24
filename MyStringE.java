public class MyStringE {
    public static void main(String[] args) {
        MyString a = new MyString();
        String str = "Hello, World!";
        System.out.println(" String: " + str);
        System.out.println(" String length: " + str.length());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("INDEX OF ' ' : " + str.indexOf(' '));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        
    }
}