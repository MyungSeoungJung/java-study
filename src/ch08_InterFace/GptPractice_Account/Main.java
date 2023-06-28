package ch08_InterFace.GptPractice_Account;

public class Main {
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement();
        accountManagement.run();
        Account ac = new Account("6535",10000);

    }
}