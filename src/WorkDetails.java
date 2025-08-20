//for handing CRUD operation for work details
public class WorkDetails implements Operations{
    //for creating employee work details
    public void create(EmployeeDetail e) {
        if (!Main.empDet.containsKey(e.getId())) {
            Main.empDet.put(e.getId(), e);
            System.out.println("Details added Successfully!");
        } else System.out.println("Details of employee having ID " + e.getId() + " is already present.");
    }

    //for Retrieving the employee data using Employee ID
    public void read(String id) {
        if (Main.empDet.containsKey(id)) {
            EmployeeDetail e = Main.empDet.get(id);
            System.out.println("Work Details of Employee with ID " + id);
            System.out.println("ID : " + e.getId());
            System.out.println("Age : " + e.getAge());
            System.out.println("Experience : " + e.getExperienceYears());
            System.out.println("Department name : " + e.getDepartmentName());
            System.out.println("Project : " + e.getProject());
        } else System.out.println("Details of employee does not exist in database!");
    }

    //Updating Employee work details
    public void update(String id, int age, String departmentName, int experienceYears, String project) {
        if (Main.empDet.containsKey(id)) {
            EmployeeDetail e = Main.empDet.get(id);
            if (!departmentName.isEmpty()) e.setDepartmentName(departmentName);
            if (!project.isEmpty()) e.setProject(project);
            e.setAge(age);
            e.setExperienceYears(experienceYears);
            Main.empDet.replace(id, Main.empDet.get(id), e);
            System.out.println("Employee work details updated successfully.");
        } else {
            System.out.println("Employee Details does not exist in database!");
        }
    }

    //Deleting Employee Work Details
    public void delete(String id) {
        if (Main.empDet.containsKey(id)) {
            Main.empDet.remove(id);
            System.out.println("Employee Work Details are removed!");
        } else {
            System.out.println("Employee Details does not exist in database!");
        }
    }
}
