/* ****************************************************************
 * SSSReports.java
 *
 * Functions and routines to handle the SSS Reports Tab
 *
 * Robert Pascua (c) 2017
 *
 * *****************************************************************/
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

public class SSSReports {
    private static GridPane sssPane;
    private static TextField employerSSSNumber;
    private static TextField SBRNumField;
    private static TextField SBRAmountField;
    private static TextField SBRDateField;
    private static TextField applicableMonthField;


    public static void initializeSSSTab(Tab ssstab) {
        GridPane sssPane = new GridPane();
        ssstab.setContent(sssPane);

        Text ssst1 = new Text("Employer SSS Number");
        sssPane.add(ssst1, 0,0);
        employerSSSNumber = new TextField();
        sssPane.add(employerSSSNumber, 1,0);

        Text spcr1 = new Text();   // Just a spacer.
        sssPane.add(spcr1, 0,1);

        Text sbrt1 = new Text("SBR Number");
        sssPane.add(sbrt1, 0,2);
        SBRNumField= new TextField();
        sssPane.add(SBRNumField, 1,2);

        Text sbrt2 = new Text("SBR Amount");
        sssPane.add(sbrt2, 0,3);
        SBRAmountField = new TextField();
        sssPane.add(SBRAmountField, 1,3);

        Text sbrt3 = new Text("SBR Date");
        sssPane.add(sbrt3, 0,4);
        SBRDateField = new TextField();
        sssPane.add(SBRDateField, 1,4);

        Text sbrt4 = new Text("Applicable Month");
        sssPane.add(sbrt4, 0,5);
        applicableMonthField = new TextField();
        sssPane.add(applicableMonthField, 1,5);

        Button r3Button = new Button("Create R3");
        Button tlButton = new Button("Create Transmittal");
        sssPane.add(r3Button, 0,6);
        sssPane.add(tlButton, 1,6);
    }

}
