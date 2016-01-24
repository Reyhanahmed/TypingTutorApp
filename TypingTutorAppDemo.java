package Book.chp14.Exercise.TypingTutorApp;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TypingTutorAppDemo{
    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                try{
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }catch(UnsupportedLookAndFeelException | InstantiationException |
                        IllegalAccessException | ClassNotFoundException e){
                    e.printStackTrace();
                }

                new TypingTutorFrame();
            }
        });

    }
}
