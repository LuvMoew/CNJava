package C12;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class b21 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b21 frame = new b21();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b21() {
		setTitle("Danh sách thành phố");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Danh sách thành phố (10 thành phố)
		String[] cities = {
			"Hồ Chí Minh", "Huế", "Hà Nội", "Hải Dương", "Hải Phòng",
			"Bắc Ninh", "Hưng Yên", "Đà Nẵng", "Cần Thơ", "Đà Lạt"
		};

		JList<String> list = new JList<>(cities);  // Dùng mảng trực tiếp
		JScrollPane scrollPane = new JScrollPane(list);

		JLabel lblNewLabel = new JLabel("Số lượng thành phố: " + cities.length);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addContainerGap(40, Short.MAX_VALUE))
		);

		contentPane.setLayout(gl_contentPane);
	}
}
