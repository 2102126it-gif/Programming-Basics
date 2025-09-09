package programs.oops;

class P3A{
    static void m1(){
        System.out.println("P3A - m1()");
    }
}

class P3B extends P3A{
    static  void m2(){
        System.out.println("P3B - m2()");
    }
}

class P3C extends P3A{
    static void m3(){
        System.out.println("P3C - m3()");
    }
}

public class Polymorphism_3 {
    public static void main(String as[]){
        P3A pa = null;

        pa = new P3B();
        pa.m1();

        pa = new P3C();
        pa.m1();
    }
}
