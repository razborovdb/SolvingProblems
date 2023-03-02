package training2.array.codestudio;

public class SimpleTest {

    int n = 10;
    static {
        int n = 5;
        System.out.println(n);
    }
    public static void main(String[] args) {
        SimpleTest t = new SimpleTest();
        System.out.println(t.n);




    }

    static {
        int n = 20;
        System.out.println(n);
    }
}
