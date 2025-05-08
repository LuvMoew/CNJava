package C12;

import javax.swing.*;
import java.awt.*;


public class b23 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private StringBuilder input = new StringBuilder();

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                b23 frame = new b23();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public b23() {
        setTitle("Máy Tính");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 400);

        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new GridBagLayout());
        setContentPane(contentPane);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.ipady = 20;
        contentPane.add(textField, gbc);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int row = 1;
        int col = 0;

        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            gbc.gridx = col;
            gbc.gridy = row;
            gbc.gridwidth = 1;
            gbc.ipady = 15;

            button.addActionListener(e -> handleInput(label));

            contentPane.add(button, gbc);

            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }
    }

    private void handleInput(String value) {
        switch (value) {
            case "=":
                try {
                    double result = evalSimpleExpression(input.toString());
                    textField.setText(String.valueOf(result));
                    input.setLength(0);
                } catch (Exception e) {
                    textField.setText("Lỗi");
                    input.setLength(0);
                }
                break;
            case "C":
                input.setLength(0);
                textField.setText("");
                break;
            default:
                input.append(value);
                textField.setText(input.toString());
                break;
        }
    }

    // Hàm tính toán đơn giản
    private double evalSimpleExpression(String expr) throws Exception {
        String[] tokens = expr.split("(?<=[-+*/])|(?=[-+*/])"); // chia tách toán tử
        double result = Double.parseDouble(tokens[0].trim());

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i].trim();
            double num = Double.parseDouble(tokens[i + 1].trim());

            switch (op) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/": 
                    if (num == 0) throw new ArithmeticException("Chia 0");
                    result /= num;
                    break;
                default: throw new Exception("Toán tử không hợp lệ");
            }
        }

        return result;
    }
}

