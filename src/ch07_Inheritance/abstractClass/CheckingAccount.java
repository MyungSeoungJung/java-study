package ch07_Inheritance.abstractClass;


//지출을 위한 계좌
class CheckingAccount extends Account {
    CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void endOfMonth() {
        System.out.println("End of month statement. Balance: " + balance);
    }
}
