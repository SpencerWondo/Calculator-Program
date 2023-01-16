import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String[]args){
    home();
  }



  static void home(){
    double section;

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("WELCOME TO SPENCER'S CALCULATOR");
    System.out.println();
    System.out.println("Please choose the operation you would like to do by typing what is in the []'s:");
    System.out.println();
    System.out.println("[1]'Add, subtract, multiply, divide'");
    System.out.println("[2]'Square Root'");
    System.out.println("[3]'Exponents'");
    System.out.println("--------------------------------------------------");
    System.out.println();

    Scanner op = new Scanner(System.in); 
    section = op.nextDouble();

    if (section == 1){
      basic();
    }
    else if (section == 2){
      sqroot();
    }
    else if (section == 3){
      exponent();
    }    
  }



  static void basic(){
    double operation; 

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Would you like to: "); 
    System.out.println("[1] 'ADD'");
    System.out.println("[2] 'SUBTRACT' ");
    System.out.println("[3] 'MULTIPLY'");
    System.out.println("[4] 'DIVIDE'");
    System.out.println("[5] 'Home'");
    System.out.println("--------------------------------------------------");
    System.out.println();

    Scanner operation1 = new Scanner(System.in);
    operation = operation1.nextDouble();

    if (operation == 1){
      add(); 
    }
    else if (operation == 2){
      subtract();
    }
    else if (operation == 3){
      multiply();
    }
    else if (operation == 4){
      divide();
    }
    else if (operation == 5){
      home();
    }
    else{
      System.out.println("ERROR INVALID INPUT");
      basic();
    }
  }



  static void add(){
    double first; 
    double second; 
    double answer; 

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Please enter the first number:");
    Scanner first1 = new Scanner(System.in); 
    first = first1.nextDouble();

    System.out.println("Please enter the second number:");
    Scanner second1 = new Scanner(System.in);
    second = second1.nextDouble();

    answer = first + second; 

    System.out.println(first + " + " + second + " = " + answer);

    System.out.println("--------------------------------------------------");

    System.out.println("Enter another operation:");
    basic();

  }



  static void subtract(){
    double first; 
    double second; 
    double answer;

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Please enter the first number:");
    Scanner first1 = new Scanner(System.in); 
    first = first1.nextDouble();

    System.out.println("Please enter the second number:");
    Scanner second1 = new Scanner(System.in);
    second = second1.nextDouble(); 

    answer = first - second; 

    System.out.println(first + " - " + second + " = " + answer);

    System.out.println("--------------------------------------------------");

    System.out.println("Enter another operation:");
    basic();
  }



  static void multiply(){
    double first; 
    double second; 
    double answer;

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Please enter the first number:");
    Scanner first1 = new Scanner(System.in); 
    first = first1.nextDouble();

    System.out.println("Please enter the second number:");
    Scanner second1 = new Scanner(System.in);
    second = second1.nextDouble(); 

    answer = first * second; 

    System.out.println(first + " x " + second + " = " + answer);

    System.out.println("--------------------------------------------------");

    System.out.println("Enter another operation:");
    basic();
  }



  static void divide(){
    double first; 
    double second; 
    double answer;

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Please enter the first number:");
    Scanner first1 = new Scanner(System.in); 
    first = first1.nextDouble();

    System.out.println("Please enter the second number:");
    Scanner second1 = new Scanner(System.in);
    second = second1.nextDouble(); 

    answer = first / second; 

    System.out.println(first + " / " + second + " = " + answer);

    System.out.println("--------------------------------------------------");

    System.out.println("Enter another operation:");
    basic();
  }



  static void sqroot(){
    double first; 
    double answer;

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Please enter the number:");
    Scanner first1 = new Scanner(System.in); 
    first = first1.nextDouble();

    answer = Math.sqrt(first); 

    System.out.println("The Square Root of " + first + " is " + answer);

    System.out.println("--------------------------------------------------");

    System.out.println("Enter another operation:");
    home();
  }



  static void exponent(){
    double first; 
    double second; 
    double answer;

    System.out.println();
    System.out.println("--------------------------------------------------");
    System.out.println("Please enter the number:");
    Scanner first1 = new Scanner(System.in); 
    first = first1.nextDouble();

    System.out.println("Please enter the exponent:");
    Scanner second1 = new Scanner(System.in);
    second = second1.nextDouble(); 

    answer = Math.pow(first, second);

    System.out.println(first + " ^ " + second + " = " + answer);

    System.out.println("--------------------------------------------------");

    System.out.println("Enter another operation:");
    home();     

  }
}