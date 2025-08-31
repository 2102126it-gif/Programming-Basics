package programs.oops;

class Method_overloading3{
    void show(int a){
        System.out.println("show(int)");
    }
    void show(long a){
        System.out.println("show(Long)");
    }
}

class Method_overloading3b{
    void shows(long a){
        System.out.println("shows(long)");
    }
}

public class Method_overloading_3 {
    public static void main(String as[]){
        Method_overloading3 m = new Method_overloading3();
        Method_overloading3b mb = new Method_overloading3b();
        byte b = 10;
        m.show(b);


        short s = 10;
        m.show(s);

        int i = 10;
        m.show(i);

        long x =10;
        m.show(x);
        System.out.println("Method_overloading3b class :");
        mb.shows(b);
        mb.shows(s);
        mb.shows(i);
        mb.shows(x);
    }
}
