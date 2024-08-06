import java.util.Scanner;

public class calculator{       
    public static void main(String[] args){
    // Simple Calculator using JAVA

    float num1,num2,Result; //Taking num1 & num2 for first and seconnd number respectiely, Result for the output after the operation.
    char operator;
     Scanner sc = new Scanner(System.in); //Adding scanner class for user input
        System.out.println("ENTER TWO NUMBERS TO CALCULATE:- ");       
         
        System.out.println("First Number is:- ");
         num1 = sc.nextFloat();

        System.out.println("Second Number is:- ");
         num2 = sc.nextFloat();

         System.out.print("CHOOSE YOUR OPERATOR   +, - , * , / \n");
         operator = sc.next().charAt(0);
         switch (operator) {
            case '+':
            Result= num1+num2;
                System.out.println(Result);
            break;

            case '-':
            Result= num1-num2;
            System.out.println(Result);
            break;

            case '*':
            Result= num1*num2;
            System.out.println(Result);
            break;

            case '/':
            Result= num1/num2;
            System.out.println(Result);
            break;
            default:
                break;
         }
         sc.close();

    }
}