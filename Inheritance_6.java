package programs.oops;

class A6{
   void m1(){
       System.out.println("a m1");
   }
}

class B6 extends A6{
    void m2(){
        System.out.println("b m2");
    }
}
class C6 extends A6{
    void m3(){
        System.out.println("c m3");
    }
}

public class Inheritance_6 {
    public static void main(String as[]){
         B6 b = new B6();
         b.m1();
         b.m2();
       //   b.m3();  // cannot find symvbol

         C6 c = new C6();
         c.m1();
      //    c.m2();    cannot find symbol
         c.m3();
    }
}
