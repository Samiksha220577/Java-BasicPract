
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the upper limit :");
        double n = scanner.nextInt();

        double lrs = 0;
        double rls = 0;
        int lrs_Count=0;
        int rls_Count=0;
        for (double i = 1; i <= n; i++) 
        {
            lrs += 1 /  i;
            System.out.println("inside first for loop lrs:"+lrs);
            lrs_Count++;
        }

        for (double i = n; i >= 1; i--) 
        {
            rls += 1 /  i;
            System.out.println("inside for loop rls:"+rls);
            rls_Count++;

        }
        System.out.println("Sum from left to right: " + lrs);
        System.out.println("count lrs: " + lrs_Count);

        
        System.out.println("Sum from right to left: " + rls);
        System.out.println("count rls: " + rls_Count);

        // double absoluteDifference = Math.abs(lrs - rls);
        // System.out.println("Absolute difference: " + absoluteDifference);

        if (lrs > rls) 
        {
            System.out.println("Sum from left to right is greater.");
        } else if (lrs < rls) {
            System.out.println("Sum from right to left is greater.");
        } else {
            System.out.println("Sums are equal.");
        }
    }
}






class FibonacciExample2{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  


import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int i=-1;
        int j=1;
        int x=0;
        while (y>0)
        {
            x=i+j;
            System.out.print(""+x);
            i=j;
            j=x;
            y=y-1;

        }
       
        
       
        }
       
        
    }




import java.util.Scanner;
public class Main 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int inp=sc.nextInt();
		int x=0;
		int[]Mat=new int[10];
		int Mat[]=sc.nextInt();
		for (int i=0;1<10;i++)
		{
			if (inp==Mat[i])
			{
				x++;
		}}
		System.out.print(x);
		
		
		

  
}}


_______________________________________________________________
class Main{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
	System.out.print(n1+" "+n2);
    
 for(i=2;i<count;++i)  
 {    
  n3=n1+n2;    
 System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  

_______________________________________________________________
FIBINOSSIE SERIES
import java.util.*;
class Main{  
public static void main(String args[])  
{   
Scanner sc=new Scanner(System.in);
{
	int y=sc.nextInt();
	int i=-1,j=1,x=0;
	while(y>0)
	{
		x=i+j;
		i=j;
		j=x;
		y=y-1;
	}
	System.out.print(x);
 
  
}}  }
________________________________________
REVERSAL OF DIGITS
import java.util.*;
class Main{  
public static void main(String args[])  
{   
Scanner sc=new Scanner(System.in);
int z=sc.nextInt();
int rem=0;
int num=0;
while (z>0)
{
	rem=z%10;
	num=rem;
	z=z/10;

	
	System.out.print(num);
}
  
}}  
________________________________________

PI VALUE
public class Main 
{

    public static void main(String[] args) 
	{
        double[]arr=new double[1000];
		double k=1,m=0;
		for (int i=0;i<1000;i++)
		{
			arr[i]=(1/k);
			k+=2;
		}
		for (int i=0;i<arr.length;i++)                         
		{
			if(i%2==0)
			{
				m+=arr[i];
			}
			else if (i%2==1)
			{
				m-=arr[i];
			}
			System.out.println(4*m);
		}
		
    }
}


______________________________________________________________________________________________________________
__________________________________________________________________________________________
//sum product min max
import java.util.*;
public class Main
{
	public static void main(String[]args)
	{
		int num1,num2,num3,sum,product,min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first integer:");
		num1=sc.nextInt();
		System.out.println("enter sec integer:");
		num2=sc.nextInt();
		System.out.println("enter third integer:");
		num3=sc.nextInt();
		sum=num1+num2+num3;
		System.out.println("sum:"+sum);
		product=num1*num2*num3;
		System.out.println("product:"+product);
        min=num1;
        if(num2<min)
        {
            min=num2;
        }
        if (num3<min)
        {
            min=num3;
        }
        else
        {
            min=num1;
        }
        System.out.println("min="+min);
		max=num1;
        if(num2>max)
        {
            max=num2;
        }
        if (num3>max)
        {
            max=num3;
        }
        else
        {
            max=num1;
        }
        System.out.println("max="+max);
		
}	}


output
enter first integer:
1
enter sec integer:
2
enter third integer:
3
sum:6
product:6
min=1
max=3
___________________________________________________________________________________________________________
//SUM
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        int num1,num2,num3,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first integer:");
        num1=sc.nextInt();
        System.out.println("enter second integer:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("sum="+sum);
    }
}
OUTPUT
enter first integer:
5
enter second integer:
4
sum=9
__________________________________________________________________________________________
//CIRCLE COMPUTATION
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double radius, diameter, circumference, area; 
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        //System.out.println("diameter="+diameter);
        System.out.println("area="+area);
        System.out.println("circumference="+circumference);



    }
}
OUTPUT
Enter the radius: 7
Diameter is: 14.00
area=153.93804002589985
circumference=43.982297150257104
______________________________________________________________________________________________________________
//EXCHANGING NUMBERS
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
{
    int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first no:");
    int n1=sc.nextInt();
    System.out.println("enter second no:");
    int n2=sc.nextInt();
    temp=n1;
    n1=n2;
    n2=temp;
    System.out.println("first no="+n1);
    System.out.println("second no="+n2);
    
    
    
    
}}
OUTPUT
enter first no:
9
enter second no:
6
first no=6
second no=9
______________________________________________________________________________________________________________

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
{
    int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first no:");
    int n1=sc.nextInt();
    System.out.println("enter second no:");
    int n2=sc.nextInt();
    temp=n1;
    n1=n2;
    n2=temp;
    System.out.println("first no="+n1);
    System.out.println("second no="+n2);
    
    
    
    
}}
__________________________________________________________________________________________import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("integer: ");
        int num = sc.nextInt();

        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed Integer: " + reversed);
    }
}
__________________________________________________________________________________________import java.util.*;

public class Main 
{

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		double income=sc.nextDouble();
		double tax;
		   if (income <= 50000) {
            tax = income * 0.10;
        } else if (income>=50001&&income <= 100000 ) {
            tax = income * 0.15;
        } else if (income>=10001&&income <= 150000) {
            tax = income * 0.175;
        } else {
            tax = income * 0.25;
        }
		System.out.println(tax);
    }
}
_____________________________________________________________-
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double totalPrice = 0;
        double totalActualPrice = 0;
        double totalSalesTax = 0;

        while (true) {
            System.out.println("Enter the tax-inclusive price (in dollars): ");
            double price = scanner.nextDouble();

            if (price == -1) {
                break;
            }

            double actualPrice = price / 1.07;
            double salesTax = price - actualPrice;

            System.out.println("The actual price is $" + df.format(actualPrice) + " and the sales tax is $" + df.format(salesTax) + ".");

            totalPrice += price;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;
        }

        System.out.println("The total price is $" + df.format(totalPrice) + ", the total actual price is $" + df.format(totalActualPrice) + ", and the total sales tax is $" + df.format(totalSalesTax) + ".");
    }
}
__________________________________________________________________________________________
import java.util.*;

public class Main
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
			while (num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum+rem;
			}
			System.out .println(sum);
				
	}
}
__________________________________________________________
import java.util.*;

public class Main
{
	public static void main(String [] args)
  
	{
		Scanner sc=new Scanner(System.in);
		double total=sc.nextDouble();
        if (price==-1)
        {break;}
		else{
        double price=(total)*100/107;
        double tax=total-price;
		System.out.println("total:$"+total);	
		System.out.println("price without tax:$"+price);
        System.out.println("tax amount:$"+tax);
        }
				
	}
}
______________________________________________________________________________-
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    

    // Declare constants
    final double SALES_TAX_RATE = 0.07;
    final int SENTINEL = -1; // Terminating value for input

    // Declare variables
    double price, actualPrice, salesTax; // inputs and results
    double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0; // to


    // Read the first input to "seed" the while loop
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
    price = in.nextDouble();

    while (price != SENTINEL) {
        // Compute the tax
        actualPrice = price / (1 + SALES_TAX_RATE);
        salesTax = price - actualPrice;

        // Accumulate into the totals
        totalPrice += price;
        totalActualPrice += actualPrice;
        totalSalesTax += salesTax;

        // Print results
        System.out.printf("Price: $%.2f, Actual Price: $%.2f, Sales Tax: $%.2f%n", price, actualPrice, salesTax);

        // Read the next input and repeat
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price = in.nextDouble();
    }

    // print totals
    System.out.printf("Total Price: $%.2f, Total Actual Price: $%.2f, Total Sales Tax: $%.2f%n", totalPrice, totalActualPrice, totalSalesTax);

    in.close();
}}


_______________________________________________________________________________________________________________
6.4. Circular Prime
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isCircularPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isCircularPrime(int n) {
        if (isPrime(n)) {
            int digits = 0;
            int temp = n;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            int[] nums = new int[digits];
            for (int i = 0; i < digits; i++) {
                nums[i] = n % 10;
                n /= 10;
            }
            for (int i = 0; i < digits; i++) {
                int rotated = 0;
                for (int j = 0; j < digits; j++) {
                    rotated = rotated * 10 + nums[(i + j) % digits];
                }
                if (!isPrime(rotated)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
-------------------------------------------------------------------------
import java.util.Scanner;

public class CircularPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is prime
        if (isPrime(num)) {
            // Check if all rotations of the number are prime
            boolean isCircularPrime = true;
            for (int i = 0; i < num / 10; i++) {
                num = rotate(num);
                if (!isPrime(num)) {
                    isCircularPrime = false;
                    break;
                }
            }

            if (isCircularPrime) {
                System.out.println(num + " is a circular prime.");
            } else {
                System.out.println(num + " is not a circular prime.");
            }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int rotate(int num) {
        int rotatedNum = num / 10;
        rotatedNum += num % 10 * 10;
        return rotatedNum;
    }
}
---------------------------------------------
import java.util.Scanner;
public class Example17  {

       public static void main( String args[] ){ 
        int num; 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        num = sc.nextInt(); 
        int num_of_digits = 0, divisor_part=1, circular_num = num; 
        boolean allPrime = true; 
        for( int i = num; i > 0; i /= 10 ){
            num_of_digits++;
            divisor_part *=10;
        }
        divisor_part /=10;
        do{
            circular_num = circulate_func( circular_num, divisor_part );
            if( !isPrime( circular_num ) ) allPrime=false;
        }while( circular_num != num );
        if( allPrime ) System.out.println("It is Circular Prime number." );
        else System.out.println("It is not a Circular Prime number." );
    }


	public static boolean isPrime( int n ){
        int factorCount = 0;
        if( n < 2 ) return false;
        else if( n == 2 ) return true;
        else if( n % 2 == 0 ) return false;
        else{
            int num = (int) Math.sqrt( n );
            for( int i = 3 ; i <= num; i+=2 ){
                if( n %i == 0 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static int circulate_func( int n, int divisor_part ){
         if( n < 10 ) return n; 
         else return ( n % divisor_part ) * 10 + n / divisor_part; 
   } 
  
}

________________________________________
6.1. Amicable umbers
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (isAmicable(num1, num2)) {
            System.out.println("Amicable Numbers");
        } else {
            System.out.println("Not Amicable Numbers");
        }
    }

    public static boolean isAmicable(int num1, int num2) {
        int sum1 = sumOfProperDivisors(num1);
        int sum2 = sumOfProperDivisors(num2);
        return (sum1 == num2 && sum2 == num1);
    }

    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += num / i;
                }
            }
        }
        return sum - num;
    }
}
-------------------------------------------------------------------------------------
import java.util.Scanner;  
public class AmicableNumberExample1  
{  
public static void main (String args[])  
{  
int firstDivisorSum = 0, secondDivisorSum = 0, firstNumber, secondNumber;   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
//reading the first number  
firstNumber = sc.nextInt();  
System.out.print("Enter the second number: ");  
//reading the second number  
secondNumber = sc.nextInt();  
for(int i=1;i<firstNumber;i++)  
{  
//finds the divisors of the first number      
if(firstNumber % i == 0)  
{  
//finds the sum of divisors of the first number  
firstDivisorSum = firstDivisorSum + i;  
}  
}  
for(int i=1;i<secondNumber;i++)  
{  
//finds the divisors of the second number          
if(secondNumber % i == 0)  
{  
//finds the sum of divisors of the second number      
secondDivisorSum = secondDivisorSum + i;  
}  
}  
//comparing the sum of divisors with the given numbers   
//returns true if both conditions are true  
if((firstNumber == secondDivisorSum) && (secondNumber == firstDivisorSum))  
{  
System.out.println(firstNumber+", "+ secondNumber +" are amicable numbers.");  
}  
else  
{  
System.out.println(firstNumber+", "+ secondNumber +" are not amicable numbers.");  
}  
}  
}  
------------------------------------------------------------
import java.util.Scanner;

public class Example16
    {
      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int num1 = in.nextInt();
            System.out.print("Input the second number: ");
            int num2 = in.nextInt();
            int sum_num1 = 0, sum_num2 = 0;
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    sum_num1 += i;
            }
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0)
                    sum_num2 += i;
            }
            if (sum_num1 == sum_num2)
                System.out.println("These numbers are amicable.");
            else
                System.out.println("These numbers are not amicable.");
				System.out.println("\n");			
    }
}

__________________________________________________________________________________________
6.2. Armstrong Number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isArmstrong(num)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int numOfDigits = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numOfDigits);
            temp /= 10;
        }

        return sum == num;
    }
}
-------------------------------------------------------------------------------------------------------------
import java.util.Scanner;  =
import java.lang.Math;  
public class ArmstsrongNumberExample  
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
//driver code  
public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");  
//reads the limit from the user  
num=sc.nextInt();  
System.out.println("Armstrong Number up to "+ num + " are: ");  
for(int i=0; i<=num; i++)  
//function calling  
if(isArmstrong(i))  
//prints the armstrong numbers  
System.out.print(i+ ", ");  
}   
}  
----------------------------------------------------------------
import java.util.*;
public class solution {	
 public static boolean is_Amstrong(int n) {
        int remainder, sum = 0, temp = 0;
        temp = n;
        while (n > 0) {
            remainder = n % 10;
            sum = sum + (remainder * remainder * remainder);
            n = n / 10;
        }
        return sum == temp;
    }  

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input); 
		System.out.println("Is Armstrong number? "+is_Amstrong(number));		
		}
 }

__________________________________________________________________________________________
6.3. Capricorn Number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isCapricorn(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isCapricorn(int num) {
        int square = num * num;
        int digitsSum = 0;
        while (square > 0) {
            digitsSum += square % 10;
            square /= 10;
        }

        return digitsSum == num;
    }
}
---------------------------------------------------------------------------------------

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
		int sum=0,b=a*a,k=10,m=0;
		int c=a*a;
		while(c!=0)
		{
			sum=(b%k)+(b/k);
			if (sum==a)
				m++;
			k*=10;
			c/=10;
		}
		if (m>0)
		{
			System.out.println("capricorn");
		}
		else{
			
			System.out.println("not capricorn");
		}
	}
   
}
-----------------------------------------------------------------------------------------------------

// Java program to check if a number is  
// Kaprekar number or not 
  
class GFG  
{ 
    // Returns true if n is a Kaprekar number, else false 
    static boolean iskaprekar(int n) 
    { 
        if (n == 1) 
           return true; 
       
        // Count number of digits in square 
        int sq_n = n * n; 
        int count_digits = 0; 
        while (sq_n != 0) 
        { 
            count_digits++; 
            sq_n /= 10; 
        } 
       
        sq_n = n*n; // Recompute square as it was changed 
       
        // Split the square at different points and see if sum 
        // of any pair of splitted numbers is equal to n. 
        for (int r_digits=1; r_digits<count_digits; r_digits++) 
        { 
             int eq_parts = (int) Math.pow(10, r_digits); 
       
             // To avoid numbers like 10, 100, 1000 (These are not 
             // Kaprekar numbers 
             if (eq_parts == n) 
                continue; 
       
             // Find sum of current parts and compare with n 
             int sum = sq_n/eq_parts + sq_n % eq_parts; 
             if (sum == n) 
               return true; 
        } 
       
        // compare with original number 
        return false; 
    } 
      
    // Driver method 
    public static void main (String[] args) 
    { 
        System.out.println("Printing first few Kaprekar Numbers" + 
                             " using iskaprekar()"); 
          
        for (int i=1; i<10000; i++) 
            if (iskaprekar(i)) 
                 System.out.print(i + " "); 
    } 
} 
---------------------------------------------------------------------------------
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int z=x*x;
        int a=0;
        int b=0;
        int p=x;
        int d=1;
        int flag = 0;
        //while(z>0)
        Boolean capr= false;
           // for (int d=10;d<z;d++)
         while(d<z)
        {
            a=z/d;
            System.out.println( "a :"+a);
            b =z%d;
            System.out.println( "b :"+b);
           // System.out.println( "d before:"+d);
            d=d*10;
            //System.out.println( "d after:"+d);
            if ((a+b)==p)
            {
                System.out.println("capricorn inner ");
                capr = true;
               // flag = 1;
                break;
            }
           else {
              //  System.out.println("not capricorn");
                capr = false;
                //flag =0;
            }

        }
       // System.out.println( "z :"+z);
        if(capr==true)
        // if(flag ==1)
        {
            System.out.println("capricorn ");
        }
        else{

            System.out.println("not capricorn");
        }

    }
}

______________________________________________________________________________-
6.5. Happy Number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isHappyNumber(num)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }

    public static boolean isHappyNumber(int num) {
        Set<Integer> visited = new HashSet<>();
        while (num != 1 && !visited.contains(num)) {
            visited.add(num);
            num = getNext(num);
        }

        return num == 1;
    }

    public static int getNext(int num) {
        int totalSum = 0;
        while (num > 0) {
            int digit = num % 10;
            totalSum += digit * digit;
            num /= 10;
        }

        return totalSum;
    }
}
---------------------------------------------------------------------------------
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example10 {

    public static boolean isHappy_number(int num)
    {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(num))
        {
            int value = 0;
            while (num > 0)
            {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return num == 1;
    }

    public static void main(String[] args)
    {
        System.out.print("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(isHappy_number(num) ? "Happy Number" : "Unhappy Number");
    }
}
-------------------------------------------------------------------------------------------------------
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int y;
        int sq=0;
        while(num!=1) {
            while (num > 0) {
                y = num % 10;
                sq = sq + (y * y);
                num = num / 10;
            }
            num=sq;
            sq=0;
        }
        if (num==1)
            System.out.println("happy");
        else
            System.out.println("not happy");
    }
}

______________________________________________________________________________-
6.6. Automorphic Number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isAutomorphicNumber(num)) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        while (num != 0) {
            if (num % 10 != square % 10) {
                return false;
            }
            num /= 10;
            square /= 10;
        }

        return true;
    }
}
--------------------------------------------------------------
import java.util.Scanner;
public class Example14 {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int sq_num = num*num;  
 
        String str_num = Integer.toString(num);  
        String square = Integer.toString(sq_num);  
 
        if(square.endsWith(str_num))  
            System.out.println("Automorphic Number.");
        else
            System.out.println("Not an Automorphic Number.");
    }
}

______________________________________________________________________________________________________________
6.7. Disarium Number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(disarium(n) ? "Disarium" : "Not Disarium");
    }

    public static boolean disarium(int n) {
        int sum = 0;
        int temp = n;
        int digits;

        while (temp > 0) {
            digits = temp % 10;
            sum += Math.pow(digits, digits);
            temp /= 10;
        }

        return sum == n;
    }
}---------------------------------------------------------------------------------------------------------------------
public class DisariumNumber  
{  
    //calculateLength() will count the digits present in a number  
    public static int calculateLength(int n){  
        int length = 0;  
        while(n != 0){  
            length = length + 1;  
            n = n/10;  
        }  
        return length;  
    }  
      
    public static void main(String[] args) {  
        int num = 175, sum = 0, rem = 0, n;  
        int len = calculateLength(num);  
          
        //Makes a copy of the original number num  
        n = num;  
          
        //Calculates the sum of digits powered with their respective position  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (int)Math.pow(rem,len);  
            num = num/10;  
            len--;  
        }  
          
        //Checks whether the sum is equal to the number itself  
        if(sum == n)  
            System.out.println(n + " is a disarium number");  
        else  
            System.out.println(n + " is not a disarium number");  
    }  
}  
--------------------------------------------------------------------------------------------------------
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int b = num;
        int sum = 0;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        while (num > 0) {
            int r = num % 10;
            sum = sum + (int) Math.pow(r, count);
            count--;
            num = num / 10;
        }
        if (sum == b) {
            System.out.println("dissarium");
        } else {
            System.out.println("not dissarium");
        }
    }
}
__________________________________________________________________________________________
6.8. Magic Number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(magic(n) ? "Magic Number" : "Not Magic Number");
    }

    public static boolean magic(int n) {
        int sum = 0;
        int temp = n;
        int digits;

        while (temp > 0) {
            digits = temp % 10;
            sum += digits;
            temp /= 10;
        }

        while (sum > 9) {
            temp = sum;
            sum = 0;
            while (temp > 0) {
                digits = temp % 10;
                sum += digits;
                temp /= 10;
            }
        }

        return sum == 1;
    }
}
----------------------------------------------
import java.util.Scanner;  
public class MagicNumberExample1  
{  
public static void main(String args[])  
{  
int n, remainder = 1, number, sum = 0;  
//creating a constructor of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number you want to check: ");  
//reading an integer form the user  
n = sc.nextInt();  
//assigning the entered number in the variable num  
number = n;  
//outer while loop  
while (number > 9)               //while(number > 0 || sum > 9)  
{  
//inner while loop      
while (number > 0)  
{  
//determines the remainder      
remainder = number % 10;   
sum = sum + remainder;  
//divides the number by 10 and removes the last digit of the number  
number = number / 10;     
}  
number = sum;  
sum = 0;  
}  
if (number == 1)  
{  
System.out.println("The given number is a magic number.");  
}  
else  
{  
System.out.println("The given number is not a magic number.");  
}  
}  
}  
--------------------------------------------------------------
import java.util.Scanner;  
public class MagicNumberExample2  
{  
public static void main(String args[])  
{  
Scanner scanner = new Scanner(System.in);      
System.out.print("Enter any number to check: ");  
//reading an iteger from the user  
int number = scanner.nextInt();  
if(magicNumber(number))  
System.out.println(number +" is a magic number.");  
else  
System.out.println(number +" is not a magic number.");  
}  
//user-defined method to check the number is magic or not  
public static boolean magicNumber(int number)  
{  
if( ((number - 1) % 9) == 0)  
return true;  
else  
return false;  
}  
} 
__________________________________________________________
6.9. Neon Number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(neon(n) ? "Neon Number" : "Not Neon Number");
    }
    public static boolean neon(int n) {
        int sumOfDigits = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            temp /= 10;
        }

        int square = n * n;
        int sumOfDigitsInSquare = 0;

        while (square > 0) {
            int digit = square % 10;
            sumOfDigitsInSquare += digit;
            square /= 10;
        }

        return sumOfDigits == sumOfDigitsInSquare;
    }
}
------------------------------------------------------------------
import java.util.*;  
public class NeonNumberExample1  
{  
public static void main(String args[])  
{  
int sum = 0, n;      
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: ");  
//raeds an integer from the user  
n = sc.nextInt();  
//calculate square of the given number  
int square = n * n;  
//loop executes until the condition becomes false  
while(square != 0)  
{  
//find the last digit of the square      
int digit = square % 10;  
//adds digits to the variable sum  
sum = sum + digit;  
//removes the last digit of the variable square  
square = square / 10;  
}  
//compares the given number (n) with sum  
if(n == sum)  
System.out.println(n + " is a Neon Number.");  
else  
System.out.println(n + " is not a Neon Number.");  
}  
}  
-------------------------------------
import java.io.*;   
public class NeonNumberExample2   
{   
//function to check Neon Number   
static boolean isNeon(int num)   
{   
//calculate the square of the given number  
int sq = num * num;   
//stores the sum of digits  
int sumOfdigits = 0;  
//executes until the condition becomes false  
while (sq != 0)   
{   
//finds the last digit of the variable sq and adds it to the variable sum     
sumOfdigits = sumOfdigits + sq % 10;   
//removes the last dogit of the variable sq  
sq = sq / 10;   
}   
//compares the sumOgDigits with num and returns the boolean value accordingly  
return (sumOfdigits == num);   
}   
//driver Code   
public static void main(String args[])  
{   
System.out.print("Neon Numbers between the given range are: ");      
// 0 is the lowe limit and 100000 is the upper limit  
for (int i = 0; i <= 100000; i++)   
//calling the user-defined number  
if (isNeon(i))   
//prints all the neon numbers between given range  
System.out.print(i+" ");           
}   
}   
---------------------------------------------------------------------------------------------------------
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
		int sq=x*x;
		int y;
		int sum=0;
	
        while (sq > 0) 
		{
           y=sq%10;
		   sum=sum+y;
		   sq=sq/10;

        }
        if (sum == x) {
            System.out.println("neon");
        } else {
            System.out.println("not neon");
        }
    }
}
_________________________________________________________________________________-
6.10. Palindromic Number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(palindromic(n) ? "Palindromic Number" : "Not Palindromic Number");
    }

    public static boolean palindromic(int n) {
        int reversed = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return n == reversed;
    }
}
-----------------------------------
import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  
----------------------

class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
-------------------------------------------------------------------------
import java.util.*;

public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 int r,sum=0,temp;    
	 int n=sc.nextInt(); 
  
  		temp=n;    
  	while(n>0){    
		r=n%10;  
		sum=(sum*10)+r;    
		n=n/10;    
 	 }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
______________________________________________________________________________-
------------------------------------------------------------------
_________________________________________________________________________________________________________________________________
7.1 ReverseString (String & char)
public class Prog
{
    public static void main(String[] args)
	{String s="java programming";
		String revs="";
	for (int i=s.length()-1;i>=0;i--)
	{
		char val=s.charAt(i);
		revs=revs+val;
	
	
   }
   System.out.println("original string is:"+s);
   System.out.println("reverse string is:"+revs);
  
}
}
______________________________________________________________________________________________________________
7.2 CountVowelsDigits (String & char)
import java.util.Scanner;
public class Exercise4 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
___________________________________________________________________________________________________________
7.3 PhoneKeyPad (String & char)
import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.next().toLowerCase();
        System.out.println("Keypad digits: " + convertToKeypadDigits(input));

    }

    public static String convertToKeypadDigits(String input) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);
            switch (inChar) {
                case 'a': case 'b': case 'c':
                    output.append(2); break;
                case 'd': case 'e': case 'f':
                    output.append(3); break;
                case 'g': case 'h': case 'i':
                    output.append(4); break;
                case 'j': case 'k': case 'l':
                    output.append(5); break;
                case 'm': case 'n': case 'o':
                    output.append(6); break;
                case 'p': case 'q': case 'r': case 's':
                    output.append(7); break;
                case 't': case 'u': case 'v':
                    output.append(8); break;
                case 'w': case 'x': case 'y': case 'z':
                    output.append(9); break;
                default:
                    output.append(inChar); break;
            }
        }

        return output.toString();
    }
}
___________________________________________________________________________________________-
7.4 Caesar's Code (String & char)
// import required classes and package, if any    
import java.util.Scanner;   
   
// create class CaesarCipherExample for encryption and decryption    
public class CaesarCipherExample   
{   
    // ALPHABET string denotes alphabet from a-z   
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";   
      
    // create encryptData() method for encrypting user input string with given shift key   
    public static String encryptData(String inputStr, int shiftKey)   
    {   
        // convert inputStr into lower case   
        inputStr = inputStr.toLowerCase();   
          
        // encryptStr to store encrypted data   
        String encryptStr = "";   
          
        // use for loop for traversing each character of the input string   
        for (int i = 0; i < inputStr.length(); i++)   
        {   
            // get position of each character of inputStr in ALPHABET   
            int pos = ALPHABET.indexOf(inputStr.charAt(i));   
              
            // get encrypted char for each char of inputStr   
            int encryptPos = (shiftKey + pos) % 26;   
            char encryptChar = ALPHABET.charAt(encryptPos);   
              
            // add encrypted char to encrypted string   
            encryptStr += encryptChar;   
        }   
          
        // return encrypted string   
        return encryptStr;   
    }   
      
    // create decryptData() method for decrypting user input string with given shift key   
    public static String decryptData(String inputStr, int shiftKey)   
    {   
        // convert inputStr into lower case   
        inputStr = inputStr.toLowerCase();   
          
        // decryptStr to store decrypted data   
        String decryptStr = "";   
          
        // use for loop for traversing each character of the input string   
        for (int i = 0; i < inputStr.length(); i++)   
        {   
              
            // get position of each character of inputStr in ALPHABET   
            int pos = ALPHABET.indexOf(inputStr.charAt(i));   
              
            // get decrypted char for each char of inputStr   
            int decryptPos = (pos - shiftKey) % 26;   
              
            // if decryptPos is negative   
            if (decryptPos < 0){   
                decryptPos = ALPHABET.length() + decryptPos;   
            }   
            char decryptChar = ALPHABET.charAt(decryptPos);   
              
            // add decrypted char to decrypted string   
            decryptStr += decryptChar;   
        }   
        // return decrypted string   
        return decryptStr;   
    }   
      
    // main() method start   
    public static void main(String[] args)   
    {   
        // create an instance of Scanner class   
        Scanner sc = new Scanner(System.in);   
          
        // take input from the user   
        System.out.println("Enter a string for encryption using Caesar Cipher: ");   
        String inputStr = sc.nextLine();   
          
        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");   
        int shiftKey = Integer.valueOf(sc.nextLine());   
          
        System.out.println("Encrypted Data ===> "+encryptData(inputStr, shiftKey));   
        System.out.println("Decrypted Data ===> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));   
          
        // close Scanner class object   
        sc.close();   
    }   
}   
---------------------------
import java.util.*;
public class CaesarCipherProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value by which 
        each character in the plaintext         
        message gets shifted : ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             // Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println(" ciphertext : " + ciphertext);
  }
}___________________________________________________________________________________________________________
7.5 Decipher Caesar's Code (String & char)

import java.util.*;
public class CaesarCipherProgram {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the ciphertext message : ");
        String ciphertext = sc.nextLine();
        System.out.println(" Enter the shift value : ");
        int shift = sc.nextInt();
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)  

        {
            // Shift one character at a time
            char alphabet = ciphertext.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
            
                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }    
                // if alphabet lies between A and Z
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
             // shift alphabet
                alphabet = (char) (alphabet - shift);
                
                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet;            
            } 
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}
______________________________________________________________________________-
7.6 Exchange Cipher (String & char)
import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String input = scanner.next().toLowerCase();
        System.out.println("Ciphertext: " + computeCiphertext(input));

    }

    public static String computeCiphertext(String input) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);
            if (inChar >= 'a' && inChar <= 'z') {
                output.append((char) (((inChar - 'a') ^ 0x1F) + 'A'));
            } else {
                output.append(inChar);
            }
        }

        return output.toString();
    }
}
------______________________________________________________________________________-
___________________________________________________________________________________________________________
7.2 COUNT VOWELS DIGITS
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String x=s.toLowerCase();
       // System.out.println(x);
        int count1=0;
        int count2=0;
        for (int i=0;i<=x.length()-1;i++)
        {
            char y=x.charAt(i);
            if (y== 'a' ||y == 'e' || y== 'i' || y == 'o' || s.charAt(i) == 'u')
            {
                count1++;
            }
            if(y=='0'||y=='1'||y=='2'||y=='3'||y=='4'||y=='5'||y=='6'||y=='7'||y=='8'||y=='9')
            {
                count2++;
            }
        }
       System.out.println(count1);
        System.out.println(count2);


    }
}
___________________________________________________________________________________________________________
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String x=s.toLowerCase();
        int z=s.length();
       // System.out.println(x);
        int count1=0;
        int count2=0;
        for (int i=0;i<=x.length()-1;i++)
        {
            char y=x.charAt(i);
            if (y== 'a' ||y == 'e' || y== 'i' || y == 'o' || s.charAt(i) == 'u')
            {
                count1++;
            }
            if(y=='0'||y=='1'||y=='2'||y=='3'||y=='4'||y=='5'||y=='6'||y=='7'||y=='8'||y=='9')
            {
                count2++;
            }
        }
       System.out.println(count1);
        System.out.println(count2);
        System.out.println((count1*100)/z+"%");
        System.out.println((count2*100)/z+"%");



    }
}
----------------------------------------------------------------------
7.3 PhoneKeyPad (String & char)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.next().toLowerCase();


        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);
            switch (inChar) {
                case 'a': case 'b': case 'c':
                    System.out.println(2);; break;
                case 'd': case 'e': case 'f':
                    System.out.println(3);; break;
                case 'g': case 'h': case 'i':
                    System.out.println(4);; break;
                case 'j': case 'k': case 'l':
                    System.out.println(5);; break;
                case 'm': case 'n': case 'o':
                    System.out.println(6);; break;
                case 'p': case 'q': case 'r': case 's':
                    System.out.println(7);; break;
                case 't': case 'u': case 'v':
                    System.out.println(8);; break;
                case 'w': case 'x': case 'y': case 'z':
                    System.out.println(9);; break;
                default:
                    System.out.println(input.charAt(inChar));
            }
        }


    }
}
______________________________________________________________________________-
7.1 ReverseString (String & char)
import java.util.*;
public class Main
{
public static void main(String[] args)
        {Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String revs="";
        for (int i=s.length()-1;i>=0;i--)
        {
        char val=s.charAt(i);
        revs=revs+val;


        }
        System.out.println("original string is:"+s);
        System.out.println("reverse string is:"+revs);

        }
        }

--------------------------------
7.2 CountVowelsDigits (String & char)
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String x=s.toLowerCase();
        int z=s.length();
        // System.out.println(x);
        int count1=0;
        int count2=0;
        for (int i=0;i<=x.length()-1;i++)
        {
            char y=x.charAt(i);
            if (y== 'a' ||y == 'e' || y== 'i' || y == 'o' || s.charAt(i) == 'u')
            {
                count1++;
            }
            if(y=='0'||y=='1'||y=='2'||y=='3'||y=='4'||y=='5'||y=='6'||y=='7'||y=='8'||y=='9')
            {
                count2++;
            }
        }
        double a=((double)(count1*100)/z);
        double b=((double)(count2*100)/z);
        System.out.println(count1);
        System.out.println(count2);
//        double rounded1 = Math.round(a * 1) / 100;
//        double rounded2 = Math.round(b * 1) / 100;
//        System.out.println(rounded1+"%");
//        System.out.println(rounded2+"%");
        System.out.printf("%.2f",a);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",b);
        System.out.print("%");



    }
}
_____________________________________________________________________________________________________________________________
import java.util.Scanner;
 
class ChkPalindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}
----------______________________________________________________________________________-
public class HexadecimalValidator {
	// Function to check if a string is a valid hexadecimal representation
	public static boolean isHexadecimal(String s) {
		try {
			// Attempt to parse the string as an integer in base 16 (hexadecimal)
			Integer.parseInt(s, 16);
			return true; // If successful, the string is hexadecimal
		} catch (NumberFormatException e) {
			return false; // If an exception is caught, the string is not hexadecimal
		}
	}

	public static void main(String[] args) {
		String s1 = "BF57C";
		if (isHexadecimal(s1)) {
			System.out.println("Yes");
			System.out.println("Decimal Representation of the given string = " + Integer.parseInt(s1, 16));
		} else {
			System.out.println("No");
		}

		String s2 = "58GK";
		if (isHexadecimal(s2)) {
			System.out.println("Yes");
			System.out.println("Decimal Representation of the given string = " + Integer.parseInt(s2, 16));
		} else {
			System.out.println("No");
		}
	}
}

_____________________________________________________________________________________________________________________________
public class HexPerformanceTest {
    @Test
    public void testPerformance() {
        int count = 100000000;
        char[] chars = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        String regexString = new String(chars);

        Predicate<String> isHex1Test = testString -> {
            boolean isHex = true;
            for (char c: testString.toCharArray()) {
                if (!isHex1(c)) {
                    isHex = false;
                    break;
                }
            }
            return isHex;
        };

        Predicate<String> isHex2Test = testString -> {
            boolean isHex = true;
            for (char c: testString.toCharArray()) {
                if (!isHex2(c)) {
                    isHex = false;
                    break;
                }
            }
            return isHex;
        };

        Predicate<String> isHex3Test = testString -> {
            boolean isHex = true;
            for (char c: testString.toCharArray()) {
                if (!isHex3(c)) {
                    isHex = false;
                    break;
                }
            }
            return isHex;
        };

        Pattern pattern = Pattern.compile("^[0-9a-fA-F]+$");
        Predicate<String> regexTest = testString -> {
            Matcher matcher = pattern.matcher(regexString);
            return matcher.matches();
        };

        System.out.println("execution time isHex1: " + milliseconds(regexString, isHex1Test, count) + " ms");
        System.out.println("execution time isHex2: " + milliseconds(regexString, isHex2Test, count) + " ms");
        System.out.println("execution time isHex3: " + milliseconds(regexString, isHex3Test, count) + " ms");
        System.out.println("execution time regex: " + milliseconds(regexString, regexTest, count) + " ms");
    }

    private long milliseconds(String testString, Predicate<String> hexTest, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            hexTest.test(testString);
        }
        return System.currentTimeMillis() - start;
    }

    private boolean isHex1(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    private boolean isHex2(char c) {
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return true;
            default:
                return false;
        }
    }

    private boolean isHex3(char c) {
        return (Character.digit(c, 16) != -1);
    }
}
---_____________________________________________________________________________________________________________________________
import java.util.*;
public class Main
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String x = p.toUpperCase();
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            int z = (int) y;
            if (y == '0' || y == '1' || y == '2' || y == '3' || y == '4' || y == '5' || y == '6' || y == '7' || y == '8' || y == '9') {
                System.out.println("not valid");
                break;
            }
            else if (y=='X'){
                System.out.print("A");
            }
            else if (y=='Y'){
                System.out.print("B");
            }
           else if (y=='Z'){
                System.out.print("C");
            }
        else{

            //System.out.println(z);
            int k = z + 3;
            char s = (char) k;
            System.out.print(s);
           }
        }



        }

    }
	__________________________________________________________________________________________
	7.5 Decipher Caesar's Code (String & char)
	import java.util.*;
public class Main
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String x = p.toUpperCase();
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            int z = (int) y;
            if (y == '0' || y == '1' || y == '2' || y == '3' || y == '4' || y == '5' || y == '6' || y == '7' || y == '8' || y == '9') {
                System.out.println("not valid");
                break;
            }
            else if (y=='A'){
                System.out.print("X");
            }
            else if (y=='B'){
                System.out.print("Y");
            }
           else if (y=='C'){
                System.out.print("Z");
            }
        else{

            //System.out.println(z);
            int k = z -3;
            char s = (char) k;
            System.out.print(s);
           }
        }



        }

    }
___________________________________________________________________________________________________________
7.6 Exchange Cipher (String & char)

import java.util.*;
public class Main
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String x = p.toUpperCase();
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            int z = (int) y;
            if (y == '0' || y == '1' || y == '2' || y == '3' || y == '4' || y == '5' || y == '6' || y == '7' || y == '8' || y == '9') {
                System.out.println("not valid");
                break;
            }
            else if (y=='A'){
                System.out.print("X");
            }
            else if (y=='B'){
                System.out.print("Y");
            }
           else if (y=='C'){
                System.out.print("Z");
            }
            else if (y=='X'){
                System.out.print("A");
            }
            else if (y=='Y'){
                System.out.print("B");
            }
            else if (y=='Z'){
                System.out.print("C");
            }
        else{

            //System.out.println(z);
            int k = z -3;
            char s = (char) k;
            System.out.print(s);
           }
        }



        }

    }
_________________________________________________________________________________-
7.7 TestPalindromicWord and TestPalindromicPhrase (String & char)
import java.util.*;
public class Main {
  public static boolean isPalindrome(String word) {
    word = word.toLowerCase(); 

    int left = 0;
    int right = word.length() - 1;

    while (left < right) {
      if (word.charAt(left) != word.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String word = sc.nextLine();

    if (isPalindrome(word)) {
      System.out.println(word + " is a palindrome.");
    } else {
      System.out.println(word + " is not a palindrome.");
    }
  }
}
___________________________________________________________________________________________________________
7.8 CheckBinStr (String & char)
import java.util.*;
public class Main 
{

	  public static void main(String[] args) 
	  {
	        Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();
	        boolean isBinary = true;

	        for (int i = 0; i < str.length(); i++) 
	        {
	            if (str.charAt(i) != '0' && str.charAt(i) != '1') 
	            {
	                isBinary = false;
	                break;
	            }
	        }

	        if (isBinary) 
	        {
	            System.out.println("The string is binary.");
	        } else {
	            System.out.println("The string is not binary.");
	        }
	    }
	}
____________________________________________________________________________________________________________________________________________
7.9 CheckHexStr (String & char)
import java.util.*;
public class Main 
{

public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    boolean isBinary = false;

    for (int i = 0; i < str.length(); i++) {
        if (!((str.charAt(i) >= '0' && str.charAt(i) <= '9')|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'F')|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'f')))
        {
            isBinary = true;
            break;
        }
    }

    if (isBinary) {
        System.out.println("The string is not hex.");
    } else {
        System.out.println("The string is hex.");
    }
}
}
____________________________________________________________________________________________________________________________________________
7.10 Bin2Dec (String & char)
import java.util.*;
public class Main 
{

	  public static void main(String[] args) 
	  {
            Scanner sc=new Scanner(System.in);
            String str = sc.nextLine();	        
            boolean isBinary = true;

	        for (int i = 0; i < str.length(); i++) 
	        {
	            if (str.charAt(i) != '0' && str.charAt(i) != '1') 
	            {
	                isBinary = false;
	                break;
	            }
	        }

	        if (isBinary) 
	        {
	            System.out.println("The string is binary.");
                int decimal=Integer.parseInt(str,2);
                System.out.println(decimal);
	        } else {
	            System.out.println("The string is not binary.");
	        }
	    }
	}
____________________________________________________________________________________________________________________________________________
7.11 Hex2Dec (String & char)_________________________________________________________________________________________________________________________________

import java.util.*;
public class Main 
{

public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    boolean isBinary = false;

    for (int i = 0; i < str.length(); i++) {
        if (!((str.charAt(i) >= '0' && str.charAt(i) <= '9')|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'F')|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'f')))
        {
            isBinary = true;
            break;
        }
    }

    if (isBinary) {
        System.out.println("The string is not hex.");
    } else {
        System.out.println("The string is hex.");
        int decimal = Integer.parseInt(str, 16);
        System.out.println(decimal);
    }
}
}
_________________________________________________________________________________________________________________________________
7.12 Oct2Dec (String & char)
_______________________________________________________________________________________________________________
8. Exercises on Arrays
8.1 PrintArray (Array)
import java.util.*;
 
public class Main {

	

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of items:");
    int NUM_ITEMS = scanner.nextInt();
    System.out.println("Enter the value of all items (separated by space):");
    int[] items = new int[NUM_ITEMS];
    for (int i = 0; i < items.length; ++i) {
        items[i] = scanner.nextInt();
    }

    System.out.print("The values are: [");
    for (int i = 0; i < items.length; ++i) {
        if (i == 0) {
            System.out.print(items[i]);
        } else {
            System.out.print(", " + items[i]);
        }
    }
    System.out.print("]");
}}
_________________________________________________________________________________________________________________________________
8.2 PrintArrayInStars (Array)
import java.util.*;
 
public class Main {

	

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of items:");
    int NUM_ITEMS = scanner.nextInt();
    System.out.println("Enter the value of all items (separated by space):");
    int[] items = new int[NUM_ITEMS];
    for (int i = 0; i < items.length; ++i) {
        items[i] = scanner.nextInt();
    }

    // Print array in "index: number of stars" using a nested-loop
    // Take note that rows are the array indexes and columns are the value in 
    // that index
    for (int idx = 0; idx < items.length; ++idx) { // row
        System.out.print(idx + ": ");
        // Print value as the number of stars
        for (int starNo = 1; starNo <= items[idx]; ++starNo) { // column
            System.out.print("*");
			
        }System.out.print("("+items[idx]+")");
        System.out.println();
    }
}}
____________________________________________________________________________________________________________________________________________
8.3 GradesStatistics (Array)
import java.util.*;
 
public class Main {

	

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int numStudents = scanner.nextInt();
    //System.out.println("Enter the grade for each student (separated by space):");
    int[] grades = new int[numStudents];
    for (int i = 0; i < grades.length; ++i) {

		System.out.print("enter grade of student "+(i+1)+":");
        grades[i] = scanner.nextInt();
    }

    double average = 0.0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int grade : grades) {
        average += grade;
        min = Math.min(min, grade o);
        max = Math.max(max, grade);
    }

    average /= grades.length;
    System.out.println("The average is: " + String.format("%.2f", average));
    System.out.println("The minimum is: " + min);
    System.out.println("The maximum is: " + max);
}}
____________________________________________________________________________________________________________________________________________
8.4 Hex2Bin (Array for Table Lookup)

import java.util.Scanner;

	public class Main {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a Hexadecimal string: ");
			String hexString = scanner.next();
	
			String binaryString = hexToBinary(hexString);
			System.out.println("The equivalent binary for hexadecimal \"" + hexString + "\" is: " + binaryString);
		}
	
		private static String hexToBinary(String hexString) {
			final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
										 "0100", "0101", "0110", "0111",
										 "1000", "1001", "1010", "1011",
										 "1100", "1101", "1110", "1111"};
	
			StringBuilder binaryString = new StringBuilder();
			for (char hexChar : hexString.toCharArray()) {
				binaryString.append(HEX_BITS[Character.digit(hexChar, 16)]).append(" ");
			}
			return binaryString.toString();
		}
	}

____________________________________________________________________________________________________________________________________________
8.5 Dec2Hex (Array for Table Lookup)
import java.util.Scanner;

public class Dec2Hex
    public static void mainString[] args)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive decimal number: ");        int dec = scanner.nextInt();
        if (dec < 0) {
            System.out.println("Invalid input. Please enter a positive decimal number.");
        } else {
            String hex = decimalToHex(dec);
            System.out.println("The hexadecimal equivalent of " + dec + " is: " + hex);
        }
    }

    private static String decimalToHex(int dec) {
        if (dec == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        while (dec > 0) {
            int rem = dec % 16;
            char hexChar;
            if (rem < 10) {
                hexChar = (char) ('0' + rem);
            } else {
                hexChar = (char) ('A' + rem - 10);
            }
            hex.append(hexChar);
            dec /= 16;
        }
        return hex.reverse().toString();
    }
}
----------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Dec2Hex
    public static void mainString[] args)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive decimal number: ");        
		int dec = scanner.nextInt();
        if (dec < 0) {
            System.out.println("Invalid input. Please enter a positive decimal number.");
        } else {
            String hex = decimalToHex(dec);
            System.out.println("The hexadecimal equivalent of " + dec + " is: " + hex);
        }
    }

    private static String decimalToHex(int dec) {
        String[] table = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
        };
        if (dec == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        while (dec > 0) {
            hex.append(table[dec % 16]);
            dec /= 16;
        }
        return hex.reverse().toString();
    }
}
____________________________________________________________________________________________________________________________________________
9. Exercises on Methods
9.1 exponent() (method)

import java.util.Scanner;

	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter exp:");
			int exp =sc.nextInt();
			System.out.println("enter base");
			int base=sc.nextInt();

			System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));

		}
	
		public static int exponent(int base, int exp)
		{ int result=1;
			for (int i=0;i<exp;i++)
			{
				result=result*base;
				

			}
			return result;
			
		}}
	---------------------------------------------------------------------------------------------
	public static void main(String[] args) {
    // Declare variables
    int exp; // exponent (non-negative integer)
    int base; // base (integer)

    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Prompt and read exponent and base
    System.out.print("Enter the base: ");
    base = scanner.nextInt();
    System.out.print("Enter the exponent: ");
    exp = scanner.nextInt();

    // Close the Scanner object
    scanner.close();

    // Print result
    System.out.println(base + " raises to the power of " + exp + " is: "
            + exponent(base, exp));
}

// Returns "base" raised to the power "exp"
public static int exponent(int base, int exp) {
    int product = 1; // resulting product

    // Check if exponent is negative
    if (exp < 0) {
        return 0; // Exponent cannot be negative, hence return 0
    }

    // Multiply product and base for exp number of times
    for (int i = 0; i < exp; i++) {
        product *= base;
    }

    return product;
}
	
____________________________________________________________________________________________________________________________________________
9.2 isOdd() (method)
import java.util.Scanner;

	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter an number:");
			int x =sc.nextInt();

			if(isOdd(x))
			{
				System.out.println("even");
			}
			else 
			{
				System.out.println("odd");
			}
		}
	
		public static  boolean isOdd(int x)
		{ 
			if (x%2==0)
			{
				return true;
			}
			else 
			{return false;}
			
		}}
------------------------------------------------------------------------------
public static void main(String[] args) {
    // Declare variables
    int number; // number to be checked (integer)

    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Prompt and read number
    System.out.print("Enter a number: ");
    number = scanner.nextInt();

    // Close the Scanner object
    scanner.close();

    // Print result
    if (isOdd(number)) {
        System.out.println(number + " is an odd number");
    } else {
        System.out.println(number + " is an even number");
    }
}

// Returns true if "number" is odd
public static boolean isOdd(int number) {
    return number % 2 != 0;
}
____________________________________________________________________________________________________________________________________________
9.3 hasEight() (method)
import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        // Declare variables
        int number; // number to be checked (integer)
        int sum = 0; // sum of numbers containing the digit 8

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Repeat until input is -1
        while (true) {
            // Prompt and read number
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scanner.nextInt();

            // Exit if input is -1
            if (number == -1) {
                break;
            }

            // Add number to sum if it contains the digit 8
            if (hasEight(number)) {
                sum += number;
            }
        }

        // Close the Scanner object
        scanner.close();

        // Print the magic sum
        System.out.println("The magic sum is: " + sum);
    }

    // Returns true if "number" contains the digit 8
    public static boolean hasEight(int number) {
        while (number != 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
--------------------------------------------------------------------
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new scanner(System.in);
		int count=0;
		int n;
		do{
			System.out.println("enter no");
			n=sc.nextInt();
			if (hasEight(n))
			{
				count+=n;
			}
			while (n!=-1);
			{
				System.out.println(count);
			}
		}
		public static boolean hasEight(int n)
		{
			boolean result=false;
			while(n>0)
			{
				int rem=n%10;
				result=true;
				break;
			}
			n=n/10;
		}
		return result;
	}
}
_______________________________________________________________________________________________________________________________-
9.4 print() (Array & Method)

import java.util.Arrays;

public class ArrayPrinter {

    public static void main(String[] args) {
        // Test on empty array
        print(new int[0]);

        // Test on one-element array
        print(new int[]{42});

        // Test on n-element array
        print(new int[]{1, 2, 3, 4, 5});

        // Test on double[] and float[] arrays
        print(new double[]{1.2, 3.4, 5.6});
        print(new float[]{7.8f, 9.0f, 1.2f});
    }

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }

    public static void print(double[] array) {
        if (array.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }

    public static void print(float[] array) {
        if (array.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }
}
____________________________________________________________________________________________________________________________________________
9.5 arrayToString() (Array & Method)
import java.util.Arrays;

public class ArrayPrinter {

    public static void main(String[] args) {
        // Test on empty array
        System.out.println(arrayToString(new int[0]));

        // Test on one-element array
        System.out.println(arrayToString(new int[]{42}));

        // Test on n-element array
        System.out.println(arrayToString(new int[]{1, 2, 3, 4, 5}));

        // Test on double[] and float[] arrays
        System.out.println(arrayToString(new double[]{1.2, 3.4, 5.6}));
        System.out.println(arrayToString(new float[]{7.8f, 9.0f, 1.2f}));
    }

    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
		
_________________________________________________________________________________________________________________________________
9.6 contains() (Array & Method)


_____________________________________________________________________________________________________________________________
//10.1 Arithmetic (Command-Line Arguments)
public class Test2 {
 public static void main (String[] args) {
 int operand1, operand2;
 char theOperator;
 
 // Check if there are 3 command-line arguments in the
 // String[] args by using length variable of array.
 if (args.length != 3) {
 System.err.println("Usage: java Arithmetic int1 int2 op");
 return;
 }
 
 // Convert the 3 Strings args[0], args[1], args[2] to int and char.
 // Use the Integer.parseInt(aStr) to convert a String to an int.
 operand1 = Integer.parseInt(args[0]);
 operand2 = Integer.parseInt(args[1]);
 
 // Get the operator, assumed to be the first character of
 // the 3rd string. Use method charAt() of String.
 theOperator = args[2].charAt(0);
 System.out.print(args[0] + args[2] + args[1] + "=");
 
 switch(theOperator) {
 case ('-'): System.out.println(operand1 - operand2); break;
 case ('+'): System.out.println(operand1 + operand2); break;
 case ('*'): System.out.println(operand1 * operand2); break;
 case ('/'): System.out.println(operand1 / operand2); break;
 default:
 System.err.println("Error: invalid operator!"); 
 }
 }
}


_________________________________________________________________________________________________________________________________________________
public class CopyOfArray {
    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        int[] newArray = new int[newLength];
        int copyLength = Math.min(array.length, newLength);
        System.arraycopy(array, 0, newArray, 0, copyLength);
        return newArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = copyOf(originalArray);
        System.out.println("New Array: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        newArray = copyOf(originalArray, 7);
        System.out.println("New Array: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        newArray = copyOf(originalArray, 3);
        System.out.println("New Array: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
-------------------------------------------------------------------
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        // Print the copied array
        System.out.println("Copied array:");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
        System.out.println();
    }
}
------------------------------------------
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 2};
        int[] copyarr = copyOf(arr1, 7);
        System.out.println("coppied array" + Arrays.toString(copyarr));


    }
    public static int[] copyOf(int[] array,int newLength)
    {
        int[]newarr=new int[newLength];
        for(int i=0;i<newLength;i++)
        {
            if (i< array.length)
            {
                newarr[i]=array[i];

            }
            else newarr[i]=0;
        }
        return newarr;

    }
}
---------------------------------------
9.10 swap() (Array & Method)
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Before swap
        System.out.println("Before swap:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        // Swap arrays
        boolean result = swap(array1, array2);

        // After swap
        System.out.println("After swap:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Swap result: " + result);
    }

    public static boolean swap(int[] array1, int[] array2) {
        // Check if the two arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Swap the contents of the two arrays
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }}
____________________________________________________________________________________________________________________________________________
public class SumDigits {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java SumDigits int1");
            return;
        }

        int number = Integer.parseInt(args[0]);
        if (number < 0) {
            System.err.println("Error: Number must be positive!");
            return;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of digits = " + sum);
    }
}
__________________________________________________________________________________________
public class Factorial {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Factorial int1");
            return;
        }

        int number = Integer.parseInt(args[0]);
        if (number < 0) {
            System.err.println("Error: Number must be positive!");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " = " + factorial);
    }
}
___________________________________________________________________________________________________________
public static int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    }
    if (n == 0) {
        return 1; // base case
    } else {
        return n * factorial(n-1); // call itself
    }
}
-----
public static void main(String[] args) {
    System.out.println(factorial(5)); // Output: 120
    System.out.println(factorial(0)); // Output: 1
    System.out.println(factorial(-1)); // Throws an IllegalArgumentException
}
_____________________________________________________________________________________________________________________________
public static int fibonacci(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
    }
    if (n == 0) {
        return 0; // base case
    } else if (n == 1) {
        return 1; // base case
    } else {
        return fibonacci(n-1) + fibonacci(n-2); // call itself
    }
}
------------------------------
public static void main(String[] args) {
    System.out.println(fibonacci(5)); // Output: 5
    System.out.println(fibonacci(0)); // Output: 0
    System.out.println(fibonacci(-1)); // Throws an IllegalArgumentException
}
___________________________________________________________________________________________________________
public static int lengthOfS(int n) {
    if (n < 1) {
        throw new IllegalArgumentException("Length of S is not defined for negative numbers or 0");
    }
    if (n == 1) {
        return 1; // base case
    } else {
        return lengthOfS(n-1) + numOfDigits(n); // call itself
    }
}

private static int numOfDigits(int n) {
    return (int) Math.log10(n) + 1;
}
-----------------------------------
public static void main(String[] args) {
    System.out.println(lengthOfS(5)); // Output: 5
    System.out.println(lengthOfS(0)); // Throws an IllegalArgumentException
    System.out.println(lengthOfS(-1)); // Throws an IllegalArgumentException
}
--------------------------------
public static int lengthOfS(int n) {
    if (n < 1) {
        throw new IllegalArgumentException("Length of S is not defined for negative numbers or 0");
    }
    int length = 0;
    for (int i = 1; i <= n; i++) {
        length += numOfDigits(i);
    }
    return length;
}

private static int numOfDigits(int n) {
    return (int) Math.log10(n) + 1;
}
_____________________________________________________________________________________________________________________________
public static int gcd(int a, int b) {
    if (a < 1 || b < 1) {
        throw new IllegalArgumentException("GCD is not defined for negative numbers or 0");
    }
    if (b == 0) {
        return a; // base case
    } else {
        return gcd(b, a % b); // call itself
    }
}
------------------------------------
public static void main(String[] args) {
    System.out.println(gcd(60, 48)); // Output: 12
    System.out.println(gcd(0, 48)); // Throws an IllegalArgumentException
    System.out.println(gcd(60, -48)); // Throws an IllegalArgumentException
}
-----------------------------------------
public static int gcd(int a, int b) {
    if (a < 1 || b < 1) {
        throw new IllegalArgumentException("GCD is not defined for negative numbers or 0");
    }
    while (b > 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
_____________________________________________________________________________________________________________________________

___________________________________________________________________________________________________________
10.2 Factorial Recursive
import java.util.Scanner;

class Test1{

public static void main(String[] args) {
    //Scanner sc=new Scanner (System.in);
    //int x=sc.nextInt();
    int n=Integer.parseInt(args[0]);
    System.out.println(factorial(n));
    // System.out.println(factorial(5)); // Output: 120
    // System.out.println(factorial(0)); // Output: 1
    // System.out.println(factorial(-1)); // Throws an IllegalArgumentException
}
public static int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    }
    if (n == 0) {
        return 1; // base case
    } else {
        return n * factorial(n-1); // call itself
    }
}}
___________________________________________________________________________________________________________
10.3 Fibonacci (Recursive)
public class Main {
    public static void main(String[] args) {
        int n;

        if (args.length != 1) {
            System.err.println("Usage: java Fibonacci n");
            return;
        }

        n = Integer.parseInt(args[0]);
        System.out.println("Fibonacci number of " + n + " is " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
_________________________________________________________________________________________________________________________________________________
10.4 Length of a Running Number Sequence (Recursive
public class Main {
    // Recursive version
    public static int lenRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return lenRecursive(n - 1) + numOfDigits(n);
        }
    }

    // Iterative version
    public static int lenIterative(int n) {
        int length = 0;
        for (int i = 1; i <= n; i++) {
            length += numOfDigits(i);
        }
        return length;
    }

    // Helper function to calculate number of digits in a number
    public static int numOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Recursive Length of S(" + n + "): " + lenRecursive(n));
        System.out.println("Iterative Length of S(" + n + "): " + lenIterative(n));
    }
}

______________________________________________________________________________-
10.5 GCD (Recursive)
public class Main {
    // Recursive method to compute the greatest common divisor
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}

_____________________________________________________________________________________________________________________________
11.1 JDK Source Code
public class Main {
    public static void main(String[] args) {
        // Use of Math class
        double a = Math.PI; // value of PI
        double b = Math.E;  // value of E
        System.out.println("PI: " + a);
        System.out.println("E: " + b);

        // Use of Integer class
        Integer i = Integer.valueOf(10); // converting string into Integer
        System.out.println("Value of i: " + i);

        // Use of String class
        String s = "Hello, World!";
        System.out.println(s);
    }
}
-------------------------------
______________________________________________________________________________________________________________________________________________________________
12.1 The Rectangle Class
public class Rectangle
{
    float length;
    float width;
    public Rectangle()
    {
        this.length=1.0f;
        this.width=1.0f;
    }
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    public void setLength(float length)
    {
        this.length=length;
    }
    public float getLength()
    {
        this.length=length;
        return length;
    }

    public void setWidth()
    {
        this.width=width;
    }
    public float getWidth()
    {
        this.width=width;
        return width;
    }

    public double getArea()
    {
        double Area=length * width;
        return Area;
    }

    public double getPerimeter()
    {
        double Perimeter=  2 * (length + width);
        return Perimeter;
    }
    public String toString()
    {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
    //such that it doesnot return ascii values
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(1.2f, 3.4f);
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle(5.6f, 7.8f);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println();
        System.out.println("Rectangle 1: " + rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println();
        System.out.println("Rectangle 2: " + rect2.toString());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println();
        System.out.println("Rectangle 3: " + rect3.toString());
        System.out.println("Area: " + rect3.getArea());
        System.out.println("Perimeter: " + rect3.getPerimeter());
    }
}

________________________________________________________________________________________________________________________________________________________________
12.2 The Employee Class
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary)  {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
}

public int getId() {
    return id;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getName() {
    return firstName + " " + lastName;
}

public int getSalary() {
    return salary;
}

public void setSalary(int salary) {
    this.salary = salary;
}

public int getAnnualSalary() {
    return salary * 12;
}

public int raiseSalary(int percent) {
    salary += (salary * percent / 100);
    return salary;
}

public String toString() {
    return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
}

public static void main(String[] args) 
{
    Employee e1=new Employee(8, "Sami", "T", 2500000);
    Employee e2=new Employee(7, "Samiksha", "T", 3000000);
    System.out.println(e1);
    System.out.println(" id=" + e1.getId());
    System.out.println(" first name=" + e1.getFirstName());
    System.out.println(" last name=" + e1.getLastName());
    System.out.println(" anual Salaries: " + e1.getAnnualSalary());
    System.out.println(e2);
    System.out.println(" id=" + e2.getId());
    System.out.println(" first name=" + e2.getFirstName());
    System.out.println(" last name=" + e2.getLastName());
    System.out.println(" anual Salaries: " + e2.getAnnualSalary());
}}
-----------------------------------------------------------------------------------
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
    
    // Test the class
    public static void main(String[] args){
        Employee employee = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee); // Expected output: Employee[id=8,name=Peter Tan,salary=2500]

        employee.setSalary(999);
        System.out.println(employee); // Expected output: Employee[id=8,name=Peter Tan,salary=999]

        System.out.println("id is: " + employee.getId()); // Expected output: id is: 8
        System.out.println("firstname is: " + employee.getFirstName()); // Expected output: firstname is: Peter
        System.out.println("lastname is: " + employee.getLastName()); // Expected output: lastname is: Tan
        System.out.println("salary is: " + employee.getSalary()); // Expected output: salary is: 999
        System.out.println("name is: " + employee.getName()); // Expected output: name is: Peter Tan
        System.out.println("annual salary is: " + employee.getAnnualSalary()); // Expected output: annual salary is: 11988

        employee.raiseSalary(10);
        System.out.println(employee); // Expected output: Employee[id=8,name=Peter Tan,salary=1098]
    }
}

______________________________________________________________________________________________________________________________________________________________
12.3 The InvoiceItem Class
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
   
    public double getTotal(){
        return unitPrice * qty; 
    }
   
    @Override
    public String toString(){
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice+"]";
    }
     
    // Test the class
    public static void main(String[] args){
        InvoiceItem item1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(item1);
         
        item1.setQty(999);
        item1.setUnitPrice(0.99);
         
        System.out.println(item1);
         
        System.out.println("id is: " + item1.getId());
        System.out.println("desc is: " + item1.getDesc());
        System.out.println("qty is: " + item1.getQty());
        System.out.println("unit price is: " + item1.getUnitPrice());
         
        System.out.printf("The total is: %.2f%n",item1.getTotal()); 
    }
}
________________________________________________________________________________________________________________________________________________________________
12.4 The Account Class
public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public void transferTo(Account anotherAccount, double amount) {
        if (balance >= amount) {
            debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    @Override
    public String toString(){
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance+"]";
    }
    
    // Test the class
    public static void main(String[] args){
        Account account1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(account1);
        
        Account account2 = new Account("A102", "Kumar", 0);
        System.out.println(account2);
        
        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());
        
        account1.credit(100);
        System.out.println(account1);
        
        account1.debit(50);
        System.out.println(account1);
        
        account1.debit(100);
        System.out.println(account1);
        
        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }
}
_________________________________________________________________________________________________________________________________________________________________________
12.5 The Date Class
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
    
    // Test the class
    public static void main(String[] args){
        Date date1 = new Date(2, 1, 2014);
        System.out.println(date1); // Expected output: 01/02/2014

        date1.setDay(9);
        date1.setMonth(12);
        date1.setYear(2099);
        System.out.println(date1); // Expected output: 09/12/2099

        System.out.println("Month: " + date1.getMonth()); // Expected output: Month: 12
        System.out.println("Day: " + date1.getDay()); // Expected output: Day: 9
        System.out.println("Year: " + date1.getYear()); // Expected output: Year: 2099

        Date date2 = new Date(4, 3, 2016);
        System.out.println(date2); // Expected output: 03/04/2016
    }
}
________________________________________________________________________________________________________________________________________________________________
13.1 An Introduction to OOP Inheritance -
The Circle and Cylinder Classes
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: Radius=" + radius + " Color=" + color;
    }
}

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
_________________________________________________________________________________________________________________________________________________________________________
// dec to binary
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;
        int rem[]=new int [20];
        while (x!=0)
        {
            rem[i++]=x%2;
            x=x/2;
        }
        for (int j=i-1;j>0;j--)
        {
            System.out.print(rem[j]);
        }
       
    }
}
__________________________________________________________
//dec to hexdec
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String hexdec="";
        int rem;
        char hex []={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    
        while (x!=0)
        {
            rem=x%16;
            hexdec=hex[rem]+hexdec;
            x=x/16;
        }
        System.out.println(hexdec);
    }
}
______________________________________________________________________________________________________________
//binary to decimal
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        long  x=sc.nextLong();
        long dec=0;
        long rem=0;
        long i=1;
        while (x!=0)
        {
            rem=x%10;
            dec=dec+rem*i;
            i=i*2;
            x=x/10;
        }
            System.out.println(dec);
       
        
    }
}
______________________________________________________________________________-
//hexadecimal to decimal
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        x=x.toUpperCase();
        String dig="0123456789ABCDEF";
        int val=0;
        for (int i=0;i<x.length();i++)
        {
            char c=x.charAt(i);
            int d=dig.indexOf(c);
            val=val*16+d;
        }
        System.out.println(val);
       
       
        
    }
}
_________________________________________________________________________________-
//hexadecimal to binaryimport java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        x=x.toUpperCase();
        String dig="0123456789ABCDEF";
        int val=0;
        for (int i=0;i<x.length();i++)
        {
            char c=x.charAt(i);
            int d=dig.indexOf(c);
            val=val*16+d;
        }
        System.out.println(val);
       int i=1;
       int rem[]=new int[20];
       while(val!=0)
       {
        rem[i++]=val%2;
        val=val/2;
       }
       for(int j=i-1;j>0;j--)
       {
        System.out.print(rem[j]);
       }
        
    }
}
___________________________________________________________________________________________________________
//binary to hexadecimal;
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        long  x=sc.nextLong();
        long dec=0;
        long rem=0;
        long i=1;
        while (x!=0)
        {
            rem=x%10;
            dec=dec+rem*i;
            i=i*2;
            x=x/10;
        }
            System.out.println(dec);
            int deci=(int)dec;
            String hexdec="";
            int remi;
            char hex []={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
            while (deci!=0)
            {
                remi=deci%16;
                hexdec=hex[remi]+hexdec;
                deci=deci/16;
            }
            System.out.print(hexdec);
        }
       
        
    }

___________________________________________________________________________________________________________
//factorial
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;
        int fact=1;
        for (i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        }
       
        
    }

__________________________________________________________
