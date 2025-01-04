import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Panel extends JPanel implements ActionListener{
    int PANEL_WIDTH;
    int PANEL_HEIGHT;
    Timer loop;
    Rect rect;
    Rect2 rect2;

    Panel(int w, int h){
        this.PANEL_WIDTH = w;
        this.PANEL_HEIGHT = h;

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        this.rect = new Rect(200, 100, 50, 50);
        this.rect2 = new Rect2(0, 10, 12, 60);
        this.loop = new Timer(10, this);
        loop.start();
        

    }


    @Override
    public void paint(Graphics g){
        super.paint(g);
        this.rect.draw(g);
        this.rect2.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        this.rect.update(this.PANEL_WIDTH, this.PANEL_HEIGHT);
        repaint();
    }
}