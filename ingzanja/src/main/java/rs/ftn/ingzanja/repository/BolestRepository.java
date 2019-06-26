package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Bolest;

import java.util.List;

@Repository
public interface BolestRepository extends JpaRepository<Bolest,Long> {

    List<Bolest> findAll();
    List<Bolest> findByNaziv(String naziv);
}
