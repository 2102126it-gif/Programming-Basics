package programs.oops;

class Recursive1{
    void show(){
        System.out.println("Show - begin");
        show();
        System.out.println("Show - end");
    }
}

public class Recursion_1 {
    public static void main(String as[]){
        Recursive1 r = new Recursive1();
        r.show();
    }

}
//  error : java.lang.StackOverflowError
