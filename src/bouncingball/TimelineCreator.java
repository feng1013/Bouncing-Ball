/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author alexfeng
 */
public class TimelineCreator {

    int vx = 0;
    int vy = 0;

    public Timeline createTL(Circle c, Ball b1) {

        switch (b1.getDirection()) {
            case 1: {
                vx = 1;
                vy = -1;
                break;
            }

            case 2: {
                vx = -1;
                vy = -1;
                break;
            }

            case 3: {
                vx = -1;
                vy = 1;
                break;
            }

            case 4: {
                vx = 1;
                vy = 1;
                break;
            }

        }

        Timeline tl = new Timeline();
        tl.setCycleCount(Timeline.INDEFINITE);
        KeyFrame kf = new KeyFrame(Duration.millis(3), new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                c.setLayoutX(c.getLayoutX() + vx);
                c.setLayoutY(c.getLayoutY() + vy);

                if ((c.getLayoutX() >= Ball.sw - (c.getRadius())) || c.getLayoutX() <= c.getRadius()) {

                    vx = -vx;

                }

                if ((c.getLayoutY() >= Ball.sh - (c.getRadius())) || c.getLayoutY() <= c.getRadius()) {

                    vy = -vy;

                }

            }
        });

        tl.getKeyFrames().add(kf);

        return tl;
    }

}
