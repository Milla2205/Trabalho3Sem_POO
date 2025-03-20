package com.mycompany.trabalho1bim3sem.controller;

import com.mycompany.trabalho1bim3sem.model.VeiculoConcreto;
import com.mycompany.trabalho1bim3sem.model.VeiculoModel;

import java.util.ArrayList;
import java.util.List;


public class VeiculoController {
    private List<VeiculoModel> veiculos;

    
    public VeiculoController(){
        this.veiculos = new ArrayList<>();

    }
    
    public List<VeiculoModel> getVeiculos(){
        return veiculos;
    }
    
    public void adicionarVeiculo(String placaVeic, String marcaVeic, String modeloVeic, int anoVeic, String corVeic, double kmRodVeic, double valorVendaVeic, double valorFipeVeic, String infOpcional){
        VeiculoModel veiculo = new VeiculoConcreto(placaVeic, marcaVeic, modeloVeic, anoVeic, corVeic, kmRodVeic, valorVendaVeic, valorFipeVeic);
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado com sucesso!");
    }
    
    public void exibirVeiculos(){
        
        if (veiculos.isEmpty()){
            System.out.println("\nNão há veículos cadastrados");
            
        } else {
            System.out.println("\nLista de Veiculos");
            
            //Para passar por toda a lista e exibir todos os veículos
            for(VeiculoModel v : veiculos){
                v.exibirDetalhes();
            }
        }
    }
    
    public void marcarComoVendido(int indice) {        
        if (indice >= 0 && indice < veiculos.size()) {
            VeiculoModel veiculo = veiculos.get(indice);
            veiculo.marcarComoVendido();
            System.out.println("\nVeículo marcado como vendido: \n" + veiculo);
        } else {
            System.out.println("\nÍndice inválido!\n");
        }
    }
    
    
    
    public void editarVeiculo(int indice, String placaVeic, String marcaVeic, String modeloVeic, int anoVeic, String corVeic, double kmRodVeic, double valorVendaVeic, double valorFipeVeic, String infOpcional){
        
        if (indice >= 0 && indice < veiculos.size()) {
            VeiculoModel veiculo = veiculos.get(indice);
            
            
            if (placaVeic != null) veiculo.setPlacaVeic(placaVeic);
            if (marcaVeic != null) veiculo.setMarcaVeic(marcaVeic);
            if (modeloVeic != null) veiculo.setModeloVeic(modeloVeic);
            if (anoVeic < 0) veiculo.setAnoVeic(anoVeic);
            if (corVeic != null) veiculo.setCorVeic(corVeic);
            if (kmRodVeic <= 0) veiculo.setKmRodVeic(kmRodVeic);
            if (valorVendaVeic <= 0) veiculo.setValorVendaVeic(valorVendaVeic);
            if (valorFipeVeic <= 0) veiculo.setValorFipeVeic(valorFipeVeic);
            if (infOpcional != null) veiculo.setInfOpcional(infOpcional);
            
            
            System.out.println("Veículo editado com sucesso: " + veiculo);
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    

    

    
}
