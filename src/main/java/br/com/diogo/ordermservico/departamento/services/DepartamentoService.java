package br.com.diogo.ordermservico.departamento.services;

import br.com.diogo.ordermservico.departamento.domain.DepartamentoEntity;
import br.com.diogo.ordermservico.departamento.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartamentoService {
    private final DepartamentoRepository departamentoRepository;

    public DepartamentoEntity create(DepartamentoEntity departamentoEntity){
        return departamentoRepository.save(departamentoEntity);
    }

    public void delete(Integer idOrdemServico){
        departamentoRepository.deleteById(idOrdemServico);
    }

    public DepartamentoEntity update (Integer idDepartamento, DepartamentoEntity departamento) throws Exception {
        DepartamentoEntity departamentoEntity = departamentoRepository.findById(idDepartamento)
                .orElseThrow(()-> new Exception("Departamento não encontrado"));
        departamentoEntity.setIdDepartament(departamento.getIdDepartament());
        departamentoEntity.setName(departamento.getName());
        return departamentoRepository.save(departamentoEntity);
    }

    public List<DepartamentoEntity> findAll(){
        return departamentoRepository.findAll();
    }

    public Optional<DepartamentoEntity> findById(Integer idDepartamento){
        return departamentoRepository.findById(idDepartamento);
    }
}
