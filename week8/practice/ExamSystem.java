import java.util.*;
public class ExamSystem{
    static double essayScore(String correct,String student,int pts){
        String[] keys=correct.toLowerCase().split(",");
        String st=student.toLowerCase();
        int count=0;
        for(String k:keys)if(st.contains(k.trim()))count++;
        if(count>=2)return 0.75*pts;
        if(count==1)return 0.5*pts;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        double total=0;
        for(int i=0;i<n;i++){
            String line=sc.nextLine();
            String[] parts=line.split("\"");
            String type=parts[0].trim().split(" ")[0];
            String correct=parts[3],student=parts[5];
            int pts=Integer.parseInt(parts[6].trim());
            double score=0;
            if(type.equals("MCQ")||type.equals("TF"))score=correct.equals(student)?pts:0;
            else score=essayScore(correct,student,pts);
            total+=score;
            System.out.printf("%s: %.2f\n",type,score);
        }
        System.out.printf("Total Score: %.2f\n",total);
    }
}
