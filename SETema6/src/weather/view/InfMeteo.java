package weather.view;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import weather.control.WControl;

public class InfMeteo extends JFrame{

	public JFrame frame;
	private JTextField vit_vant;
	private JTextField temp;
	//private JPanel jContentPane=null;
	private static final long serialVersionUID=1L;
	
	WControl con=new WControl();
	
	ImageIcon imagen;


	//creare constructorului!!!
	public InfMeteo() {
		super();
		initialize();
	
	}
	

	private void initialize() {
		//constructia ferestrei si detaliile ei
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 503, 396);
		frame.setTitle("Tema6");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setSize(500, 359);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		
	
		
		
		vit_vant = new JTextField();
		vit_vant.setBounds(194, 142, 86, 20);
		vit_vant.setEditable(false);
		vit_vant.setForeground(Color.RED);
		frame.getContentPane().add(vit_vant);
		vit_vant.setColumns(10);
		
		
		
		temp = new JTextField();
		temp.setBounds(194, 100, 86, 20);
		temp.setForeground(Color.RED);
		temp.setEditable(false);
		frame.getContentPane().add(temp);
		temp.setColumns(10);
		
		
		//constructia celor 2 label Temperatura si Viteza vantului!!!
		JLabel lblNewLabel = new JLabel("Temperatura:");
		lblNewLabel.setBounds(66, 100, 114, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Viteza vantului:");
		lblNewLabel_1.setBounds(66, 142, 114, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(252, 259, 122, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				temp.setText(Integer.toString(con.calc_temperatura()));
				vit_vant.setText(Integer.toString(con.calc_vant()));
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblWeatherMenu = new JLabel("Weather Menu");
		lblWeatherMenu.setBounds(0, 0, 474, 66);
		lblWeatherMenu.setVerticalAlignment(SwingConstants.TOP);
		lblWeatherMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeatherMenu.setForeground(Color.RED);
		lblWeatherMenu.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(lblWeatherMenu);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setBounds(328, 103, 46, 14);
		frame.getContentPane().add(lblCelsius);
		
		JLabel lblMs = new JLabel("m/s");
		lblMs.setBounds(328, 145, 46, 14);
		frame.getContentPane().add(lblMs);
		
	
	}
	

}
