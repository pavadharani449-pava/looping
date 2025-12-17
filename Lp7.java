import java.util.Scanner;
public class Lp7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int num=x;
        int temp=0;
        if(x<0)
        {
            System.out.println("negative");
        }
        while(x!=0)
        {
            temp=temp*10+x%10;
            x=x/10;
        }
        if(temp==num)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
      

