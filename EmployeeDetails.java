package weeek2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) 
	{
		
			System.out.println("Employee Name:"+empName);
			System.out.println("Employee Id:"+empId);
			}
		public void getEmployeeAddress(String empAddress)
		{
		
			System.out.println("Employee Address:"+empAddress);
		}
		public void printEmployeeSalary(double empSalary)
		{
			
			System.out.println("Employee Salary:"+empSalary);
		}
		public void printEmployeeMobileNumber(long mobNum)
		{
			System.out.println("Employee MobNum:"+mobNum);
		}
		
public static void main(String[] args) 
		{
			EmployeeDetails emp=new EmployeeDetails();
		    emp.printEmployeeName("KISHORE",01);
		    emp.getEmployeeAddress("KRISHNAGIRI");
			emp.printEmployeeSalary(65000.12);
			emp.printEmployeeMobileNumber(9876543210L);

		
	}


}
