package programs.oops;

class Mor2{
    long m1(int a){
        System.out.println("Mor2 - m1(int)");
        return 9;
    }
}

class Mor2a extends Mor2{
    long m1(int a){
        System.out.println("Mor2a - m1(int)");
        return 1;
    }
}

public class Method_overriding_2 {
    public static void main(String as[]){
        Mor2a mo = new Mor2a();
        mo.m1(10);
    }
}
