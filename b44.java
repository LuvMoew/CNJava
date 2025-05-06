package C12;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;

public class b44 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b44 frame = new b44();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b44() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200); // ✅ Đúng kích thước yêu cầu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		JSlider slider = new JSlider(10, 50, 20); // từ 10 đến 50, mặc định là 20
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		JLabel lblSample = new JLabel("Sample Text");
		lblSample.setFont(new Font("Tahoma", Font.PLAIN, 20));

		GroupLayout gl = new GroupLayout(contentPane);
		gl.setHorizontalGroup(
			gl.createParallelGroup(GroupLayout.Alignment.CENTER)
				.addComponent(slider, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblSample)
		);
		gl.setVerticalGroup(
			gl.createSequentialGroup()
				.addComponent(slider, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
				.addGap(20)
				.addComponent(lblSample)
		);

		contentPane.setLayout(gl);
		// ✅ Gắn ChangeListener để thay đổi kích thước font
				slider.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						int size = slider.getValue();
						lblSample.setFont(new Font("Tahoma", Font.PLAIN, size));
					}
				});
	}
}
