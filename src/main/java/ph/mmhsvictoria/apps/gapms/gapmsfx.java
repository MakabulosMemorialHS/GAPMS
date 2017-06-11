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

        Tab ertab = new Tab("Employer Info");
        GridPane employerPane = new GridPane();
        ertab.setContent(employerPane);

        Text ert1 = new Text("Employer Name");
        employerPane.add(ert1, 0,0);
        TextField ertf1 = new TextField();
        employerPane.add(ertf1, 1,0);

 
        Text ert2 = new Text("Employer Address");
        employerPane.add(ert2, 0,1);
        TextField ertf2 = new TextField();
        employerPane.add(ertf2, 1,1);


        Tab ssstab = new Tab("SSS Reports");
        GridPane sssPane = new GridPane();
        ssstab.setContent(sssPane);

        Text ssst1 = new Text("Employer SSS Number");
        sssPane.add(ssst1, 0,0);
        TextField ssstf1 = new TextField();
        sssPane.add(ssstf1, 1,0);

        Text spcr1 = new Text();   // Just a spacer.
        sssPane.add(spcr1, 0,1);

        Text sbrt1 = new Text("SBR Number");
        sssPane.add(sbrt1, 0,2);
        TextField sbrtf1 = new TextField();
        sssPane.add(sbrtf1, 1,2);

        Text sbrt2 = new Text("SBR Amount");
        sssPane.add(sbrt2, 0,3);
        TextField sbrtf2 = new TextField();
        sssPane.add(sbrtf2, 1,3);

        Text sbrt3 = new Text("SBR Date");
        sssPane.add(sbrt3, 0,4);
        TextField sbrtf3 = new TextField();
        sssPane.add(sbrtf3, 1,4);

        Text sbrt4 = new Text("Applicable Month");
        sssPane.add(sbrt4, 0,5);
        TextField sbrtf4 = new TextField();
        sssPane.add(sbrtf4, 1,5);

        Button r3Button = new Button("Create R3");
        Button tlButton = new Button("Create Transmittal");
        sssPane.add(r3Button, 1,6);
        sssPane.add(tlButton, 2,6);


        Tab hdmftab = new Tab("HDMF Reports");
        GridPane hdmfPane = new GridPane();
        hdmftab.setContent(hdmfPane);

        Text hdmft1 = new Text("HDMF Number");
        hdmfPane.add(hdmft1, 0,0);
        TextField hdmftf1 = new TextField();
        hdmfPane.add(hdmftf1, 1,0);


        Tab eetab = new Tab("Employee Table");

        tabpane.getTabs().add(ertab);
        tabpane.getTabs().add(ssstab);
        tabpane.getTabs().add(hdmftab);
        tabpane.getTabs().add(eetab);
	topPanel.getChildren().add(tabpane);


       // Create and populate the Bottom of the BorderPane Scene.

        VBox bottomPanel = new VBox();
        bpane.setBottom(bottomPanel);

        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e->Platform.exit());
        bottomPanel.getChildren().add(quitButton);



        // Create the TableView widget which will be placed in the Center.
        TableView empTable = new TableView();
        ScrollPane empScroll = new ScrollPane(empTable);
        empScroll.setFitToWidth(true);
        bpane.setCenter(empScroll);

        TableColumn lname = new TableColumn("Family Name");
        TableColumn fname = new TableColumn("First Name");
        TableColumn mname = new TableColumn("Middle Name");

        empTable.getColumns().addAll(lname, fname, mname);


	// Prepare and show the primaryStage

	primaryStage.setScene(scene);
	primaryStage.setTitle("GAPMS");
	primaryStage.show();
    }
}
 
