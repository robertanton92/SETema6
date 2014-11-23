package weaher.aplication;
import java.awt.EventQueue;

import javax.swing.JFrame;

import weather.view.InfMeteo;

public class Aplication {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfMeteo window = new InfMeteo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
