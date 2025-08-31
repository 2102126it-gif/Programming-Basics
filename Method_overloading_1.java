package programs.oops;

class Method_overloading1{
    void sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    int sum(int x, int y,int z){
        int sum=x+y;
        return sum;
    }
    // error : method sum(int,int) is already defined

}

public class Method_overloading_1 {
    public static void main(String as[]){
        Method_overloading1 mo = new Method_overloading1();
        mo.sum(23,45);

    }
}
