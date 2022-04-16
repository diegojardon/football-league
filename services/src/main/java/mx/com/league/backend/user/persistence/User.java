package mx.com.league.backend.user.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String userPassword;

    private String userRole;

    private String firstName;

    private String lastName;

    private String lastLoginDate;

    private String signupDate;
}
