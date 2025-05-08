package BDD;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ktr1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ktr1 frame = new ktr1();
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
	public ktr1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		
		JLabel lblName = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ng\u00E0y sinh");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblQue = new JLabel("Qu\u00EA qu\u00E1n");
		lblQue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Hi\u00EAn th\u1ECB th\u00F4ng tin\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
								.addComponent(lblQue))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField, 184, 184, Short.MAX_VALUE)
								.addComponent(textField_1, 184, 184, Short.MAX_VALUE)
								.addComponent(tfName))))
					.addGap(182))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQue))
					.addGap(20)
					.addComponent(btnNewButton)
					.addGap(27)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		
		JLabel lblHienThi = new JLabel("Th\u00F4ng tin user");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblHienThi, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHienThi, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		btnNewButton.addActionListener(e -> {
			String name = tfName.getText().trim();
			String birth = textField.getText().trim();
			String hometown = textField_1.getText().trim();

			// Kiểm tra họ tên (chỉ chữ cái và khoảng trắng)
			if (!name.matches("^[\\p{L}\\s]+$")) {
				JOptionPane.showMessageDialog(ktr1.this, "Họ tên chỉ được chứa chữ cái và khoảng trắng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Kiểm tra định dạng ngày sinh
			if (!birth.matches("\\d{2}/\\d{2}/\\d{4}")) {
				JOptionPane.showMessageDialog(ktr1.this, "Ngày sinh phải đúng định dạng dd/MM/yyyy!", "Lỗi", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Kiểm tra ngày sinh có hợp lệ thực sự không
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sdf.setLenient(false); // Không cho phép ngày không hợp lệ
				sdf.parse(birth);
			} catch (ParseException ex) {
				JOptionPane.showMessageDialog(ktr1.this, "Ngày sinh không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Kiểm tra quê quán
			if (hometown.isEmpty()) {
				JOptionPane.showMessageDialog(ktr1.this, "Quê quán không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Nếu tất cả hợp lệ thì hiển thị lên JLabel
			lblHienThi.setForeground(new Color(0, 128, 0)); // Màu xanh lá
			lblHienThi.setText(
				"<html>" +
					"<div style='color:green; font-size:12pt;'>" +
					"<b>✅ Họ tên:</b> " + name + "<br>" +
					"<b>✅ Ngày sinh:</b> " + birth + "<br>" +
					"<b>✅ Quê quán:</b> " + hometown +
					"</div>" +
				"</html>"
			);
		});

	}
}
