import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;



public class panelImage {
    JLabel  label =  new JLabel();

    panelImage(){
            BufferedImage myPicture;
            try {
                myPicture = ImageIO.read(new File("java\\alumns_register\\src\\foto."));
                label.setIcon(new ImageIcon(myPicture));
                label.setOpaque(true);
                label.setBackground(java.awt.Color.black);
              
            } catch (IOException e) {
                System.out.println("fuck");
            }
            

    }
    public JLabel getLabel() {
        return label;
    }

}
