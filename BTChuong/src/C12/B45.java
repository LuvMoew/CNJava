package C12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class B45 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B45 frame = new B45();
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
	public B45() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JCheckBox checkBox = new JCheckBox("Show Image");
		checkBox.setForeground(new Color(255, 255, 255));
		checkBox.setBackground(new Color(0, 128, 192));
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\arc.jpg"));
		lblImage.setVisible(false);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(113)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(172, Short.MAX_VALUE)
					.addComponent(checkBox)
					.addGap(167))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(checkBox)
					.addGap(36)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE)
					.addGap(66))
		);
		contentPane.setLayout(gl_contentPane);
		
		checkBox.addItemListener(e -> lblImage.setVisible(checkBox.isSelected()));
	}
}
