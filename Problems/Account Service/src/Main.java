import java.util.ArrayList;
import java.util.Arrays;

interface AccountService {
    /**
     * It finds an account by owner id
     *
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);

    /**
     * It count the number of account with balance > the given value
     *
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here

class AccountServiceImpl implements AccountService {

    private Account[] accounts;


    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    /**
     * It finds an account by owner id
     *
     * @param id owner unique identifier
     * @return account or null
     */
    @Override
    public Account findAccountByOwnerId(long id) {
        Account acc_id = null;

        for (Account i : accounts) {
            if (i.getOwner().getId() == id) {
                acc_id = i;
                break;
            }
        }


        return acc_id;


    }

    /**
     * It count the number of account with balance > the given value
     *
     * @param value
     * @return the number of accounts
     */
    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long num = 0L;
        for (Account s : accounts) {
            if (s.getBalance() > value) {
                num++;
            }
        }

        return num;
    }
}


class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

//class Main{
//    public static void main(String[] args) {
//        User sam = new User(2000010, "Sam", "Kate");
//        Account a = new Account(2000010, 4900030, sam);
//        User chloe = new User(2000011, "Chloe", "Johnson");
//        Account b = new Account(2000011, 5000200, chloe);
//        Account[] accounts = {a, b};
//
//
//        AccountService service = new AccountServiceImpl(accounts);
//        System.out.println(service.findAccountByOwnerId(2000010));
//        service.findAccountByOwnerId(2000011);
//    }
//}