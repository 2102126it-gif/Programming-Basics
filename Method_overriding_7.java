package programs.oops;

class Mor7A{
    private void m1(){
        System.out.println("Mor7A - m1()");
    }

}

class Mor7B extends Mor7A{

    // private
    // private void m1(){
    // error : m1() has private access in programs.oops.Mor7B

    // default//
    void m1(){
        System.out.println("mor7B - m1()");
    }
}


public class Method_overriding_7 {
    public static void main(String as[]){
        Mor7B  mb = new Mor7B();
        mb.m1();
    }
}
