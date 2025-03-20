/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1bim3sem.model;

/**
 *
 * @author alunoADM
 */
public class VeiculoConcreto extends VeiculoModel {
    public VeiculoConcreto(String placaVeic, String marcaVeic, String modeloVeic, int anoVeic, String corVeic, double kmRodVeic, double valorVendaVeic, double valorFipeVeic){
        super(placaVeic, marcaVeic, modeloVeic, anoVeic, corVeic, kmRodVeic, valorVendaVeic, valorFipeVeic);
        
    }

    @Override
    public void exibirDetalhes() {
        String status = isDispVeic() ? "Vendido" : "Disponível";
        
        System.out.println(
        "=============================="
            + "\nVeículo :" 
                
            + "\n\nPlaca do veículo = " + getPlacaVeic()
                
            + "\nMarca = " + getMarcaVeic()
            + "\nModelo = " + getModeloVeic()
            + "\nAno = " + getAnoVeic ()
            + "\nCor = " + getCorVeic()
                
            + "\nQuilometragem rodada = " + getKmRodVeic()
                
            + "\n\nValor para venda = " + getValorVendaVeic()
            + "\nValor pela FIPE = " + getValorFipeVeic()
                
            + "\n\nVeículo está disponível? " + status
                
            + "\n\nInformações adicionais: \n" + getInfOpcional()

            + "==============================\n");
    }
    
   
}
