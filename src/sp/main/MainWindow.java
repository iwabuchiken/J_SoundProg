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
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;

import sp.utils.Methods;

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
	private JPanel panel_2;
	private JTextField tf_Param1;
	private JTextField tf_Param2;
	private JLabel lbl_Param_1;
	private JLabel lbl_Param_2;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	public static JLabel lbl_Output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//test
//		File f = new File();
//		
//		f.de
		
		
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
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lbl_Param_1 = new JLabel("param 1");
		lbl_Param_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		panel_2.add(lbl_Param_1);
		
		tf_Param1 = new JTextField();
		tf_Param1.setBackground(new Color(173, 255, 47));
		panel_2.add(tf_Param1);
		tf_Param1.setColumns(10);
		
		lbl_Param_2 = new JLabel("param 2");
		lbl_Param_2.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		panel_2.add(lbl_Param_2);
		
		tf_Param2 = new JTextField();
		tf_Param2.setBackground(SystemColor.inactiveCaption);
		panel_2.add(tf_Param2);
		tf_Param2.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		panel_2.add(lblNewLabel);
		
		panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lbl_Output = new JLabel("New label");
		lbl_Output.setBackground(SystemColor.activeCaption);
		lbl_Output.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		panel_3.add(lbl_Output);
		
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
		
		
		
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				// action
				Methods.execExternal_Get_Params(this, MainWindow.lbl_Output);
				
//				Process process;
//				try {
//					process = new ProcessBuilder(
//							
//							"C:\\WORKS\\Programs\\Java\\jdk1.7.0_79\\bin\\java.exe", 
//							"Test")
//	//					"C:\\WORKS\\WS\\Eclipse_Luna\\J_SoundProg\\java", "Test")
//						.start();
//					
////				"C:\\PathToExe\\MyExe.exe","param1","param2").start();
//					
//					InputStream is = process.getInputStream();
//					
//					InputStreamReader isr = new InputStreamReader(is);
//					
//					BufferedReader br = new BufferedReader(isr);
//					
//					String line;
//					
////				System.out.printf("Output of running %s is:", Arrays.toString(args));
//					
//					String whole_text = "";
//					
//					while ((line = br.readLine()) != null) {
//						
//						System.out.println(line);
//						
//						whole_text += line;
//						
////						MainWindow..lbl_Output.setText(whole_text);
////						MainWindow.lblMessage.setText("This lesson covers writing layout");
//						
//					}
//					
//					MainWindow.lbl_Output.setText(whole_text);
////					MainWindow.lblMessage.setText(whole_text);
//					
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
			}//public void actionPerformed(ActionEvent arg0)
			
		});
		
		
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
