package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.SecureRandom;

public class TextPanel extends JPanel{

    private JButton[] buttons;
    private JTextArea textArea;
    private SentenceLabel sentenceLabel;
    private boolean toggle = false;
    private static final String[] pangrams = {"The quick brown fox jumped over the lazy dog",
        "Pack my box with five dozen liquor jugs", "How quickly daft jumping zebras vex",
        "The explorer was frozen in his big kayak just after making queer discoveries",
        "Sixty zippers were quickly picked from the woven jute bag",
        "The job requires extra pluck and zeal from every young wage earner",
        "While making deep excavations we found some quaint bronze jewelry",
        "We quickly seized the black axle and just saved it from going past him",
        "The public was amazed to view the quickness and dexterity of the juggler",
        "Whenever the black fox jumped the squirrel gazed suspiciously"};
    private String singlePangram;
    private SecureRandom randomNum;
    private char[] array;
    static int counter = 0;
    static int correct = 0;
    static int incorrect = 0;

    TextPanel(){

        setLayout(new BorderLayout(5, 10));
        textArea = new JTextArea(8, 87);
        //textArea.setBorder(BorderFactory.createEtchedBorder());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        KeyHandler handler = new KeyHandler();
        textArea.addKeyListener(handler);

        randomNum = new SecureRandom();
        int num = randomNum.nextInt(pangrams.length);
        singlePangram = pangrams[num];
        array = singlePangram.toCharArray();
        sentenceLabel = new SentenceLabel("Type: \"" + singlePangram +"\"");
        sentenceLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
        sentenceLabel.setPreferredSize(new Dimension(1000, 17));
        add(sentenceLabel, BorderLayout.SOUTH);
    }

    public void randomSentence(){
        int num = randomNum.nextInt(pangrams.length);
        singlePangram = pangrams[num];
        array = singlePangram.toCharArray();
        sentenceLabel.setText("Type: \"" + singlePangram +"\"");
        sentenceLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
    }

    public void setButtons(JButton[] buttons){
        this.buttons = buttons;
    }

    public String[] getPangrams(){
        return pangrams;
    }

    public JTextArea getTextArea(){
        return textArea;
    }

    class KeyHandler implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e){
            char ch = e.getKeyChar();
            switch(ch){
                case '`':
                    buttons[0].setBackground(Color.BLUE);
                    break;
                case '1':
                    buttons[1].setBackground(Color.BLUE);
                    break;
                case '2':
                    buttons[2].setBackground(Color.BLUE);
                    break;
                case '3':
                    buttons[3].setBackground(Color.BLUE);
                    break;
                case '4':
                    buttons[4].setBackground(Color.BLUE);
                    break;
                case '5':
                    buttons[5].setBackground(Color.BLUE);
                    break;
                case '6':
                    buttons[6].setBackground(Color.BLUE);
                    break;
                case '7':
                    buttons[7].setBackground(Color.BLUE);
                    break;
                case '8':
                    buttons[8].setBackground(Color.BLUE);
                    break;
                case '9':
                    buttons[9].setBackground(Color.BLUE);
                    break;
                case '0':
                    buttons[10].setBackground(Color.BLUE);
                    break;
                case '-':
                    buttons[11].setBackground(Color.BLUE);
                    break;
                case '=':
                    buttons[12].setBackground(Color.BLUE);
                    break;
                case 'Q':
                case 'q':
                    buttons[15].setBackground(Color.BLUE);
                    break;
                case 'W':
                case 'w':
                    buttons[16].setBackground(Color.BLUE);
                    break;
                case 'E':
                case 'e':
                    buttons[17].setBackground(Color.BLUE);
                    break;
                case 'R':
                case 'r':
                    buttons[18].setBackground(Color.BLUE);
                    break;
                case 'T':
                case 't':
                    buttons[19].setBackground(Color.BLUE);
                    break;
                case 'Y':
                case 'y':
                    buttons[20].setBackground(Color.BLUE);
                    break;
                case 'U':
                case 'u':
                    buttons[21].setBackground(Color.BLUE);
                    break;
                case 'I':
                case 'i':
                    buttons[22].setBackground(Color.BLUE);
                    break;
                case 'O':
                case 'o':
                    buttons[23].setBackground(Color.BLUE);
                    break;
                case 'P':
                case 'p':
                    buttons[24].setBackground(Color.BLUE);
                    break;
                case '[':
                    buttons[25].setBackground(Color.BLUE);
                    break;
                case ']':
                    buttons[26].setBackground(Color.BLUE);
                    break;
                case '\\':
                    buttons[27].setBackground(Color.BLUE);
                    break;
                case 'A':
                case 'a':
                    buttons[29].setBackground(Color.BLUE);
                    break;
                case 'S':
                case 's':
                    buttons[30].setBackground(Color.BLUE);
                    break;
                case 'D':
                case 'd':
                    buttons[31].setBackground(Color.BLUE);
                    break;
                case 'F':
                case 'f':
                    buttons[32].setBackground(Color.BLUE);
                    break;
                case 'G':
                case 'g':
                    buttons[33].setBackground(Color.BLUE);
                    break;
                case 'H':
                case 'h':
                    buttons[34].setBackground(Color.BLUE);
                    break;
                case 'J':
                case 'j':
                    buttons[35].setBackground(Color.BLUE);
                    break;
                case 'K':
                case 'k':
                    buttons[36].setBackground(Color.BLUE);
                    break;
                case 'L':
                case 'l':
                    buttons[37].setBackground(Color.BLUE);
                    break;
                case ';':
                    buttons[38].setBackground(Color.BLUE);
                    break;
                case '\'':
                    buttons[39].setBackground(Color.BLUE);
                    break;
                case '\n':
                    buttons[40].setBackground(Color.BLUE);
                    break;
                case 'Z':
                case 'z':
                    buttons[42].setBackground(Color.BLUE);
                    break;
                case 'X':
                case 'x':
                    buttons[43].setBackground(Color.BLUE);
                    break;
                case 'C':
                case 'c':
                    buttons[44].setBackground(Color.BLUE);
                    break;
                case 'V':
                case 'v':
                    buttons[45].setBackground(Color.BLUE);
                    break;
                case 'B':
                case 'b':
                    buttons[46].setBackground(Color.BLUE);
                    break;
                case 'N':
                case 'n':
                    buttons[47].setBackground(Color.BLUE);
                    break;
                case 'M':
                case 'm':
                    buttons[48].setBackground(Color.BLUE);
                    break;
                case ',':
                    buttons[49].setBackground(Color.BLUE);
                    break;
                case '.':
                    buttons[50].setBackground(Color.BLUE);
                    break;
                case '/':
                    buttons[51].setBackground(Color.BLUE);
                    break;
                case ' ':
                    buttons[53].setBackground(Color.BLUE);
                    break;
            }

            int bs;
            bs = ch;
            if(bs == 8)
                buttons[13].setBackground(Color.BLUE);
        }

        @Override
        public void keyPressed(KeyEvent e){

            String s = KeyEvent.getKeyText(e.getKeyCode());
            switch(s){
                case "Tab":
                    buttons[14].setBackground(Color.BLUE);
                    break;
                case "Caps Lock":
                    toggle = !toggle;
                    if(toggle)
                        buttons[28].setBackground(Color.RED);
                    else
                        buttons[28].setBackground(Color.WHITE);
                    break;
                case "Shift":
                    buttons[41].setBackground(Color.BLUE);
                    break;
                case "Up":
                    buttons[52].setBackground(Color.BLUE);
                    break;
                case "Left":
                    buttons[54].setBackground(Color.BLUE);
                    break;
                case "Down":
                    buttons[55].setBackground(Color.BLUE);
                    break;
                case "Right":
                    buttons[56].setBackground(Color.BLUE);
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e){
            char ch = e.getKeyChar();
            switch(ch){
                case '`':
                    buttons[0].setBackground(Color.WHITE);
                    break;
                case '1':
                    buttons[1].setBackground(Color.WHITE);
                    break;
                case '2':
                    buttons[2].setBackground(Color.WHITE);
                    break;
                case '3':
                    buttons[3].setBackground(Color.WHITE);
                    break;
                case '4':
                    buttons[4].setBackground(Color.WHITE);
                    break;
                case '5':
                    buttons[5].setBackground(Color.WHITE);
                    break;
                case '6':
                    buttons[6].setBackground(Color.WHITE);
                    break;
                case '7':
                    buttons[7].setBackground(Color.WHITE);
                    break;
                case '8':
                    buttons[8].setBackground(Color.WHITE);
                    break;
                case '9':
                    buttons[9].setBackground(Color.WHITE);
                    break;
                case '0':
                    buttons[10].setBackground(Color.WHITE);
                    break;
                case '-':
                    buttons[11].setBackground(Color.WHITE);
                    break;
                case '=':
                    buttons[12].setBackground(Color.WHITE);
                    break;
                case 'Q':
                case 'q':
                    buttons[15].setBackground(Color.WHITE);
                    break;
                case 'W':
                case 'w':
                    buttons[16].setBackground(Color.WHITE);
                    break;
                case 'E':
                case 'e':
                    buttons[17].setBackground(Color.WHITE);
                    break;
                case 'R':
                case 'r':
                    buttons[18].setBackground(Color.WHITE);
                    break;
                case 'T':
                case 't':
                    buttons[19].setBackground(Color.WHITE);
                    break;
                case 'Y':
                case 'y':
                    buttons[20].setBackground(Color.WHITE);
                    break;
                case 'U':
                case 'u':
                    buttons[21].setBackground(Color.WHITE);
                    break;
                case 'I':
                case 'i':
                    buttons[22].setBackground(Color.WHITE);
                    break;
                case 'O':
                case 'o':
                    buttons[23].setBackground(Color.WHITE);
                    break;
                case 'P':
                case 'p':
                    buttons[24].setBackground(Color.WHITE);
                    break;
                case '[':
                    buttons[25].setBackground(Color.WHITE);
                    break;
                case ']':
                    buttons[26].setBackground(Color.WHITE);
                    break;
                case '\\':
                    buttons[27].setBackground(Color.WHITE);
                    break;
                case 'A':
                case 'a':
                    buttons[29].setBackground(Color.WHITE);
                    break;
                case 'S':
                case 's':
                    buttons[30].setBackground(Color.WHITE);
                    break;
                case 'D':
                case 'd':
                    buttons[31].setBackground(Color.WHITE);
                    break;
                case 'F':
                case 'f':
                    buttons[32].setBackground(Color.WHITE);
                    break;
                case 'G':
                case 'g':
                    buttons[33].setBackground(Color.WHITE);
                    break;
                case 'H':
                case 'h':
                    buttons[34].setBackground(Color.WHITE);
                    break;
                case 'J':
                case 'j':
                    buttons[35].setBackground(Color.WHITE);
                    break;
                case 'K':
                case 'k':
                    buttons[36].setBackground(Color.WHITE);
                    break;
                case 'L':
                case 'l':
                    buttons[37].setBackground(Color.WHITE);
                    break;
                case ';':
                    buttons[38].setBackground(Color.WHITE);
                    break;
                case '\'':
                    buttons[39].setBackground(Color.WHITE);
                    break;
                case '\n':
                    buttons[40].setBackground(Color.WHITE);
                    break;
                case 'Z':
                case 'z':
                    buttons[42].setBackground(Color.WHITE);
                    break;
                case 'X':
                case 'x':
                    buttons[43].setBackground(Color.WHITE);
                    break;
                case 'C':
                case 'c':
                    buttons[44].setBackground(Color.WHITE);
                    break;
                case 'V':
                case 'v':
                    buttons[45].setBackground(Color.WHITE);
                    break;
                case 'B':
                case 'b':
                    buttons[46].setBackground(Color.WHITE);
                    break;
                case 'N':
                case 'n':
                    buttons[47].setBackground(Color.WHITE);
                    break;
                case 'M':
                case 'm':
                    buttons[48].setBackground(Color.WHITE);
                    break;
                case ',':
                    buttons[49].setBackground(Color.WHITE);
                    break;
                case '.':
                    buttons[50].setBackground(Color.WHITE);
                    break;
                case '/':
                    buttons[51].setBackground(Color.WHITE);
                    break;
                case ' ':
                    buttons[53].setBackground(Color.WHITE);
                    break;
            }

            int bs;
            bs = ch;
            if(bs == 8)
                buttons[13].setBackground(Color.WHITE);

            String s = KeyEvent.getKeyText(e.getKeyCode());
            switch(s){
                case "Tab":
                    buttons[14].setBackground(Color.WHITE);
                    break;
//            case "Caps Lock":
//                buttons[28].setBackground(Color.WHITE);
//                break;
                case "Shift":
                    buttons[41].setBackground(Color.WHITE);
                    break;
                case "Up":
                    buttons[52].setBackground(Color.WHITE);
                    break;
                case "Left":
                    buttons[54].setBackground(Color.WHITE);
                    break;
                case "Down":
                    buttons[55].setBackground(Color.WHITE);
                    break;
                case "Right":
                    buttons[56].setBackground(Color.WHITE);
                    break;
            }


            if(s != "Tab" && s != "Caps Lock" && s != "Shift" && s != "Up" && s != "Left" &&
                    s != "Down" && s != "Right" && ch != '\b' ){
                    if(array[counter] == ch){
                        correct++;
                        textArea.setForeground(Color.BLACK);
                        counter++;
                        if(counter == array.length){
                            JOptionPane.showMessageDialog(null, String.format("Total Keystrokes: %d%nCorrect Keystrokes: %d" +
                                    "%nIncorrect Keystrokes: %d", correct+incorrect, correct, incorrect), "Result",
                                     JOptionPane.INFORMATION_MESSAGE);
                            correct = 0;
                            incorrect = 0;
                            counter = 0;
                            textArea.setText("");
                        }
                    }
                    else {
                        incorrect++;
                        textArea.setForeground(Color.RED);
                    }
            }

        }
    }
}
