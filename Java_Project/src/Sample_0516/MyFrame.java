package Sample_0516;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		//Toolkit kit = Toolkit.getDefaultToolkit();
		//Dimension screenSize = kit.getScreenSize();
		//setLocation(screenSize.width/2,screenSize.height /2);
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("Welcome to Java pizza!");
		panelA.add(label1);
		
		
		JButton button1 = new JButton("combo pizza");
		JButton button2 = new JButton("potato pizza");
		JButton button3 = new JButton("bulgogi pizza");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("number");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}

}
