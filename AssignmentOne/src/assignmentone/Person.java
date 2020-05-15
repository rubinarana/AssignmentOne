package assignmentone;
/**
 *
 * @author rubir
 */
class PersonInheritance {
    private String name;
    private double baseSalary = 5000;
    private double bonusSalary;

    public PersonInheritance() {
    }

    public PersonInheritance(String name, double bonusSalary){
        this.name = name;
        this.bonusSalary = bonusSalary;
        System.out.println("Name: "+name);
        System.out.println("Total Salary: "+(baseSalary+this.bonusSalary));
    }
}

class Politician extends PersonInheritance{

    public Politician(String name,double bonusSalary) {
        super(name, bonusSalary);
    }

    public Politician() {
    }
}
class Sportsman extends PersonInheritance{

    public Sportsman(String name,double bonusSalary){
        super(name,bonusSalary);
    }

    public Sportsman() {
    }
}

class Person {
    public static void main(String[] args) {
        Politician politician = new Politician("ram",2000);
        Sportsman sportsman = new Sportsman("hari",1000);
    }
}
