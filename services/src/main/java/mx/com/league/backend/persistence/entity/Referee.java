package mx.com.league.backend.persistence.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Referee")
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "refereeName", length = 30)
    private String refereeName;

    @NotNull
    @Column(name = "refereeLastName", length = 30)
    private String refereeLastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "totalParticipatedMatches")
    private Integer totalParticipatedMatches;
}
