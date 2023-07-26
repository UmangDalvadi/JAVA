public class summer2023 {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.max(12, 29));
    }
}

class A {
    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

class B extends A {
    int max(int x, int y) {
        return super.max(y, x) - 10;
    }
}

class C extends B {
    int max(int x, int y) {
        return super.max(x + 10, y + 2);
    }
}
