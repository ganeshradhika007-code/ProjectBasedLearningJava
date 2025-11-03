import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AccountDAO {
    public Account findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Account acc = session.get(Account.class, id);
        session.close();
        return acc;
    }
    public void update(Account acc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(acc);
        session.getTransaction().commit();
        session.close();
    }
}
