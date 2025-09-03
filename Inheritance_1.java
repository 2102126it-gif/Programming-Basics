package programs.oops;

class Inheritance1{
    static{
        System.out.println("Hai - S.B");
    }
}

class Inheritance1A{
    static{
        System.out.println("Inheritance1A - s.b");
    }
}

public class Inheritance_1 {
    public static void main(String as[]){
        Inheritance1 i = new Inheritance1();
    }
}

/*
=> When you are using Super class, then only Super class members will be processed.
=> Super class don't know anything about sub class.
=> Super class cannot access sub class members.

 */
