package programs.oops;

class Inheritance3{
    int a=10;
}

class Inheritance3A extends Inheritance3{
    int b=20;
}

public class Inheritance_3 {
    public static void main(String as[]){
        Inheritance3 i = new Inheritance3();
        System.out.println(i.a);
    //     System.out.println(i.b);  //  cannot find symbol

        Inheritance3A ia= new Inheritance3A();
        System.out.println(ia.a);
        System.out.println(ia.b);
    }
}

/*
=> When you are using Super class, then only Super class members will be processed.
=> When you are using Super class, then both Sub class and Super class members will be processed.

=> Super class don't know anything about sub class.
=> Sub class do know about super class.

=> Super class cannot access sub class members.
=> sub class can access Super class members.
 */
