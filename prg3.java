import java.io.*;                       
class cheque extends Exception
{
cheque()
{
System.out.println("SORRY YOUR CHEQUE IS DISHONORED");
}
}
public class prg3
{
public static void main(string p[]) throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int bal,wd;
System.out.println("****************");
System.out.println("PAY OUT BOUNCE");
System.out.println("****************");
System.out.println();
System.out.println("enter your amt balance");
bal=Integer.parseInt(d.readLine());
System.out.println("enter the withdraw amount:");
wd=Integer.parseInt(d.readLine());
if(wd>=bal)
{
System.out.println();
new cheque();
System.out.println();
}
else
{
System.out.println();
System.out.println("Your Cheque is passed!");
System.out.println();
}
}
}