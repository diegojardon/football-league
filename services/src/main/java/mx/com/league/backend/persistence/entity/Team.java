package mx.com.league.backend.persistence.entity;

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
@Table(name = "Team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "teamName", length = 40)
    private String teamName;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "contactPhone", length = 13)
    private String contactPhone;

    @Column(name = "contactEmail", length = 30)
    private String contactEmail;

    @Column(name = "website", length = 60)
    private String website;

    @Column(name = "shortDescription", length = 200)
    private String shortDescription;
}
