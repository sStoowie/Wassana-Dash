
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Main;

public class MyFrame extends JFrame {
    private JButton helpButton;
    private JButton startButton;
    private JButton exitButton;
    private JLabel backgroundLabel, wassanaLabel, logoLabel;

    public MyFrame() {
        setTitle("Wassana Dash!");
        setSize(768, 576);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        //background
        backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());
        backgroundLabel.setIcon(new ImageIcon("res/objects/bgmenu.png"));
        backgroundLabel.setLayout(null);
        
        //wassana
        wassanaLabel = new JLabel();
        wassanaLabel.setBounds(0, 0, getWidth(), getHeight());
        wassanaLabel.setIcon(new ImageIcon("res/objects/auntiewassana.png"));
        wassanaLabel.setLayout(null);
        
        //   
        logoLabel = new JLabel();
        logoLabel.setBounds(530, -50,getWidth()/2, getHeight()/2);
        logoLabel.setIcon(new ImageIcon("res/objects/logospin2.gif"));
        logoLabel.setLayout(null);

        // Create buttons with custom icons
        startButton = createButton("res/objects/playbutton.png", 50, 40, 200, 150);
        helpButton = createButton("res/objects/helpbutton.png", 50, 110, 200, 150);
        exitButton = createButton("res/objects/exitbutton.png", 50, 180, 200, 150);

        // Center buttons vertically
        int frameHeight = 576;
        int startY = (frameHeight - 380) / 2;
        startButton.setLocation(startButton.getX(), startY);
        helpButton.setLocation(helpButton.getX(), startY + 100);
        exitButton.setLocation(exitButton.getX(), startY + 200);

        // Add buttons to the frame
        
        add(helpButton);
        add(startButton);
        add(exitButton);
        add(wassanaLabel);
        add(logoLabel);
        add(backgroundLabel);
        
    }

    private JButton createButton(String imagePath, int x, int y, int width, int height) {
        JButton button = new JButton();
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);

        // Set custom icon
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));

        // Button click listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button click event
                if (button == helpButton) {
                    // Perform help action
                } else if (button == startButton) {
                    new Main();
                   
                } else if (button == exitButton) {
                    // Perform exit action
                    System.exit(0);
                }
            }
        });

        return button;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame frame = new MyFrame();
                frame.setVisible(true);
            }
        });
    }
}
