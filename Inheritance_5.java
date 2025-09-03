package programs.oops;

class A5{
    void m1(){
        System.out.println("A - m1");
    }
}

class B5 extends A5{
    void m2(){
        System.out.println("B - m2");
    }
}

class C5 extends B5{
    void m3(){
        System.out.println("C - m3");
    }
}

public class Inheritance_5 {
    public static void main(String as[]){
        C5 c = new C5();
        c.m1();
        c.m2();
        c.m3();
    }
}
