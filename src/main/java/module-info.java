module com.example.simulation_of_bangladesh_bank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulation_of_bangladesh_bank to javafx.fxml;
    exports com.example.simulation_of_bangladesh_bank;
}