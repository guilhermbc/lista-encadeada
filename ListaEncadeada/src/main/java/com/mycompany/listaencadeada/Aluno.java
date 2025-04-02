/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author Usuario
 */
public class Aluno implements Comparable<Aluno>{

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
    private String nome;
    private int matricula, nota;
    
    public Aluno(String nome, int matricula, int nota){
        this.nome = nome;
        this.matricula = matricula;
        this. nota = nota;
    } 
            
    @Override
    public int compareTo(Aluno a){
        return this.nome.compareTo(a.nome);
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
}
