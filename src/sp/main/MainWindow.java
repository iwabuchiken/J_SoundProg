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
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class MainWindow {

	private JFrame frame;
	private Font font_Basic_Bold;
	private JPanel panel;
	private JButton btnExec;
	private JButton btn2;
	private JButton btnQuit;
	private JPanel panel_1;
	private JMenuItem mntmQuit;
	private static JLabel lblMessage;

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
		
		///////////////////////////////////
		//
		// initialize components
		//
		///////////////////////////////////
		init_Components();
		
//		panel = new JPanel();
//		JPanel panel = new JPanel();
		
		//REF border http://stackoverflow.com/questions/5328405/jpanel-padding-in-java answered Mar 16 '11 at 16:33
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
//		JButton btnExec = new JButton("Exec");
		btnExec.setForeground(Color.BLUE);
		btnExec.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		
		btnExec.setFont(font_Basic_Bold);
		
//		btnExec.setPreferredSize(new Dimension(40, 40));
		
		panel.add(btnExec);
		
//		JButton btn2 = new JButton("Button2");
		btn2.setFont(font_Basic_Bold);
//		btn2.setFont(new Font("MS UI Gothic", Font.BOLD, 23));
		panel.add(btn2);
		
//		JButton btnQuit = new JButton("Quit");
		btnQuit.setForeground(Color.RED);
		btnQuit.setBackground(Color.YELLOW);
		
		btnQuit.setFont(font_Basic_Bold);
		
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		
		panel.add(btnQuit);
		
//		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
//		lblMessage = new JLabel("Message");
		lblMessage.setBackground(SystemColor.inactiveCaption);
		lblMessage.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		panel_1.add(lblMessage);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("メイリオ", Font.PLAIN, 25));
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("メイリオ", Font.PLAIN, 25));
		
		mnFile.setMnemonic(KeyEvent.VK_F);
		
		menuBar.add(mnFile);
		
		JMenu mnOthers = new JMenu("Others");
		mnOthers.setFont(new Font("メイリオ", Font.PLAIN, 25));
		
		mnOthers.setMnemonic(KeyEvent.VK_O);
		
		menuBar.add(mnOthers);
		
		
//		JMenuItem mntmQuit = new JMenuItem("&Quit");
//		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setFont(new Font("メイリオ", Font.PLAIN, 25));
		
		mntmQuit.setMnemonic(KeyEvent.VK_Q);
		
//		mntmQuit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//		
//				System.exit(0);
//				
//			}
//		});
		mnOthers.add(mntmQuit);
		
		///////////////////////////////////
		//
		// listeners
		//
		///////////////////////////////////
		setup_Components_Listeners();
		
//		mntmQuit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				System.exit(0);
//				
//			}
//		});
	}

	private void 
	setup_Components_Listeners() {
		// TODO Auto-generated method stub

		///////////////////////////////////
		//
		// menu
		//
		///////////////////////////////////
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});

		///////////////////////////////////
		//
		// buttons
		//
		///////////////////////////////////
		btnExec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainWindow.lblMessage.setText("This lesson covers writing layout");
				
			}
		});

	}//setup_Components_Listeners()

	private void init_Components() {
		// TODO Auto-generated method stub
		
		panel = new JPanel();

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		
		// buttons
		btnExec = new JButton("Exec");
		
		btn2 = new JButton("Button2");
		
		btnQuit = new JButton("Quit");

		///////////////////////////////////
		//
		// menu
		//
		///////////////////////////////////
		mntmQuit = new JMenuItem("Quit");

		///////////////////////////////////
		//
		// labels
		//
		///////////////////////////////////
		lblMessage = new JLabel("Message");
		
	}

}
