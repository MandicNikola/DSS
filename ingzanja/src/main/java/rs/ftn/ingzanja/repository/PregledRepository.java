package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Pregled;

import java.util.List;

@Repository
public interface PregledRepository extends JpaRepository<Pregled, Long> {

    Pregled findOneById(Long id);

    @Query(value = "select p FROM Pregled p where p.isComplet = true ")
    List<Pregled> findCompletePregled();


}
