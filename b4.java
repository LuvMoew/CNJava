package C12;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class b4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b4 frame = new b4();
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
	public b4() {
		setTitle("Image Viewer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Đường dẫn hình ảnh 
		String imagePath = "C:\\Users\\User\\Downloads\\arc.jpg";
		ImageIcon imageIcon = new ImageIcon(imagePath);

		// Tạo JLabel chứa ảnh
		JLabel lblImage = new JLabel(imageIcon);

		// Tạo panel và thêm ảnh
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(lblImage);

		setContentPane(contentPane);

		// Tự động điều chỉnh kích thước JFrame theo ảnh
		pack();
	}
}
