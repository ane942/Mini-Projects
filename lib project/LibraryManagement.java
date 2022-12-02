import javax.swing.*;
import java.awt. event.*;
import java.awt.*;
public class LibraryManagement 
{
	LibraryManagement()
	{
	JFrame f=new JFrame();
JLabel l=new JLabel("LIBRARY MANAGEMENT SYSTEM");
   l.setFont(new Font("times new roman", Font.BOLD, 30));
   l.setBounds(225,100,700,100);
	JButton b0=new JButton("View Book");
	b0.setBounds(200,200,250,50);

b0.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame();
JLabel l0=new JLabel("AVAILABLE BOOKS");
   l0.setFont(new Font("times new roman", Font.BOLD, 25));
   l0.setBounds(225,100,700,100);
f.add (l0);
f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b1=new JButton("View User");
	b1.setBounds(200,300,250,50); 

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame();

f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b2=new JButton("View Issued book");
	b2.setBounds(200,400,250,50);

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame();

f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b3=new JButton("Issue Book");
	b3.setBounds(200,500,250,50);

b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{

JFrame f=new JFrame("ISSUE BOOK");
JLabel l1,l2,l3,l4,l5;
 l1=new JLabel("ENTER  DETAILS");
l1.setFont(new Font("times new roman",Font.BOLD,30));
l1.setBounds(150,50,500,50);
 l2=new JLabel("BOOK ID:");
l2.setBounds(100,130,200,50);
l2.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a1=new JTextField();
a1.setBounds(330,130,200,30);
 l3=new JLabel("USER ID:");
l3.setBounds(100,200,200,50);
JTextField a2=new JTextField();
l3.setFont(new Font("times new roman",Font.BOLD,20));
a2.setBounds(330,200,200,30);
 l4=new JLabel("PERIOD:");
l4.setBounds(100,270,200,50);
l4.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a3=new JTextField();
a3.setBounds(330,270,200,30);
 l5=new JLabel("ISSUE DATE:");
l5.setBounds(100,350,200,50);
l5.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a4=new JTextField();
a4.setBounds(330,350,200,30);
JButton b=new JButton("SUBMIT");
	b.setBounds(200,500,100,50);
f.add(b);
f.add(l1);
f.add(l2);f.add(l3);f.add(l4);f.add(l5);
f.add(a1);f.add(a2);f.add(a3);f.add(a4);

f.setSize(800,800);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b4=new JButton("Add User");
	b4.setBounds(500,200,250,50);
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame("Enter user details");
JLabel l1,l2;
l1=new JLabel("Username");
l1.setBounds(30,15,100,30);
l2=new JLabel("Password");
l2.setBounds(30,50,100,30);
JTextField a3=new JTextField();
a3.setBounds(110,15,200,30);
 JPasswordField a4=new JPasswordField();
  a4.setBounds(110, 50, 200, 30);
JRadioButton r1=new  JRadioButton ("admin");
r1.setBounds(55,80,200,30); 
JRadioButton r2=new  JRadioButton ("user");
r2.setBounds(200,80,200,30);
   ButtonGroup bg=new ButtonGroup();    
                bg.add(r1);bg.add(r2);           
  JButton c=new JButton("Create");
c.setBounds(130,130,80,25);
f.add(a3);
f.add(a4);
f.add(r1);
f.add(r2);
f.add(l1);
f.add(l2);
f.add(c);
f.setSize(350,200);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b5=new JButton("Add Book");
	b5.setBounds(500,300,250,50);
b5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame("ADD BOOK");
JLabel l1,l2,l3,l4,l5;
 l1=new JLabel("ENTER BOOK DETAILS");
l1.setFont(new Font("times new roman",Font.BOLD,30));
l1.setBounds(150,50,500,50);
 l2=new JLabel("BOOK NAME:");
l2.setBounds(100,130,200,50);
l2.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a1=new JTextField();
a1.setBounds(330,130,200,30);
 l3=new JLabel("AUTHOR:");
l3.setBounds(100,200,200,50);
JTextField a2=new JTextField();
l3.setFont(new Font("times new roman",Font.BOLD,20));
a2.setBounds(330,200,200,30);
 l4=new JLabel("CATEGORY:");
l4.setBounds(100,270,200,50);
l4.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a3=new JTextField();
a3.setBounds(330,270,200,30);
 l5=new JLabel("PRICE:");
l5.setBounds(100,350,200,50);
l5.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a4=new JTextField();
a4.setBounds(330,350,200,30);
JButton b=new JButton("SUBMIT");
	b.setBounds(200,500,100,50);
f.add(b);
f.add(l1);
f.add(l2);f.add(l3);f.add(l4);f.add(l5);
f.add(a1);f.add(a2);f.add(a3);f.add(a4);
f.setSize(800,800);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b6=new JButton("Return Book");
	b6.setBounds(500,400,250,50);
b6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame();
JLabel l1,l2,l3;
 l1=new JLabel("ENTER  DETAILS");
l1.setFont(new Font("times new roman",Font.BOLD,30));
l1.setBounds(150,50,500,50);
 l2=new JLabel("ISSUE ID:");
l2.setBounds(100,130,200,50);
l2.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a1=new JTextField();
a1.setBounds(330,130,200,30);
 l3=new JLabel("RETURN DATE:");
l3.setBounds(100,200,200,50);
l3.setFont(new Font("times new roman",Font.BOLD,20));
JTextField a2=new JTextField();
a2.setBounds(330,200,200,30);
JButton b=new JButton("RETURN");
	b.setBounds(200,300,250,50);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(a1);
f.add(a2);
f.add(b);
f.setSize(800,500);
	f.setLayout(null);
	f.setVisible(true);
}
});
	JButton b7=new JButton("Create or Reset");
	b7.setBounds(500,500,250,50);
b7.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JFrame f=new JFrame();

f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
}
});
	f.add(l);
	f.add ( b0);
	f.add ( b1);
	f.add ( b2);
	f.add ( b3);
	f.add ( b4);
	f.add ( b5);
	f.add ( b6);
	f.add ( b7);
	f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
		  } 
		 
}
