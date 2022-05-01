package mx.com.league.backend.persistence.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "username", length = 25)
    private String username;

    @NotNull
    @Column(name = "userPassword", length = 25)
    private String userPassword;

    @NotNull
    @Column(name = "userRole", length = 10)
    private String userRole;

    @NotNull
    @Column(name = "firstName", length = 30)
    private String firstName;

    @NotNull
    @Column(name = "lastName", length = 50)
    private String lastName;

    @NotNull
    @Column(name = "lastLoginDate")
    private LocalDateTime lastLoginDate;

    @Column(name = "signupDate")
    private LocalDateTime signupDate;
}
