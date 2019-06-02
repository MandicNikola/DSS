package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Pregled;

@Repository
public interface PregledRepository extends JpaRepository<Pregled, Long> {

    Pregled findOneById(Long id);

}
