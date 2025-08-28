package programs.oops;

class This3{
    int a;
    int b;
    int c;

    This3(int a, int b, int c){
//        a=a;
//        b=b;
//        c=c;

        // output:
        //  0
        //  0
        //  0

        this.a=a;
        this.b=b;
        this.c=c;

    }

    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class This_3 {
    public static void main(String as[]){
        This3 t = new This3(12,20,30);
        t.show();

    }
}
