package ch06_list_Map_set.map.mapPractice.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class AccountManagement {
    //  Account타입의 배열을 만들었다. ↓
    private Map<String, Account> accounts;  // 계좌 목록 배열  //맵으로 변경
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement(int maxSize) {
        accounts = new HashMap<>();  

        scanner = new Scanner(System.in);     //사용자 입력값
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후 처음부터 배열의 순서대로 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
        Account ac = new Account(accountNumber,balance);
        accounts.put(accountNumber,ac); //계좌 목록 맵 생성
        System.out.println("입력하신 계좌번호는: " + ac.getAccountNumber() + "입니다");

    }

    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // --------------------------------
      //출력할 때는 해시맵 -> 트리맵으로 변환한 다음에 값 목록 가져와서 출력
        for (Account ac : new TreeMap<>(accounts).values()){  //한번 정렬 해준 다음
            System.out.println("계좌번호 :"+ac.getAccountNumber() +" 잔액 :"+ac.getBalance());
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
        
        for (Account ac : accounts.values()) {
            if (ac.getAccountNumber().equals(accountNumber)) {     
                return ac;
            } else {
                System.out.println("해당 계좌는 없습니다.");
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

