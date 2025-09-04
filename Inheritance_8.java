package programs.oops;

class A8{
    static int a=10;
    static{
        System.out.println("A8 -S.B"+a);
    }
}

class B8 extends A8{
    static int b=20;
    static{
        System.out.println("B8 - S.B :"+a);
        System.out.println("B8-S.B :"+b);
    }
}

public interface Inheritance_8 {
    public static void main(String aas[]){
        B8 b= new B8();

    }
}
