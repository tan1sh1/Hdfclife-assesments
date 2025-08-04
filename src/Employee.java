public class Employee {


        String employeeName;
        String employeeDesignation;
        double employeeSalary;
        String employeeDOB;
        String employeeaddress;
        private int employeeage;

        public void displayEmployeeDetails(){
            System.out.println("employee name "+employeeName);
            System.out.println("employee designation "+employeeDesignation);
            System.out.println("employee salary "+employeeSalary);
            System.out.println("employee DOB "+employeeDOB);
            System.out.println("employee add "+employeeaddress);
            System.out.println("employee age "+employeeage);

    }

    public void setAge(int employeeage){
            if(employeeage>100){

            }else{
                this.employeeage=employeeage;
            }
    }
}
