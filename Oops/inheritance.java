public class inheritance {
    public static void main(String[] args) {
        fish f=new fish();
        f.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("I can eat");
    }
    void breath(){
        System.out.println("I can breath");
    }
}

class fish extends Animals{
    
}
