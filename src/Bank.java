public class Bank {
    public static void main(String [] args){
        Account Jung = new Account("정혜정");
        Jung.deposit(20);

        try {
            Jung.withdraw(15);
        }catch (BalanceOutOfBoundsException be){
            be.printStackTrace();
        }catch (MalformedData me){
            me.printStackTrace();
        }
        Jung.check();

        try{
            Jung.withdraw(10);
        }catch (BalanceOutOfBoundsException be){
            be.printStackTrace();
        }

        System.out.println("normal termination");
    }
}
