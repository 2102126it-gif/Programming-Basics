package programs.oops;



public class Blocks_1 {
    public static void main(String args[]){
        Block1 b = new Block1();
    }
}
class Block1{
    int a;
//    a=10;
//    System.out.println(a);
    // these are directly not allowed in a class.

    {
        System.out.println("I am IIB");
        a=10;
        System.out.println(a);
    }
}