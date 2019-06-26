package rs.ftn.ingzanja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.ingzanja.model.PreventivniPregled;

import java.util.List;
@Repository
public interface PreventivniPregledRepository extends JpaRepository <PreventivniPregled,Long> {

    PreventivniPregled findOneById(Long id);
    List<PreventivniPregled> findAll();
}
