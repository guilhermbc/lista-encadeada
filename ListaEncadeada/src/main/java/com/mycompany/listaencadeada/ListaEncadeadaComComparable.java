/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author 20231bsi0112
 * @param <T>
 */
public class ListaEncadeadaComComparable<T extends Comparable>{
    private No<T> primeiro, ultimo;
    private int quantidade;
    private final boolean ordenada;
    
    public ListaEncadeadaComComparable(boolean ehOrdenada){
        this.primeiro = this.ultimo = null;
        this.quantidade = 0;
        this.ordenada = ehOrdenada;
    }
    
    public void inserirElemento(T elem){
        if (this.ordenada == false)
            inserirElementoNaoOrd(elem);
        else
            inserirElementoOrd(elem);
    }
    
    public void inserirElementoNaoOrd(T elem){
        No<T> novo = new No<>(elem);
        //Se a lista estiver vazia
        if (this.primeiro == null){
            this.primeiro = novo;
            this.ultimo = novo;
        }
        //Se não estiver, coloca o elemento no fim da lista
        else{
            this.ultimo.setProx(novo);
            this.ultimo = novo;
        }
        this.quantidade++;
    }

    public void inserirElementoOrd(T elem){
        No<T> novo = new No<>(elem);
        No<T> atual, ant;
        atual = this.primeiro;
        ant = null;
        //Se a lista estiver vazia
        if (this.primeiro == null){
            this.primeiro = novo;
            this.ultimo = novo;
        }
        //Se não estiver
        else{
            //Enquanto não for o fim da lista e o atual for menor do que o novo 
            //elemento, continuar percorrendo a lista
            while (atual != null && atual.getValor().compareTo(elem) < 0){
                ant = atual;
                atual = atual.getProx();
            }
            //Se ant for null, o novo deve ser o novo primeiro
            if (ant == null){
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            // Se atual for null, novo deve ser o último
            else if (atual == null){
                this.ultimo.setProx(novo);
                this.ultimo = novo;
            }
            //Se não for primeiro nem último, entra entre o ant e o atual
            else{
                ant.setProx(novo);
                novo.setProx(atual);
            }          
        }
        this.quantidade++;
    }
    
    public boolean contemElemento(T elem){
        No<T> aux = this.primeiro;
        while (aux != null){
            if (aux.getValor().equals(elem))
                return true;
            aux = aux.getProx();
        }
        return false;
    }
    
    public boolean excluirElemento(T elem){
        No<T> aux = this.primeiro;
        No<T> ant = null;
        while (aux != null){
            //Se encontrou, remove o elemento
            if (aux.getValor().equals(elem)){
                //Se for o primeiro nó
                if (aux == this.primeiro){
                    this.primeiro = aux.getProx();
                    //Se também for o último, ou seja, o único nó da lista
                    if (aux == this.ultimo)
                        this.ultimo = null;       
                }
                //Se não é o primeiro, o anterior passa a apontar para o próximo
                else{
                    ant.setProx(aux.getProx());
                    //Se ele for o último, o anterior passa a ser o novo último
                    if (aux == this.ultimo)
                        this.ultimo = ant;
                }
                //Decrementar a quantidade
                this.quantidade--;
                return true;
            }
            ant = aux;
            aux = aux.getProx();
        }
        //Se rodou tudo sem encontrar, retorna false
        return false;
    }
    
    @Override
    public String toString(){
        No<T> aux = this.primeiro;
        String s = "[";
        while (aux != null){
            s+= aux.getValor();
            if (aux != this.ultimo)
                s+= ", ";
            aux = aux.getProx();
        }
        return (s+"]");
    }
    
}
