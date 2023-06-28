package ch06_list_Map_set.set.account;

import java.util.*;

class AccountManagement {
    //  Account타입의 배열을 만들었다. ↓
    private Set<Account> accountList;  // 계좌 목록 배열
    private int numAccounts;        // 계좌의 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
        accountList = new HashSet<>();
        scanner = new Scanner(System.in);     //사용자 입력값
    }

    public void addAccount(String accountNumber, double balance) {         //매게 변수 = 어떤 입력 값이 들어올지 지정해주는 것
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후 처음부터 배열의 순서대로 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
        Account ac = new Account(accountNumber,balance);  //생성자 호출
        accountList.add(ac);
        System.out.println("입력하신 계좌번호는: " + ac.getAccountNumber() + "입니다");
        numAccounts++;
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
        for (Account ac :accountList){  //account 타입의 ac(변수)
            if(ac != null) {     //null인 값을 막아야 함    =  배열의 빈 공간에는 null값이 들어가있기때문에
                System.out.println("계좌번호 :" + ac.getAccountNumber() + " 잔액 :" + ac.getBalance());          //getAccountNumber = Account의 메서드 부를려면 ac 통해서?
            } else if (ac == null) {             //Account타입의 기능
                System.out.println("-----마지막 계좌입니다-----");
                break;
            }
        }
    }
   //  String accountNumber(매개변수) = findAccount를 돌리기위한 매개변수
    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 추가한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber);   //findAccount메서드 리턴을 받기위해 변수(빈 상자)가 필요함 = Account클래스의 변수가 필요 why? findAccount에서 리턴 값으로 Account타입 선언
        if(account != null) {                // if문으로 null값이 아니라면 실행 = null값이 리턴되면 발생되는 오류를 방어하기 위해서.
            account.deposit(amount);
        }

    }

    public void withdraw(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        Account account = findAccount(accountNumber); //계좌번호를 찾고 참이면 문장을 실행하라는 if가 필요없나? = findAccount의 if문에서 .equals가 아니라면 break이니까 필요없다고 생각듬  == 잘못된 내 생각 (break필요없음)
        if (account != null){                         //   ↑ if문 필요함 =  if문으로 findAccount에서 null값이 account에 리턴되면 실행안되게 if문으로 오류방어       == 강사님 풀이
            account.withdraw(amount);                         
        }
    }

    //Account타입으로 return할거야
    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
        // 1번째 방법
        for (Account ac : accountList) {
            //.getAccountNumber()쓰는 이유 접근하려는 accountNumber가 private로 막혀있어서 우회하려고
            if (ac.getAccountNumber().equals(accountNumber)) {      //A.equals.b   A랑 B 비교
                return ac;
            } else {
                System.out.println("해당 계좌는 없습니다.");
            }
            return null;
        }
        return null;
        //2번째 방법
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

