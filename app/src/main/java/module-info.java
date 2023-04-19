module br.ufms.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.ufms.app to javafx.fxml;
    exports br.ufms.app;
}