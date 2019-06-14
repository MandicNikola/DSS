package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Pacient;

@Repository
public interface PacientRepository extends JpaRepository<Pacient, Long> {

    Pacient findOneById(Long id);

}
