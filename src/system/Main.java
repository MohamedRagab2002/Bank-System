package system;

public class Main {
    public static void main(String[] args){
        Atm atmBank = new Atm();
        atmBank.setCardInformation();
        atmBank.getCardInformation();
        atmBank.depositMoney();
        atmBank.withdrawMoney();
    }
}
