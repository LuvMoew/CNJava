package C12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class b24 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Color defaultColor; // Màu nền mặc định

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b24 frame = new b24();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b24() {
		setTitle("JCheckBox Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // đúng kích thước yêu cầu

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		JCheckBox checkBox = new JCheckBox("Enable Background");
		defaultColor = contentPane.getBackground(); // lưu lại màu nền ban đầu

		// Xử lý sự kiện chọn checkbox
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkBox.isSelected()) {
					contentPane.setBackground(Color.GREEN);
				} else {
					contentPane.setBackground(defaultColor);
				}
			}
		});

		contentPane.setLayout(new FlowLayout());
		contentPane.add(checkBox);
	}
}
