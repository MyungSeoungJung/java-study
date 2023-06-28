package ch07_Inheritance.abstractClass;


//저축성 계좌
class SavingsAccount extends Account {
    double interestRate; //이율

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    void endOfMonth() {
        //이자 계산해서 밸런스에 넣어줌
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
}
