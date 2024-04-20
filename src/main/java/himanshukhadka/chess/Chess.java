package himanshukhadka.chess;
import javafx.application.Application;
import javafx.geometry.Insets;
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
        pane.setPadding(new Insets(10,10,10,10));
        pane.setMaxHeight(1620);
        pane.setMaxWidth(1620);

        for(int i = 0;i<8;i++){
            for (int j = 0;j<8;j++){
                Pane cell = new Pane();
                cell.setPrefSize(200, 200);

                if ((i%2)==(j%2)){
                    cell.setStyle("-fx-background-color: rgba(0,0,0,0.8);");
                }
                pane.add(cell,j,i);
                board[i][j] = ' ';
            }
        }

            //Adding pieces using AddPieces class This is the line that is causing the error
            try {
                AddPieces.addPieces(pane, board);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error in adding pieces");
            }




        Scene scene = new Scene(pane);
        stage.setTitle("Chess By Himanshu");
        stage.setScene(scene);
        stage.show();
    }
}
