package clase2.enums;

public enum AccountType {

    SIGHT(10000), CURRENT(100000);

    final int maximumAmountBalance;

    AccountType(int maximumAmountBalance){
        this.maximumAmountBalance = maximumAmountBalance;
    }
}
