module com.example.orderease {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.orderease to javafx.fxml;
    exports com.example.orderease;
}