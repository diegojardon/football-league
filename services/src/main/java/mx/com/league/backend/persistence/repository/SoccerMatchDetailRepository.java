package mx.com.league.backend.persistence.repository;

import mx.com.league.backend.persistence.entity.SoccerMatchDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoccerMatchDetailRepository extends JpaRepository<SoccerMatchDetail, Integer> {
}
