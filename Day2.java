import java.util.Scanner;

class Day2{
    public static void main(String[] args) {
        //Q.1 Calculator to do +,-,*,/,
      /*   
        int a=1;
        int b=3;
        System.out.println("addition: "+(a +b));
        System.out.println("substraction:"+(a-b));
        System.out.println("multiplication:"+(a*b));
        System.out.println("division:"+(a/b));   */


        //Q.2 Find remainder using modulas operator
        
      /*   int a=5, b=9;
        System.out.println("remainder "+(a%b)); */


        //Q.3 Swap two number using a third variable
       
       /* int a=5, b=9;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a + " b ="+b); */

        //Q.4 Swap two number without using a third variable
       /*  int a=3,b=5;
        a = a+b;
        b = a-b;
        a =a-b;
        System.out.print("a = "+a+" b = "+b); */

        //Q.5 Check wheather a number is even or odd

      /*  Scanner in =    new Scanner(System.in);
        System.out.println("enter the vlaue ");
        int  a=  in.nextInt();
        if ( a % 2 == 0)
        System.out.println("Number is even");
        else
        System.out.println("number is odd");  */


      //Q.6 Check if a number is positive, negative or zero

     /*  Scanner in =   new Scanner(System.in);
      System.out.println("enter a integer");
    
      int  a =     in.nextInt();
      if( a> 0)
      
      System.out.println("number is positive");
      else if (a< 0)
      System.out.println("number is negative");
      else 
      System.out.println("number is zero");*/

      //Q.7 Find the largert no. between two number

     /*  Scanner in=   new Scanner(System.in);
      System.out.println("Enter the two integer ");
      int a=   in.nextInt();
      int b=   in.nextInt();
      if(a<b)
      System.out.println(+a+" number is bigger");
      else if (a>b)
      System.out.println(+b+"number is bigger "+a);
      else 
      System.out.println(+a+b+"both number is same"); */

      //Q.8 Find the larger of three
     /*  Scanner in=  new Scanner(System.in);
      System.out.println("enter the integer");
      int a=     in.nextInt();
      int b=     in.nextInt();
      int c=     in.nextInt();
      if (a>b && a>c)
      System.out.println(+a+" number is bigger");
        
     else if (b>a && b>c)
        System.out.println(+b+" number is bigger");
        
     else if(c>a && c>b) 
     System.out.println(+c+" number is bigger"); */

     //Q.9 Check if a year is leap year
    /*  Scanner in=  new Scanner(System.in);
     System.out.println("enter the year");
     int a=    in.nextInt();
     if(a%4 == 0 && ( a % 100 != 0|| a%400 == 0))
     System.out .println(+a+" year is leap year");
     else
     System.out.println(+a+" is not a leap year");*/

     //Q.10 Check the number is divisible by 5 and 11
/* 
     Scanner in=    new Scanner(System.in);
     System.out.println("enter the integer");
     int  a =   in.nextInt();
     if(a % 5 == 0  && a % 11 == 0)
     System.out.println(+a+" number is Divisible by 5 and 11");
     else
     System.out.println(+a+"number is not Divisible by 5 and 11"); */

     //Q.11 Check wheather a character is vowel or consunent
    /* Scanner in=  new Scanner(System.in);
     System.out.println("enter the character");
     int a =   in.nextInt();
     if (a == 'a' || a=='e' || a=='i' || a=='o'|| a=='u'||a== 'A' ||a=='E'||a=='I'||a=='O'||a=='u')
     System.out.println("you enter a vowel");
     else
     System.out.println("you enter a cosunent");*/

     //Q.12 Check wheather the number is prime or not
     /* 
     Scanner in=  new Scanner(System.in);
     System.out.println("enter an integer");
     int a= in.nextInt();
     if (a % 2 ==0)
     System.out.println("number is prime");
     else
     System.out.println("number is not prime"); */

     //Q.13 Check eligibility for vote

    /*  Scanner in=   new Scanner(System.in);
     System.out.println("enter your age");
     int age=  in.nextInt();
     if(age>=18)
     System.out.println("you have right to vote");
     else
     System.out.println("you are not elligible"); */

     //Q.14 Find grade of student based on marks
    /* // Scanner in= new Scanner(System.in);
     System.out.println("enter your marks");
     int marks=   in.nextInt();
     if (marks>=90)
     System.out.println("Grede A");
     else if (marks>=75)
     System.out.println("Grede B");
     else if(marks>=60) 
     System.out.println("Grede C");
     else if(marks>=33)
     System.out.println("Grede D");
     else
     System.out.println("Fale");*/
     
     //Q.15 Check wheather a character is upper or lower case

     Scanner in=  new Scanner(System.in);
     System.out.println("enter the character");
     char a=   in.next().charAt(0);
     if (a >= 97 && a<= 117)
     System.out.println("upper case");
     else if(a<= 65 && a>= 87) 
     System.out.println("lower case");
     else 
     System.out.println("Not an Alphabet"); 
  }
}

    
