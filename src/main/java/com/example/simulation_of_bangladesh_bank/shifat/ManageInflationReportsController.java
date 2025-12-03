package com.example.simulation_of_bangladesh_bank.shifat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ManageInflationReportsController
{
    @javafx.fxml.FXML
    private TableView<ManageInflationReports> tableID;
    @javafx.fxml.FXML
    private TableColumn<ManageInflationReports, String> yearColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageInflationReports, String> inflationColumn;
    @javafx.fxml.FXML
    private TextField inflationID1;
    @javafx.fxml.FXML
    private TextField inflationID2;
    @javafx.fxml.FXML
    private TableColumn<ManageInflationReports, String> reportColumn;
    @javafx.fxml.FXML
    private DatePicker yearID2;
    @javafx.fxml.FXML
    private DatePicker yearID1;
    @javafx.fxml.FXML
    private TextField reportID1;
    @javafx.fxml.FXML
    private TextField reportID2;
    @javafx.fxml.FXML
    private ComboBox<String> statusID;
    @javafx.fxml.FXML
    private TextField reportID3;
    @javafx.fxml.FXML
    private TableColumn<ManageInflationReports, String> statusColumn;
    @javafx.fxml.FXML
    private TextArea commentID;
    @javafx.fxml.FXML
    private TableColumn<ManageInflationReports, String> commentColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addOnClick(ActionEvent actionEvent) {
    }

    @Deprecated
    public void signOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOnClicnk(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOutt(ActionEvent actionEvent) {
    }
}