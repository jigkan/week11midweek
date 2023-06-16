public class PracticeTest {

    public static void m(String name){

        System.out.println("method1 =" + name);
    }
    public static void m(int a){
        System.out.println("method2 =" + a);
    }

    public static void main(String[] args) {
        m(10);
        m("jignesh");
    }
}
