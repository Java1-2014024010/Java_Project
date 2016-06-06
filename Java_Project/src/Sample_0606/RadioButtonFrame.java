package Sample_0606;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class RadioButtonFrame extends JFrame implements ActionListener{
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public RadioButtonFrame(){
		setTitle("Radio button Test");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("what size?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER);
		resultPanel = new JPanel();
		text= new JLabel("no chosen");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==small){
			text.setText("Small choosen");
		}
		if(e.getSource()==medium){
			text.setText("Medium choosen");
		}
		if(e.getSource()==large){
			text.setText("Large choosen");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonFrame();
	}

}
