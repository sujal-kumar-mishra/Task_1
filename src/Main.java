import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final HashMap<String, Employee> emp = new HashMap<>(); //for storing employee basic details
    static final HashMap<String, EmployeeDetail> empDet = new HashMap<>(); //for storing employee work details

    public static void main(String[] args) {
        WorkDetails wd = new WorkDetails(); // creating work details object
        BasicDetails bs = new BasicDetails(); //creating basic details object
        Scanner sc = new Scanner(System.in); //creating and using sc object

        while (true) {
            int mainChoice = Utils.showMainMenu(sc);
            switch (mainChoice) {
                case 1:
                    Utils.handleWorkDetails(sc, wd);
                    break;
                case 2:
                    Utils.handleBasicDetails(sc, bs);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong Choice!!");
            }
        }
    }
}