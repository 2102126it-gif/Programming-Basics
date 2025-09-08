package programs.oops;

class Mor4A{
    public void m1(){
        System.out.println("Mor4A - m1()");
    }

    public void m2(){
        System.out.println("Mor4A - m2()");
    }
}

class Mor4B extends Mor4A{
    public void m1(){
        System.out.println("Mor4B - m1()");
    }
   /* void m2(){
        System.out.println("Mor4B - m2()");
    }

     error : m2() in programs.oops.Mor4B cannot override m2() in programs.oops.Mor4A
  attempting to assign weaker access privileges; was public

    */
}

public class Method_overriding_4 {
    public static void main(String as[]){
        Mor4B mo = new Mor4B();
        mo.m1();
        mo.m2();
    }
}
