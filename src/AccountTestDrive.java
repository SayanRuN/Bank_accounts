public class AccountTestDrive {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Расчетный счет", 800);
        CreditAccount creditAccount = new CreditAccount("Кредитный счет", -350);
        SavingAccount savingAccount = new SavingAccount("Сберегатательный счет", 100);
        creditAccount.add(50);
        savingAccount.transfer(checkingAccount, 800);
        creditAccount.pay(650);
        checkingAccount.pay(500);
        checkingAccount.transfer(savingAccount, 1000);
    }
}