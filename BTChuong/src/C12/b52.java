package C12;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class b52 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				b52 frame = new b52();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public b52() {
		setTitle("Safe GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null); // Căn giữa màn hình

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("Safe GUI", SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
	}
}
