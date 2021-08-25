public class CreditAccount extends Account {
    public CreditAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        if (this.amount + amount > 0) {
            System.out.println("Нельзя пополнить на эту сумму");
            return false;
        } else {
            this.amount += amount;
            System.out.println("На счет: " + accountName + " внесено " + amount + " у.е.");
            return true;
        }
    }

    @Override
    public boolean pay(int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения оплаты");
            return false;
        }
        this.amount -= amount;
        System.out.println("Оплата с: " + accountName + " на " + amount + " у.е.");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения перевода");
            return false;
        }
        if (!account.add(amount)) {
            System.out.println("Перевод с: " + accountName + " на " + account + " не удался");
            return false;
        }
        this.amount -= amount;
        System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + " у.е.");
        return true;
    }
}