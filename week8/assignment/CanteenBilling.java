import java.util.*;
public class CanteenBilling{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            double amt=sc.nextDouble();
            if(type.equals("STUDENT"))amt*=0.9;
            else if(type.equals("STAFF"))amt*=0.95;
            else amt+=10;
            total+=amt;
            System.out.printf("%s: %.2f\n",type,amt);
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
