package profile;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AccountCollection {
    private List<Account> accountsList;

    public AccountCollection() {
        this.accountsList = new LinkedList<>();
    }

    public void addAccount(Account account) {
        this.accountsList.add(account);
    }

    public Account getAccount(String login) {
        for (Account account : this.accountsList) {
            if (account.getLogin().equals(login)) {
                return account;
            }
        }
        return null;
    }

    public void removeAccount(String login) {
        Account accountToRemove = null;
        for (Account account : this.accountsList) {
            if (account.getLogin().equals(login)) {
                accountToRemove = account;
                break;
            }
        }
        if (accountToRemove != null) {
            this.accountsList.remove(accountToRemove);
        }
    }

    public List<Account> getaccountsList() {
        return this.accountsList;
    }

    public void sortByLogin() {
        Collections.sort(this.accountsList, new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                return a1.getLogin().compareTo(a2.getLogin());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountCollection:\n");
        for (Account account : this.accountsList) {
            sb.append(account.toString()).append("\n");
        }
        return sb.toString();
    }

}