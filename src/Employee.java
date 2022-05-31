public class Employee extends Members {

    String dept;
    Members employee[];

    public Employee (String name, int idnum, String dept) {
        super(name, idnum,dept);
    }

    public void setStudents(Members sub[]) {
        employee = sub;
    }

    public void work() {
        System.out.println("\tEmployee: \"" + name +"(ID:"+ id +") \"  hard with his job in " + dept + " dept.");
    }
}
