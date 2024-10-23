package ma.emsi.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
public class User {
    @Id
    private int id;
    private String fullName;
    private String email;
    private long phone;
}
