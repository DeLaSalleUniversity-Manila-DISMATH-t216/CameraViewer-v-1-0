package ph.edu.dlsu;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MenuHBox extends HBox{

    public MenuHBox(CustomMenuItem... items){

        getChildren().add(createSeparator());

        for(CustomMenuItem item : items){
            getChildren().addAll(item, createSeparator());
        }

    }

    private Line createSeparator(){

        Line sep = new Line();
        sep.setEndY(40);
        sep.setStroke(Color.DARKGREY);

        return sep;

    }

}
