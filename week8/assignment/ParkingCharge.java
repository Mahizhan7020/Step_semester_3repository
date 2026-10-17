import java.util.*;
public class ParkingCharge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            int h=sc.nextInt();
            double charge=0;
            if(type.equals("BIKE"))charge=10*h;
            else if(type.equals("CAR"))charge=30+20*(h-1);
            else{charge=50*h;if(charge<100)charge=100;}
            total+=charge;
            System.out.printf("%s: %.2f\n",type,charge);
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
