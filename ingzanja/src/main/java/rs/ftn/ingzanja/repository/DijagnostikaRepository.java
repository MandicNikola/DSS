package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Dijagnostika;

import java.util.List;
@Repository
public interface DijagnostikaRepository extends JpaRepository<Dijagnostika,Long> {

    List<Dijagnostika> findAll();

    List<Dijagnostika> findByNaziv(String naziv);

}
