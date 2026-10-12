module com.romeryto.workshop_javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.romeryto.workshop_javafx_jdbc to javafx.fxml;
    exports com.romeryto.workshop_javafx_jdbc;
}