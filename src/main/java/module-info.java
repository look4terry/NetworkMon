module com.senyahsolutions.networkmon {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.senyahsolutions.networkmon to javafx.fxml;
    exports com.senyahsolutions.networkmon;
}