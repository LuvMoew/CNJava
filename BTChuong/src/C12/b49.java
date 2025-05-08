package C12;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class b49 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				b49 frame = new b49();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public b49() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // Kích thước đúng yêu cầu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JRadioButton rdbtnRed = new JRadioButton("Red");
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		JRadioButton rdbtnGreen = new JRadioButton("Green");

		JLabel lblSample = new JLabel("Sample");
		lblSample.setFont(new Font("Tahoma", Font.PLAIN, 20));

		
		// Sắp xếp layout
		GroupLayout gl = new GroupLayout(contentPane);
		gl.setHorizontalGroup(
			gl.createParallelGroup(Alignment.CENTER)
				.addComponent(rdbtnRed)
				.addComponent(rdbtnBlue)
				.addComponent(rdbtnGreen)
				.addComponent(lblSample)
		);
		gl.setVerticalGroup(
			gl.createSequentialGroup()
				.addComponent(rdbtnRed)
				.addComponent(rdbtnBlue)
				.addComponent(rdbtnGreen)
				.addGap(20)
				.addComponent(lblSample)
		);
		contentPane.setLayout(gl);
		
		// Tạo ButtonGroup để chỉ cho phép chọn 1 nút radio
				ButtonGroup group = new ButtonGroup();
				group.add(rdbtnRed);
				group.add(rdbtnBlue);
				group.add(rdbtnGreen);
				
		// Thêm ItemListener để thay đổi màu chữ
		rdbtnRed.addItemListener(e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
					lblSample.setForeground(Color.RED);
				}
			});
		rdbtnBlue.addItemListener(e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
					lblSample.setForeground(Color.BLUE);
				}
			});
		rdbtnGreen.addItemListener(e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
					lblSample.setForeground(Color.GREEN);
				}
			});

	}
}
