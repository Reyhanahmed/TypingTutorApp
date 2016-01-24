package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class FontChooser extends JPanel{
    private JLabel fontLabel;
    private JLabel styleLabel;
    private JLabel sizeLabel;
    private JLabel sampleLabel;
    private JTextField fontNameField;
    private JTextField fontStyleField;
    private JTextField fontSizeField;
    private JList fontNameList;
    private JList fontStyleList;
    private JList fontSizeList;
    private Font finalFont;
    private static final String[] fontNames = {"Arial", "Arvo", "Calibri", "Cambria", "Candara", "Century Gothic",
            "Georgia", "Impact", "Lucida Console", "Lucida Handwriting", "Monaco", "Times New Roman"};
    private static final String[] fontStylesNames = {"Regular", "Oblique", "Bold", "Bold Oblique"};
    private static final String[] fontSizeNames = {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24",
                                                    "26", "28", "36", "48", "72"};

    FontChooser(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

       ////////////// Labels //////////////
        fontLabel = new JLabel("Font:");
        fontLabel.setPreferredSize(new Dimension(167, 10));
        add(fontLabel);

        styleLabel = new JLabel("Font Style:");
        styleLabel.setPreferredSize(new Dimension(126, 10));
        add(styleLabel);

        sizeLabel = new JLabel("Size:");
        sizeLabel.setPreferredSize(new Dimension(40, 10));
        add(sizeLabel);


        ////////////// Fields //////////////
        fontNameField = new JTextField(fontNames[0], 20);
        fontNameField.setEditable(false);
        add(fontNameField);

        fontStyleField = new JTextField(fontStylesNames[0], 15);
        fontStyleField.setEditable(false);
        add(fontStyleField);

        fontSizeField = new JTextField(fontSizeNames[0], 8);
        fontSizeField.setEditable(false);
        add(fontSizeField);


        ////////////// JLists //////////////
        fontNameList = new JList(fontNames);
        fontNameList.setVisibleRowCount(5);
        fontNameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fontNameList.setBorder(BorderFactory.createEtchedBorder());
        fontNameList.setSelectedIndex(0);
        fontNameList.setPreferredSize(new Dimension(146, 200));
        add(new JScrollPane(fontNameList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));


        fontStyleList = new JList(fontStylesNames);
        fontStyleList.setVisibleRowCount(5);
        fontStyleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fontStyleList.setBorder(BorderFactory.createEtchedBorder());
        fontStyleList.setSelectedIndex(0);
        fontStyleList.setPreferredSize(new Dimension(108, 200));
        add(new JScrollPane(fontStyleList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));


        fontSizeList = new JList(fontSizeNames);
        fontSizeList.setVisibleRowCount(5);
        fontSizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fontSizeList.setBorder(BorderFactory.createEtchedBorder());
        fontSizeList.setSelectedIndex(0);
        fontSizeList.setPreferredSize(new Dimension(52, 200));
        add(new JScrollPane(fontSizeList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));

        ////////////// SampleLabel //////////////
        sampleLabel = new JLabel("AaBbYyZz");
        sampleLabel.setPreferredSize(new Dimension(200, 70));
        sampleLabel.setFont(new Font("Arial", Font.PLAIN, 8));
        sampleLabel.setBorder(BorderFactory.createTitledBorder("Sample"));
        add(sampleLabel);

        setPreferredSize(new Dimension(400, 300));

        ListHandler handler = new ListHandler();
        fontNameList.addListSelectionListener(handler);
        fontStyleList.addListSelectionListener(handler);
        fontSizeList.addListSelectionListener(handler);
    }


    private class ListHandler implements ListSelectionListener{

        String font = "Arial";
        String style = "Regular";
        String size = "8";
        @Override
        public void valueChanged(ListSelectionEvent e){
            if(e.getSource() == fontNameList){
                fontNameField.setText((String) fontNameList.getSelectedValue());
                font = fontNameField.getText();
            }
            else if(e.getSource() == fontStyleList){
                fontStyleField.setText((String)fontStyleList.getSelectedValue());
                style = fontStyleField.getText();
            }
            else {
                fontSizeField.setText((String)fontSizeList.getSelectedValue());
                size = fontSizeField.getText();
            }

            if(style.equals("Regular")){
                finalFont = new Font(font, Font.PLAIN, Integer.parseInt(size));
                sampleLabel.setFont(finalFont);
            }
            else if(style.equals("Oblique")){
                finalFont = new Font(font, Font.ITALIC, Integer.parseInt(size));
                sampleLabel.setFont(finalFont);
            }
            else if(style.equals("Bold")){
                finalFont = new Font(font, Font.BOLD, Integer.parseInt(size));
                sampleLabel.setFont(finalFont);
            }
            else if(style.equals("Bold Oblique")){
                finalFont = new Font(font, Font.ITALIC + Font.BOLD, Integer.parseInt(size));
                sampleLabel.setFont(finalFont);
            }
        }
    }

    public Font getFont(){
        return finalFont;
    }

}
