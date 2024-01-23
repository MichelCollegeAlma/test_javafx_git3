module org.example.test_javafx_git3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.test_javafx_git3 to javafx.fxml;
    exports org.example.test_javafx_git3;
}