package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

/**
 * Created by Rehan on 28-Aug-15.
 */
public class BtnPanel extends JPanel{

    private JButton[] buttons;
    private static final String[] keys = {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+",
            "Backspace", "Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\", "Caps", "A", "S",
            "D", "F", "G", "H", "J", "K", "L", ";", "\'", "Enter", "Shift", "Z", "X", "C", "V", "B", "N", "M", ",",
            ".", "/", "^", " ", "<", "v", ">"};

    BtnPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        buttons = new JButton[ keys.length ];

        for(int count = 0; count < keys.length; count++){
            buttons[ count ] = new JButton(keys[ count ]);
            if(count == 13)
                buttons[ count ].setPreferredSize(new Dimension(88, 34));
            else if(count == 14)
                buttons[ count ].setPreferredSize(new Dimension(58, 34));
            else if(count == 28)
                buttons[ count ].setPreferredSize(new Dimension(58, 34));
            else if(count == 40)
                buttons[ count ].setPreferredSize(new Dimension(88, 34));
            else if(count == 41)
                buttons[ count ].setPreferredSize(new Dimension(88, 34));
            else if(count == 53)
                buttons[ count ].setPreferredSize(new Dimension(280, 34));
            else
                buttons[ count ].setPreferredSize(new Dimension(42, 34));

           if(count == 51){
                add(buttons[ count ]);
                JLabel spaceLabel = new JLabel("    ");
                add(spaceLabel);
            } else if(count == 52){
                add(buttons[ count ]);
                JLabel spaceLabel = new JLabel("                                    " +
                                                "                        ");
                add(spaceLabel);
            } else if(count == 53){
                add(buttons[ count ]);
                JLabel spaceLabel = new JLabel("                   ");
                add(spaceLabel);
            } else
                add(buttons[ count ]);
        }

        setPreferredSize(new Dimension(725, 300));
    }

    public JButton[] getButtons(){
        return buttons;
    }


}
