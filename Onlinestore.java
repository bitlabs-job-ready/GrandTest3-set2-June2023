//Online Shopping Platform Product Data Input:- You are a software developer working for an online shopping platform. The platform allows customers to purchase a wide variety of products. Your task is to develop a program that allows the platform administrators to input product data dynamically and validate the inputs according to specific requirements. The program should also display the data for all the products entered.

import java.util.*;

public class InvalidPriceException extends Exception
  {
    InvalidPriceException(String message)
    {
      super(message);
    }
  }

class Product
  {
    int quantity,productID;
    String productname,category;
    float price;
    Product()
    {
      this.quantity=quantity;
      this.price=price;
      this.productID=productID;
      this.productname=productname;
      this.category=category;
    }
    void displayItem() throws InvalidPriceException
    {
      if(price<1)
      {
        throw new exception("Invalid price entered");
      }
      System.out.println("Product ID "+productID);
      System.out.println("Product name "+productname);
      System.out.println("Product category "+category);
      System.out.println("Price "+price);
      System.out.println("Quantity in stock "+quantity);
    }
  }
class Onlinestore
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of products");
      int n=sc.nextInt();
      Product pr[]=new Product[n];
      for(int i=0;i<n;i++)
        {
          pr[i]=new Product();
        }
      try
        {
          for(int i=0;i<n;i++)
            {
              System.out.print("Product name: ");
              pr[i].productname=sc.next();
              System.out.print("Product Category: ");
              pr[i].category=sc.next();
              System.out.print("Price : ");
              pr[i].price=sc.nextFloat();
              System.out.print("Quantity in Stock: ");
              pr[i].quantity=sc.nextInt();
              System.out.print("Product ID: ");
              pr[i].productID=sc.nextInt();
              pr[i].displayItem();
            }
        }
      catch(InvalidPriceException ip)
        {
          System.out.println("Error occured "+ip.getMessage());
        }
    }
  }