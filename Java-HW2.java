//Q1

import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
      double A,B;
      Scanner A = new Scanner(System.in);
      System.out.println("Please enter the first number");
      
      double A2=A.nextLine();
      Scanner cal = new Scanner(System.in);
      System.out.println("Please enter the operation");
       
      String cal2=cal.nextLine();
      Scanner B = new Scanner(System.in);
      System.out.println("Please enter the second number");
        
      double B2=B.nextLine();

      switch (cal2){
            case '+':
            System.out.println(A2+B2);
             break;

            case '-':
            System.out.println(A2-B2);
             break;   
            case '*':
            System.out.println(A2*B2);
             break;
             case '/':
            System.out.println(A2/B2);
             break;
        
        default:
        System.out.println("Choice is not available");
      }
  }
}
//Q2
double div=0;
for(int i=1;i<=100;i++){
    if (i%3==0 && i%5==0)
    System.out.println(i);
}

//Q3
int sum=0;
for(int i=0;i<=100;i++){
    sum=sum+i;
}
System.out.println("the sum of numbers between 1 to 100 is " + sum);

//Q4
String satrs='****';
for(int i=0;i<satrs.length();i--){
    System.out.println(satrs);
    satrs=satrs.substring(0, satrs.length() - 1);
}

