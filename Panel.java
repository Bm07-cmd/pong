import java.*;
// import javax.swing.JPanel;
// import java.awt.Dimension;
// import java.awt.Color;
// import java.awt.Graphics;
// import javax.swing.Timer;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
// import java.awt.event.KeyListener;
// import java.awt.event.KeyEvent;


public class Panel extends JPanel implements ActionListener, KeyListener{
    int PANEL_WIDTH;
    int PANEL_HEIGHT;
    Timer loop;
    Rect rect;
    Ball ball;
    Paddle p1;
    Paddle p2;

    Panel(int w, int h){
        this.PANEL_WIDTH = w;
        this.PANEL_HEIGHT = h;

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        this.ball = new Ball(PANEL_WIDTH/2, PANEL_HEIGHT/2, 20, 20);
        this.p1 = new Paddle(0, 0, 12, 80);
        this.p2 = new Paddle(PANEL_WIDTH - 12, 0, 12, 80);
        this.loop = new Timer(10, this);
        addKeyListener(this);
        loop.start();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        this.ball.draw(g);
        this.p1.draw(g);
        this.p2.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        this.ball.update(this.PANEL_WIDTH, this.PANEL_HEIGHT);
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        this.ball.update(this.PANEL_WIDTH, this.PANEL_HEIGHT);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("up arrow");
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
