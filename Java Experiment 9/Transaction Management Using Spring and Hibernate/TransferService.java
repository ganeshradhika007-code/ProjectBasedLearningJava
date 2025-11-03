import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferService {
    @Autowired
    private AccountDAO accountDAO;
    @Transactional
    public void transfer(int fromId, int toId, double amount) {
        Account from = accountDAO.findById(fromId);
        Account to = accountDAO.findById(toId);
        if (from.getBalance() < amount) throw new RuntimeException("Insufficient funds");
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        accountDAO.update(from);
        accountDAO.update(to);
    }
}
