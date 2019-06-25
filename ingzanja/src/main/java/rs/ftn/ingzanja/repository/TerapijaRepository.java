package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ftn.ingzanja.model.Terapija;

import java.util.List;

public interface TerapijaRepository extends JpaRepository<Terapija,Long> {

    List<Terapija> findAll();
}
