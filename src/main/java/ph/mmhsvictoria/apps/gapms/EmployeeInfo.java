/* *****************************************************
 * EmployeeInfo.java
 *
 * Class EmployeeInfo is the class that will be
 * displayed by the TableView.
 *
 *
 * *************************************************** */

////////////////////////////////////////////////////////////////////////////
//
// A. The format of the input fields for this version of Create_CRF()
//    should be the following:
//     0. ID Number
//     1. Last Name
//     2. First Name
//     3. Middle Name
//     4. SSS Number
//     5. PHilhealth Number
//     6. HDMF Number
//     7. Gross Monthly Salary
//     8. SSS Employee Contribution Amount
//     9. SSS Employer Contribution Amount
//    10. EC Contribution (ER Only)
//    11. PhilHealth EE Contribution
//    12. PhilHealth ER Contribution
//    13. HDMF EE Contribution
//    14. HDMF ER Contribution
//
////////////////////////////////////////////////////////////////////////////

package ph.mmhsvictoria.apps.gapms;


public class EmployeeInfo {
    private String idNum;
    private String lastName;
    private String firstName;
    private String middleName;
    private String sssNumber;
    private String philHealthNumber;
    private String hdmfNumber;
    private double salary;
    private double sssEeAmount;
    private double sssErAmount;
    private double ecContribution;
    private double philHealthEeAmount;
    private double philHealthErAmount;
    private double hdmfEeAmount;
    private double hdmfErAmount;

    public EmployeeInfo() {
	this.idNum = "";
	this.lastName = "";         
	this.firstName = "";
	this.middleName = "";
	this.sssNumber = "";    
	this.philHealthNumber = "";
	this.hdmfNumber = "";
	this.salary = 0.00;
	this.sssEeAmount = 0.00;
	this.sssErAmount = 0.00;
	this.ecContribution = 10.00;
	this.philHealthEeAmount = 0.00;
	this.philHealthErAmount = 0.00;
	this.hdmfEeAmount = 100.00;
	this.hdmfErAmount = 100.00;
   }

    public EmployeeInfo(String lastName, String firstName, String middleName) {
	this.idNum = "";
	this.lastName = lastName;         
	this.firstName = firstName;
	this.middleName = middleName;
	this.sssNumber = "";    
	this.philHealthNumber = "";
	this.hdmfNumber = "";
	this.salary = 0.00;
	this.sssEeAmount = 0.00;
	this.sssErAmount = 0.00;
	this.ecContribution = 10.00;
	this.philHealthEeAmount = 0.00;
	this.philHealthErAmount = 0.00;
	this.hdmfEeAmount = 100.00;
	this.hdmfErAmount = 100.00;
   }

   /* *******************************************************************
    * Here we implement the Getter methods.
    * *******************************************************************/


    public String getIdNum() {
	return idNum;
    }


    public String getLastName() {
	return lastName;
    }


    public String getFirstName() {
	return firstName;
    }


    public String getMiddleName() {
	return middleName;
    }


    public String getSssNumber() {
	return sssNumber;
    }


    public String getPhilHealthNumber() {
	return philHealthNumber;
    }


    public String getHdmfNumber() {
	return hdmfNumber;
    }


    public double getSalary() {
	return salary;
    }


    public double getSssEeAmount() {
	return sssEeAmount;
    }


    public double getSssErAmount() {
	return sssErAmount;
    }


    public double getEcContribution() {
	return ecContribution;
    }


    public double getPhilHealthEeAmount() {
	return philHealthEeAmount;
    }


    public double getPhilHealthErAmount() {
	return philHealthErAmount;
    }


    public double getHdmfEeAmount() {
	return hdmfEeAmount;
    }


    public double getHdmfErAmount() {
	return hdmfErAmount;
    }




   /* *******************************************************************
    * Here we implement the Setter methods.
    * *******************************************************************/


    public void  setIdNum(String aparam) {
	this.idNum = aparam;
    }


    public void  setLastName(String aparam) {
	this.lastName = aparam;         
    }


    public void  setFirstName(String aparam) {
	this.firstName = aparam;
    }


    public void  setMiddleName(String aparam) {
	this.middleName = aparam;
    }


    public void  setSssNumber(String aparam) {
	this.sssNumber = aparam;    
    }


    public void  setPhilHealthNumber(String aparam) {
	this.philHealthNumber = aparam;
    }


    public void  setHdmfNumber(String aparam) {
	this.hdmfNumber = aparam;
    }


    public void  setSalary(double aparam) {
	this.salary = aparam;
    }


    public void  setSssEeAmount(double aparam) {
	this.sssEeAmount = aparam;
    }


    public void  setSssErAmount(double aparam) {
	this.sssErAmount = aparam;
    }


    public void  setEcContribution(double aparam) {
	this.ecContribution = aparam;
    }


    public void  setPhilHealthEeAmount(double aparam) {
	this.philHealthEeAmount = aparam;
    }


    public void  setPhilHealthErAmount(double aparam) {
	this.philHealthErAmount = aparam;
    }


    public void  setHdmfEeAmount(double aparam) {
	this.hdmfEeAmount = aparam;
    }


    public void  setHdmfErAmount(double aparam) {
	this.hdmfErAmount = aparam;
    }
}





