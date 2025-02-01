import java.util.Scanner;
import java.util.StringTokenizer;

public class BigWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String :");
        String l=sc.nextLine();
        String temp;
        String max =" ";
        StringTokenizer st=new StringTokenizer(l);
       while(st.hasMoreTokens()){
        temp =st.nextToken();
        if(temp.length()>max.length()){
            max=temp;
        }
       }
       System.out.println(max);
    }
}