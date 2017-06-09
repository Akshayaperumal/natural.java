# natural.java
import java.io.*;
import java.util.*;
public class natural
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i=1;
        int sum=0;
        while(i<=a)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        
    }
}
