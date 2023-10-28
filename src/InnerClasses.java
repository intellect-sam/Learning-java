class OuterClass {
    int x = 10;

    // static class InnerClass {
    //     int y = 5;
    // }

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
        // OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        // System.out.println(myInner.y + myOuter.x);
    }
}
