//conditional statements1
class Prac
{
    public static void main(String[]args)
	{
	 int a=5;
	int b= 7;
	String c;
	c=(a<b)?"hello":"hi";
	System.out.println(c);
		
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------
public class Prac {
    public static void main(String[]args){
   float num=3.14f;
   if(num!=3.14);
   System.out.println("it is not 3.14");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------
public class Ifelsecity 
{
    public static void main(String[]args){
    String city="Delhi";
    if(city=="Merut")
        System.out.println("city is Merut");
    else if (city=="Noida")
        System.out.println("city is Noida");
    else if (city=="Agra")
        System.out.println("city is Agra");
    else
        System.out.println(city);}

    
        

}
---------------------------------------------------------------------------------------------------------------------------------------------
public class If1{
    public static void main(String[]args){
   float num=3.14f;
   if(num!=3.14);
   System.out.println("it is not 3.14");
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
public class Alg {
    public static void main(String[]args){
     System.out.println(5+2*3);
	 System.out.println(10-4+2*3);
	 System.out.println(10/2*5);

	}
    }
-----------------------------------------------------------------------------------------------------------------------------------------	
	public class Abcnu {
    public static void main(String[]args){
		System.out.println(1+2+"abc");
		System.out.println("abc"+1+2);}}
---------------------------------------------------------------------------------------------------------------------------------------------
	 public class {
    public static void main(String[]args){
	int x=5;
	int y=10;
	int z=++x*y--;
     System.out.println(x);
	 System.out.println(y);
	 System.out.println(z);
    }
---------------------------------------------------------------------------------------------------------------------------------------------
//divisibility by 2
import java.util.Scanner;
class Twodiv
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);//installation of scanner class
	 int x=sc.nextInt();//to read integer value from user
	 if (x%2==0)//to check if x is divisible by 2
		System.out.println("Even number");
	else
	System.out.println("Odd number");
	}
	}
----------------------------------------------------------------------------------------------------------------------------------------------	
//divisibility by 3 and 5
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);//installation of scanner class
	 int x=sc.nextInt();//to read integer value from user
	 if (x%3==0&&x%5==0)//to check if x is divisible by 3 and 5
		System.out.println("divisible by 3 and 5");
	else
	System.out.println("not divisible by 3 and 5");
	}
--------------------------------------------------------------------------------------------------------------------------------------------
//leap year
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 if (x%4==0)
	 if (x%100==0)
	 if (x%400==0)
		System.out.println("leap year");
	else
		System.out.println("not leap year");
	else
		System.out.println("leap year");
	else
		System.out.println("not leap year");
	}
	}	
----------------------------------------------------------------------------------------------------------------------------------------------
//leap year
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 if (x%4==0||x%100==0||x%400==0)
	 /*if (x%100==0)
	 if (x%400==0)*/
		System.out.println("leap year");
	else
		System.out.println("not leap year");
	/*else
		System.out.println("leap year");
	else
		System.out.println("not leap year");*/
	}
	}
----------------------------------------------------------------------------------------------------------------------------------------------
//leap year
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 if ((x%4==0 && x%100!=0) || (x%4==0 && x%100==0 && x%400==0))
		System.out.println("leap year");
	else
		System.out.println("not leap year");
	}
	}
----------------------------------------------------------------------------------------------------------------------------------------------
//to print the greatest among the 3 numbers
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
			if (x>y && x>z)
				System.out.println("x is greater");
			else if (y>x && y>z)
				System.out.println("y is greater");
			else
				System.out.println("z is greater");
	}
	}
----------------------------------------------------------------------------------------------------------------------------------------------
//if the given value can form three sides of a triangle
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
     Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
			if (x+y>=z && y+z>=x && x+z>=y)
				System.out.println("forms a triangle");
			else
				System.out.println("dosent form a triangle");
	}
	}
----------------------------------------------------------------------------------------------------------------------------------------------
//to find the are of the circle of given radius
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
		float pi=3.14f;
     Scanner sc=new Scanner(System.in);//instantation of scanner class
		float r=sc.nextFloat();
	 System.out.println("area of the circle="+pi*Math.pow(r,2));	
		
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------
//input-arithemetic operator,2 values
import java.util.Scanner;
class Prac
{
    public static void main(String[]args)
	{
		float pi=3.14f;
     Scanner sc=new Scanner(System.in);//instantation of scanner class
		char op=sc.next().charAt(0);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (op=='+')
	 System.out.println("a+b="+(a+b));	
		else if(op=='-')
	 System.out.println("a-b="+(a-b));	
	else if(op=='*')
	 System.out.println("a*b="+(a*b));	
	else if(op=='/')
	 System.out.println("a/b="+(a/b));	
	else if(op=='%')
	 System.out.println("a%b="+(a%b));	
	else
	 System.out.println("invalid operator");	
		
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------
//finding if the given number is greater than 50 and inbetween 51 and 100
import java.util.Scanner;

public class Prac{
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        float num= sc.nextFloat();
        if(num>50.0)
		{
            if (num>51&&num<100)
			
            {
				System.out.println("yes its greater than 50 and in between 51 to 100");
            }
			else
			{
                System.out.println("greater than 50 but not between 51 and 100");
            }
			
        }
		else
			{
                System.out.println("number not in my cateogery less then 50");
            }
		
		
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------
public class Practest{
    public static void main(String[] args) {
	
	//input num
	Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        float num= sc.nextFloat();
	//check num is grt 50
	if(num>50.0){
		//check num in between 51 and 100
		if (num>51&&num<100)
			
            {
				System.out.println("yes its greater than 50 and in between 51 to 100");
            }
			else
			{
                System.out.println("greater than 50 but not between 51 and 100");
            }
	}
	else{
	   System.out.println("number not in my cateogery less then 50");
	
	}
		
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------
//to find the sum of the first 10 natural numbers
public class Prac
{
	public static void main(String [] args)
	{
		int max=10;
		int sum=0;
		for (int i=1;i<=10;i++)
	
			{sum=sum+i;}
			System.out.println("sum of the first ten natural numbers="+sum);}
	
}
		
		

----------------------------------------------------------------------------------------------------------------------------------------------
//to print the product of first 20 natural numbers
public class Prac
{
	public static void main(String [] args)
	{
		int k=1;
		long product=1;
		for(k=1;k<=20;k++)
			{
				product=product*k;
			}
			System.out.println(product);
	
	}
}
______________________________________________________________________________________________________________________________________________
//to find the sum of the digits of the given number
public class Prac
{
	public static void main(String [] args)
	{
		int num=1498;
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
______________________________________________________________________________________________________________________________________________
//to find the product of the digits of the given number
public class Prac
{
	public static void main(String [] args)
	{
		int num=1498;
		int rem=0;
		int product=1;
			while (num>0)
			{
				rem=num%10;
				num=num/10;
				product=product*rem;
			}
			System.out .println(product);
				
	}
}
______________________________________________________________________________________________________________________________________________
//to print triangular pattern
public class Prac
{
	public static void main(String [] args)
	{
	int n=5;
	for (int line=1;line<=5;line++)//this for is the next 2 for's
		{
			for (int space=0;space<=(n-line);space++)
			System.out.print(" ");//space before numbers
		
			for (int num=1;num<=line;num++)
			{
				System.out.print(line);
				System.out.print(" ");//space between  numbers
			}
			System.out.println();
		}
	

	}
}
______________________________________________________________________________________________________________________________________________
//to print triangular pattern 2
public class Prac
{
	public static void main(String [] args)
	{
	int n=5;
	for (int line=1;line<=5;line++)//this for is the next 2 for's
		{
			for (int space=0;space<=(n-line);space++)
			System.out.print(" ");//space before numbers
		
			for (int num=1;num<=line;num++)
			{
				System.out.print(num);
				System.out.print(" ");//space between  numbers
			}
			System.out.println();
		}
	

	}
}
______________________________________________________________________________________________________________________________________________
public class Prac
{
	public static void main(String [] args)
	{
	int n=5;
	for (int line=1;line<=5;line++)//this for is the next 2 for's
		{
			//for (int space=0;space<=(n-line);space++)
			//System.out.print(" ");//space before numbers
		
			for (int num=1;num<=line;num++)
			{
				System.out.print(num);
				System.out.print(" ");//space between  numbers
			}
			System.out.println();
		}
	

	}
}
____________
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
______________________________________________________________________________________________________________________________________________
public class Prac 
{
    public static void main(String[]args)
	{ int k=21;
        while(k<=50){
     System.out.println(k);
		k++;}
	}
}
______________________________________________________________________________________________________________________________________________
public class Prac
{
	public static void main(String [] args)
	{
	int n=5;
	for (int line=1;line<=5;line++)//this for is the next 2 for's
		{
			//for (int space=0;space<=(n-line);space++)
			//System.out.print(" ");//space before numbers
		
			for (int num=1;num<=line;num++)
			{
				System.out.print(line);
				System.out.print(" ");//space between  numbers
			}
			System.out.println();
		}
	

	}
}
____________
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

public class Prac{
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age");
        int age= sc.nextInt();
        if(age>=18)
		{
            if (age>18&&age<80)
			
            {
				System.out.println("Eligible to vote");
				Scanner a =new Scanner(System.in);
				System.out.println("enter the phno");
				long phno= a.nextInt();
				System.out.println("Phone no="+ phno);	
				System.out.println("age diffr"+(age-18));
				
				
				
            }
			else if (age>80)
			{
                System.out.println("Please take rest");
				System.out.println("age diff"+(age-80));
            }
			
        }
		else
			{
                System.out.println("Not eligeble to vote");
            }
		
		
    }
}
______________________________________________________________________________________________________________________________________________
//sum using arrays
public class New
{
    public static void main(String[] args)
    
    {	
		int[] a={45,6,2,1};
		int len=a.length;
		int sum=0;
		for (int i=0;i<=len-1;i++)
		{
		 sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
______________________________________________________________________________________________________________________________________________
//productusing arrays
public class New
{
    public static void main(String[] args)
    
    {	
		int[] a={45,6,2,1};
		int len=a.length;
		int product=1;
		for (int i=0;i<=len-1;i++)
		{
		 product=product*a[i];
		}
		System.out.println(product);
	}
}
______________________________________________________________________________________________________________________________________________
public class Prac
{
    public static void main(String[] args)
	{
    
     int i,j;
     for(i=0;i<3;i++)
     for(j=0;j<3;j++)
     {
        System.out.println("i:"+i);
        System.out.println("j:"+j);  }
	}
}
output
i:0
j:0
i:0
j:1
i:0
j:2
j:0
i:1
j:1
i:1
j:2
i:2
j:0
i:2
j:1
i:2
j:2
______________________________________________________________________________________________________________________________________________
public class Prac
{
    public static void main(String[] args)
	{
    
    System.out.println("*\t*\t*\n\n\n*\t*\t*\n\n\n*\t*\t*\t");
	}
}
*       *       *


*       *       *


*       *       *
______________________________________________________________________________________________________________________________________________
public class Prac
{
    public static void main(String[] args)
	{
    
    System.out.println("*\t*\t*\n\n\n*\t\t*\n\n\n*\t*\t*\t");
	}
}
*       *       *


*               *


*       *       *
______________________________________________________________________________________________________________________________________________
public class New
{
public static void main(String[] args)
{
	String s="hello";
	String s1="HELLO";
	String s2="     hello     ";
	System.out.println("Length is:--"+s.length());
	System.out.println("adding strings--"+s.concat("xyz"));
	System.out.println("charecter at particular index--"+s.charAt(2));
	System.out.println("checks equality--"+s.equals(s1));
	System.out.println("it ignores case sensitivity--"+s.equalsIgnoreCase(s1));
	System.out.println("removes begening and end spaces--"+s2.trim());
	System.out.println("converting to lower case--"+s1.toLowerCase());
	System.out.println("converting to upper case--"+s1.toUpperCase());
	System.out.println("returns index of element--"+s.indexOf('1'));
	System.out.println("returns last index of element--"+s.lastIndexOf('1'));
}
	
}
output
Length is:--5
adding strings--helloxyz
charecter at particular index--l
checks equality--false
it ignores case sensitivity--true
removes begening and end spaces--hello
converting to lower case--hello
converting to upper case--HELLO
returns index of element---1
returns last index of element---1
______________________________________________________________________________________________________________________________________________
//temp exchange nos
import java.util.Scanner;
public class Prac
{public static void main(String[] args) {
    {int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st no:");
    int n1=sc.nextInt();
    System.out.println("enter second no:");
    int n2=sc.nextInt();
    temp=n1;
    n1=n2;
    n2=temp;
    System.out.println(n1);
    System.out.println(n2);
    
    
    }
    
}}
output
enter 1st no:
3
enter second no:
5
5
3

public class Prog
{
    public static void main(String[] args)
	{String s="haaiaao";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char val=s.charAt(i);
		if (val=='a')
		{
			count++;
		}
		
   }
   System.out.println("the count of a is:"+count);
}
}
output
the count of a is:4
______________________________________________________________________________________________________________________________________________
public class Prog
{
    public static void main(String[] args)
	{String s="haaiaao  hi hhhiii";
	int count=0;
	int space=0;
	for(int i=0;i<s.length();i++)
	{
		char val=s.charAt(i);
		if (val=='a')
		{
			count++;
		}
		if (val==' '){
			space++;
		}
		
   }
   System.out.println("the count of a is:"+count);
   System.out.println("the number of spaces are:"+space);
}
}

the count of a is:4
the number of spaces are:3
______________________________________________________________________________________________________________________________________________
public class Prog
{
    public static void main(String[] args)
	{String s="haaiaao  hi hhhiii";
	int vcount=0;
	int count=0;
	int space=0;
	for(int i=0;i<s.length();i++)
	{
		char val=s.charAt(i);
		if (val=='a'||val=='e'||val=='i'||val=='o'||val=='u')
		{
			vcount++;
		}
		if (val==' '){
			space++;
		}
		else
		{
			count++;
		}
   }
   System.out.println("the number of vowels is:"+vcount);
   System.out.println("the count of a is:"+count);
   System.out.println("the number of spaces are:"+space);
}
}
output
the number of vowels is:10
the count of a is:15
the number of spaces are:3
______________________________________________________________________________________________________________________________________________
//printing strings
import java.util.Scanner;
public class Prac
{public static void main(String[] args) {
    {Scanner sc=new Scanner(System.in);
    System.out.println("enter string:");
    String mystring=sc.nextLine();
    
    System.out.println(mystring);
    
    
    }
    
}}
output
enter string:
hi sami
hi sami
______________________________________________________________________________________________________________________________________________
//strings
import java.util.Scanner;
public class Prac
{public static void main(String[] args) {
    {int a[]={100,2,3,4,5};
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);

    
    
    }
    
}}or
//strings
import java.util.Scanner;
public class Prog
{public static void main(String[] args) {
    {int a[]={100,2,3,4,5};
    for (int i=0;i<5;i++)
	 System.out.println(a[i]);

    
    
    }
    
}}
output
100
2
3
4
5
______________________________________________________________________________________________________________________________________________
//reversalof string
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
output
original string is:java programming
reverse string is:gnimmargorp avaj
______________________________________________________________________________________________________________________________________________
//Array
class Prac {
    public static void main(String[] args) {
        float arr[] = {100.3f, 2.3f, 3.5f, 4.8f, 5.8f, 9.1f};
        System.out.println(arr[2]);
    }
}
output
100
2
3
4
5
______________________________________________________________________________________________________________________________________________
class Prac {
    public static void main(String[] args) {
        int i;
        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
output
100
2
3
4
5
______________________________________________________________________________________________________________________________________________
class Prac {
    public static void main(String[] args) {
        int i;
        for (i = 1; i<11; i++) {
            System.out.println("\n?"+i);
        }
    }
}
output
?1

?2

?3

?4

?5

?6

?7

?8

?9

?10
______________________________________________________________________________________________________________________________________________
class Prac{
    public static void main(String[] args) {
        int i;
        for (i = 1;i<11; i++) {
            System.out.println(i+"\n?");
        }
    }
}
output
1
?
2
?
3
?
4
?
5
?
6
?
7
?
8
?
9
?
10
?
______________________________________________________________________________________________________________________________________________
class Prac{
    public static void main(String[] args) {
        int i;
        for (i = 1;i<11; i++) {
            System.out.println("\n?"+i);
        }
    }
}
output
?1

?2

?3

?4

?5

?6

?7

?8

?9

?10
______________________________________________________________________________________________________________________________________________
class Prac{
    public static void main(String[] args) {
        int i;
        for (i = 1;i<10; i++) 
        {
            System.out.println(i);
            if(i%2==0)
            {System.out.println("?");}
        }
    }
}
output
1
2
?
3
4
?
5
6
?
7
8
?
9
______________________________________________________________________________________________________________________________________________
                              class Prac {
    public static void main(String[] args) {
        int[] a = {45, 1, 2, 5};
        int len = a.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            sum = sum + a[i];
        }
        
        System.out.println("Sum: " + sum);
    }
}
output
Sum: 53
______________________________________________________________________________________________________________________________________________
//create 1D array using user input and display
import java.util.Scanner;

class Prac {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any array size:");
        n=sc.nextInt();
        int[]array=new int[3];
        System.out.println("enter array elements");
        {
            array[1]=sc.nextInt();
        
        }
        System.out.println("created array:");
        for(int i=0;i<n;i++)
        {System.out.println(array[i]);} 
    }
}
output
Enter any array size:
3
enter array elements
1 2 3
created array:
0
1
0
______________________________________________________________________________________________________________________________________________
//after entering iD arrays print sum of array elements
import java.util.Scanner;

class Prac {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements:");
        int sum = 0;
        
        for (int j = 0; j < n; j++) {
            array[j] = sc.nextInt();
            sum = sum + array[j];
        }
		output
		Enter the array size:
4
Enter array elements:
1 3 5 7  
Sum: 16
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
}}}
output
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
}}}
output
5
*
* *
* * *
* * * *
* * * * *
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=5;i>=1;i--)
		{
			for (j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
}}}
output
5
* * * * *
* * * *
* * *
* *
*
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=1;i<=n;i++)
		{	for (j=1;j<=(n-i);j++)
				System.out.print(" ");
			for (j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
}}}
output
5
    *
   **
  ***
 ****
*****
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=5;i>=1;i--)
		{	for (j=1;j<=(n-i);j++)
				System.out.print(" ");
			for (j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
}}}
Output
5
*****
 ****
  ***
   **
    *
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for (i=1;i<=n;i++)
		{	for (j=1;j<=(n-i);j++)
				System.out.print(" ");
			for (j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
}}}
output
6
     *
    ***
   *****
  *******
 *********
***********
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{	for (j=1;j<=(n-i);j++)
				System.out.print(" ");
			for (j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
}}}
output
6
***********
 *********
  *******
   *****
    ***
     *
______________________________________________________________________________________________________________________________________________import java.util.Scanner;

class Prog{
    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{	for (j=1;j<=(n-i);j++)
				System.out.print(" ");
			for (j=1;j<=2*i-1;j++)
				System.out.print("*");
		System.out.println();}
		for (i=1;i<=n;i++)
		{	for (j=1;j<=(n-i);j++)
				System.out.print(" ");
			for (j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
}}}
output
3
*****
 ***
  *
  *
 ***
*****
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;
class Prog
{
    public static void main(String[] args)
	{
		
        Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,sp=n/2,st=1;
		for(i=1;i<=n;i++)
		{	for (j=1;j<=sp;j++)
				System.out.print(" ");
			for (j=1;j<=2*st-1;j++)
				System.out.print("*");
			if (i<=n/2)
			{
				sp--;
				st++;
			}
			else
			{
				sp++;
				st--;
			}
		System.out.println();
		}
		
	}
}
output
11
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
______________________________________________________________________________________________________________________________________________
//after creating iD array print sum of array elements
import java.util.Scanner;

class Prog {
    public static void main(String[] args) {
        int size;
        int i;
        int j;
        int sum = 0;
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        
        System.out.println("Enter array elements:");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        
        for (j = 0; j < size; j++) {
            sum = sum + a[j];
        }
        
        System.out.println("Sum: " + sum);
    }
}
output
Enter the size of the array:
10
Enter array elements:
1 2 34 5 6 8 9 0 7 2
Sum: 74
______________________________________________________________________________________________________________________________________________
//program to read the elements into 1d array and print sum
import java.util.Scanner;
class Prog
{
    public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for (int i=0;i<arr.length;i++)
			sum+=arr[i];
		System.out.print("sum of array elements="+sum);
		
		

		
		
	}
}
output
5
5 5 6 6 7
sum of array elements=29
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog {
    public static void main(String[] args) {
        int size;
        int i;
        int j;
        int sum = 0;
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        
        System.out.println("Enter array elements:");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        
        for (j = 1; j<size;j=j+2) {
            
        }
        
        System.out.println(a[j]);
    }
}
______________________________________________________________________________________________________________________________________________
______________________________________________________________________________________________________________________________________________
//2d arrays
//to print matrix
import java.util.Scanner;

class Prog {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
		int rows=sc.nextInt();
		System.out.println("enter number of columns:");
		int columns=sc.nextInt();
		int [] [] a=new int [rows] [columns];
		System.out.println("enter elements");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
			System.out.println("the 2d array is:");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					System.out.print(a[i] [j]+" ");
				
				}
				System.out.println();
					
				

	}}
}

Output
enter number of rows:
3
enter number of columns:
2
enter elements
2 4 5 3 7 9
the 2d array is:
2 4
5 3
7 9
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();
        int[][] a = new int[rows][columns];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Enter elements for diagonal:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    a[i][j] = sc.nextInt();
                }
            }
        }
        
        System.out.println("The updated 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

output
Enter number of rows:
2
Enter number of columns:
2
Enter elements:
1 2 3 4
The 2D array is:
1 2
3 4
Enter elements for diagonal:
7 9
The updated 2D array is:
7 2
3 9
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class Prog 
{
    public static void main(String[] args) 
	{
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();
        int[][] a = new int[rows][columns];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++)
				{
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++)
			{
            for (int j = 0; j < columns; j++) 
			{
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Enter elements diagonal:");
		int val = sc.nextInt();
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++)
				{
                if (i == j) 
				{
                    a[i][j] = val;
                }
            }
        }
        
        System.out.println("The updated 2D array is:");
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

output
Enter number of rows:
3
Enter number of columns:
3
Enter elements:
1
2
3
4
5
6
7
8
9
The 2D array is:
1 2 3
4 5 6
7 8 9
Enter elements diagonal:
-1
The updated 2D array is:
-1 2 3
4 -1 6
7 8 -1
______________________________________________________________________________________________________________________________________________
//to print the greatest and smallest value in the given array
class New
{
    public static void main(String[] args)
	{
		int[] a={78,34,9,2,12};
		int len=a.length;
		int big=0;
		int small=999;
		for (int i=0;i<len;i++)
		{
			if (a[i]>big)
			{
				big=a[i];
			}
			if (a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println(small+"is the smallest value");
		System.out.println(big+"is the largest value");
		
	}
}
output
2is the smallest value
78is the largest value
steps
78is the smallest value
78is the largest value
34is the smallest value
78is the largest value
9is the smallest value
78is the largest value
2is the smallest value
78is the largest value
2is the smallest value
78is the largest value
______________________________________________________________________________________________________________________________________________
//to print the number in the array which has a duplicate
class New
{
    public static void main(String[] args)
	{
		int[] a={21,19,14,21,19};
		int len=a.length;
		for (int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println("duplicated value is:"+a[i]);
				}
			}
		}
		
	}
}
		
		
output
duplicated value is:21
duplicated value is:19
______________________________________________________________________________________________________________________________________________
//get one integer as input calculate sum of digits and display the result using method type 1
import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        sod();
    }

    public static void sod() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }

        System.out.println(sum);
    }
}
output
First numbers:10
Second numbers:20
Result numbers:30
______________________________________________________________________________________________________________________________________________
class Prac

{
    public static void main(String[] args)
	{
		red();
	
	}

	public static void red()
	{
		System.out.println("sami fav colour is red");

	}
}
output 
sami fav colour is red
______________________________________________________________________________________________________________________________________________
//method 2
import java.util.Scanner;

class New

{
    public static void main(String[] args)
	{
		int res =sod();
		System.out.println(res);
	}
		public static int sod()
	{
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		int sum = 0;
        int rem;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		return sum;
		
	}
}

output
265897
37
453274
25
______________________________________________________________________________________________________________________________________________
public class Prac 
{
    public static void main(String[] args) 
	{
        int a = 10;
        int b = 20;
        sum(a, b);
    }

    public static void sum(int n1, int n2) {
        int res = n1 + n2;
        System.out.print(res);
    }
}

output
30
______________________________________________________________________________________________________________________________________________

class Calculator//class
{
    int a;
    public int add(int n1 ,int n2)//method
    {
        int r= n1 + n2;
        //System.out.println("in add");
        return r;
    }
}

public class Prac //class
{
    public static void main(String a[]) 
    {
        int num1=4;
        int num2=5;
        Calculator calc=new Calculator();
        int result=calc.add(num1,num2);
        //int result =num1+num2;
        System.out.println(result);
    }
}
   

output
9
______________________________________________________________________________________________________________________________________________
//no parameters no return type 
public class Prac
{
	public static void sum()//function definitions 
	{
		int num=1234;
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
public static void main(String[]args)
			{
				sum();//function calling
				
			}
			
}			
		
		output
		10
______________________________________________________________________________________________________________________________________________
//with parameters with return type 
public class Prac
{
	public static int sum()//function definitions 
	{
		int num=1234;
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
public static void main(String[]args)
			{
				System.out.println(sum());
			}
			
}			
		
output
10
______________________________________________________________________________________________________________________________________________
//with parameters with return type 
public class Prac
{
	public static int sum()//function definitions 
	{
		int num=1234;
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
public static void main(String[]args)
			{
				int ans=sum();
				System.out.println(ans);
			}
			
}		
output
10
______________________________________________________________________________________________________________________________________________
//no parameters no return type 
public class Prac
{
	public static void sum(int num)//function definitions 
	{
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println(sum);
	}
public static void main(String[]args)
			{
				sum(1234);//function calling
				
				
			}
			
}	
output 10
______________________________________________________________________________________________________________________________________________
//no parameters no return type 
import java.util.Scanner;
public class Prac
{
	public static int sum(int num)//function definitions 
	{
		
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println(sum);
		return sum;
	}
public static void main(String[]args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter num:");
				int a = sc.nextInt();
				sum(a);//function calling
				
				
			}
			
}	
output
enter num:
1234
10
______________________________________________________________________________________________________________________________________________
//with parameters without return type
//printing sum of two numbers 
//no parameters no return type 
	
public class Prac
{
	public static int sum(int a,int b)//function definitions 
	{
		int sum=0;
		{
			sum=a + b;
		}
		
		System.out.println(sum);
		return sum;
	}
public static void main(String[]args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter num 1:");
				int a = sc.nextInt();
				System.out.println("enter num 2:");
				int b = sc.nextInt();
				
				sum(a,b);//function calling
				
				
			}
			
}	
output
enter num 1:
3
enter num 2:
4
7
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;
public class Prac
{
	public static int sum(int num)//function definitions 
	{
		
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
public static void main(String[]args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter num:");
				int a = sc.nextInt();
				System.out.println(sum(a));//function calling
				
				
			}
			
}
output
enter num:
123456
21
______________________________________________________________________________________________________________________________________________
//to check if the given number is palindrome or notpublic class Prac
{ 
	public static void main(String args[])
	{
		int num=123;
		
		int rev=0;
		int temp=num;
		while (num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
	
	if 
		(rev==temp)
		System.out.println("palindrome");
	else 
		System.out.println("not palindrome");
	}
}
output
not palindrome
_____________________________________zyy_________________________________________________________________________________________________________
//package Home.Loops;
public class Loopvar 
{   
	public static void main(String[]args)
    {
        
        int num=6;
//if loop starta

        if(num==3)
        {
                System.out.println("it is num 3 ");
        }
        else if (num==4){
            System.out.println("equal to 4");
        }
        else{
            System.out.println("not equal to 3 or 4");

        }
        int fornum=0;
        for (fornum=0;fornum<10;fornum++)
        {
            System.out.println(fornum);
        }
System.out.println("fornum  ends");
        
    int num2 = 0;
        //while loop starts
     String a ="*";

    while(num2<10)
    {
        System.out.println(a);
       a= a.concat("*");
        //System.out.println(num);
       num2++; //num = num+1; 
        // ++num;
    }
    
    //while ends
   
    

    }
}


output
not equal to 3 or 4
0
1
2
3
4
5
6
7
*
**
***
****
*****
******
*******
********
*********
**********
PS C:\CSM\Engeneering-2023\Year-1\Sem-1\Pract\Java\Home\Loops> javac Loopvar.java
PS C:\CSM\Engeneering-2023\Year-1\Sem-1\Pract\Java\Home\Loops> java Loopvar      
not equal to 3 or 4
0
1
2
3
4
5
6
7
8
9
fornum  ends
*
**
***
****
*****
******
*******
********
*********
**********
______________________________________________________________________________________________________________________________________________
public class Prac
{ 	
	int number;	
	String sname;
	public Prac()
	{
		System.out.println("no arguments constructor");
	}
	public void m1()
	{
		System.out.println("method");
	}
	public Prac(int no,String name)
	{
		number=no;
		sname=name;
		System.out.println(number);
		System.out.println(sname);
	}
	public static void main(String []args)
	{
		Prac a=new Prac();
		Prac a1=new Prac(12,"asd");
		Prac a2=new Prac(17,"sam");
		a.m1();
		a1.m1();
	}
}
		
output
no arguments constructor
12
asd
17
sam
method
method
______________________________________________________________________________________________________________________________________________
//constructors
public class Prac
{ 	
	Prac()//constructor
	{
		System.out.println("constructor");
	}
public static void main (String[]args)//mainclass
{
	Prac n=new Prac();//calling of constructor by creating new class
}

	
}
		output
		constructor
______________________________________________________________________________________________________________________________________________
//The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y).
// When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:
public class Prac {
  int x;

  public Prac(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Prac myObj = new Prac(5);//creating new obj myobj
    System.out.println(myObj.x);
  }
}
output
5
______________________________________________________________________________________________________________________________________________
public class Prac {
  int modelYear;
  String modelName;

  public Prac(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Prac myCar = new Prac(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
output
1969 Mustang
______________________________________________________________________________________________________________________________________________
class Constructor 
{
void m1()
{System.out.println("m1-method");
}}
public class Main//Main -name of the saved file
{
public static void main(String args[])
{
Constructor m=new Constructor();
m.m1();
}}
output
m1-method
______________________________________________________________________________________________________________________________________________
//encapsulation set and get 
// rule after set and get the name should start with captial letter
public class Prac
{
	String sname;
	public String getSname()
	{
		return sname;
	}
	public void setSname(String name)
	{
		this.sname = name;
	}
	public static void main(String [] args)
	{
		Prac h=new Prac();
		h.setSname("xyz");
		System.out.println(h.getSname());
		h.setSname("abc");
		System.out.println(h.getSname());
	}
}
		
output
xyz
abc
______________________________________________________________________________________________________________________________________________
import java.util.*;

class HouseDetail {
    String houseName;
    int doorNo;
    String street;

    public void house() {
        System.out.println(houseName);
        System.out.println("My house");
    }

    public void detail() {
        System.out.println(doorNo);
        System.out.println("This is my door number");
    }

    public void streetName() {
        System.out.println(street);
        System.out.println("Street name");
    }
}

public class Main {
    public static void main(String args[]) {
        HouseDetail building = new HouseDetail();
        building.houseName = "My House";
        building.doorNo = 123;
        building.street = "Main Street";

        building.house();
        building.detail();
        building.streetName();
    }
}
OUTPUT
My House
My house
123
This is my door number
Main Street
Street name
______________________________________________________________________________________________________________________________________________
//method overloading

class Calculator//class
{
    int a;
    public int add(int n1 ,int n2)//method
    {
        return n1+n2;
    } public int add(int n1 ,int n2,int n3)//method
    {
        return n1+n2+n3;
    } public double add(double n1 ,int n2)//method
    {
        return n1+n2;
    }
}

public class Prac //class
{
    public static void main(String a[]) 
    {
        
        Calculator obj=new Calculator();
       int r1=obj.add(3,4,7);
        System.out.println(r1);
    }
}
output
14
______________________________________________________________________________________________________________________________________________
public class Prac 
{
    public static void main(String[] args) 
    {
        int nums[] ={3,7,2,4};
        System.out.println(nums[0]);
        
        int[][] num2={ {1}, {1,2}, {1,2,3,4,5}, {1,2}, {1,2,3} };
        for (int i=0; i<(num2.length); i++ ) {
            for (int j=0;j<num2[i].length;j++)
                System.out.println(num2[i][j]);
        }
    
    }
}
output
3
1
1
2
1
2
3
4
5
1
2
1
2
3
______________________________________________________________________________________________________________________________________________
  class Box {
 double width, height, depth;
 
 Box(double w, double h, double d) {
  width = w;
  height = h;
  depth = d;
 }
 
 Box() {
  width = height = depth = 0;
 }
 
 Box(double len) {
  width = height = depth = len;
 }
 
 double volume() {
  return width * height * depth;
 }
}

public class Prac {
 public static void main(String[] args) {
  Box mybox1 = new Box(10, 20, 15);
  Box mybox2 = new Box(10,10,10);
  Box mycube = new Box(7);
  double vol;
  
  vol = mybox1.volume();
  System.out.println("Volume of mybox1 is " + vol);
  
  vol = mybox2.volume();
  System.out.println("Volume of mybox2 is " + vol);
  
  vol = mycube.volume();
  System.out.println("Volume of mycube is " + vol);
 }
}
output
Volume of mybox1 is 3000.0
Volume of mybox2 is 1000.0
Volume of mycube is 343.0
______________________________________________________________________________________________________________________________________________
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("name: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("puppyAge is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("call using obj: " + myPuppy.puppyAge);
    }
}

output
name: tommy
puppyAge is: 2
call using obj: 2
______________________________________________________________________________________________________________________________________________
 class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(134001, "sami");
        Student s2 = new Student(134002, "samiksha");
        s1.display();
        s2.display();
    }
}

class Test {
    void m1() {
        System.out.println("m1-method");
    }

    Test() {
        System.out.println("0-arg constructor");
    }

    Test(int a) {
        System.out.println("1-arg constructor");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test(10);
        t.m1();
        t2.m1();
    }
}
output
0-arg constructor
1-arg constructor
m1-method
m1-method
______________________________________________________________________________________________________________________________________________
public class Prac
{
    public static void main(String[] args) {
        int nums[][]=new int [3][4];
        for (int i=0;i<3;i++)
        { 
            for (int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
          }
          for (int i=0;i<3;i++)
        { 
            for (int j=0;j<4;j++)
            {
                System.out.print(nums[i][j]+" ");
        
            }
            System.out.println();
          }

    }
}
output
4 9 8 8 
2 6 1 5 
2 8 4 9 
______________________________________________________________________________________________________________________________________________
public class Prac
{
    public static void main(String[] args) {
        int nums[][]=new int [3][4];
        for (int i=0;i<3;i++)
        { 
            for (int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
          }
          for (int i=0;i<3;i++)
        { 
            for (int j=0;j<4;j++)//for loop
            {
                System.out.print(nums[i][j]+" ");
        
            }
            System.out.println();
          }
          //enhanced for loop
          for (int n[]:nums)
          {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
          }

    }
}
output
3 9 2 2 // first loop
8 2 5 9 
3 8 7 8 
3 9 2 2 //enhanced for loop
8 2 5 9 
3 8 7 8 
______________________________________________________________________________________________________________________________________________
//word palindrome
public class Prac {
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
    String word = "adadas";

    if (isPalindrome(word)) {
      System.out.println(word + " is a palindrome.");
    } else {
      System.out.println(word + " is not a palindrome.");
    }
  }
}
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;
public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input number from the user
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();
        // Extract the first and last digits of the number
        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        // Check if the first and last digits are the same
        boolean areSame = firstDigit == lastDigit;
        // Print the result
        if (areSame) {
            System.out.println("The first and last digits of the number are the same.");
        } else {
            System.out.println("The first and last digits of the number are not the same.");
        }
    }
}
______________________________________________________________________________________________________________________________________________
//decimal to binary conversion
import java.util.*;
public class Main
{
	public static void main(String[]args)
	{
		int dec,quo,i=1,j;
		int bin[]=new int[50];
		Scanner sc=new Scanner(System.in);
		dec=sc.nextInt();
		quo=dec;
		while (quo!=0)
		{
			bin[i++]=quo%2;
			quo=quo/2;
		}
		for(j=i-1;j>0;j--)
		{
			System.out.print(bin[j]);
		}
	}
}
______________________________________________________________________________________________________________________________________________
//Static variable
class Mobile 
{
   String brand;//instance variables
   int price;
   static String name;
   public void show()
   {
        System.out.println(brand+" : "+price+" : "+name );
   }
}

public class Main
{
    public static void main(String[] args) 
    {
        Mobile obj1=new Mobile();
        obj1.brand="Samsung";
        obj1.price=1700;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Apple";
        obj2.price=1500;
        Mobile.name="phone";


        obj1.show();
        obj2.show();
        


    }
}
______________________________________________________________________________________________________________________________________________
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the square pattern:");
    int size = scanner.nextInt();
    scanner.close();

    printSquarePattern(size);
}

public static void printSquarePattern(int size) {

    for (int i = 0; i < size; i++) {

        for (int j = 0; j < size; j++) {
            System.out.print("# ");
        }

        System.out.println();
    }
}
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the triangle pattern:");
        int size = scanner.nextInt();
        scanner.close();

        printTrianglePattern(size);
    }

    public static void printTrianglePattern(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
______________________________________________________________________________________________________________________________________________
import java.util.Scanner;

public class BoxPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the box pattern:");
        int size = scanner.nextInt();
        scanner.close();

        printBoxPattern(size);
    }

    public static void printBoxPattern(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
_______________________________________________________________________________________________________________________________________-
import java.util.Scanner;

public class TriangleNumberPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangle pattern:");
        int rows = scanner.nextInt();
        scanner.close();

        printTriangleNumberPattern(rows);
    }

    public static void printTriangleNumberPattern(int rows) {

        for (int i = 1; i <= rows; i++) {

            int number = 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}
_______________________________________________________________________________________________________________________________________-
import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the multiplication table:");
        int size = scanner.nextInt();
        scanner.close();

        printTimeTable(size);
    }

    public static void printTimeTable(int size) {

        // Print row and column headers
        System.out.print("* ");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print multiplication table
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
_______________________________________________________________________________________________________________________________________-
binary to character
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
                int integerValue = Integer.parseInt(str, 2);
                char character = (char) integerValue;
                System.out.println(character); // A
	        } else {
	            System.out.println("The string is not binary.");
	        }
	    }
	}
	_______________________________________________________________________________________________________________________________________-
	

//to create a file
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
} 

______________________________________________________________________________________________________________________________________________
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 5);
        Rectangle rect2 = new Rectangle(4, 6);

        System.out.println("Rectangle 1: " + rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println("\nRectangle 2: " + rect2.toString());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("Rectangle 1 is bigger.");
        } else if (rect1.getArea() < rect2.getArea()) {
            System.out.println("Rectangle 2 is bigger.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

class Rectangle1 {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {}

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

            public double getArea() {
                return length * width;
            }

            public double getPerimeter() {
                return 2 * (length + width);
            }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}\
---------------------------
public class Rectangle2 {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {}

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}

-----
g={
    'a':['b','c','d'],
    'b':['d','c','a','b'],
    'c':['d','b','a'],
    'd':['b','c','a'],

}
count=0
for k in g:
    if( k in g[k]):
        print("loop")
        count=count+1
    else:
        print(g[k],"no loop")
print("no of loops",count)
