//for handing CRUD operation for basic details
public class BasicDetails implements Operations{
    //for creating employee work details
    public void create(Employee e) {
        if (!Main.emp.containsKey(e.getId())) {
            Main.emp.put(e.getId(), e);
            System.out.println("Details added Successfully!");
        } else System.out.println("Details of employee having ID " + e.getId() + " is already present.");
    }

    //for Retrieving the employee data using Employee ID
    public void read(String id) {
        if (Main.emp.containsKey(id)) {
            Employee e = Main.emp.get(id);
            System.out.println("Basic Details of Employee with ID " + id);
            System.out.println("ID : " + e.getId());
            System.out.println("Name : " + e.getName());
            System.out.println("Role : " + e.getRole());
            System.out.println("Reporting to : " + e.getReportingTo());
        } else System.out.println("Details of employee does not exist in database!");
    }

    //Updating Employee basic details using ID
    public void update(String id, String name, ROLE role, String reportingTo) {
        if (Main.emp.containsKey(id)) {
            Employee e = Main.emp.get(id);
            if (!name.isEmpty()) e.setName(name);
            if (!reportingTo.isEmpty()) e.setReportingTo(reportingTo);
            e.setRole(role);
            Main.emp.replace(id, Main.emp.get(id), e);
            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee Details does not exist in database!");
        }
    }
    //Deleting Employee Basic details and Work Details also along with it
    public void delete(String id) {
        if (Main.emp.containsKey(id)) {
            Main.emp.remove(id);
            System.out.println("Employee Basic Details are removed!");
            if (Main.empDet.containsKey(id)) {
                Main.empDet.remove(id);
                System.out.println("Employee Work Details are removed!");
            }
        } else {
            System.out.println("Employee Details does not exist in database!");
        }
    }
}
