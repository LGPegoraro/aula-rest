package br.edu.unicesumar.aula.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CursoNovo{
    @Id
    @GeneratedValue
    private Long codcurso;
    @NotEmpty
    private String nome;
    private String chminima;
    private String chmaxima;
    private LocalDate Dataprov;
    

}
