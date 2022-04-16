package mx.com.league.backend.category.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
@Getter
@Setter
@ToString
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    private String categoryName;

    private String ageRange;

    private boolean forMales;

    private boolean forFemales;

    private int capacity;

}
