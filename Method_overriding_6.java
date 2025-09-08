package programs.oops;

class Mor6A{
    void m1(){
        System.out.println("Mor6A - m1()");
    }
}
class Mor6B extends Mor6A{
   public void m1(){
        System.out.println("Mor6B - m1()");
    }
}


public class Method_overriding_6 {
    public static void main(String as[]){
        Mor6B mb = new Mor6B();
        mb.m1();
    }
}
