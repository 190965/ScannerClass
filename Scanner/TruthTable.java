import java.util.Scanner;

/**
 * a program that reads users' input and evaluate them based on the truth table
 */
public class TruthTable
{
    // instance variables - replace the example below with your own
    public TruthTable()
    {
        
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean input1;
        boolean input2;
        int whichOperator;
        
        while(true)
        {
        System.out.println("Im a truth table robot, please enter the first input (T/F)");
        input1 = sc.nextBoolean();
        //check if it is correct
        System.out.println("The first input value is: "+input1);
        
        System.out.println("Please enter the second input (T/F)");
        input2 = sc.nextBoolean();
        //check if it is correct
        System.out.println("The second input value is: "+input2);
        
        //let user choose which logical operator to be used
        System.out.println("Which operator would you like to use? 1 for AND , 2 for OR");
        whichOperator = sc.nextInt();
        if (whichOperator == 1){
            System.out.println("You chose the AND operator");
            System.out.println("Output: "+(input1&&input2));
        }else if (whichOperator == 2){
                System.out.println("You chose the OR operator");
                System.out.println("Output: "+(input1||input2));
        }
    }
}
}
