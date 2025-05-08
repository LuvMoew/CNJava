package C12;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class b6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b6 frame = new b6();
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
		public b6() {
			setTitle("Custom Icon Window");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 500, 400);

			// Đặt biểu tượng cửa sổ
			setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\avtt.jpg"));

			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
			contentPane.setLayout(null);
			setContentPane(contentPane);

			JLabel lblTitle = new JLabel("Custom Icon Window");
			lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle.setBounds(88, 152, 300, 50);
			contentPane.add(lblTitle);
		}
	}
