import java.io.*;
interface area
{
float compute(float x,float y);
}
class rectangle implements area
{
public float compute(float x,float y)
{
return(x*y);
}
}
class triangle implements area
{
public float compute(float x,float y)
{
return(x*y/2);
}
}
class prg2
{
public static void main(String args[])
{
rectangle rect=new rectangle();
triangle tri=new triangle();
area area;
area=rect;
System.out.println("area of rectangle="+area.compute(1,2));
area=tri;
System.out.println("area of triangle="+area.compute(10,2));
}
}