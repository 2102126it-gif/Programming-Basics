package programs.oops;

class Methods1{
    int a=10;
    static int v=20;

    void m1(){
        System.out.println("I am m1");
    }
    static void m2(){
        System.out.println("i am m2");
    }

   //  show() // error : invalid method declaration; return type required
    void show(){
        System.out.println(a);
        System.out.println(v);
        m1();
        m2();
    }

    static void display(){
      //   System.out.println(a); // error:  non-static variable a cannot be referenced from a static context
        System.out.println(v);
    //     m1();  // // error:  non-static variable a cannot be referenced from a static context
        m2();
    }


}

public class Methods_1 {
    public static void main(String as[]){
        Methods1 m = new Methods1();
        m.show();
    }
}
