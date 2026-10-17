import java.util.*;
public class DeliverySystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            double fee=0;
            if(type.equals("INTERNATIONAL")){
                double w=sc.nextDouble(),d=sc.nextDouble(),c=sc.nextDouble();
                fee=25+2*w+0.5*d+c;
            }else if(type.equals("STANDARD")){
                double w=sc.nextDouble(),d=sc.nextDouble();
                fee=5+0.5*w+0.1*d;
            }else{
                double w=sc.nextDouble(),d=sc.nextDouble();
                fee=15+1*w+0.2*d;
            }
            total+=fee;
            System.out.printf("%s: %.2f\n",type,fee);
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
