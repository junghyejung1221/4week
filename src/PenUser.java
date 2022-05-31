import PenP.Pen4;

public class PenUser {
    public static void main(String [] args){

        System.out.println("Hello Pen! ");

        Pen4 mypen =new Pen4("SMU","Green",1000);

        mypen.erase();
        System.out.println("---------------------------------------------------");
        mypen.write();
        System.out.println("---------------------------------------------------");
        mypen.write(2000);
        System.out.println("---------------------------------------------------");
        mypen.write(3000,"Dept. IT Engineering");



    }
}
