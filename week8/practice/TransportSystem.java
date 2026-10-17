import java.util.*;
public class TransportSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            double fare=0;
            if(type.equals("BUS")){
                double d=sc.nextDouble();
                fare=2+0.1*d;if(fare>10)fare=10;
            }else if(type.equals("TRAIN")){
                double d=sc.nextDouble();
                fare=3+0.15*d;
            }else{
                double d=sc.nextDouble(),f=sc.nextDouble();
                fare=(1.5+0.2*d)*f;
            }
            total+=fare;
            System.out.printf("%s: %.2f\n",type,fare);
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
