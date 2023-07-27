import java.util.Scanner;
interface Calci
{
 int getSum(int n1 , int n2);
}

class CalciImpl implements Calci
{
int getSum(int n1 , int n2)
{
return n1+n2;
}
}

public class CalciDriver
{
public static void main(String[] args)
{
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter 2 numbers to find Sum");
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();
 CalciImpl c = new CalciImpl();
 int sum = c.getSum(n1 , n2);
 System.out.println(n1+"+"+n2+"="+sum);
}
}