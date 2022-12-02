import javax.swing.*;
import java.awt. event.*;
import java.awt.*;
public class Librarian implements ActionListener
{
private static JLabel label;
private static JTextField a1;
private static JLabel password;
private static JPasswordField a2;
private static JButton button;
private static JLabel success;
public static void main(String[]args)
{
JFrame frame=new JFrame("LOGIN PAGE ");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel=new JPanel();
 label=new JLabel("User");
label.setBounds(10,20,80,25);

          label.setFont(new Font("times new roman", Font.ITALIC, 20));
panel.add(label);
		   a1= new JTextField (20);
		  a1.setBounds(100,20,165,25);
panel.add(a1);

           password= new JLabel("Password");                                     // for the password label
	      password.setBounds(10,50,80,25);
          password.setFont(new Font("times new roman", Font.ITALIC, 20));
panel.add(password);
           a2= new JPasswordField (25);
		  a2.setBounds(100,50,165,25);
 button=new JButton("Login");
button.addActionListener(new Librarian());
button.setBounds(10,80,80,25);
panel.add(button);
 success=new JLabel(" ");
success.setBounds(10,110,300,25);
panel.add(success);



panel.add(a2);
frame.setSize(350,200);

panel.setLayout(null);
frame.add(panel);
frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{
String user= a1.getText();
String pass= a2.getText();
if (user.equals("admin")&&pass.equals("admin"))
{
success.setText("login success");
new LibraryManagement();
}
else
{
JOptionPane.showMessageDialog(null,"Wrong username/password");
}
}
}
