package C12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class b61 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel imageLabel;
	private JButton btnLoadImage;

	// Danh sách URL ảnh
	private final String[] imageUrls = {
		"https://upload.wikimedia.org/wikipedia/commons/4/47/PNG_transparency_demonstration_1.png",
		"https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Hopetoun_falls.jpg/640px-Hopetoun_falls.jpg",
		"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Gull_portrait_ca_usa.jpg/640px-Gull_portrait_ca_usa.jpg"
	};

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b61 frame = new b61();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b61() {
		setTitle("Tải hình ảnh từ URL - Random");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);

		// JLabel để hiển thị ảnh
		imageLabel = new JLabel("Chưa có ảnh", SwingConstants.CENTER);
		imageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(imageLabel, BorderLayout.CENTER);

		// Nút "Load Image"
		btnLoadImage = new JButton("Load Random Image");
		btnLoadImage.addActionListener(this::loadImage);
		contentPane.add(btnLoadImage, BorderLayout.SOUTH);
	}

	private void loadImage(ActionEvent e) {
		btnLoadImage.setEnabled(false);
		imageLabel.setText("Đang tải ảnh...");

		SwingWorker<ImageIcon, Void> worker = new SwingWorker<ImageIcon, Void>() {
			@Override
			protected ImageIcon doInBackground() throws Exception {
				Random rand = new Random();
				int index = rand.nextInt(imageUrls.length); // chọn ngẫu nhiên 1 URL
				String selectedUrl = imageUrls[index];

				URL url = new URL(selectedUrl);
				Image img = ImageIO.read(url);

				Image scaled = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
				return new ImageIcon(scaled);
			}

			@Override
			protected void done() {
				try {
					ImageIcon icon = get();
					imageLabel.setIcon(icon);
					imageLabel.setText("");
				} catch (Exception ex) {
					ex.printStackTrace();
					imageLabel.setText("Lỗi khi tải ảnh!");
				} finally {
					btnLoadImage.setEnabled(true);
				}
			}
		};

		worker.execute();
	}
}
