package br.com.diogo.ordermservico.departamento.repository;

import br.com.diogo.ordermservico.departamento.domain.DepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity,Integer> {
}
