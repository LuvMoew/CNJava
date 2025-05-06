package C12;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class b43 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b43 frame = new b43();
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
	public b43() {
		setTitle("Confirm Close Window");
		setSize(400, 300); // Đặt kích thước 400x300
		setLocationRelativeTo(null); // Căn giữa màn hình

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Gắn WindowListener để xác nhận khi đóng
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int confirm = JOptionPane.showConfirmDialog(
					b43.this,
					"Are you sure you want to exit?",
					"Confirm Exit",
					JOptionPane.YES_NO_OPTION
				);
				if (confirm == JOptionPane.YES_OPTION) {
					dispose(); // Đóng cửa sổ nếu chọn Yes
				}
				// Nếu chọn No thì không làm gì, cửa sổ sẽ không đóng
			}
		});

		// Không đặt EXIT_ON_CLOSE để tự xử lý
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
