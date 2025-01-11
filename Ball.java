import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Rect{
    int initial_x;
    int initial_y;


    Ball(int x, int y, int w, int h){
        super(x, y, w, h);
        this.initial_x = x;
        this.initial_y = y;
    }
    public void update(int PANEL_WIDTH, int PANEL_HEIGHT){
        this.x+=velocity_x;
        this.y += velocity_y;
        if(this.x > PANEL_WIDTH + 300){
            this.changeDirection();
        }
        if(this.x < -this.w - 300){
            this.changeDirection();
        
        }

        if(this.y > PANEL_HEIGHT - this.h){
            velocity_y = velocity_y*-1;
        }

        if(this.y < 0){
            velocity_y = velocity_y*-1;
        }

    }

    public void changeDirection(){
        this.x = this.initial_x;
        this.y = this.initial_y;
        velocity_x = velocity_x*-1;
    }

}


