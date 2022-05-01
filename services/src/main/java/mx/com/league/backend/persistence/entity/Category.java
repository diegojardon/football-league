package mx.com.league.backend.persistence.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "categoryName", length = 40)
    private String categoryName;

    @NotNull
    @Column(name = "ageRange", length = 20)
    private String ageRange;

    @NotNull
    @Column(name = "forMales")
    private Boolean forMales;

    @NotNull
    @Column(name = "forFemales")
    private Boolean forFemales;

    @NotNull
    @Column(name = "capacity")
    private Integer capacity;

}
