package g;

import java.awt.*;
import javax.swing.*;
class G extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D G=  (Graphics2D) g;
        G.setColor (Color.BLUE);
        G.drawRect(100,100,150,80);
        G.drawArc(100,100,150,150,0,360);
        
        
    }

    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.add(new G());
        f.setSize(400,400);
        f.setVisible(true);
    }
}
