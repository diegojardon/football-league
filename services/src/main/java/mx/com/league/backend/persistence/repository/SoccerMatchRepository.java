package mx.com.league.backend.persistence.repository;

import mx.com.league.backend.persistence.entity.SoccerMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoccerMatchRepository extends JpaRepository<SoccerMatch, Integer> {
}
