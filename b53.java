package C12;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class b53 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel timeLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b53 frame = new b53();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public b53() {
		setTitle("Đồng hồ thời gian thực");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null); // Căn giữa màn hình

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		timeLabel = new JLabel("", SwingConstants.CENTER);
		timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
		contentPane.add(timeLabel, BorderLayout.CENTER);

		startClock();
	}

	/**
	 * Bắt đầu cập nhật thời gian mỗi giây bằng một luồng riêng.
	 */
	private void startClock() {
		Thread clockThread = new Thread(() -> {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			while (true) {
				String currentTime = sdf.format(new Date());
				SwingUtilities.invokeLater(() -> timeLabel.setText(currentTime));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		clockThread.start();
	}
}
