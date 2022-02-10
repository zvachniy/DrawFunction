module com.example.drawfunction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.drawfunction to javafx.fxml;
    exports com.example.drawfunction;
}