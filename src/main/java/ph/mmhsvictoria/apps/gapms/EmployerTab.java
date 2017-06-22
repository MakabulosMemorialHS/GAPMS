/* ************************************************************
 * EmployerTab.java
 *
 * Routines and Functions for the Employer Tab
 *
 * Robert Pascual (c) 2017
 *
 * ***********************************************************/
package ph.mmhsvictoria.apps.gapms;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class EmployerTab {
    public static void initializeTab(Tab ertab) {
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
    }
}

