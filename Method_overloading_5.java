package programs.oops;

class A1{}
class B1 extends A{}
class C extends B{}

class Method_overloading5{

    void show(C co){
        System.out.println("Shows(C)");
    }


    void show(B bo){
        System.out.println("Shows(B)");
    }


    void show(A ao){
        System.out.println("Shows(A)");
    }


    void show(Object obj){
        System.out.println("Show(Object)");
    }
}

public class Method_overloading_5 {
    public static void main(String as[]){
        Method_overloading5 m = new Method_overloading5();

        C co = new C();
        m.show(co);

        B bo = new B();
        m.show(bo);

        A ao = new A();
        m.show(ao);
    }
}
