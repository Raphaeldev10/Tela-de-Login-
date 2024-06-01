package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MainMenuScreen extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5;
    private JButton logoutButton;

    public MainMenuScreen() {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

       
        menuBar = new JMenuBar();
        menu = new JMenu("Opções");

        
        menuItem1 = new JMenuItem("Opção 1");
        menuItem2 = new JMenuItem("Opção 2");
        menuItem3 = new JMenuItem("Opção 3");
        menuItem4 = new JMenuItem("Opção 4");
        menuItem5 = new JMenuItem("Opção 5");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menu.add(menuItem5);

        menuBar.add(menu);
        setJMenuBar(menuBar);

        
        logoutButton = new JButton("Sair");
        logoutButton.addActionListener(this);

        
        setLayout(new BorderLayout());
        add(logoutButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            System.exit(0); 
        }
    }
}
