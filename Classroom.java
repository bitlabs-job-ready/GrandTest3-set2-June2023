//You are building a student management system for a school that allows teachers to manage student information. The system should be able to add new students, display student details, calculate average marks, and handle exceptions for invalid inputs. Your task is to create a Java program that implements the necessary classes and methods to achieve these functionalities.

import java.util.*;

public class InvalidMarkException extends Exception
  {
    public InvalidMarkException(String message)
    {
      super(message);
    }
  }

class Student
  {
    Scanner sc=new Scanner(System.in);
    int rollno,noofsubjects,totalmarks=0;
    int subject_marks[]=new int[noofsubjects];
    float avgmarks;
    String name;
    Student()
    {
      System.out.println("Enter the number of subjects");
      this.noofsubjects=sc.nextInt();
      this.avgmarks=avgmarks;
      this.rollno=rollno;
      this.name=name;
      this.subject_marks=new int[noofsubjects];
    }
    public void displayStudentdetails(String name, int rollno, int subject_marks[],int noofsubjects) throws InvalidMarkException
    {
      for(int i=0;i<noofsubjects;i++)
        {
          if((subject_marks[i]>100)||(subject_marks[i]<0))
          {
            throw new InvalidMarkException("Invalid marks entered. Please enter valid marks");
          }
        }
    }
  }
class Sturesult extends Student
  {
    public void displayStudentdetails(String name, int rollno, int subject_marks[],int noofsubjects)
    {
      System.out.println("Student ID: "+rollno);
      System.out.println("Student name: "+name);
      for(int i=0;i<noofsubjects;i++)
        {
          System.out.println("Subject "+(i+1)+" marks: "+subject_marks[i]);
        }
      for(int i=0;i<noofsubjects;i++)
        {
          totalmarks=totalmarks+subject_marks[i];
        }
      avgmarks=totalmarks/noofsubjects;
      System.out.println("Average marks: "+avgmarks);
    }
  }
class Classroom
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      Student st=new Student();
      Sturesult sr=new Sturesult();
      System.out.println("Enter student ID");
      st.rollno=sc.nextInt();
      System.out.println("Enter Student name");
      st.name=sc.next();
      sc.nextLine();
      int subject_marks[]=new int[st.noofsubjects];
      try
        {
          System.out.println("Enter the marks of student");
          for(int i=0;i<st.noofsubjects;i++)
            {
              subject_marks[i]=sc.nextInt();
              st.subject_marks[i]=subject_marks[i];
            }
          st.subject_marks=subject_marks;
          st.displayStudentdetails(st.name,st.rollno,subject_marks, st.noofsubjects);
           System.out.println("The student details are displayed as follows");
          sr.displayStudentdetails(st.name,st.rollno,subject_marks,st.noofsubjects);
        }
      catch(InvalidMarkException ie)
        {
          System.out.println("Exception occured "+ie.getMessage());
        }
    }
  }