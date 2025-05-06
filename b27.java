package C12;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class b27 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JProgressBar progressBar;
    private Timer timer;
    private int progress = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                b27 frame = new b27();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public b27() {
        setTitle("Tiến trình tải");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200); // Kích thước theo yêu cầu
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setStringPainted(true); // Hiển thị % trên thanh

        JButton btnStart = new JButton("Start");
        btnStart.setFont(new Font("Tahoma", Font.PLAIN, 15));

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                progress = 0;
                progressBar.setValue(0);

                // Timer cập nhật mỗi 50ms (=> 100 bước x 50ms = 5000ms = 5 giây)
                timer = new Timer(50, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        progress++;
                        progressBar.setValue(progress);
                        if (progress >= 100) {
                            timer.stop();
                        }
                    }
                });
                timer.start();
            }
        });

        GroupLayout layout = new GroupLayout(contentPane);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                .addGap(10)
                .addComponent(btnStart)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(40)
                .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addComponent(btnStart)
        );
        contentPane.setLayout(layout);
    }
}
