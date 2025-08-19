import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//Employee Work details
public class EmployeeDetail {
    private final String id;
    private int age;
    private int experienceYears;
    private String departmentName;
    private String project;
}
