module org.example.java_wise {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.java_wise to javafx.fxml;
    exports org.example.java_wise;
}