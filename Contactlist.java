import java.util.Scanner;

//Write a Java program that implements a contact management system using classes and interfaces. The classes should include Contact, PersonalContact, and ContactManager. The interface should include CRUD operations.

interface ContactManage
  {
    public void readContact();
    public void updateContact();
  }
class Contact
  {
    Scanner sc=new Scanner(System.in);
    int contactID;
    String name,email;
    long phonenumber;
    Contact()
    {
      this.contactID=contactID;
      this.name=name;
      this.email=email;
      this.phonenumber=phonenumber;
    }
  }
class PersonalContact extends Contact implements ContactManage
  {
    String address;
    public void readContact(String name, int contactID,String email,long phonenumber)
    {
      System.out.println("Enter the address");
      address=sc.nextLine();
      sc.nextLine();
      System.out.println("Conact ID: "+contactID);
      System.out.println("Name: "+name);
      System.out.println("Phone number: "+phonenumber);
      System.out.println("Email: "+email);
      System.out.println("Address: "+address);
      System.out.println("The contact details are added successfully");
    }
    public void updateContact(String name, int contactID,String email,long phonenumber)
    {
      System.out.println("The contact details are being updated");
    }
  }
class ContactManager extends PersonalContact
  {
     public void updateContact(String name, int contactID,String email,long phonenumber)
    {
      System.out.println("Enter the details to update contact");
      System.out.print("Enter new name");
      String updatename=sc.nextLine();
      sc.nextLine();
      System.out.print("Enter new email");
      String updateemail=sc.nextLine();
      sc.nextLine();
      System.out.print("Enter new Phone number");
      long newphonenumber=sc.nextLong();
      System.out.println("Contact updated successfully");
    }
  }
class Contactlist
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of contacts to be created");
      int n=sc.nextInt();
      ContactManager cm=new ContactManager();
      Contact ca[]=new Contact[n];
      for(int i=0;i<n;i++)
        {
        ca[i]=new Contact();
        }
      for(int i=0;i<n;i++)
        {
            System.out.println("Enter contact ID");
            ca[i].contactID=sc.nextInt();
            System.out.println("Enter name");
            ca[i].name=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter email");
            ca[i].email=sc.nextLine();
            System.out.println("Enter contact number");
            ca[i].phonenumber=sc.nextLong();      cm.readContact(ca[i].name,ca[i],contactID,ca[i].email,ca[i].phonenumber);
        }
      cm.updateContact(ca.name,ca,contactID,ca.email,ca.phonenumber);
    }
  }