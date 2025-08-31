package programs.oops;

class Method_overloading4{
    void show(byte a){
        System.out.println("Show(byte)");
    }
    void show(short s){
        System.out.println("show(short)");
    }
    void show(int i){
        System.out.println("Show(int)");
    }
    void show(long l){
        System.out.println("Show(long)");
    }
    void show(float f){
        System.out.println("Show(float)");
    }
    void show(double d){
        System.out.println("Show(double)");
    }
}

public class Method_overloading_4 {
    public static void main(String as[]){
        Method_overloading4 m =new Method_overloading4();
        byte b=10;
        m.show(b);
        short s=10;
        m.show(s);
        int i=10;
        m.show(i);
        long l=1;
        m.show(l);
        float f=1.0F;
        m.show(f);
        double d=1.09;
        m.show(d);

    }
}
