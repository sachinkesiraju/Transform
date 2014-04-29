
/**
 * program to check whether a number is a palindrome even after adding the reverse of its digits
 * Level 2 algorithm on Top Coder high school championship
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Transform
{
    int sum;
    int num;
    public void main()throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        Transform obj = new Transform ();
        int rem=n;
        int s;
        while(rem<1000000000)
        {
            s=obj.palindrome(rem);
           if(s==rem)
           {              
              System.out.println("Palindrome " +s);
              break;
           }  
           else 
           {
               System.out.println("Not palindrome yet " +s);
               rem+=s;
               System.out.println();
               System.out.println("Number after adding reverse "+rem);
               continue;
            }
        }
        if(rem>1000000000)
        {
            System.out.println("Number too large");
        }
    }
    public static int palindrome(int num)//to check if number is palindrome
    {
       int digit=0;
       int pal=0;
       while(num>0)
       {
           digit=num%10;
           num=num/10;
           pal=pal*10+digit;
       }
        return pal;
       }
    }

