package mx.com.league.backend.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Coach")
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "coachName", length = 30)
    private String coachName;

    @Column(name = "coachLastName", length = 40)
    private String coachLastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "startDate")
    private LocalDateTime startDate;

}
