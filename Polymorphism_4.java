package programs.oops;

class P4A{
    int x=10;
    static int y=20;
}

class P4B extends P4A{
    String x="JLC";
    String y="MyJLC";
}

public class Polymorphism_4 {
    public static void main(String as[]){
        P4A pa = new P4B();
        System.out.println(pa.x);
        System.out.println(pa.y);
    }
}
