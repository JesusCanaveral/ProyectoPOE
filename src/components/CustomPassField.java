package components;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JPasswordField;
import utils.Fonts;
import utils.Colors;

public class CustomPassField extends JPasswordField {
    private boolean clicked;
    
    public CustomPassField() {
        super();
        this.clicked = false;
        this.setBackground(Colors.trans);
        this.setFont(Fonts.normal);
        this.setForeground(Colors.lightGray);
        this.setMargin(new Insets(2, 10, 2, 10));
        this.setSelectionColor(Colors.trans);
        this.setHighlighter(null);
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                thisMouseClicked(evt);
            }
        });
    }
        
    private void thisMouseClicked(java.awt.event.FocusEvent evt) {                                         
        if(!clicked){
            this.setText("");
            clicked = true;
            this.setForeground(Color.BLACK);
        }
    }  
    
}
