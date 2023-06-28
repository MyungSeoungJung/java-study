package ch06_list_Map_set.list.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class AccountManagement {



    //ArrayList로 변경
    private List<Account> accountList;  // 계좌 목록 배열
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
        accountList = new ArrayList<>();
        scanner = new Scanner(System.in);     //사용자 입력값
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후 처음부터 배열의 순서대로 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.

       // accountList.add(new Account(accountNumber,balance));   //그냥 accountlist를 했을때 Arraylist에 데이터가 들어가지 않았음 => new연산자로 해결 => 안해도되는디?
        Account ac = new Account(accountNumber,balance);
        accountList.add(ac);  //뒤에 추가

    }

    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------

        for (Account ac : accountList) {
            System.out.println("계좌번호: "+ ac.getAccountNumber() + "잔액: " + ac.getBalance());
            //addAccount에서 입력 한 값을 출력 for문 accountlist.get[i]로 출력하면  터미널에서 awfe@123f3f@a라는 오류 출력문구가 뜸 =>getter로 해결

        }


    }


    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 추가한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber);
        if(account != null) {
            account.deposit(amount);
        }

    }

    public void withdraw(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber);
        if (account != null){
            account.withdraw(amount);
        }
    }

    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
        /* 1번째 방법
        for (Account ac : accountList) {
        //.getAccountNumber()쓰는 이유 접근하려는 accountNumber가 private로 막혀있어서 우회하려고
            if (ac.getAccountNumber().equals(accountNumber)){      //A.equals.b   A랑 B 비교
                return ac;
            }else {
                System.out.println("해당 계좌는 없습니다.");
            }
            break; == break는 필요없음(break빼고 나머지는 다 맞음)
            return null;
        }
       return null;
         */ //2번째 방법
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
                return accountList.get(i);
            }
        }
        return null;
    }

    public void run() {
        while (true) {

            //기능 목록 출력
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            //번호 받기
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("잔액: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    addAccount(accountNumber, balance);
                    break;
                case 2:
                    showAccountList();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    withdraw(accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

