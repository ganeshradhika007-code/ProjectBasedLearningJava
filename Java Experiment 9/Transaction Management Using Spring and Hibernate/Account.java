import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    private int accountId;
    @Column(name = "balance")
    private double balance;
    // Getters, setters, constructors...
    public int getAccountId() { return accountId; }
    public void setAccountId(int id) { this.accountId = id; }
    public double getBalance() { return balance; }
    public void setBalance(double b) { this.balance = b; }
}
