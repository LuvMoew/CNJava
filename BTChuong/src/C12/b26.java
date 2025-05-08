package C12;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.EmptyBorder;

public class b26 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b26 frame = new b26();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b26() {
		setTitle("JSlider - Đổi màu nền theo độ sáng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200); // đúng kích thước yêu cầu

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		// Tạo JSlider từ 0 -> 255
		JSlider slider = new JSlider(0, 255, 128);
		slider.setMajorTickSpacing(64);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		// Label hiển thị giá trị hiện tại
		JLabel valueLabel = new JLabel("Brightness: 128", SwingConstants.CENTER);
		valueLabel.setFont(new Font("Arial", Font.BOLD, 14));

		// Sự kiện khi kéo slider
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int value = slider.getValue();
				valueLabel.setText("Brightness: " + value);
				contentPane.setBackground(new Color(value, value, value));
			}
		});

		// Set màu ban đầu
		contentPane.setBackground(new Color(128, 128, 128));

		// Thêm slider và label vào contentPane
		contentPane.add(slider, BorderLayout.SOUTH);
		contentPane.add(valueLabel, BorderLayout.NORTH);
	}
}
