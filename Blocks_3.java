package programs.oops;

public class Blocks_3 {
    public static void main(String args[]){
        System.out.println("IN main :" + Block3.b);
        Block3 b1 = new Block3();

    }
}
class Block3{
    int a;
    static int b;

    {
        System.out.println("I am IIB");
        System.out.println(a);
        a=10;
        System.out.println(a);
    }

    static {
        System.out.println("I am SIB");
        System.out.println(b);
        b=20;
        System.out.println(b);
    }

}
