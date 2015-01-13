package it.prova.unisalento;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pannello extends JPanel {
	public Pannello(int i){
		JLabel l=new JLabel(Integer.toString(i));
		add(l);
	}
}
