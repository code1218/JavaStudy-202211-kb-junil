package j14_스태틱.내부클래스;

public class Main {
    public void test() {}


    public static void main(String[] args) {
        A.B b = new A().new B("김준일");
        System.out.println(b.getName());
        Main m = new Main();

        m.test();
    }
}
