package programs.oops;

class Mor5A{
     protected void m1(){
         System.out.println("mor5A - m1()");
     }
}

class Mor5B extends Mor5A{
    public void m1(){
        System.out.println("Mor5B - m1()");
    }
}
/*
class Mor5C extends Mor5A{
    void m1(){
        System.out.println("mor5c - m1()");
    }

}

error : m1() in programs.oops.Mor5C cannot override m1() in programs.oops.Mor5A
  attempting to assign weaker access privileges; was protected

 */

public class Method_overriding_5 {
    public static void main(String ass[]){
        Mor5B mo = new Mor5B();
        mo.m1();

//        Mor5C mc = new Mor5C();
//        mc.m1();
    }
}
