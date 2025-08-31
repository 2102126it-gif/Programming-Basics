package programs.oops;

class MethodCalls{
    int x=123;
    void m1(int a){
        System.out.println("m1 - begin");
        m2(a+10);
        System.out.println("m1 - end");
    }
    void m2(int b){
        System.out.println("m2 - begin");
        m3(b+10);
        System.out.println("m2 - end");
    }
    void m3(int c){
        System.out.println("m3 - begni");
        System.out.println("m3 -" + c);
        System.out.println("m3 - end");
    }
}

public class Method_call_Stack {
    public static void main(String as[]){
        MethodCalls m =new MethodCalls();
        m.m1(10);
        int p=99;
        System.out.println("p : " + p);
        System.out.println("main - end");
    }
}
// JVM => main => m1 => m2 => m3 => m2 => m1 => main => JVM