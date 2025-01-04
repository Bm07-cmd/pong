import java.awt.Color;
import java.awt.Graphics;


public class Rect{

    int x = 0;
    int y = 0;
    int w = 0;
    int h = 0;
  
    int velocity_x = 6;
    int velocity_y = 6;
    
    Rect(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillRect(this.x, this.y, this.w, this.h);
    }

    public void update(int PANEL_WIDTH, int PANEL_HEIGHT){
        this.x+=velocity_x;
        this.y += velocity_y;
        if(this.x > PANEL_WIDTH - this.w){
            velocity_x = velocity_x*-1;
        }
        if(this.x < 0){
            velocity_x = velocity_x*-1;
        }

        if(this.y > PANEL_HEIGHT - this.h){
            velocity_y = velocity_y*-1;
        }

        if(this.y < 0){
            velocity_y = velocity_y*-1;
        }
        
    }


}