import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine().replaceAll("[\

\[\\]

,]","");
        String[] parts=line.trim().split("\\s+");
        int even=0,odd=0;
        for(String p:parts){
            int num=Integer.parseInt(p);
            if(num%2==0)even++;else odd++;
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
