package structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{

    private String employeeName;

    ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess(){
        if (getRole(employeeName).equalsIgnoreCase("Manager")){
            RealInternetAccess realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        }
        else if (getRole(employeeName).equalsIgnoreCase("normal_employee")){
            RealInternetAccess realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        }else{
            System.out.println("No Internet access granted.");
        }
    }

    private String getRole(String empName) {
        //Check Database for getting different Roles
        return "normal_employee";
    }
}  
