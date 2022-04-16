package mx.com.league.backend.match.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoccerMatchRepository extends JpaRepository<SoccerMatch, Integer> {
}
