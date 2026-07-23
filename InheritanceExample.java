class Teacher {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

class Student extends Teacher {
    void study() {
        System.out.println("Student is studying.");
    }
}

public class InheritanceExample {
    public static void main(java.lang.String[] args) {
        Student s = new Student();

        s.teach();  
        s.study();  
    }
}
