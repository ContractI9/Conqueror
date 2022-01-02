package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class TestView extends JFrame  implements ActionListener{
	
	public TestView() {
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Empire");
		this.getContentPane().setBackground(Color.BLUE);
		String xs="defendingarmy Army1";
		String[] x = xs.split(" ");
		JComboBox<String> combo = new JComboBox<String>(x);
		combo.setPreferredSize(new Dimension(200,20));
		combo.addActionListener(this);
		this.add(combo);
		this.validate();
		this.repaint();
	}
public static void main(String[] args) {
	new TestView();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() instanceof JComboBox){
		  JComboBox lel = (JComboBox) e.getSource();
		  String msg= (String)lel.getSelectedItem();
		  if(msg.equals("defendingarmy")) {
			  System.out.println("works ez");
		  }
	
}
}}
