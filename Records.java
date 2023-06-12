package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Records extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Records frame = new Records();
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
	public Records() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ViewRecordsPic = new JLabel("");
		ViewRecordsPic.setIcon(new ImageIcon("C:\\Users\\VJRM14\\Downloads\\MicrosoftTeams-image (7).png"));
		ViewRecordsPic.setBounds(0, 0, 1000, 600);
		contentPane.add(ViewRecordsPic);
		
		JLabel AdminBackBtn = new JLabel("");
		AdminBackBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AdminChoice AdmChc = new AdminChoice();
				AdmChc.setVisible(true);
				dispose();
			}
		});
		AdminBackBtn.setBounds(820, 11, 115, 40);
		contentPane.add(AdminBackBtn);
	}

}
