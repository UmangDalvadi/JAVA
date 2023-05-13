public class Abstract {
    public static void main(String[] args) {
        // Animals a=new Animals();
        horse h=new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        penguin p=new penguin();
        p.eat();
        p.walk();
        p.color="white";
        System.out.println(p.color);
    }
}

abstract class Animals{
    String color;

    Animals(){
        color="brown";
    }

    void eat()
    {
        System.out.println("i can eat");
    }

    abstract void walk();

}

class horse extends Animals{

    void walk()
    {
        System.out.println("I have 4 legs");
    }
    
}

class penguin extends Animals{
    void walk()
    {
        System.out.println("I have two legs");
    }
}