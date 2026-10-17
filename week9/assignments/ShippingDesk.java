import java.util.*;
abstract class Parcel{
    double w,v;Parcel(double w,double v){this.w=w;this.v=v;}
    abstract double charge();
    double insurance(){return 0;}
    double total(){return charge()+insurance();}
}
class Standard extends Parcel{
    Standard(double w,double v){super(w,v);}
    double charge(){return 40+10*w;}
}
class Express extends Parcel{
    Express(double w,double v){super(w,v);}
    double charge(){return 80+15*w;}
    double insurance(){return 0.02*v;}
}
class Fragile extends Parcel{
    Fragile(double w,double v){super(w,v);}
    double charge(){return 40+10*w+50;}
    double insurance(){return 0.02*v;}
}
public class ShippingDesk{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double grand=0;
        for(int i=0;i<n;i++){
            String type=sc.next();double w=sc.nextDouble(),v=sc.nextDouble();
            Parcel p=null;
            if(type.equals("STANDARD"))p=new Standard(w,v);
            else if(type.equals("EXPRESS"))p=new Express(w,v);
            else p=new Fragile(w,v);
            double c=p.charge(),ins=p.insurance(),t=p.total();
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n",type,c,ins,t);
            grand+=t;
        }
        System.out.printf("Grand Total: %.2f\n",grand);
    }
}
