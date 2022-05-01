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
@Table(name = "Soccer_match")
public class SoccerMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "matchDate")
    private LocalDateTime matchDate;

    @NotNull
    @Column(name = "localTeamByCategoryId")
    //TODO: FOREIGN KEY RELATIONSHIP
    private Integer localTeamByCategoryId;

    @NotNull
    @Column(name = "visitorTeamByCategoryId")
    private Integer visitorTeamByCategoryId;

    @Column(name = "finalScore", length = 7)
    private String finalScore;

    @Column(name = "firstHalfScore", length = 7)
    private String firstHalfScore;

    @Column(name = "secondHalfScore", length = 7)
    private String secondHalfScore;

    @Column(name = "hasOvertime")
    private Boolean hasOvertime;

    @Column(name = "firstOvertimeScore", length = 7)
    private String firstOvertimeScore;

    @Column(name = "secondOvertimeScore", length = 7)
    private String secondOvertimeScore;

    @Column(name = "hasPenaltyKicks")
    private Boolean hasPenaltyKicks;

    @Column(name ="penaltiesScore", length = 7)
    private String penaltiesScore;
}
