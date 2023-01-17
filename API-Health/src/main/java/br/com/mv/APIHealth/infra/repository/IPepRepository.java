package br.com.mv.APIHealth.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mv.APIHealth.domain.entity.pep.Pep;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IPepRepository extends JpaRepository<Pep, UUID> {

}
