package C12;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class b32 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b32 frame = new b32();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public b32() {
		setTitle("JTextArea Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null); // căn giữa cửa sổ

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Tạo JTextArea và đặt trong JScrollPane
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);

		// Tạo nút Clear
		JButton btnClear = new JButton("Clear");
		contentPane.add(btnClear, BorderLayout.SOUTH);

		// Xử lý sự kiện nút Clear
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""); // Xóa nội dung
			}
		});
	}
}
