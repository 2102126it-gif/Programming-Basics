package programs.oops;

interface Inter_1{
    int A=10;
    public final static int b=20;
    void m1();
    public abstract void m2();
    // m1() and m2() are both same , public abstract
}

public class Interface_1 {
    public static void main(String as[]){
        System.out.println(Inter_1.A);
        System.out.println(Inter_1.b);
       //  Inter_1.A =99;  => cannot assign a value to static final variable A
     //   Inter_1.b=88;   => cannot assign a value to static final variable A
    }
}
