/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author 20231bsi0112
 */
public class No<T>{

    /**
     * @return the valor
     */
    public T getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

    /**
     * @return the prox
     */
    public No getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(No prox) {
        this.prox = prox;
    }
    private T valor;
    private No prox;
    
    public No(T valor){
        this.valor = valor;
        this.prox = null;
    }
}
