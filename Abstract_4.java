package programs.oops;

abstract class Abs4{
    int a=10;
    static int b=20;

    {
        System.out.println("I.B");
    }
    static{
        System.out.println("S.B : "+b);
    }
    Abs4(){
        System.out.println("D.C");
    }
    void m1(){
        System.out.println("M1()");
    }
    static void m2(){
        System.out.println("Static m2()");
    }
    abstract void m3();

}

public class Abstract_4 {
    public static void main(String as[]){
        Abs4.m2();
    }
}
