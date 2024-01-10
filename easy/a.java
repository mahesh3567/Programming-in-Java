import java.util.Scanner;
public class a{
     public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if(i<=0)
            System.out.println("enter the greater value than 0");
        else{
          if(i%2==0)
            System.out.println(i+"iseven number");
          else
            System.out.println(i+"is odd number");
        }
    }
 }