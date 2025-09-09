package programs.oops;

class Abs1{
   // void area();
    // error : missing method body, or declare abstract
  //  void draw();
    // error : missing method body, or declare abstract

    void area(){
        System.out.println("area");
    }
    void draw(){
        System.out.println("draw");
    }

}

public class Abstract_1 {
    public static void main(String as[]){
        Abs1 ab = new Abs1();
        ab.area();
        ab.draw();
    }
}