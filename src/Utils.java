import java.util.Scanner;

public class Utils {
    public static int showMainMenu(Scanner sc) {
        System.out.println("\nHi, Let's begin!");
        System.out.println("1. Work Details");
        System.out.println("2. Basic Details");
        System.out.println("3. Exit");
        System.out.print("Enter Your Choice: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void handleWorkDetails(Scanner sc, WorkDetails wd) {
        while (true) {
            System.out.println("\nWork Details:");
            System.out.println("1. Create Employee Work Details");
            System.out.println("2. See Employee Details");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Delete Employee Details");
            System.out.println("5. Go Back");
            System.out.print("Enter Your Choice: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
            }
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Experience Years: ");
                    int exp = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Department Name: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Project: ");
                    String project = sc.nextLine();
                    wd.create(new EmployeeDetail(id, age, exp, dept, project));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to read: ");
                    String empIdToRead = sc.nextLine();
                    wd.read(empIdToRead);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    id = sc.nextLine();
                    System.out.print("Enter new Age: ");
                    age = sc.nextInt();
                    System.out.print("Enter new Experience Years: ");
                    exp = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter new Department Name: ");
                    dept = sc.nextLine();
                    System.out.print("Enter new Project: ");
                    project = sc.nextLine();
                    wd.update(id, age, dept, exp, project);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    wd.delete(sc.nextLine());
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong choice !!");
            }
        }
    }

    public static void handleBasicDetails(Scanner sc, BasicDetails bs) {
        while (true) {
            System.out.println("\nBasic Details:");
            System.out.println("1. Create Employee Basic Details");
            System.out.println("2. See Employee Details");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Delete Employee Details");
            System.out.println("5. Go Back");
            System.out.print("Enter Your Choice: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
            }
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Role (CUSTOMER/ADMIN/EMPLOYEE): ");
                    String roleStr = sc.nextLine().toUpperCase();
                    ROLE role = ROLE.valueOf(roleStr);
                    System.out.print("Enter Reporting To: ");
                    String reportingTo = sc.nextLine();
                    bs.create(new Employee(id, name, role, reportingTo));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to read: ");
                    String empIdBasicRead = sc.nextLine();
                    bs.read(empIdBasicRead);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    id = sc.nextLine();
                    System.out.print("Enter new Name (leave empty to keep unchanged): ");
                    name = sc.nextLine();
                    System.out.print("Enter new Role (CUSTOMER/ADMIN/EMPLOYEE): ");
                    roleStr = sc.nextLine().toUpperCase();
                    role = ROLE.valueOf(roleStr);
                    System.out.print("Enter new Reporting To (leave empty to keep unchanged): ");
                    reportingTo = sc.nextLine();
                    bs.update(id, name, role, reportingTo);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    bs.delete(sc.nextLine());
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong choice !!");
            }
        }
    }
}
