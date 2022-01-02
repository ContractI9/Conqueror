package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import control.StartViewControl;
import control.WorldMapControl;
import engine.Game;
import units.Army;

public class ArmyView extends JPanel {
	
   // private JPanel Main;
    private WorldMapControl worldMapControl;
	//private JButton ;

	public ArmyView(WorldMapControl worldMapControl) {
	//	this.setMain(new JPanel());
        this.worldMapControl=worldMapControl;
		this.setLayout(new GridLayout(4,1));
		this.validate();
		this.repaint();
	}

//	public JPanel getMain() {
//		return Main;
//	}

//	public void setMain(JPanel main) {
//		Main = main;
//	}
	
	
}
