public class SavingAccount extends Account {
    public SavingAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        this.amount += amount;
        System.out.println("На счет: " + accountName + " внесено " + amount + " у.е.");
        return true;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("С данного счета нельзся совершать покупки");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Осуществить перевод невозможно. Максимальная сумма перевода " + this.amount);
            return false;
        } else if (!account.add(amount)) {
            System.out.println("Перевод с: " + accountName + " на " + account + " не удался");
            return false;
        } else {
            this.amount -= amount;
            System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + " у.е.");
            return true;
        }
    }
}