package br.com.diogo.ordermservico.departamento.domain;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "departament")
public class DepartamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departament")
    private Integer idDepartament;

    @Column(name = "name_departament")
    private String name;
}
