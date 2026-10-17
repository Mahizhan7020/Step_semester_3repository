import java.util.*;
public class FestivalBonus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            String name=sc.next();
            double sal=sc.nextDouble(),bonus=0;
            if(type.equals("FULLTIME"))bonus=0.1*sal;
            else if(type.equals("PARTTIME"))bonus=0.05*sal;
            else bonus=2000;
            total+=bonus;
            System.out.printf("%s: %.2f\n",name,bonus);
        }
        System.out.printf("Total Bonus: %.2f\n",total);
    }
}
