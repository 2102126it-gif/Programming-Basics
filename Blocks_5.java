package programs.oops;

class Block5{
    {
        System.out.println("I am I.B");

    }
    static{
        System.out.println("I am S.B");
    }
}
public class Blocks_5 {
    public static void main(String as[]){
        Block5 b1= new Block5();
        Block5 b2= new Block5();
        Block5 b3= new Block5();

    }
}

// Q). can we write multiple Instance blocks in class?
//ans=> Yes
// Q). can we write multiple static Blocks in class?
//ans=> Yes