import java.util.*;
import java.time.*;
public class StreamingPlan{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String type=sc.next();
            String name=sc.next();
            LocalDate start=LocalDate.parse(sc.next());
            int days=0;
            if(type.equals("BASIC"))days=30;
            else if(type.equals("STANDARD"))days=90;
            else days=365;
            LocalDate renewal=start.plusDays(days);
            System.out.printf("%s: %s\n",name,renewal);
        }
    }
}
