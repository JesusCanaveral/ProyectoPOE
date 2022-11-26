package components;

import java.awt.Color;
import javax.swing.JComboBox;
import utils.Fonts;
import utils.Colors;

public class CustomChoose extends JComboBox {
    private boolean clicked;
    
    public CustomChoose() {
        super();
        this.clicked = false;
        this.setBackground(Colors.lightGray);
        this.setFont(Fonts.normal);
        this.setForeground(Colors.lightGray);
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                thisMouseClicked(evt);
            }
        });
    }
        
    private void thisMouseClicked(java.awt.event.FocusEvent evt) {                                         
        if(!clicked){
            clicked = true;
            this.setForeground(Color.BLACK);
        } 
    
    }
}
