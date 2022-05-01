package mx.com.league.backend.persistence.repository;

import mx.com.league.backend.persistence.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer> {
}
