class Student {
    String name;
    int age;

    // Constructor 1 - no parameters
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2 - one parameter
    Student(String n) {
        name = n;
        age = 18; // default age
    }

    // Constructor 3 - two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Riya");
        Student s3 = new Student("Amit", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
