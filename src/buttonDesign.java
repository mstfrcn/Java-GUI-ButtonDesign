import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class buttonDesign extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buttonDesign frame = new buttonDesign();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public buttonDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnM = new JButton("");
		btnM.setBackground(Color.BLUE);
		btnM.setBounds(52, 230, 75, 75);
		contentPane.add(btnM);
		
		JButton btnS = new JButton("");
		btnS.setBackground(Color.YELLOW);
		btnS.setBounds(148, 230, 75, 75);
		contentPane.add(btnS);
		
		JButton btnK = new JButton("");
		btnK.setBackground(Color.RED);
		btnK.setBounds(351, 230, 75, 75);
		contentPane.add(btnK);
		
		JButton btnB = new JButton("");
		btnB.setBackground(Color.WHITE);
		btnB.setBounds(251, 230, 75, 75);
		contentPane.add(btnB);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(200, 30, 72, 127);
		contentPane.add(lbl1);
		
		
		Image bAmpul = new ImageIcon(this.getClass().getResource("/bAmpul.png")).getImage();
		Image kAmpul = new ImageIcon(this.getClass().getResource("/kAmpul.png")).getImage();
		Image mAmpul = new ImageIcon(this.getClass().getResource("/mAmpul.png")).getImage();
		Image sAmpul = new ImageIcon(this.getClass().getResource("/sAmpul.png")).getImage();
		Image oAmpul = new ImageIcon(this.getClass().getResource("/oAmpul.png")).getImage();
		
		
		lbl1.setIcon(new ImageIcon(oAmpul));
		
		// MAVI BUTON EVENTI
		btnM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(mAmpul));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(oAmpul));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnM.setBounds(65, 243, 50, 50);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnM.setBounds(52, 230, 75, 75);
			}
			
		});
		
		
		// SARI BUTON EVENT
		btnS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(sAmpul));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(oAmpul));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnS.setBounds(161, 243, 50, 50);;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnS.setBounds(148, 230, 75, 75);
			}
		});
		
		// BEYAZ BUTON EVENT
		btnB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(bAmpul));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(oAmpul));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnB.setBounds(264, 243, 50, 50);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnB.setBounds(251, 230, 75, 75);
			}
		});
		
		// KIRMIZI BUTON EVENT
		btnK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(kAmpul));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl1.setIcon(new ImageIcon(oAmpul));
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnK.setBounds(364, 243, 50, 50);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnK.setBounds(351, 230, 75, 75);
			}
		});
		
		
		
		
	}
}
