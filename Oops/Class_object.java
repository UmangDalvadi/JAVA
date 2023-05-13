public class Class_object{
    public static void main(String[] args) {
       Pen p1=new Pen();
        p1.color="blue";
        System.out.println(p1.color);
        p1.setcolor("black");
        System.out.println(p1.color);
        p1.tip=5;
        System.out.println(p1.tip);
        p1.settip(6);
        System.out.println(p1.tip);
       

    }
}

class Pen{
    String color;
    int tip;

    void setcolor(String c)
    {
        color=c;
    }
    void settip(int t)
    {
        tip=t;
    }
}