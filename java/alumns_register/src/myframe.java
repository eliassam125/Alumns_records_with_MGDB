import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class myframe {

    private JFrame frame ;

    myframe(){
        frame = new JFrame();
        frame.setSize(1250, 1250);
        frame.setLocationRelativeTo(null);
        


        //panelImage imagen_1 = new panelImage();
        //frame.add(imagen_1.getLabel());
        
        panelimage2 asd = new panelimage2();
        frame.add(asd);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

}
