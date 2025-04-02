/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
 
public class ComparadorAlunoPorMatricula implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2){
        return Integer.compare(o1.getMatricula(), o2.getMatricula());
    }
}
