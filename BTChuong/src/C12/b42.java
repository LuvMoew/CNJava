package C12;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class b42 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b42 frame = new b42();
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
	public b42() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JComboBox <String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Red", "Pink", "Blue", "Green", "Yellow"}));
		contentPane.add(comboBox);
		
		comboBox.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String selectedColor = (String) comboBox.getSelectedItem();
				switch(selectedColor) {
				case "Red" :
					contentPane.setBackground(Color.RED);
					break;
				case "Pink" :
					contentPane.setBackground(Color.PINK);
					break;
				case "Blue" :
					contentPane.setBackground(Color.BLUE);
					break;
				case "Green" :
					contentPane.setBackground(Color.GREEN);
					break;
				case "Yellow" :
					contentPane.setBackground(Color.YELLOW);
					break;
				}
			}
		});
	}

}