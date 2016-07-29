
public class MyTestClass {

    public static class MyStaticNested {
        public void test() {
            System.out.println("This is nested class");
        }
    }

    public class MyInner {
        public void test() {
            System.out.println("This is inner class");
        }
    }

    class MyLocal {
        void test() {
            System.out.println("This is local class");
        }
    }

    public void test() {
        new MyLocal().test();
    }
}
