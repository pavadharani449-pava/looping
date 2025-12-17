import java.util.Scanner;
public class Lp15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int Sum=0;
        while(temp>0){
            int digit=temp % 10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;  
       }
       Sum +=fact;
       temp/=10;
        }
        if(Sum==num){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }

    }
    
}
