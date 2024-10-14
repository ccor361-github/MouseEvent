module es.ieslosmontecillos.ejerciciomouseevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.ejerciciomouseevent to javafx.fxml;
    exports es.ieslosmontecillos.ejerciciomouseevent;
}