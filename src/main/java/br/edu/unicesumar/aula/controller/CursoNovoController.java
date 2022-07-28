package br.edu.unicesumar.aula.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unicesumar.aula.domain.CursoNovo;
import br.edu.unicesumar.aula.service.CursoNovoService;



@RestController
@RequestMapping("/cursonovo")
public class CursoNovoController {

    @Autowired
    private CursoNovoService service;

    @PostMapping
    private ResponseEntity<CursoNovo> salvar(@RequestBody CursoNovo cursoNovo){
        CursoNovo salvarCursoNovo = service.salvarCursoNovo(cursoNovo);
        return ResponseEntity.ok(salvarCursoNovo);
    }

    @GetMapping
    public ResponseEntity<Page<CursoNovo>> buscarCursoNovo  (Pageable pageable){
        Page<CursoNovo> cursonovopaginado = service.buscarCurso(pageable);
        return ResponseEntity.ok(cursonovopaginado);
    }
    
}
