module com.example.simulation_of_bangladesh_bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.simulation_of_bangladesh_bank to javafx.fxml;
<<<<<<< HEAD
    exports com.example.simulation_of_bangladesh_bank;
    exports com.example.simulation_of_bangladesh_bank.Sara;
    opens com.example.simulation_of_bangladesh_bank.Sara to javafx.fxml;
=======
    opens com.example.simulation_of_bangladesh_bank.shifat to javafx.fxml;
    exports com.example.simulation_of_bangladesh_bank;
    exports com.example.simulation_of_bangladesh_bank.shifat;
>>>>>>> 38e97a1b5ac1e4b1f63fb0852c111d29fe17f190
}