import java.util.Scanner;

public class calculator{      
    static int choice; 
    public static void main(String[] args){
    // Simple Calculator using JAVA

    float num1,num2,Result; //Taking num1 & num2 for first and seconnd number respectiely, Result for the output after the operation.
    char operator;
     Scanner sc = new Scanner(System.in); //Adding scanner class for user input

        do{
            System.out.println("\nWhat Do You Want?");
            System.out.println("1. Simple Calculation \n2. Squaring\n3. Cubing\n4. Suare-root\n5. Cube-Root\n6. Exits");
                choice = sc.nextInt();
        

            if(choice==1){
                    System.out.print("ENTER TWO NUMBERS TO CALCULATE:- ");       
         
                    System.out.print("First Number is:- ");
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
                                    if(num2!=0){
                                        Result= num1/num2;
                                            System.out.println(Result);
                                    }else{
                                        System.out.println("Division by zero is not allowed.");
                                    }
                                break;
                        default:
                        break;
         }
        }else if(choice==2){
                System.out.print("Enter Your Number for Squaring:- ");
                    int sq = sc.nextInt();
                        System.out.println("The Suare of "+sq +" is "+ sq*sq);        
        }else if(choice==3){
            System.out.print("Enter Your Number for Cubing:- ");
                int cu = sc.nextInt();
                    System.out.println("The Square of "+cu+" is "+(cu*cu*cu));
        }else if(choice==4){
            System.out.print("Enter Your Number for Square root:- ");
                double sqr = sc.nextDouble();
                    System.out.println("The Square-root of "+sqr+" is "+Math.sqrt(sqr));
        }else if(choice==5){
            System.out.print("Enter Your Number for cube root:- ");
                double cbr = sc.nextDouble();
                    System.out.println("The Square-root of "+cbr+" is "+Math.cbrt(cbr));
        }else if(choice==6){
            System.out.println("Existing From The Program.");
        }else{
            System.out.println("Invalid Input. Please Select 1, 2 or 3.");
        }
    }while(choice !=6);
         sc.close();

    }
//  public class MathExpression {
//    public static void sqr(Scanner scanner) {
//     Scanner sc = new Scanner(System.in); //Adding scanner class for user input
//         if(choice==4)
//             System.out.println("Enter the Number for Suare-root: ");
//             double sqr = sc.nextDouble();
//                 System.out.println("The Suare-root of "+sqr+" is "+Math.sqrt(sqr) );
//         sc.close();
//     }
//  }

}