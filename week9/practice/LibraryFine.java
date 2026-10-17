import java.util.*;
abstract class Item{
    String title;Item(String t){title=t;}
    abstract double fine(int d);
}
class Book extends Item{
    Book(String t){super(t);}
    double fine(int d){return 2*d;}
}
class DVD extends Item{
    DVD(String t){super(t);}
    double fine(int d){return Math.min(5*d,50);}
}
class Magazine extends Item{
    Magazine(String t){super(t);}
    double fine(int d){return d;}
}
public class LibraryFine{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Item> items=new ArrayList<>();
        int[] days=new int[n];
        for(int i=0;i<n;i++){
            String type=sc.next();
            String title=sc.next();
            int d=sc.nextInt();
            days[i]=d;
            if(type.equals("BOOK"))items.add(new Book(title));
            else if(type.equals("DVD"))items.add(new DVD(title));
            else items.add(new Magazine(title));
        }
        double total=0;
        for(int i=0;i<n;i++){
            double f=items.get(i).fine(days[i]);
            System.out.printf("%s: %.2f\n",items.get(i).title,f);
            total+=f;
        }
        System.out.printf("Total Fines: %.2f\n",total);
    }
}
