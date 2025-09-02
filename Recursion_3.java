package programs.oops;

class Recursive3{
    void printNums(int n){
        if(n==0)
            return;
        printNums(n-1);
        System.out.println(n);
    }
}

public class Recursion_3 {
    public static void main(String as[]){
        Recursive3 r = new Recursive3();
        r.printNums(6);

    }
}
