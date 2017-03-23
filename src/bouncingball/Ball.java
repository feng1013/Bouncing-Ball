/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import java.awt.Dimension;

/**
 *
 * @author alexfeng
 */
import java.util.Random;

public class Ball {

    int x;
    int y;
    int r = 20;
    String name;
    Random rdm = new Random();
    int speedX;
    int speedY;
    int direction;

    static Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    public static int sh = screenSize.height;
    public static int sw = screenSize.width;

    public Ball() {
        

        //setX(50);
        //setY(50);
        setX(rdm.nextInt(sw-2*r+1)+r);
        setY(rdm.nextInt(sh-2*r+1)+r);

        direction = rdm.nextInt(4) + 1;

        //direction =4;
        
        if (direction == 1) {
            speedX = 1;
            speedY = -1;

        } else if (direction == 2) {
            speedX = -1;
            speedY = -1;
        } else if (direction == 3) {
            speedX = -1;
            speedY = 1;

        } else {
            speedX = 1;
            speedY = 1;
        }

        //測試用
        System.out.println(getX() + "," + getY() + "," + getDirection());

    }

    public void run() {
        
        
        
        
        

    }

    public void rerun(int d) {

    }

    public void bounce() {

    }

    public int getDirection() {
        return direction;

    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
