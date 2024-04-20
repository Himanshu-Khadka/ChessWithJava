module himanshukhadka.chess {
    requires javafx.controls;
    requires javafx.fxml;


    opens himanshukhadka.chess to javafx.fxml;
    exports himanshukhadka.chess;
}