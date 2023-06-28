package ch08_InterFace.GptPractice_Account;


// 계좌 클래스
public class Account implements Bankable{
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액
    double calculateTax = 0.1;

    public Account(String accountNumber, double balance) {            // 생성자 만들어서 String accountNumber, double balance 이렇게 받을거야
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

@Override
    public void deposit(double amount) {
        // **코드 작성
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가
        this.balance += amount;
        System.out.println(amount + "원이 입금 되었습니다.");
    }
@Override
    public void withdraw(double amount) {
        // **코드 작성
        // 출금 금액 만큼 해당 계좌객체에 잔고(balance) 차감
        // 단, 출금 금액보다 잔액이 적으면 오류 메시지를 출력하면 차감하지 않음
        if (balance >= amount){
            balance -= amount;
        }else {
            System.out.println("잔액이 부족합니다");
        }
    }



    public void calculateTax() { //잔액의 10%를 세금으로 계산
        double calculateTax = 0.1;
        double Tax = balance * calculateTax;
        double Total = balance - Tax;
        System.out.println("현재 잔액에서의 10%인 세금은" + Total + "입니다");
    }


    public void calcul(double loan) {
        //loan 호출 받는 대출금액
        double loanpersent = 0.05; // 이자율 0.05퍼센트
        double loanAmount = loan * loanpersent;
        System.out.println(loan + "의 이자율은 "  + loanAmount + "입니다");



    }
}