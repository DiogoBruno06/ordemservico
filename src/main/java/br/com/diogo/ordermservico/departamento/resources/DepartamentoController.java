package br.com.diogo.ordermservico.departamento.resources;

import br.com.diogo.ordermservico.departamento.domain.DepartamentoEntity;
import br.com.diogo.ordermservico.departamento.services.DepartamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamento")
@RequiredArgsConstructor
public class DepartamentoController {
    private final DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<DepartamentoEntity> create(@RequestBody DepartamentoEntity departamento){
        return new ResponseEntity<>(departamentoService.create(departamento), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DepartamentoEntity>> findAll(){
        return new ResponseEntity<>(departamentoService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{idDepartament}")
    public ResponseEntity<Void> delete(@PathVariable Integer idDepartament){
        departamentoService.delete(idDepartament);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{idDepartament}")
    public ResponseEntity<DepartamentoEntity> update(@PathVariable Integer idDepartament ,DepartamentoEntity departamento) throws Exception {
        return new ResponseEntity<>(departamentoService.update(idDepartament,departamento), HttpStatus.OK);
    }
    @GetMapping("/{idDepartament}")
    public ResponseEntity<Optional<DepartamentoEntity>> findById(@PathVariable Integer idDepartament){
        return new ResponseEntity<>(departamentoService.findById(idDepartament), HttpStatus.FOUND);
    }
}
