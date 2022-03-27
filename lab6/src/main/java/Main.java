/**
 *
 * @author Griffin
 */
        
public class Main {
    public static void main(String[] args) {
        Employee empOne = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee empTwo = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee empThree = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.println(empOne.getName() + " " + empOne.getID() + " " + empOne.getDept() + " " + empOne.getPos());
        System.out.println(empTwo.getName() + " " + empTwo.getID() + " " + empTwo.getDept() + " " + empTwo.getPos());
        System.out.println(empThree.getName() + " " + empThree.getID() + " " + empThree.getDept() + " " + empThree.getPos());
        
    }
    
}



