package com.example.simulation_of_bangladesh_bank.Sara;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ForeignExchangeDealer_DashController
{
    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void managedailyexchangeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitching.sceneSwitch(actionEvent, "Sara/ForeignExchangeDealer.fxml", "Foreign Exchange Dealer");
    }
}