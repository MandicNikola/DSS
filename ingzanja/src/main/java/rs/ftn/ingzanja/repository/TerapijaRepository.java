package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.Terapija;

import java.util.List;
@Repository
public interface TerapijaRepository extends JpaRepository<Terapija,Long> {

    List<Terapija> findAll();
    Terapija findOneByNaziv(String naziv);
}
