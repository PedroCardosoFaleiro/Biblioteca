/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.projeto.Função;


import com.senac.projeto.Informação.Livros;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class ArrayLivros_Biblioteca {
    public ArrayList<Livros> Livros = new ArrayList();
    
    public boolean salvar (Livros  l) {
        if (l != null) {
            Livros.add(l);
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Livros> retornar() {
        return Livros;
    }
    
}
