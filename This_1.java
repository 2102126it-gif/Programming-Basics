package programs.oops;

class This1{
     int a=10;
     void show(){
         int a=20;
         System.out.println(a);  // Local
         System.out.println(this.a); // instance

     }
     void display(){
         System.out.println(a);
         System.out.println(this.a);
     }

}

public class This_1 {
    public static void main(String args[]){
        This1 t = new This1();
        t.show();
        System.out.println("gjh");
        t.display();
    }
}
