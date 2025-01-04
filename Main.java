

import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        
        
        int WINDOW_WIDTH = 640;
        int WINDOW_HEIGHT = 480;

        JFrame window = new JFrame("Pong");

        window.setVisible(true);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	Panel surface = new Panel(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.add(surface);
        window.pack();
        


    }
}