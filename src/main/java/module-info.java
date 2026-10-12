module com.romeryto.workshop_javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.romeryto.workshop_javafx_jdbc to javafx.fxml;
    opens com.romeryto.workshop_javafx_jdbc.gui to javafx.fxml;
    opens com.romeryto.workshop_javafx_jdbc.model.entities to java.base;
    opens com.romeryto.workshop_javafx_jdbc.model.services to java.base;

    exports com.romeryto.workshop_javafx_jdbc;
    exports com.romeryto.workshop_javafx_jdbc.gui;
    exports com.romeryto.workshop_javafx_jdbc.model.entities;
    exports com.romeryto.workshop_javafx_jdbc.model.services;
}