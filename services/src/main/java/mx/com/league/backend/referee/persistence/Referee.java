package mx.com.league.backend.referee.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Referee")
@Getter
@Setter
@ToString
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String refereeName;

    private String refereeLastName;

    private int age;

    private int totalParticipatedMatches;
}
