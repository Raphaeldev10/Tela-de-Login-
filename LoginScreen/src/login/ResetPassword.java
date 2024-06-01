package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ResetPassword extends JDialog implements ActionListener {

    private JTextField usernameField;
    private JPasswordField newPasswordField;
    private JButton resetButton;

    public ResetPassword(JFrame parent) {
        super(parent, "Resetar Senha", true);
        setSize(300, 200);
        setLocationRelativeTo(parent);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        usernameField = new JTextField();
        newPasswordField = new JPasswordField();
        resetButton = new JButton("Resetar Senha");

        panel.add(new JLabel("Usuário:"));
        panel.add(usernameField);
        panel.add(new JLabel("Nova Senha:"));
        panel.add(newPasswordField);
        panel.add(new JLabel(""));
        panel.add(resetButton);

        resetButton.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            String username = usernameField.getText();
            String newPassword = new String(newPasswordField.getPassword());
            if (resetPassword(username, newPassword)) {
                JOptionPane.showMessageDialog(this, "Senha resetada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                dispose(); 
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao resetar a senha!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    protected boolean resetPassword(String username, String newPassword) {
       
      
        return false; 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword(null);
            }
        });
    }
}
