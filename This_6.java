package programs.oops;

class This6{
    static int a=10;

    static void show(){
        int a=20;
        System.out.println(a);
        System.out.println(a);
        //   System.out.println(this.a);
        // error : non-static variable this cannot be referenced from a static context
    }
}

public class This_6 {
    public static void main(String as[]){
        This6 t = new This6();
        t.show();
    }
}
