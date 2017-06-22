/* ******************************************************************************
 * gapmsfx.java
 *
 * Government Accounts Payable Management System.
 *
 * Just what the name says.
 *
 * Written by: Robert Pascual/rtonypascual@gmail.com
 *
 * *****************************************************************************/
package ph.mmhsvictoria.apps.gapms;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class gapmsfx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static String employerName;
    public static String employerAddress;


    @Override public void start(Stage primaryStage) {

	// Create BorderPane and set as the root Scene.

	BorderPane bpane = new BorderPane();
	Scene scene = new Scene(bpane);


	// Place desired elements on the Top of BorderPane.

	VBox topPanel = new VBox();
	bpane.setTop(topPanel);

	Text programName = new Text("Government Accounts Payable Management System (WIP)");
	topPanel.getChildren().add(programName);

        TabPane tabpane = new TabPane();

        // Create the Employer Tab
        Tab ertab = new Tab("Employer Info");
        tabpane.getTabs().add(ertab);
        EmployerTab.initializeTab(ertab);


        // Create the Employee Tab
        Tab eetab = new Tab("Employee Table");
        tabpane.getTabs().add(eetab);

        // Create a TableView widget and place in Center of the BorderPane.
        TableView<EmployeeInfo> empTable = new TableView<EmployeeInfo>();
        ScrollPane empScroll = new ScrollPane(empTable);
        empScroll.setFitToWidth(true);
        bpane.setCenter(empScroll);

        EmployeeTable.initializeTab(eetab);
        EmployeeTable.initializeEmployeeTable(empTable);
        EmployeeTable.populateEmployeeTable(empTable);
 


        // Create and Populate the SSS Reports Tab
        Tab ssstab = new Tab("SSS Reports");
        SSSReports.initializeSSSTab(ssstab);
        tabpane.getTabs().add(ssstab);


        // Create and populate the HDMF Tab
        Tab hdmftab = new Tab("HDMF Reports");
        GridPane hdmfPane = new GridPane();
        hdmftab.setContent(hdmfPane);

        Text hdmft1 = new Text("HDMF Number");
        hdmfPane.add(hdmft1, 0,0);
        TextField hdmftf1 = new TextField();
        hdmfPane.add(hdmftf1, 1,0);



        tabpane.getTabs().add(hdmftab);

	topPanel.getChildren().add(tabpane);


       // Create and populate the Bottom of the BorderPane Scene.

        VBox bottomPanel = new VBox();
        bpane.setBottom(bottomPanel);

        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e->Platform.exit());
        bottomPanel.getChildren().add(quitButton);




	// Prepare and show the primaryStage

	primaryStage.setScene(scene);
	primaryStage.setTitle("GAPMS");
	primaryStage.show();
    }
}
 
