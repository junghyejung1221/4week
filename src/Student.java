class Student extends Members {

    String dept;
    Members students[];

    public Student(String name, int idnum, String dept) {
        super(name, idnum,dept);
    }

    public void setStudents(Members sub[]) {
        students = sub;
    }

    public void work() {
        System.out.println("\tStudent: \"" + name +"(ID:"+ id +") \" studies hard with his students in " + dept + " dept.");
    }
}
