

public class varargs {

    static int sum(int ...arr){
        int s = 0;
        for (int a :
                arr) {
            s+=a;
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println("sum : "+sum(1,2,3,4,5));
    }
}
