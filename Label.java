package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.JLabel;

/**
 * Created by Rehan on 28-Aug-15.
 */
public class Label extends JLabel{


    Label(){

    }
    Label(String text){
        super(text);
    }

    @Override
    public void setText(String text){
        super.setText(text);

    }
}
