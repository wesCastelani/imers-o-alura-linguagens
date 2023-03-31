package com.alura.imersaoaluralinguagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repository;


    @GetMapping("/linguagens")
    public List<Linguagem> rankingLinguagens(){
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem adicionaLinguagem(@RequestBody Linguagem linguagem){
        var linguagemSalva = repository.save(linguagem);
        return linguagemSalva;
    }

}
