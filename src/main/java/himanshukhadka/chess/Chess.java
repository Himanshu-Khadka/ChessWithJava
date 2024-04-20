package himanshukhadka.chess;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Chess extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        //Grid pane
        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true);
        for(int i = 0;i<8;i++){
            for (int j = 0;j<8;j++){
                Pane cell = new Pane();
                cell.setPrefSize(200, 200);
                if ((i%2)==(j%2)){
                    cell.setStyle("-fx-background-color: black;");
                }
                pane.add(cell,j,i);
            }
        }

        Scene scene = new Scene(pane);
        stage.setTitle("Chess By Himanshu");
        stage.setScene(scene);
        stage.show();
    }
}
