import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class prg6 extends Applet implements ActionListener
{
Label l1,l2,l3,l4;
TextField t1,t2,t3,t4;
Button b1,b2;
public void init()
{
setForeground(Color.black);
l1=new Label("Name");
l2=new Label("Street");
l3=new Label("City");
l4=new Label("Pin");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
t4=new TextField(10);
b1=new Button(" My details");
b2=new Button("clear");
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(t3);
add(t4);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void paint(Graphics g)
{
Font f1=new Font("Arial",Font.ITALIC+Font.BOLD,30);
g.setFont(f1);
g.setColor(Color.red);
g.drawString("WELCOME",10,30);
l1.setLocation(50,50);
t1.setLocation(100,50);
l2.setLocation(50,100);
t2.setLocation(100,100);
l3.setLocation(50,150);
t3.setLocation(100,150);
l4.setLocation(50,200);
t4.setLocation(100,200);
b1.setLocation(100,300);
b2.setLocation(200,300);
}
public void actionPerformed(ActionEvent e)
{
if (e.getSource()==b1)
{
t1.setText("Dhanu");
t2.setText("5th street");
t3.setText("Karamadai");
t4.setText("641603");
}
if (e.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
}
}
//<applet code=prg6.class width=500 height=500>
//</applet>


