import java.util.*;
abstract class Staff{
    String name;Staff(String n){name=n;}
    abstract double pay();
}
class FullTime extends Staff{
    double sal;FullTime(String n,double s){super(n);sal=s;}
    double pay(){return sal;}
}
class Hourly extends Staff{
    int h;double r;Hourly(String n,int h,double r){super(n);this.h=h;this.r=r;}
    double pay(){return h<=40?h*r:40*r+(h-40)*1.5*r;}
}
class Intern extends Staff{
    double st;Intern(String n,double s){super(n);st=s;}
    double pay(){return st;}
}
public class Payroll{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Staff> staff=new ArrayList<>();
        for(int i=0;i<n;i++){
            String type=sc.next();
            String name=sc.next();
            if(type.equals("FULLTIME"))staff.add(new FullTime(name,sc.nextDouble()));
            else if(type.equals("HOURLY"))staff.add(new Hourly(name,sc.nextInt(),sc.nextDouble()));
            else staff.add(new Intern(name,sc.nextDouble()));
        }
        double total=0;
        for(Staff s:staff){
            double p=s.pay();
            System.out.printf("%s: %.2f\n",s.name,p);
            total+=p;
        }
        System.out.printf("Total Payroll: %.2f\n",total);
    }
}
