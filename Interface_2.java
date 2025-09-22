package programs.oops;

interface Inter2{
    int A=10;
    void m1();
}
/*
class Inter2A extends Inter2{  // error : no interface expected here
}
 */

/*
class Inter2B implements Inter2{

}
 => error : Inter2B is not abstract and does not override abstract method m1() in
 */


class Inter2C implements Inter2{
    public void m1(){
        System.out.println("Inter2c - ma");
    }
}
//=> error : Inter2C is not abstract and does not override abstract method m1()




public class Interface_2 {
    public static void main(String as[]){
      //  Inter2 in = new Inter2();  // cannot be instantiated
        Inter2 in = null; // reference
        Inter2 inn = new Inter2C();
        inn.m1();
    }
}
