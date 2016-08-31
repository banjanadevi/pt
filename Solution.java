import java.util.*;
public class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string to evaluate");
String s1=sc.next();
String s2="";
for(int i=0;i<s1.length()/2+1;i++)
{
if(s1.substring(0,i).equals(s1.substring(s1.length()-i)))
{
s2=s1.substring(0,i);
}
}
System.out.println("The resultantant string is"+s2);
}
}