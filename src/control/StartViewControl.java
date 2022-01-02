package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import engine.Game;
import units.Army;
import units.Status;
import view.StartView;
import view.TestView;
import view.WorldMap;

public class StartViewControl implements ActionListener {
	private JButton b;
    private StartView view;
    private Game g;

	public JButton getB() {
		return b;
	}

	public StartView getView() {
		return view;
	}

	public Game getG() {
		return g;
	}

	

     public StartViewControl() {
    	 view = new StartView();
         view.getB1().addActionListener(this);
         view.getB2().addActionListener(this);
         view.getB3().addActionListener(this);
         view.getB4().addActionListener(this);
         view.getNamePlayer().addActionListener(this);
         b = null;
     }

    @Override
    public void actionPerformed(ActionEvent e) { 
    	if(!view.getNamePlayer().getText().equals("")) {
    		if(e.getSource()!=view.getB4()) {
    			if(b==(JButton)e.getSource()) {
    				b.setBackground(new Color(226, 227, 202));
    				b = null;
    			} else {
    				if (b!=null) 
    					b.setBackground(new Color(226, 227, 202));
    				b=(JButton)e.getSource();
    				b.setBackground(Color.GREEN);
    			}
    		} else if(e.getSource()==view.getB4() && b!=null) {
    			try {
    				g = new Game(view.getNamePlayer().getText(),b.getText());
//    				Army a = new Army("Cairo");
//    				Army b = new Army("Sparta");
//    				Army c = new Army("X");
//    				Army d = new Army("Y");
//    				Army q = new Army("Z");
//    				b.setCurrentStatus(Status.BESIEGING);
//    				q.setCurrentStatus(Status.MARCHING);
//    				g.getPlayer().getControlledArmies().add(a);
//    				g.getPlayer().getControlledArmies().add(b);
//    				g.getPlayer().getControlledArmies().add(c);
//    				g.getPlayer().getControlledArmies().add(d);
//    				g.getPlayer().getControlledArmies().add(q);
    				WorldMapControl worldMapControl = new WorldMapControl(this);
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
    		} else {
    			JOptionPane.showMessageDialog(this.view, "Please select a city", "Error", JOptionPane.ERROR_MESSAGE);
    		}
//        		System.out.println(view.getNamePlayer().getText() + " has started the game with city :" + b.getText());
//        		view.setVisible(false);
//       		testView.setVisible(true);
    	} else {
    		JOptionPane.showMessageDialog(this.view, "Please enter a name", "Error", JOptionPane.ERROR_MESSAGE);
    	}
    }

    
}