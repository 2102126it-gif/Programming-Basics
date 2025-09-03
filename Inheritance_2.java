package programs.oops;

class Inheritance2{
    static {
        System.out.println("Inheritance2 -S.b");
    }
}
class Inhertiance2A extends Inheritance2{
    static {
        System.out.println("Inhertance2A ; S>B");
    }
}

public class Inheritance_2 {
    public static void main(String as[]){
        Inhertiance2A i  = new Inhertiance2A();

    }
}
