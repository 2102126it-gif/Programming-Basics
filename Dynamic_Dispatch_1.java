package programs.oops;

class Dd1A{
    void m1(){
        System.out.println("Dd1A - m1()");
    }
}

class Dd1B extends Dd1A{
    void m1(){
        System.out.println("Dd1B - m1()");
    }
}

public class Dynamic_Dispatch_1 {
    public static void main(String as[]){
        Dd1A dd = new Dd1B();
        dd.m1();
    }
}
