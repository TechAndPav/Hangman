module com.techandpav.hangman {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.techandpav.hangman to javafx.fxml;
    exports com.techandpav.hangman;
}