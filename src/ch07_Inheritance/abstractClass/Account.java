package ch07_Inheritance.abstractClass;

abstract class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    //추상 메소드
    //메소드 구현 내용이 없습니다
    //상속받는 클래스에서 개별로 구현해라..
    abstract void endOfMonth(); // 추상 메소드: 매월 말에 실행되는 작업

    //추상화 = 부모 클래스에서 선언부만 구현해놓고 자식 클래스에서 세부적으로 구현
}
