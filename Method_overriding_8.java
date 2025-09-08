package programs.oops;

class Mor8A{
    static void m1(){
        System.out.println("mor8A - m1()");
    }
    static void m2(){
        System.out.println("mor8A - m2()");
    }
}

class Mor8B extends Mor8A {
    static void m1(){
        System.out.println("mor8B - m1()");
    }

    /*
    void m2(){
        System.out.println("Mor8B - m2()");
    }

    // error : m2() in programs.oops.Mor8B cannot override m2() in programs.oops.Mor8A
    //         overridden method is static
     */
}

public class Method_overriding_8 {
    public static void main(String as[]){
        Mor8A mb = new Mor8B();
        mb.m1();
        mb.m2();

    }
}
