public class deepcopy_const {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Umang";
        s1.age = 19;
        s1.marks[0] = 98;
        s1.marks[1] = 87;
        s1.marks[2] = 84;

        Student s2 = new Student(s1);
        s2.name = "Vikash";
        System.out.println(s2.name + " " + s2.age);
        // s1.marks[1]=5555;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);

        }
    }
}

class Student {
    String name;
    int age;
    int marks[];

    Student() {
        marks = new int[3];
    }

    Student(Student s) {
        marks = new int[3];
        this.age = s.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}