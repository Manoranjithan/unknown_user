import java.awt.*;
import java.awt.event.*;
public class prg10 extends Frame implements MouseListener
{
Label l1;
prg10()
{
l1=new Label("Welcome to MouseEvent");
setLayout(new FlowLayout());
add(l1);
addMouseListener (this);
addWindowListener(new W());
}
class W extends WindowAdapter
{
public void Windowclosing(WindowEvent e)
{
System.exit(0);
}
}
public void mouseReleased(MouseEvent e)
{
l1.setText("MouseReleased");
}
public void mousePressed(MouseEvent e)
{
l1.setText("MousePressed");
}
public void mouseExited(MouseEvent e)
{
l1.setText("MouseExited");
}
public void mouseEntered(MouseEvent e)
{
l1.setText("MouseEntered");
}
public void mouseClicked(MouseEvent e)
{
l1.setText("MouseClicked");
}
public static void main(String[]args)
{
prg10 W=new prg10();
{
W.setVisible(true);
W.setSize(300,500);
}
}
}
//<appletcode =prg10.class width=500 height=500>
//</applet>