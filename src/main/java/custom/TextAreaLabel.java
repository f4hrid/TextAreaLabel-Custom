package custom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

/**
 *
 * @author Fahrid
 */
public class TextAreaLabel extends JTextArea {

    public TextAreaLabel( ){
        super();
        init();
    }
    
    private void init(){
        setOpaque(false);
        setBackground(new java.awt.Color(0,0,0,0));
        setBorder(BorderFactory.createEmptyBorder());
        setLineWrap(true);
        setWrapStyleWord(true);
    }
    
    @Override
    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
    }

}
