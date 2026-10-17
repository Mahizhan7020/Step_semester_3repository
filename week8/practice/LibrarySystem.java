import java.util.*;
public class LibrarySystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        int y=2023,m=10,d=26;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if((y%400==0)||((y%4==0)&&(y%100!=0)))days[1]=29;
        for(int i=0;i<n;i++){
            String type=sc.next();
            String title=sc.nextLine().trim();
            int add=0;
            if(type.equals("BOOK"))add=14;
            else if(type.equals("DVD"))add=7;
            else if(type.equals("MAGAZINE"))add=3;
            int dd=d+add,mm=m,yy=y;
            while(dd>days[mm-1]){dd-=days[mm-1];mm++;if(mm>12){mm=1;yy++;}}
            System.out.printf("%s: %04d-%02d-%02d\n",title,yy,mm,dd);
        }
    }
}
