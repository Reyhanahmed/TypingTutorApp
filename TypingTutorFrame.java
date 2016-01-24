package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TypingTutorFrame extends JFrame{
    private Label label;
    private TextPanel textArea;
    private BtnPanel btnPanel;
    private JButton[] buttons;
    private String[] pangrams;
    FontChooser panel = new FontChooser();

    public TypingTutorFrame(){
        super("Typing Pro");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        setJMenuBar(createMenuBar());

        label = new Label("<html>Type some text using your keyboard. The keys you press" +
                " will be highlighted and the text will be displayed.<br>" +
                "Note: Clicking the buttons with your mouse will not perform any action");
        label.setPreferredSize(new Dimension(1000, 30));
        add(label);


        btnPanel = new BtnPanel();
        buttons = btnPanel.getButtons();
        btnPanel.setPreferredSize(new Dimension(712, 220));

        textArea = new TextPanel();
        textArea.setButtons(buttons);
        textArea.setPreferredSize(new Dimension(712, 180));
        pangrams = textArea.getPangrams();
        add(textArea);

        add(btnPanel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(738, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar;
        JMenu fileMenu;
        JMenu formatMenu;
        JMenu helpMenu;
        JMenu viewMenu;
        JMenuItem newItem;
        JMenuItem exitItem;
        JMenuItem fontItem;
        JMenuItem aboutItem;
        JCheckBoxMenuItem keyboardItem;
        JCheckBoxMenuItem wordWrap;

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        newItem = new JMenuItem("New");
        fileMenu.add(newItem);
        exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);
        wordWrap = new JCheckBoxMenuItem("Word Wrap");
        formatMenu.add(wordWrap);
        fontItem = new JMenuItem("Font...");
        formatMenu.add(fontItem);
        formatMenu.addSeparator();
        viewMenu = new JMenu("View");
        formatMenu.add(viewMenu);
        keyboardItem = new JCheckBoxMenuItem("Show Keyboard", true);
        viewMenu.add(keyboardItem);


        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);


        newItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

//                int num = randomNum.nextInt(pangrams.length);
//                sentenceLabel.setText("  Type: \"" + pangrams[ num ] + "\"");
//                sentenceLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
                textArea.randomSentence();
                textArea.correct = 0;
                textArea.incorrect = 0;
                textArea.counter = 0;
                textArea.getTextArea().setText("");
            }
        });

        exitItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int action = JOptionPane.showConfirmDialog(TypingTutorFrame.this, "Do you really want to exit?",
                        "Confirm Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                System.out.println(action);

                if(action == JOptionPane.OK_OPTION)
                    System.exit(0);
            }
        });

        fontItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                int action = JOptionPane.showConfirmDialog(TypingTutorFrame.this, panel,
                        "Fonts", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if(action == JOptionPane.OK_OPTION)
                    textArea.getTextArea().setFont(panel.getFont());
            }
        });

        wordWrap.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.getTextArea().setLineWrap(wordWrap.isSelected());
            }
        });

        aboutItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AboutPanel panel = new AboutPanel();
                JOptionPane.showMessageDialog(TypingTutorFrame.this, panel, "About", JOptionPane.PLAIN_MESSAGE);
            }
        });

        keyboardItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(keyboardItem.isSelected()){
                    btnPanel.setVisible(true);
                    textArea.setPreferredSize(new Dimension(712, 180));
                } else{
                    btnPanel.setVisible(false);
                    textArea.setPreferredSize(new Dimension(712, 400));
                }

            }
        });

        /////// add Mnemonics & Accelerators ////////

        fileMenu.setMnemonic(KeyEvent.VK_F);
        exitItem.setMnemonic(KeyEvent.VK_X);
        newItem.setMnemonic(KeyEvent.VK_N);

        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        keyboardItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK));

        return menuBar;
    }
}
