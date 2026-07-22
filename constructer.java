class Student {
    java.lang.String name;
    int age;
    java.lang.String gender;
    double marks;

    Student(java.lang.String name, int age, java.lang.String gender, double marks) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }
    public Student() {
    }
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Marks  : " + marks);
    }
    public static void main(java.lang.String[] args) {
        Student s1 = new Student("prashanth", 20, "Male", 96.5);
        Student s2 = new Student("abc", 19, "Female", 92.0);
        s1.display();
        System.out.println();
        s2.display();
    }
}
