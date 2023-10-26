import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
public class prg7 extends Applet implements ItemListener
{
Label l1;
List c1;
String S[];
int i;
public void init()
{
String S[]=new String[5];
for(int i=0;i<5;i++)
{
S[i]="";
}
l1=new Label("select your favourite car:");
c1=new List(4,true);
c1.add("audi");
c1.add("bmw");
c1.add("jaguare");
c1.add("lamborhini");
c1.add("porsche");
add(l1);
add(c1);
c1.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==c1)
{
S=c1.getSelectedItems();
repaint();
}
}
public void paint(Graphics g)
{
int y=300,x=200;
g.drawString("your favourite car is:",x,y);
y=y+20;
for(int i=0;i<S.length;i++)
{
g.drawString(S[i],x,y);
y=y+10;
}
}
}
//<applet code=prg7.class width=500 height=500>
//</applet>