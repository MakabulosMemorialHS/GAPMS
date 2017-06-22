/* **************************************************************************
 * EmployeeTable.java
 *
 * This module contains the functions that manipulate the Employee
 * Tables of GAPMS.
 *
 * Robert Pascual (c) 2017
 *
 * **************************************************************************/
package ph.mmhsvictoria.apps.gapms;

import java.lang.*;
import java.util.*;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeTable {
    
    // Initialize the empTable TableView<EmployeeInfo>.
    // The parameter passed must be properly allocated elsewhere.

    private static GridPane empTabGridPane;

    public static void initializeEmployeeTable(TableView<EmployeeInfo> empTable) {

        // Define the columns of the TableView
        TableColumn lnameCol = new TableColumn("Family Name");
        lnameCol.setMinWidth(200);
        lnameCol.setCellValueFactory(
            new PropertyValueFactory<EmployeeInfo,String>("lastName")
        );
        empTable.getColumns().add(lnameCol);

        TableColumn fnameCol = new TableColumn("First Name");
        fnameCol.setMinWidth(200);
        fnameCol.setCellValueFactory(
            new PropertyValueFactory<EmployeeInfo,String>("firstName")
        );
        empTable.getColumns().add(fnameCol);


        TableColumn mnameCol = new TableColumn("Middle Name");
        mnameCol.setMinWidth(200);
        mnameCol.setCellValueFactory(
            new PropertyValueFactory<EmployeeInfo,String>("middleName")
        );

        empTable.getColumns().add(mnameCol);
    }

    public static void populateEmployeeTable(TableView<EmployeeInfo> empTable) {

        // Create the test data to be displayed.
        final ObservableList<EmployeeInfo> data = FXCollections.observableArrayList(
            new EmployeeInfo("Pascual", "Maureen", "Wroblewitz"),
            new EmployeeInfo("Wurtzbach", "Pia", "Alonzo"),
            new EmployeeInfo("Domingo", "Kim", "Valdez")
            );

        empTable.setItems(data);
    }

    public static void initializeTab(Tab eeTab) {
        empTabGridPane = new GridPane();
        eeTab.setContent(empTabGridPane);
        Button addBtn = new Button("Add the following employee");
        Button clearFieldBtn = new Button("Clear fields");
        empTabGridPane.add(addBtn, 0, 0);
        empTabGridPane.add(clearFieldBtn, 1, 0);

        Text txt1 = new Text("Last Name");
        Text txt2 = new Text("First Name");
        Text txt3 = new Text("Middle Name");
        empTabGridPane.add(txt1, 0, 1);
        empTabGridPane.add(txt2, 1, 1);
        empTabGridPane.add(txt3, 2, 1);

        TextField lastNameFld = new TextField();
        TextField firstNameFld = new TextField();
        TextField middleNameFld = new TextField();
        empTabGridPane.add(lastNameFld, 0, 2);
        empTabGridPane.add(firstNameFld, 1, 2);
        empTabGridPane.add(middleNameFld, 2, 2);

       
    }
}

