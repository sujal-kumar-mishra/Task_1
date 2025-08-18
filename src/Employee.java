import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private final String id;
    private String name;
    private ROLE role;
    private String reportingTo;
}
