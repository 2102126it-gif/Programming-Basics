package programs.oops;

class A7{

}

// class B7 extends C7{

// }
// error : cyclic inheritance involving programs.oops.B7
// class C7 extends B7{
    // error : cyclic inheritance involving programs.oops.B7
// }


// class B7 extends Object,A7{  // error : '{' expected

// }

final class D7{

}

class E7 extends D7{
    // error : cannot inherit from final programs.oops.D7
}

public class Inheritance_7 {
    public static void main(String as[]){
        System.out.println("hey");
    }
}
//