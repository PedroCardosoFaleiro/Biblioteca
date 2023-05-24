/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.projeto.Informação;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Biblioteca {
    
    List<Livros> livros = new ArrayList<>();

    // Adiciona um livro na biblioteca
    public void adicionarLivro(Livros livro) {
        livros.add(livro);
    }
    
    public void removeLivro(Livros livro){
        this.livros.remove(livro);
    }
    
}
