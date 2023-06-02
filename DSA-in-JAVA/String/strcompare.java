public class strcompare {
    public static void main(String[] args) {
        String s1 = "umang";
        String s2 = "umang";
        String s3 = new String("umang");

        if (s1 == s2) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
        if (s1.equals(s3)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

    }
}
