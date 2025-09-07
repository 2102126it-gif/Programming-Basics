package programs.oops;

class Mor1{
    void m1(){
        System.out.println("Mor1 - m1()");
    }
    void m2(){
        System.out.println("Mor1 - m2()");
    }
}

class Mor1a extends Mor1{
    void m2(){
        System.out.println("Mor1a - m2()");
    }
    void m3(){
        System.out.println("Mor1a - m3()");
    }
}

public class Method_overriding_1 {
    public static void main(String as[]){
        Mor1a moa = new Mor1a();
        moa.m1();
        moa.m2();
        moa.m3();
    }
}
