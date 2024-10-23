package ma.emsi.Repository;

import ma.emsi.DAO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
