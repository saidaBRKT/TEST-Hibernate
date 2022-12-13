import Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("default");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction=session.getTransaction();
        transaction.begin();
        User user=new User("ahmed", LocalDate.now());
        transaction.commit();
    }
}
