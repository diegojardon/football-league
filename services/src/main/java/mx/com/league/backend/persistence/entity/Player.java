package mx.com.league.backend.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "playerName", length = 40)
    private String playerName;

    @Column(name = "playerLastName", length = 40)
    private String playerLastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "height")
    private Float height;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "selfie", length = 200)
    private String selfie;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    //TODO: ADD REFERENCE TO POSITIONID
}
