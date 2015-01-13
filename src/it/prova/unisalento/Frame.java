package it.prova.unisalento;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Frame extends JFrame {
	public Frame (){
		setVisible(true);
		JTabbedPane t=new JTabbedPane();
		add(t);
		t.addTab("Scheda1" ,new Pannello(1));
		t.addTab("Scheda2" ,new Pannello(2));
		pack();
	}
}
