package programs.oops;

class Inheritance4{
    int a=10;
    void m1(){
        System.out.println(a);
    //     System.out.println(b);  // cannot find symbol
    }
}
class Inheritance4A extends Inheritance4{
    int b=20;
    void m2(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class Inheritance_4 {
    public static void main(String as[]){
        Inheritance4A ia = new Inheritance4A();
        ia.m1();
        ia.m2();
    }
}
