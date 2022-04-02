import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class SimpleApp extends JFrame {
    private JLabel label = new JLabel("Выберите язык");
    private JRadioButton radio1 = new JRadioButton("RU");
    private JRadioButton radio2 = new JRadioButton("EN");
    private JButton button = new JButton("Ввод");

    ResourceBundle bundleRU = ResourceBundle.getBundle("resources",
            new Locale("ru", "RU"));
    ResourceBundle bundleEN = ResourceBundle.getBundle("resources",
            new Locale("en", "EN"));

    public SimpleApp() {
        super("Simple App");
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(label);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        radio1.addActionListener(new RadioButtonListener());
        container.add(radio1);
        radio1.setSelected(true);
        radio2.addActionListener(new RadioButtonListener());
        container.add(radio2);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    public class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";

            if(radio1.isSelected())
                message = bundleRU.getString("message");
            else if (radio2.isSelected())
                message = bundleEN.getString("message");

            JOptionPane.showMessageDialog(null, message, "MESSAGE", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(radio1.isSelected()){
                label.setText(bundleRU.getString("label"));
                button.setText(bundleRU.getString("button"));
            }
            else if(radio2.isSelected()){
                label.setText(bundleEN.getString("label"));
                button.setText(bundleEN.getString("button"));
            }
        }
    }
}
