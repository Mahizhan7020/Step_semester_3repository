import java.util.*;
abstract class Plot{
    String owner;String shape;
    Plot(String o,String s){owner=o;shape=s;}
    abstract double area();
}
class CirclePlot extends Plot{
    double r;CirclePlot(String o,double r){super(o,"CIRCLE");this.r=r;}
    double area(){return Math.PI*r*r;}
}
class RectanglePlot extends Plot{
    double l,w;RectanglePlot(String o,double l,double w){super(o,"RECTANGLE");this.l=l;this.w=w;}
    double area(){return l*w;}
}
class TrianglePlot extends Plot{
    double b,h;TrianglePlot(String o,double b,double h){super(o,"TRIANGLE");this.b=b;this.h=h;}
    double area(){return 0.5*b*h;}
}
public class GardenReport{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Plot> plots=new ArrayList<>();
        for(int i=0;i<n;i++){
            String type=sc.next();
            String owner=sc.next();
            if(type.equals("CIRCLE"))plots.add(new CirclePlot(owner,sc.nextDouble()));
            else if(type.equals("RECTANGLE"))plots.add(new RectanglePlot(owner,sc.nextDouble(),sc.nextDouble()));
            else plots.add(new TrianglePlot(owner,sc.nextDouble(),sc.nextDouble()));
        }
        double total=0;
        for(Plot p:plots){
            double a=p.area();
            System.out.printf("%s (%s): %.2f\n",p.owner,p.shape,a);
            total+=a;
        }
        System.out.printf("Total Area: %.2f\n",total);
    }
}
