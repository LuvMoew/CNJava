package C12;

import java.awt.EventQueue;
import javax.swing.*;

public class b30 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b30 frame = new b30();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public b30() {
		setTitle("JToolBar Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null); // căn giữa cửa sổ

		// Tạo thanh công cụ
		JToolBar toolBar = new JToolBar();

		// Tạo các nút
		JButton btnNew = new JButton("New");
		JButton btnSave = new JButton("Save");
		JButton btnOpen = new JButton("Open");

		// Thêm nút vào thanh công cụ
		toolBar.add(btnNew);
		toolBar.add(btnSave);
		toolBar.add(btnOpen);

		// Thêm thanh công cụ vào JFrame
		getContentPane().add(toolBar, "North");

		// Xử lý sự kiện cho từng nút
		btnNew.addActionListener(e -> JOptionPane.showMessageDialog(this, "New button clicked!"));
		btnSave.addActionListener(e -> JOptionPane.showMessageDialog(this, "Save button clicked!"));
		btnOpen.addActionListener(e -> JOptionPane.showMessageDialog(this, "Open button clicked!"));
	}
}
