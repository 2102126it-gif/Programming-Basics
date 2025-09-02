package programs.oops;

class Recursive2{
    void printNums(int n ){
        if(n==0)
            return;
        System.out.println(n);
        printNums(n-1);
    }
}

public class Recursive_2 {
    public static void main(String as[]){
        Recursive2 r = new Recursive2();
        r.printNums(5);
         //    r.printNums(-3);
        // error : Exception in thread "main" java.lang.StackOverflowError
        //	       at java.base/java.io.BufferedOutputStream.implWrite(BufferedOutputStream.java:220)
        //	       at java.base/java.io.BufferedOutputStream.write(BufferedOutputStream.java:200)
        //	       at java.base/java.io.PrintStream.implWrite(PrintStream.java:643)
        //	       at java.base/java.io.PrintStream.write(PrintStream.java:623)
        //	       at java.base/sun.nio.cs.StreamEncoder.writeBytes(StreamEncoder.java:309)
        //	       at java.base/sun.nio.cs.StreamEncoder.implFlushBuffer(StreamEncoder.java:405)
        //         at java.base/sun.nio.cs.StreamEncoder.lockedFlushBuffer(StreamEncoder.java:123)
        //	       at java.base/sun.nio.cs.StreamEncoder.flushBuffer(StreamEncoder.java:110)
        //	       at java.base/java.io.OutputStreamWriter.flushBuffer(OutputStreamWriter.java:192)
        //	       at java.base/java.io.PrintStream.implWriteln(PrintStream.java:849)
        //	       at java.base/java.io.PrintStream.writeln(PrintStream.java:826)
        //	       at java.base/java.io.PrintStream.println(PrintStream.java:1078)
        System.out.println("done");
    }
}
