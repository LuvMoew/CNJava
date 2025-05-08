package C12;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class b41 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b41 frame = new b41();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public b41() {
		setTitle("JDialog Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Open Dialog");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(120)
					.addComponent(btnNewButton)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(110)
					.addComponent(btnNewButton)
					.addContainerGap(110, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		// Xử lý khi nhấn nút
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Tạo JDialog
						JDialog dialog = new JDialog(b41.this, "My Dialog", true);
						dialog.setSize(200, 150);
						dialog.setLocationRelativeTo(b41.this);

						// Thêm JLabel vào dialog
						JLabel label = new JLabel("Dialog Opened", SwingConstants.CENTER);
						dialog.getContentPane().add(label);

						// Hiển thị dialog
						dialog.setVisible(true);
					}
				});
	}
}
