package programs.oops;

class This7{
    void show(){
        int a=20;
        System.out.println(a);
    //    System.out.println(this.a);
    // error :  cannot find symbol , symbol: variable a
     // as there is no variable at class level
    }
}

public class This_7 {
    public static void main(String args[]){

        This7 t = new This7();
        t.show();
    }

}
