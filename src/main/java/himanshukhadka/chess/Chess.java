package himanshukhadka.chess;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Chess extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        char[][] board = new char[8][8];
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
                board[i][j] = ' ';
            }
        }

        Image pieceOne = new Image("https://upload.wikimedia.org/wikipedia/commons/0/04/Chess_plt60.png");
        ImageView one = new ImageView(pieceOne);
        one.setFitHeight(100);
        one.setFitWidth(100);
        pane.add(one,1,7);




        Scene scene = new Scene(pane);
        stage.setTitle("Chess By Himanshu");
        stage.setScene(scene);
        stage.show();
    }
}
