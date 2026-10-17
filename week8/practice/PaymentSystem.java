import java.util.*;
public class PaymentSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            double amt=sc.nextDouble();
            if(type.equals("CARD"))amt*=1.02;
            else if(type.equals("WALLET"))amt*=1.01;
            total+=amt;
            System.out.printf("%s: %.2f\n",type,amt);
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
