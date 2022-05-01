package mx.com.league.backend.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Soccer_match_detail")
public class SoccerMatchDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "matchId")
    //TODO: REFERENCE TO MATCH TABLE
    private Integer matchId;

    @Column(name = "playerId")
    //TODO: REFERENCE TO PLAYER TABLE
    private Integer playerId;

    @Column(name = "totalYellowCards")
    private Integer totalYellowCards;

    @Column(name = "totalRedCards")
    private Integer totalRedCards;

    @Column(name = "totalGoalsScored")
    private Integer totalGoalsScored;

    @Column(name = "substituted")
    private Boolean substituted;

    @Column(name = "minuteSubstitutionOut")
    private Integer minuteSubstitutionOut;

    @Column(name = "minuteSubstitutionIn")
    private Integer minuteSubstitutionIn;
}
