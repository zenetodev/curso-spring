package com.example.spring_matheus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_matheus.model.Produto;
import com.example.spring_matheus.repository.ProdutoRepository;
import com.example.spring_matheus.exceptions.RecursoNaoEncontradoException;


@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Produto com ID " + id + " não encontrado"));
    }

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        if (!produtoRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Produto com ID " + id + " não encontrado");
        }
        produtoRepository.deleteById(id);
    }
    
}

    

