package mx.com.league.backend.persistence.repository;

import mx.com.league.backend.persistence.entity.Referee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, Integer> {
}
