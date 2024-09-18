import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import javafx.scene.image.Image;



public class panelImage {
    JLabel  label =  new JLabel();

    panelImage(){
            BufferedImage myPicture;
            try {
                myPicture = ImageIO.read(new File("foto3.png"));
                java.awt.Image scaledImage = myPicture.getScaledInstance(200, 200,2);
                label.setIcon(new ImageIcon(scaledImage));
                label.setOpaque(true);
                label.setBackground(java.awt.Color.black);
                label.setPreferredSize(new Dimension(25, 25));
              
            } catch (IOException e) {
                System.out.println("fuck");
            }
            

    }
    public JLabel getLabel() {
        return label;
    }

}
