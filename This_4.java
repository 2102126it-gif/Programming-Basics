package programs.oops;

class This4{
    int a;

    This4(){
     // this();   // error : recursive constructor invocation
        System.out.println("this is 0 arg");
    }
    This4(int a){
        this();  // it will work bcoz it is the first statement
        System.out.println("This is 1 arg");
        this.a=a;
      //   this();  // error : call to this must be first statement in constructor
    }
    void show(){
        System.out.println(a);
    }

}


public class This_4 {
    public static void main(String as[]){
        This4 t = new  This4(10);
        t.show();
    }
}
