import java.util.Scanner;

public class calculator{       
    public static void main(String[] args){
    // Simple Calculator using JAVA

    float num1,num2,Result; //Taking num1 & num2 for first and seconnd number respectiely, Result for the output after the operation.
    char operator;
    int choice;
     Scanner sc = new Scanner(System.in); //Adding scanner class for user input

        do{
            System.out.println("What Do You Want?");
            System.out.println("1. Simple Calculation \n2. Squaring\n3. Exit");
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
                                    Result= num1/num2;
                                        System.out.println(Result);
                                break;
                        default:
                        break;
         }
        }else if(choice==2){
                System.out.print("Enter Your Number for Squaring:- ");
                    int sq = sc.nextInt();
                        System.out.println("The Suare of "+sq + "is" + sq*sq);        
        }else if(choice==3){
            System.out.println("Existing From The Program.");
        }else{
            System.out.println("Invalid Input. Please Select 1, 2 or 3.");
        }
    }while(choice !=3);
         sc.close();

    }
}