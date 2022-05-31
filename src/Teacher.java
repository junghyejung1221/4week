public class Teacher extends Members {

    String dept;
    Members teacher[];

    public Teacher(String name, int idnum, String dept) {
        super(name, idnum,dept);
    }

    public void setStudents(Members sub[]) {
        teacher = sub;
    }

    public void work() {
        System.out.println("\tTeacher: \"" + name +"(ID:"+ id +") \" teaches with his students in " + dept + " dept.");
    }
}