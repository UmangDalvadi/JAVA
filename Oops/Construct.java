public class Construct {
    public static void main(String[] args) {
        
        Student s1=new Student("umang");
        s1.age=19;
        System.out.println(s1.age);
    }
}


class Student{

    String name;

    int age;


    Student(String name)
    {
        this.name=name;

        System.out.println(this.name);
    }
}