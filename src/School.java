public class School {
    Teacher YYI;
    Student Jung, Kim, Lee;
    Employee choi;
    Members members[];

    public School(){
        YYI = new Teacher("Yoon",10313,"IT Engineering");
        Jung = new Student("Jung hea jung",1810835,"IT Engineering");
        Kim = new Student("Kim song e",1910835,"IT Engineering");
        Lee = new Student("Lee song e",2010835,"IT Engineering");
        choi = new Employee("Choi ",10101,"Server");

        members = new Members[5];
        members[0] = YYI;
        members[1] = Jung;
        members[2] = Kim;
        members[3] = Lee;
        members[4] = choi;
    }

    public void makeWork(){
        int n = members.length;
        for (int i = 0 ; i<n;i++){
            members[i].work();
        }
    }

    public static void main(String [] args){
        School myjava = new School();
        myjava.makeWork();
    }
}
