package ntu.NgoNguyenAnhTu63135957;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMayTinhBoTui extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtResult;
    private double operand1 = 0;
    private String operator = "";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMayTinhBoTui frame = new AppMayTinhBoTui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AppMayTinhBoTui() {
        setBackground(new Color(64, 128, 128));
        setTitle("Câu1_AppMayTinhBoTui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 673, 494);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CASIO BITEXT");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 10, 639, 46);
        contentPane.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_1.setBounds(0, 60, 659, 73);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        txtResult = new JTextField();
        txtResult.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResult.setBounds(10, 10, 639, 52);
        panel_1.add(txtResult);
        txtResult.setColumns(10);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 143, 639, 314);
        contentPane.add(panel_2);
        panel_2.setLayout(new GridLayout(4, 5, 5, 5));

        ActionListener numberActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd);
            }
        };
        
        JButton btnNumber1 = new JButton("1");
        btnNumber1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber1);

        JButton btnNumber2 = new JButton("2");
        btnNumber2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber2);

        JButton btnNumber3 = new JButton("3");
        btnNumber3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber3);
        

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                performOperation("/");
            }
        });
        btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 16));	
        panel_2.add(btnDivide);
        
        JButton btnSquareRoot = new JButton("sqrt");
        btnSquareRoot.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSquareRoot.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnSquareRoot);
        
        JButton btnNumber4 = new JButton("4");
        btnNumber4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber4);
        
        JButton btnNumber5 = new JButton("5");
        btnNumber5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber5);

        JButton btnNumber6 = new JButton("6");
        btnNumber6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber6);
        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                performOperation("*");
            }
        });
        btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnMultiply);
        
        JButton btnPercentage = new JButton("%");
        btnPercentage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnPercentage);
        
        JButton btnNumber7 = new JButton("7");
        btnNumber7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber7);

        JButton btnNumber8 = new JButton("8");
        btnNumber8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber8);

        JButton btnNumber9 = new JButton("9");
        btnNumber9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNumber9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cmd = evt.getActionCommand();
                txtResult.setText(txtResult.getText() + cmd); 
            }
        });
        panel_2.add(btnNumber9);
        
        JButton btnSubtract = new JButton("-");
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                performOperation("-");
            }
        });
        btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnSubtract);
        JButton btnFraction = new JButton("1/x");
        btnFraction.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnFraction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panel_2.add(btnFraction);
        
        JButton btnNumber0 = new JButton("0");
        btnNumber0.addActionListener(numberActionListener);
        btnNumber0.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnNumber0);
        
        JButton btnPlusMinus = new JButton("+/-");
        btnPlusMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    double value = Double.parseDouble(txtResult.getText());
                    value = -value;
                    txtResult.setText(String.valueOf(value));
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnPlusMinus);
        
        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtResult.setText("");
                operand1 = 0;
                operator = "";
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnClear);


        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                performOperation("+");
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN,16));
        panel_2.add(btnAdd);
        
        JButton btnEquals = new JButton("=");
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculateResult();
            }
        });
        btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_2.add(btnEquals);
        
        
    }

    private void performOperation(String op) {
        try {
            operand1 = Double.parseDouble(txtResult.getText());
            operator = op;
            txtResult.setText("");
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    private void calculateResult() {
        if (txtResult.getText().isEmpty() || operator.isEmpty()) {
            return;
        }
        try {
            double operand2 = Double.parseDouble(txtResult.getText());
            double result = 0;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        txtResult.setText("Error");
                        return;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    break;
            }
            txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
