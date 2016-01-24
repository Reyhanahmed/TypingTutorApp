package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.*;
import java.awt.*;

public class AboutPanel extends JPanel{
    private JLabel iconLabel;
    private JLabel desLabel;
    private JLabel lastLabel;

    AboutPanel(){
        setLayout(new GridLayout(3, 1));
        ImageIcon icon = new ImageIcon(getClass().getResource("RR_logo.png"));
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Icon newIcon = new ImageIcon(newImage);

        iconLabel = new JLabel(newIcon);
        iconLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        iconLabel.setPreferredSize(new Dimension(100, 110));
        add(iconLabel);

        desLabel = new JLabel();
        desLabel.setText("<html>Pro Typing<br>Version 1.0<br>&copy; 2015 RR Corporation. All Rights Reserved." +
                "<br>This Pro Typing and it's user interface are protected by trademark<br>and other pending or " +
                "existing intellectual property in Pakistan<br>and other countries/regions. </html>");
        desLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        add(desLabel);

        lastLabel = new JLabel();
        lastLabel.setText("<html>This product is created by<br><strong><FONT color = \"E56508\">Mr Rizwan and Rehan Ahmed</FONT></strong><br>" +
                "under the license of<br><a href = \"http://www.google.com.pk\">RR Corporation</a></html>");
        lastLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        add(lastLabel);


        setPreferredSize(new Dimension(450, 350));
    }

}
