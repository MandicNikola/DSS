package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Simptom;

@Repository
public interface SymptomsRepository extends JpaRepository<Simptom, Long> {

    Simptom findOneById(Long id);

    Simptom findOneByNaziv(String naziv);

}
