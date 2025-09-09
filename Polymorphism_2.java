package programs.oops;

class P2A{
    void m1(){
        System.out.println("P2A - m1()");
    }
    void m2(){
        System.out.println("P2A - m1()");
    }
}

class  P2B extends P2A{
    void m2(){
        System.out.println("P2B - m2()");
    }
    void m3() {
        System.out.println("P2B - m3()");
    }
}

class P2C extends P2A{
    void m2(){
        System.out.println("P2C - m2()");
    }
    void m4(){
        System.out.println("P2C - m4()");
    }
}


public class Polymorphism_2 {
    public static void main(String as[]){
        P2A pa = null;

        pa = new P2B();
        pa.m1(); // inherited
        pa.m2(); // overridden
    //  pa.m3(); // newly added
    //  error : cannot find symbol

        pa = new P2C();
        pa.m1(); // inherited
        pa.m2(); // overridden
    //  pa.m4(); // newly added
    //  error : cannot find symbol
    }
}

/*
when we are invoking method with super class ref. variable which
contains sub class object then that method signature
 must be available in super class also.

 => This means that method must be either inherited or overridden

 */
