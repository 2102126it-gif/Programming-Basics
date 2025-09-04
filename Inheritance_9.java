package programs.oops;

class A9{
    static{
        System.out.println("A-S.B");
    }
    {
        System.out.println("A-I.B");
    }
}

class B9 extends A9{
    static{
        System.out.println("B-S.B");
    }
    {
        System.out.println("B-I.B");
    }
}
class C9 extends B9{
    static{
        System.out.println("C-S.B");
    }
    {
        System.out.println("C-I.B");
    }
}

public class Inheritance_9 {
    public static void main(String as[]){
        C9 co = new C9();
    }
}

/*
C9 co = new C9();
loads the class
1) loads A          -> A- S.B
2) loads B          -> B- S.B
3) loads C          -> C- S.B
                  ----------------
4) create A object  -> A- I.B
5) create B object  -> B- I.B
6) create C object  -> C- I.B

 */
