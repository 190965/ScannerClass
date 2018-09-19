import java.util.Scanner;

public class HelloWorldScanner
{
    public HelloWorldScanner()
    {
        
    }
    
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int i = sc.nextInt();
        String j = sc.next();
        System.out.println("i: "+i);
        System.out.println("j: "+j);
    }
        
}