package programs.oops;

public class BLocks_2 {
    public static void main(String args[]){
        System.out.println("In main :" + Block2.b);
    }

}
class Block2{
    static int b;

    static {
        System.out.println("I am SIB");
        b=20;
        System.out.println(b);
    }
}
