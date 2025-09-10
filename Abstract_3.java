package programs.oops;

abstract class Abs3{
    abstract void draw();
}

class Abs3A extends Abs3{
    void draw(){
        System.out.println("Abs3A - draw");
    }
}

class Abs3B extends Abs3{
    void draw(){
        System.out.println("Abs3B - draw()");
    }

}

public class Abstract_3 {
    public  static void main(String as[]){
        Abs3 ab = null;
        ab = new Abs3A();
        ab.draw();
        ab = new Abs3B();
        ab.draw();
    }
}
