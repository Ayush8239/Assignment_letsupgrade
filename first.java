import java.util.Scanner;
class first
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        if(num1>0)
        {
            System.out.println("The number is positive.");
            
        }
        else if(num1==0)
        {
            System.out.println("The number is Zero.");
            
        }
        else
        {
            System.out.println("The number is negative.");
        }
    }
}