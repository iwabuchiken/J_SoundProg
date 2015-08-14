package sp.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MainWindow {

	private JFrame frame;
	private Font font_Basic_Bold;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		
		setup();
		
		initialize();
	}

	private void setup() {
		// TODO Auto-generated method stub

		font_Basic_Bold = new Font("MS UI Gothic", Font.BOLD, 23);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		
		//REF border http://stackoverflow.com/questions/5328405/jpanel-padding-in-java answered Mar 16 '11 at 16:33
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnExec = new JButton("Exec");
		
		btnExec.setFont(font_Basic_Bold);
		
//		btnExec.setPreferredSize(new Dimension(40, 40));
		
		panel.add(btnExec);
		
		JButton btn2 = new JButton("Button2");
		btn2.setFont(font_Basic_Bold);
//		btn2.setFont(new Font("MS UI Gothic", Font.BOLD, 23));
		panel.add(btn2);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setForeground(Color.RED);
		btnQuit.setBackground(Color.YELLOW);
		
		btnQuit.setFont(font_Basic_Bold);
		
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		
		panel.add(btnQuit);
	}

}
