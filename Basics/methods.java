
public class methods {

    static int logic(int a,int b){
        return a+b;
    }
    int logic1(int a,int b){
        return a+b;
    }
    public static void main(String[] args)
    {
        int a=5;
        int b=6;

        System.out.println(logic(a,b));

        methods lc=new methods();
        System.out.println(lc.logic1(a,b));
    }
}
