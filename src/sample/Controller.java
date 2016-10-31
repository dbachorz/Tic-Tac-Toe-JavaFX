package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.List;


public class Controller {
    //true for O, false for X
    //schena
    //a1 a2 a3
    //b1 b2 b3
    //c1 c2 c3

    private char[] boardElements;
    private boolean turn = false;

    @FXML
    protected void imageClicked(Event e) {
        ImageView clickedImage = (ImageView)e.getSource();
        if (turn) clickedImage.setImage(new Image("assets/o.bmp"));
        else clickedImage.setImage(new Image("assets/x.bmp"));
        clickedImage.setDisable(true);

        if (this.checkIfThereIsAWinner()) System.out.println("We have a winner");
        else turn = !turn;
    }

    private boolean checkIfThereIsAWinner() {
        return false;
    }

    @FXML
    private List<ImageView> choiceImageList;

    public void initialize() {
        for (ImageView choiceImage : choiceImageList) {
            choiceImage.setImage(new Image("assets/nothing.bmp"));
        }
        System.out.println("initialize success!");
    }
}