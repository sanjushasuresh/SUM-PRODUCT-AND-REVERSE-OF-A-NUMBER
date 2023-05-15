import java.util.Scanner;
public class Number
{
  public static void main(String[] args)
  {
    int x,rev=0,sum=0,prod=1;
    System.out.println("Enter a value");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    do+
    {
      x=n%10;
      rev=rev*10+x;
      sum=sum+x;
      prod=prod*x;
      n=n/10;
    }
    while(n>0);
    System.out.println("Sum of digits is "+sum);
    System.out.println("Product of digits is "+prod);
    System.out.println("The reverse of the number is "+rev);
  }
}