/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaencadeada;

/**
 *
 * @author 20231bsi0112
 */
public class Application {

    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> lNome = 
                new ListaEncadeadaComComparator<>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> lMat = 
                new ListaEncadeadaComComparator<>(true, new ComparadorAlunoPorMatricula());
        Aluno a1 = new Aluno("Guilherme", 7, 100);
        Aluno a2 = new Aluno("Vinicius", 3, 95);
        Aluno a3 = new Aluno("Kayque", 10, 98);
        lNome.inserirElemento(a1);
        lNome.inserirElemento(a2);
        lNome.inserirElemento(a3);
        lMat.inserirElemento(a1);
        lMat.inserirElemento(a2);
        lMat.inserirElemento(a3);
        
        System.out.println("Lista ordenada por nome");
        System.out.println(lNome);
        System.out.println("Lista ordenada por matricula");
        System.out.println(lMat);
        
    }
}
