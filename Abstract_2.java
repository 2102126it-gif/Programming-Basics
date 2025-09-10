package programs.oops;

abstract class Abs2{
    abstract void area();
    abstract void draw();
}

abstract class Abs2B extends Abs2{
    void draw(){
        System.out.println("Abs2B - draw()");
    }
}

class Ab2C extends Abs2B{
    void area(){
        System.out.println("Abs2C - area()");
    }
}


public class Abstract_2 {
    public static void main(String as[]){
        Abs2 ab = new Ab2C();
        ab.area();
        ab.draw();
    }
}
