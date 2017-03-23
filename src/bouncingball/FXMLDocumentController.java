/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author alexfeng
 */
public class FXMLDocumentController implements Initializable {

    Ball b1 = new Ball();

    int cordx;
    int cordy;
    int vx;
    int vy;
    Timeline tl;

    ArrayList<Timeline> alTimeline = new ArrayList<Timeline>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pane.setPrefSize((double) Ball.sw, (double) Ball.sh);
        pane.setLayoutX(0);
        pane.setLayoutY(0);

        cordx = b1.x;
        cordy = b1.y;

        circle1.setLayoutX(cordx);
        circle1.setLayoutY(cordy);

        circle1.setVisible(true);

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

        System.out.println("vx: " + vx + ",vy: " + vy);

        tl = new Timeline();
        tl.setCycleCount(Timeline.INDEFINITE);
        KeyFrame kf = new KeyFrame(Duration.millis(3), new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                circle1.setLayoutX(circle1.getLayoutX() + vx);
                circle1.setLayoutY(circle1.getLayoutY() + vy);

                if ((circle1.getLayoutX() >= Ball.sw - (circle1.getRadius())) || circle1.getLayoutX() <= circle1.getRadius()) {

                    vx = -vx;

                }

                if ((circle1.getLayoutY() >= Ball.sh - (circle1.getRadius())) || circle1.getLayoutY() <= circle1.getRadius()) {

                    vy = -vy;

                }

            }
        });

        tl.getKeyFrames().add(kf);
        alTimeline.add(tl);
        tl.play();

    }

    @FXML
    private Label label;

    @FXML
    private Pane pane;

    @FXML
    private Circle circle1;

    @FXML
    private Circle circle2;

    @FXML
    private Circle circle3;
    @FXML
    private Circle circle4;
    @FXML
    private Circle circle5;
    @FXML
    private Circle circle6;
    @FXML
    private Circle circle7;
    @FXML
    private Circle circle8;
    @FXML
    private Circle circle9;
    @FXML
    private Circle circle10;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (tl.getStatus() == Animation.Status.PAUSED) {

            for (int y = 0; y < alTimeline.size(); y++) {
                alTimeline.get(y).play();
                label.setText("BOUNCE!");
            }

        } else if (tl.getStatus() == Animation.Status.RUNNING) {
            for (int y = 0; y < alTimeline.size(); y++) {
                alTimeline.get(y).pause();
                label.setText("PAUSE!");
            }
        }

    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {

        switch (alTimeline.size()) {

            case 1: {
                Ball b2 = new Ball();
                Timeline tl2 = new TimelineCreator().createTL(circle2, b2);

                cordx = b2.x;
                cordy = b2.y;

                circle2.setLayoutX(cordx);
                circle2.setLayoutY(cordy);
                circle2.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl2.play();
                }

                alTimeline.add(tl2);
                label.setText("Ball#2 added");
                break;
            }

            case 2: {
                Ball b3 = new Ball();
                Timeline tl3 = new TimelineCreator().createTL(circle3, b3);

                cordx = b3.x;
                cordy = b3.y;

                circle3.setLayoutX(cordx);
                circle3.setLayoutY(cordy);
                circle3.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl3.play();
                }

                alTimeline.add(tl3);
                label.setText("Ball#3 added");
                break;
            }

            case 3: {
                Ball b4 = new Ball();
                Timeline tl4 = new TimelineCreator().createTL(circle4, b4);

                cordx = b4.x;
                cordy = b4.y;

                circle4.setLayoutX(cordx);
                circle4.setLayoutY(cordy);
                circle4.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl4.play();
                }

                alTimeline.add(tl4);
                label.setText("Ball#4 added");
                break;
            }

            case 4: {
                Ball b5 = new Ball();
                Timeline tl5 = new TimelineCreator().createTL(circle5, b5);

                cordx = b5.x;
                cordy = b5.y;

                circle5.setLayoutX(cordx);
                circle5.setLayoutY(cordy);
                circle5.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl5.play();
                }

                alTimeline.add(tl5);
                label.setText("Ball#5 added");
                break;
            }

            case 5: {
                Ball b6 = new Ball();
                Timeline tl6 = new TimelineCreator().createTL(circle6, b6);

                cordx = b6.x;
                cordy = b6.y;

                circle6.setLayoutX(cordx);
                circle6.setLayoutY(cordy);
                circle6.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl6.play();
                }

                alTimeline.add(tl6);
                label.setText("Ball#6 added");
                break;
            }

            case 6: {
                Ball b7 = new Ball();
                Timeline tl7 = new TimelineCreator().createTL(circle7, b7);

                cordx = b7.x;
                cordy = b7.y;

                circle7.setLayoutX(cordx);
                circle7.setLayoutY(cordy);
                circle7.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl7.play();
                }

                alTimeline.add(tl7);
                label.setText("Ball#7 added");
                break;
            }

            case 7: {
                Ball b8 = new Ball();
                Timeline tl8 = new TimelineCreator().createTL(circle8, b8);

                cordx = b8.x;
                cordy = b8.y;

                circle8.setLayoutX(cordx);
                circle8.setLayoutY(cordy);
                circle8.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl8.play();
                }

                alTimeline.add(tl8);
                label.setText("Ball#8 added");
                break;
            }

            case 8: {
                Ball b9 = new Ball();
                Timeline tl9 = new TimelineCreator().createTL(circle9, b9);

                cordx = b9.x;
                cordy = b9.y;

                circle9.setLayoutX(cordx);
                circle9.setLayoutY(cordy);
                circle9.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl9.play();
                }

                alTimeline.add(tl9);
                label.setText("Ball#9 added");
                break;
            }

            case 9: {
                Ball b10 = new Ball();
                Timeline tl10 = new TimelineCreator().createTL(circle10, b10);

                cordx = b10.x;
                cordy = b10.y;

                circle10.setLayoutX(cordx);
                circle10.setLayoutY(cordy);
                circle10.setVisible(true);

                if (tl.getStatus() == Animation.Status.RUNNING) {
                    tl10.play();
                }

                alTimeline.add(tl10);
                label.setText("Ball#10 added");
                break;
            }

            case 10: {
                label.setText("[WARNING] Reached the maximum number of balls!");
                break;
            }

        }

    }

    @FXML
    private void handleButtonAction3(ActionEvent event) {
        switch (alTimeline.size()) {
            case 1: {
                label.setText("[WARNING] You have to keep at least one ball!");
                break;
            }

            case 2: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle2.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#2 removed");
                break;
            }

            case 3: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle3.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#3 removed");
                break;
            }

            case 4: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle4.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#4 removed");
                break;
            }

            case 5: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle5.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#5 removed");
                break;
            }

            case 6: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle6.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#6 removed");
                break;
            }

            case 7: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle7.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#7 removed");
                break;
            }

            case 8: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle8.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#8 removed");
                break;
            }

            case 9: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle9.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#9 removed");
                break;
            }

            case 10: {
                alTimeline.get(alTimeline.size() - 1).stop();
                circle10.setVisible(false);
                alTimeline.remove(alTimeline.size() - 1);
                label.setText("Ball#10 removed");
                break;
            }

        }

    }

    @FXML
    private void handleKeyAction(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleButtonAction2(new ActionEvent());
        } else if (event.getCode() == KeyCode.SPACE) {
            handleButtonAction(new ActionEvent());
        } else if (event.getCode() == KeyCode.ESCAPE) {
            handleButtonAction3(new ActionEvent());
        }

    }
    
    @FXML
    private void handleButtonAction4(ActionEvent event)
    {
        System.exit(2);
    }

}
