import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem_1 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word  = br.readLine().trim();
        int countZ=0,countO=0;
        for(char ch : word.toCharArray()){
            if(ch=='z' || ch=='Z')
                countZ++;
            else if(ch=='o' || ch=='O')
                countO++;
        }
        if(countO==2*countZ)
            System.out.println("yes");
        else
            System.out.println("NO");
    }
}
