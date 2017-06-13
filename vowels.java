import java.io.*;
import java.util.*;
class vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer b=new StringBuffer(a);
        StringBuffer c=b.reverse();
        System.out.println(c);
        char ch[]=new String(c).toCharArray();
        for(int i=0;i<c.length();i++)
        {
         if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
         {
             ch[i]='\0';
         }
         
        }
        for(int i=0;i<c.length();i++)
        {
            System.out.print(ch[i]);
        }
        
        
        
    }
}



