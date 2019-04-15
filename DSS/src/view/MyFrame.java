package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTree;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class MyFrame {

	//odraditi akcije koje su mi potrebne sa stablom jos
	private JFrame frame;
	private JTree myTree = new JTree();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame window = new MyFrame();
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
	public MyFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.15);
		frame.getContentPane().add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JTree tree = new JTree();
		scrollPane.setViewportView(tree);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		splitPane.setDividerLocation(-8);
		frame.setBounds(100, 100, 914, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Novi");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Pacijent\r\n");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmKarton = new JMenuItem("Karton");
		mnNewMenu.add(mntmKarton);
		
		JMenu mnSacuvaj = new JMenu("Sacuvaj");
		mnSacuvaj.setMargin(new Insets(0, 10, 0, 0));
		menuBar.add(mnSacuvaj);
		
		JMenuItem mntmWorspace = new JMenuItem("Worspace");
		mnSacuvaj.add(mntmWorspace);
		
		JMenu mnUcitaj = new JMenu("Ucitaj");
		mnUcitaj.setMargin(new Insets(0, 10, 0, 0));
		menuBar.add(mnUcitaj);
	}
	
	
	

}
