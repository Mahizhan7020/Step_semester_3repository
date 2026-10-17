import java.util.*;
abstract class Ticket{
    int count;Ticket(int c){count=c;}
    static final int FEE=20;
    abstract double price();
    double amount(){return count*(price()+FEE);}
}
class Regular extends Ticket{Regular(int c){super(c);}double price(){return 150;}}
class Premium extends Ticket{Premium(int c){super(c);}double price(){return 250;}}
class Recliner extends Ticket{Recliner(int c){super(c);}double price(){return 400;}}
public class MovieCounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();int c=sc.nextInt();
            Ticket t=null;
            if(type.equals("REGULAR"))t=new Regular(c);
            else if(type.equals("PREMIUM"))t=new Premium(c);
            else t=new Recliner(c);
            double amt=t.amount();
            System.out.printf("%s: %.2f\n",type,amt);
            total+=amt;
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
