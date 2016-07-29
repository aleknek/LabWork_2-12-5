
public class Main {

    public static void main(String[] args) {

        MyTestClass myTestClass = new MyTestClass();
        myTestClass.test();

        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        myStaticNested.test();

        MyTestClass.MyInner myInner = myTestClass.new MyInner();
        myInner.test();
    }

}
