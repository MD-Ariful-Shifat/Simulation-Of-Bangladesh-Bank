module com.example.simulation_of_bangladesh_bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.simulation_of_bangladesh_bank to javafx.fxml;
<<<<<<< HEAD
<<<<<<< HEAD
    exports com.example.simulation_of_bangladesh_bank;
    exports com.example.simulation_of_bangladesh_bank.Sara;
    opens com.example.simulation_of_bangladesh_bank.Sara to javafx.fxml;
=======
    opens com.example.simulation_of_bangladesh_bank.shifat to javafx.fxml;
    exports com.example.simulation_of_bangladesh_bank;
    exports com.example.simulation_of_bangladesh_bank.shifat;
>>>>>>> 38e97a1b5ac1e4b1f63fb0852c111d29fe17f190
=======
    opens com.example.simulation_of_bangladesh_bank.shifat to javafx.fxml;
    opens com.example.simulation_of_bangladesh_bank.saida to javafx.fxml;
    opens com.example.simulation_of_bangladesh_bank.saida.controller to javafx.fxml;
    opens com.example.simulation_of_bangladesh_bank.saida.util to javafx.fxml;
    opens com.example.simulation_of_bangladesh_bank.saida.model to javafx.fxml;
    exports com.example.simulation_of_bangladesh_bank;
    exports com.example.simulation_of_bangladesh_bank.shifat;
    exports com.example.simulation_of_bangladesh_bank.saida;
    exports com.example.simulation_of_bangladesh_bank.saida.controller;
    exports com.example.simulation_of_bangladesh_bank.saida.util;
    exports com.example.simulation_of_bangladesh_bank.saida.model;
>>>>>>> ece2fd2004e093364285ef4351e5bb86ec19952b
}