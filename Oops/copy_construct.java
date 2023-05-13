public class copy_construct {
    public static void main(String[] args) {
        Student s1=new Student();

        Student s2=new Student("Umang");
        System.out.println(s2.name);
        
        Student s3=new Student(19);
        System.out.println(s3.age);

        Student s4=new Student("umang",19,97.69f);
        System.out.println(s4.name+" "+s4.age+" "+s4.pr);

        Student s5=new Student(s4);
        s5.name="Vikash";
        System.out.println(s5.name+" "+s5.age+" "+s5.pr);

    }
}

class Student{

    String name;
    int age;
    float pr;

    Student(Student s)
    {
        this.age=s.age;
        this.pr=s.pr;
    }

    Student()
    {
        System.out.println("constructor!!");
    }

    Student(String name)
    {
        this.name=name;
    }

    Student(int age)
    {
        this.age=age;
    }

    Student(String name,int age,float pr)
    {
        this.name=name;
        this.age=age;
        this.pr=pr;
    }
}
