package C12;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Font;

public class B48 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNumber;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				B48 frame = new B48();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public B48() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // Đúng theo yêu cầu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setColumns(10);

		lblNumber = new JLabel("Number: ");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));

		

		GroupLayout gl = new GroupLayout(contentPane);
		gl.setHorizontalGroup(
			gl.createParallelGroup(GroupLayout.Alignment.CENTER)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblNumber)
		);
		gl.setVerticalGroup(
			gl.createSequentialGroup()
				.addGap(30)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(20)
				.addComponent(lblNumber)
		);

		contentPane.setLayout(gl);
		
		// Gắn DocumentListener
				textField.getDocument().addDocumentListener(new DocumentListener() {
					private void updateLabel() {
						String input = textField.getText();
						if (input.matches("\\d*")) { // Chỉ cho phép số
							lblNumber.setText("Number: " + input);
						} else {
							// Nếu có ký tự không phải số thì xóa nó
							SwingUtilities.invokeLater(() -> {
								textField.setText(input.replaceAll("[^\\d]", ""));
							});
						}
					}

					public void insertUpdate(DocumentEvent e) {
						updateLabel();
					}
					public void removeUpdate(DocumentEvent e) {
						updateLabel();
					}
					public void changedUpdate(DocumentEvent e) {
						updateLabel();
					}
				});
	}
}
