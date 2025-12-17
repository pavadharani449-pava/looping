import java.util.Scanner;
public class Lp23 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=0;
        for (int i=1;i<=b;i++) {
         mul+=i;   
        }
        System.out.println(mul);
    }
}  
