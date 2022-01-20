package gui;
import javax.swing.*;
import java.awt. *;
import java.awt.event. *;
import javax.swing.JOptionPane;
public class Project implements ActionListener  
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	JComboBox comboBox, comboBox1, comboBox2, comboBox3;
	Project(){
		f=new JFrame ("SPORTS REGISTRATION");
		l1 = new JLabel("PLAYER FIRST NAME");
		l2 = new JLabel("PLAYER SECOND NAME");
		l3 =new JLabel("ENTER YOUR AGE");
		l4 =new JLabel("ENTER YOUR SPORT");
		l5 = new JLabel("ENTER YOUR YOUR GENDER");
		l6 = new JLabel("HAVE YOU PLAYED ANY SPORTS TOURNAMENT BEFORE");
		l7 = new JLabel("SELECT YOUR TEAM TO JOIN");
		l8 = new JLabel("ENTER CONTACT DETAILS");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(2);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		b1=  new JButton("SUBMIT");
		comboBox = new JComboBox();
		comboBox1 = new JComboBox();
		comboBox2= new JComboBox();
		comboBox3 = new JComboBox();
		f.setBounds(500, 300, 850, 300);
		comboBox.setModel(new DefaultComboBoxModel(new String[]{"Basketball","Volleyball","Badminton" ,"Cricket","Table Tennis","Karate"}));
		comboBox1.setModel(new DefaultComboBoxModel(new String[]{"MALE","FEMALE","OTHER"}));
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"YES","NO"}));
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"TEAM A (RED)","TEAM B (BLUE)","TEAM C (YELLOW)","TEAM D (PURPLE)"}));
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(comboBox);
		f.add(l5);
		f.add(comboBox1);
		f.add(l6);
		f.add(comboBox2);
		f.add(l7);
		f.add(comboBox3);
		f.add(l8);
		f.add(t4);
		f.add(b1);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int c = 0;
		if ((!t1.getText().matches(".*[^a-z].*"))||((!t1.getText().matches(".*[^A-Z].*"))));
		else
		{ JOptionPane.showMessageDialog(null,"ENTER THE VALID FIRST NAME");
		c++;
		}
		if ((!t1.getText().matches(".*[^a-z].*"))||((!t1.getText().matches(".*[^A-Z].*"))));
		else
		{ JOptionPane.showMessageDialog(null,"ENTER THE VALID SECOND NAME");
		c++;
		}
		if(Integer.parseInt(t2.getText())>=18);
		else { JOptionPane.showMessageDialog(null,"ENTER VALID AGE");
		c++;
			
		}
		
		if(c==0) {
			if(e.getSource() == b1)
			{
				System.out.println("The first name is :" + t1.getText());
				System.out.println("Thesecond name is :" + t2.getText());
				System.out.println("The age is : "+t2.getText());
				System.out.println(" THANKS FOR THE REGISTRATION \nHAVE A GREAT DAY:)");
				
							}
				
				
		}
	}
	public static void main(String args[]) {
		new Project();
	}
}
	








