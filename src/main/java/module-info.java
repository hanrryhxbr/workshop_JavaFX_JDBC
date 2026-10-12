module com.romeryto.workshop_javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.romeryto.workshop_javafx_jdbc to javafx.fxml;
    opens com.romeryto.workshop_javafx_jdbc.gui to javafx.fxml;

    exports com.romeryto.workshop_javafx_jdbc;
    exports com.romeryto.workshop_javafx_jdbc.gui;
}