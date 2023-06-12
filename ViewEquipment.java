package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewEquipment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEquipment frame = new ViewEquipment();
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
	public ViewEquipment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ViewEPic = new JLabel("");
		ViewEPic.setIcon(new ImageIcon("C:\\Users\\VJRM14\\Downloads\\MicrosoftTeams-image (9).png"));
		ViewEPic.setBounds(0, 0, 1000, 600);
		contentPane.add(ViewEPic);
		
		JLabel AdminBackBtn = new JLabel("");
		AdminBackBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AdminChoice AdmChc = new AdminChoice();
				AdmChc.setVisible(true);
				dispose();
			}
		});
		AdminBackBtn.setBounds(829, 11, 99, 44);
		contentPane.add(AdminBackBtn);
	}

}
