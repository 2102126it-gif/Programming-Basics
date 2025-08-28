package programs.oops;

class This2{
    int a=10;
    static int b=20;

    void show(){
        String a="Hello";
        String b="hai";

        System.out.println(a);  //local
        System.out.println(b);   // local
        System.out.println(this.a);   // instance
        System.out.println(this.b);   // static
        System.out.println(This2.b);  // static

    }
}

public class This_2 {
    public static void main(String args[]){
        This2 t = new This2();
        t.show();
    }
}
