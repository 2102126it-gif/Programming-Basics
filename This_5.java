package programs.oops;

class This5{
    int a;

    This5(){
        System.out.println("Hello- 0 args");
     // this(10);  // error : call to this must be first statement in constructor
    }
    This5(int a){
        System.out.println("This is 0 arga");
        this.a=a;
    }
}

public class This_5 {
    public static void main(String as[]){
        This5 t = new This5();

    }
}
