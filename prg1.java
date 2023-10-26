import java.io.*;
import java.io.DataInputStream;
class prg1
{
public static void main(String args[])
{
String str1=new String();
String str2=new String();
int m=0,n=0;
DataInputStream in=new DataInputStream(System.in);
try
{
System.out.println("enter  the String:");
str1=in.readLine();
System.out.println("String is:"+str1);
System.out.println("enter number of character to be extracted from String:");
m=Integer.parseInt(in.readLine());
System.out.println("enterstarting index:");
n=Integer.parseInt(in.readLine());
}
catch(Exception e)
{
System.out.println("I/O error");
}
str2=str1.substring(n,m+n);
System.out.println("extracted String is:"+str2);
}
}

