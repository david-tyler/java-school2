// Lab33ast.java
// This is the student Version of the Lab33a assignment.


import java.awt.*;
import java.awt.event.*;


public class Lab33ast
{
	public static void main(String args[])
	{
		GfxApp gfx = new GfxApp();
		gfx.setSize(1000,750);
		gfx.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		gfx.show();
	}
}


class GfxApp extends Frame
{
	
	private int td = 200;		// time delay to slow down graphics display
	
	public void paint (Graphics g)
	{
		g.setFont(new Font("ARIAL",Font.BOLD,28));
		g.drawString("LAB 33A 80/100 POINT VERSION",300,50); 
		g.setFont(new Font("ARIAL",Font.BOLD,20));
		g.drawString("DRAWING A LINKED LIST AS A STACK",50,215); 
	//	g.drawString("DRAWING A LINKED LIST AS A QUEUE",50,415);   	// for 100 point version only
		drawStack(g);
	//	drawQueue(g);												// for 100 point version only
	}
	
	public void drawStack(Graphics g)
	{
		g.setFont(new Font("ARIAL",Font.BOLD,20));
		int xco =100;
		int yco =300;
		/* GfxNode one = new GfxNode(g, 100, 300, 'a', 1, 2);
		GfxNode two = new GfxNode(g, 150, 300, 'b', 1, 2);
		
		one.enterData(g,'A',1);
		two.enterData(g,'B',1);
		
		one.drawLink(g, two, 1); */
		
		GfxNode one = new GfxNode(g, xco, yco, 'g', 1, 2000);
		one.enterData(g, (char)(71), 1);
		one.drawPointer(g,(char)(72), 1,1);
		
		for(int x= 70; x>=65; x--)
		{
			char c = (char)x;
			xco+=50;
			GfxNode two = new GfxNode(g, xco, yco, c , 1, 2000);	
			two.enterData(g, c, 1);
			one.drawLink(g, two, 1); 
			one = two;
			
		} 
		
		//GfxNode.drawLetter(g,(char)(71),

  		
	}
	

	public void drawQueue(Graphics g)
	{
  		
  		
	}
	

}


