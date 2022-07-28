package br.edu.unicesumar.aula.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.unicesumar.aula.domain.CursoNovo;
import br.edu.unicesumar.aula.repository.CursoNovoRepository;

@Service
public class CursoNovoService {

    @Autowired
    private CursoNovoRepository cursoRepository;
    
    public CursoNovo salvarCursoNovo (CursoNovo cursonovo){
        return cursoRepository.save(cursonovo);
    }

    public Page<CursoNovo> buscarCurso(Pageable page){
        return cursoRepository.findAll(page);
    }



    
}
