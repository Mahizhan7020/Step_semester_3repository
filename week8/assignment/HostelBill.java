import java.util.*;
public class HostelBill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            double bill=0;
            if(type.equals("SINGLE")){
                int u=sc.nextInt();
                bill=8*u;
            }else if(type.equals("SHARED")){
                int u=sc.nextInt(),occ=sc.nextInt();
                bill=(6.0*u)/occ;
            }else{
                int u=sc.nextInt();
                bill=10*u+200;
            }
            total+=bill;
            System.out.printf("%s: %.2f\n",type,bill);
        }
        System.out.printf("Total: %.2f\n",total);
    }
}
