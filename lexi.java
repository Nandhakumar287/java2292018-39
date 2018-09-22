import java.io.*;
import java.util.*;
  public class lexi{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.nextLine();
      for(int i=0;i<str.length();i++)
      {
        for(int j=0;j<str.length();j++)
        {
        if(str.charAt(i)>str.charAt(j))
        {
        str.charAt(j)=str.charAt(i);
        }
        }
        System.out.println(str.charAt(j));
      }  
    }
  }  
