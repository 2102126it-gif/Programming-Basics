package programs.oops;

class Method_overloading2{
    void show(String str){
        System.out.println("sum(String)");
    }

    void  show(Object obj){
        System.out.println("show(Object)");
    }
}

public class Method_overloading_2 {
    public static void main(String as[]){
        Method_overloading2 m = new Method_overloading2();
        m.show("JLC");
        m.show(null);
    }
}
