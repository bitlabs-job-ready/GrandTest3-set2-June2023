// Write a Java program to count the number of elements in an array that have specific properties. The program should prompt the user to enter the size of the array and then input the elements of the array dynamically. After inputting the array elements, the program should count the number of elements that have each specific property and display the results.
/* Sample: Number of elements divisible by 5: 1
Number of elements with digit sum greater than 10: 2
Number of perfect Number elements: 1
Number of elements with repeating digits: 1 */

import java.util.*;

class Arrayop
  {
    public static void main(String ar[])
    {
      Arrayop ao=new Arrayop();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("The array elements are");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      ao.checkDivisibility(a,n);
      ao.sumThreshold(a,n);
      ao.isPerfect(a, n);
    }
    public void checkDivisibility(int a[],int n)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number by which the elements must be divisible");
      int b=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
        {
          if(a[i]%b==0)
          {
            count++;
          }
        }
      System.out.println("The number of elements divisible by "+b+" : "+count);
    }
    public void sumThreshold(int a[],int n)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the digit sum threshold");
      int dt=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
        {
          int temp=a[i];
          int sum=0;
          while(temp>0)
            {
             int digit=temp%10;
              sum=sum+digit;
              temp=temp/10;
            }
          if(sum<a[i])
          {
            count++;
          }
        }
      System.out.println("The number of elements with digit sum greater than "+dt+" : "+count);
    }
    public void isPerfect(int a[],int n)
    {
      int count=0,sum=0;
      for(int i=0;i<n;i++)
        {
          for(int j=1;j<a[i];j++)
            {
              if(a[i]%j==0)
              {
                sum=sum+j;
              }
            }
          if(sum==a[i])
          {
            count++;
          }
        }
      System.out.println("The no of perfect numbers in the array "+count);
    }
  }