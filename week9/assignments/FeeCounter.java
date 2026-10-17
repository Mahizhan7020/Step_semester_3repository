import java.util.*;
abstract class Student{
    String name;Student(String n){name=n;}
    static final double TUITION=40000;
    static final double BUS=12000;
    abstract double fee();
}
class DayScholar extends Student{
    DayScholar(String n){super(n);}
    double fee(){return TUITION+BUS;}
}
class Hosteller extends Student{
    Hosteller(String n){super(n);}
    double fee(){return TUITION+60000;}
}
class Scholar extends Student{
    Scholar(String n){super(n);}
    double fee(){return TUITION/2+BUS;}
}
public class FeeCounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();String name=sc.next();
            Student s=null;
            if(type.equals("DAY_SCHOLAR"))s=new DayScholar(name);
            else if(type.equals("HOSTELLER"))s=new Hosteller(name);
            else s=new Scholar(name);
            double f=s.fee();
            System.out.printf("%s: %.2f\n",s.name,f);
            total+=f;
        }
        System.out.printf("Total Collected: %.2f\n",total);
    }
}
