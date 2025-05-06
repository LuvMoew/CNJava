package C12;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class b25 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b25 frame = new b25();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b25() {
		setTitle("Radio Button Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // cập nhật đúng kích thước yêu cầu

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");

		// Group các radio button lại
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(rdbtnMale);
		genderGroup.add(rdbtnFemale);

		JLabel lblChoice = new JLabel("Bạn là: ");

		// Bắt sự kiện chọn giới tính
		rdbtnMale.addActionListener(e -> lblChoice.setText("Bạn là: Nam"));
		rdbtnFemale.addActionListener(e -> lblChoice.setText("Bạn là: Nữ"));

		// Layout
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(90)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblChoice)
						.addComponent(rdbtnMale)
						.addComponent(rdbtnFemale))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblChoice)
					.addGap(10)
					.addComponent(rdbtnMale)
					.addGap(10)
					.addComponent(rdbtnFemale)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
