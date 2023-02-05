AAA
BBB
CCC
public class MyClass {
    public static void main(String args[]) {
      char ip='A';
      for(int i=1;i<=3;i++)
      {
        for(int j=1;j<=3;j++)
        { 
            System.out.print(ip);
        }
        ip++;
        System.out.println();
      }
    }
}

ABC
DEF
GHI
public class YourClassNameHere {
    public static void main(String[] args) {
      char ip='a';
      for(int i=1;i<=3;i++)
      {
        for(int j=1;j<=3;j++)
        { 
            System.out.print(ip++);
        }
        System.out.println();
      }
    }
}



*****
 ****
  ***
   **
    *
public class YourClassNameHere {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++)
      {
        for(int j=1;j<=5;j++)
        {
         if(i==j ||i<j)
         System.out.print("*");
         else
         System.out.print(" ");
        }
        System.out.println();
      }
 
    }
}
 
Math function:
public class YourClassNameHere {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,4)); #16.0
    }
}
 
0 
1 1 
2 3 5 
8 13 21 34
public class YourClassNameHere {
    public static void main(String[] args) {
     int prev=0,next=1;
     for(int i=1;i<5;i++)
     {
       for(int j=1;j<=i;j++)
     {
       int sum=prev+next;
       System.out.print(prev+" ");
       prev=next;
       next=sum;
     } 
     System.out.println();
     }   
    }
}


ABC
ABC
ABC
public class YourClassNameHere {
    public static void main(String[] args) {
      for(int i=1;i<=3;i++)
      {
        char ip='A';
        for(int j=1;j<=3;j++)
        { 
            System.out.print(ip++);
        }
        System.out.println();
      }
    }
}


*
 *
  *
  public class YourClassNameHere {
    public static void main(String[] args) {
      for(int i=1;i<=3;i++)
      {
        for(int j=1;j<=3;j++)
        {
          if(i==j)
            System.out.print("*");
          else
          System.out.print(" ");
        }
        System.out.println();
      }
    }
}


*
**
***
****
*****
public class YourClassNameHere {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++)
      {
        for(int j=1;j<=i;j++)
        { 
            System.out.print("*");
        }
        System.out.println();
      }
    }
}

   * 
  *  
 *   
*
public class YourClassNameHere {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++)
      {
        for(int j=1;j<=5;j++)
        { 
          if(i+j==5)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
    }
}


    *
   **
  ***
 ****
*****
public class YourClassNameHere {
    public static void main(String[] args) {
      for(int i=1;i<=5;i++)
      {
        for(int j=1;j<=5;j++)
        { 
          if(i+j>5)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
    }
}

even or odd
public class YourClassNameHere {
    public static void main(String[] args) {
          int i=5/; 
          if(i%2==0)
            System.out.print("even");
          else
            System.out.print("odd");
    }
}

Print n numbers in reverese order
public class Basic {
    public static void main(String[] args) {
        for(int i=100;i>=1;i--){
            System.out.println(i);
        }
    }
}

Print palindrome
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int res=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(res==rev)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
}

Another program for palindrome

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        int leng=String.valueOf(ip).length();
        int i=0,rev=0,check=ip;
        while(i<leng){
        int rem=ip%10;
        rev=rev*10+rem;
        ip/=10;
        i++;
        }
        if(check==rev)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
}
Count no of digits
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        while(num>0){
                 num=num/10;
                 count++;
        }
        System.out.println(count);
    }
}

Another way for Count no of digits
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        int leng=String.valueOf(ip).length();
        System.out.println("Count no of digits in given number:"+leng);
    }
}



