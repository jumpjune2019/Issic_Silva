import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;

class Rectangle extends JPanel
{
public Rectangle()
{
//to  Set JFrame title
 super();

 //Set JFrame size
 setSize(500,500);

 //Make JFrame visible
 setVisible(true);
}

public void paint(Object object)
{
 super.paint((Graphics) object);

 //draw rectangle outline
 ((Graphics) object).drawRect(50,50,300,100);

 //set color to Green
 ((Graphics) object).setColor(Color.GREEN);

 //fill rectangle with GREEN color
 ((Graphics) object).fillRect(50,50,300,100);
}
}