package com.mycompany.trabalho1bim3sem.model;

/**
 *Cadastro de Veículos: Marca; Modelo; Ano; Cor do Veículo; 
 * Quilometragem rodada, Valor de Venda do Veiculo, Valor de FIPE do Veiculo; 
 * Descrição dos opcionais (ex: ar condicionado, direção hidráulica); 
 * Placa do Veículo (com validação do formato correto: ex: "AAA-1234" ou "AAA1B23"); 
 */

//Verificações das informações adicionais devem ficar no view

public abstract class VeiculoModel{
    
//  Chave primária
    private String placaVeic;
    
//  Informações principais do modelo veículo
    
    private String marcaVeic;
    private String modeloVeic;
    private int anoVeic;
    private String corVeic;
    
    private double kmRodVeic;
    
    private double valorVendaVeic;
    private double valorFipeVeic;
    
    private boolean dispVeic;
    
    private String infOpcional;
    


// Não declarar o dispVec, caso contrário toda classe vai pedir para intrar com a informação
    public VeiculoModel(String placaVeic, String marcaVeic, String modeloVeic, int anoVeic, String corVeic, double kmRodVeic, double valorVendaVeic, double valorFipeVeic) {
        
//      Validação de entrada de dados do usuário
        if (placaVeic == null || placaVeic.trim().isEmpty()){
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia!");
        }
        if (marcaVeic == null || marcaVeic.trim().isEmpty()){
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia!");
        }
        if (modeloVeic == null || modeloVeic.trim().isEmpty()){
            throw new IllegalArgumentException("O modelo não pode ser nula ou vazia!");
        }
        if (anoVeic <= 0){
            throw new IllegalArgumentException("O ano não pode ser nula ou vazia!");
        }
        if (corVeic == null || corVeic.trim().isEmpty()){
            throw new IllegalArgumentException("A cor não pode ser nula ou vazia!");
        }
        if (kmRodVeic < 0){
            throw new IllegalArgumentException("A quilometragem rodada não pode ser nula ou vazia!");
        }
        if (valorVendaVeic <= 0){
            throw new IllegalArgumentException("O valor de venda não pode ser nula ou vazia!");
        }
        if (valorFipeVeic <= 0){
            throw new IllegalArgumentException("O valor do Fipe não pode ser nula ou vazia!");
        }
                
        
        this.placaVeic = placaVeic;
        this.marcaVeic = marcaVeic;
        this.modeloVeic = modeloVeic;
        this.anoVeic = anoVeic;
        this.corVeic = corVeic;
        this.kmRodVeic = kmRodVeic;
        this.valorVendaVeic = valorVendaVeic;
        this.valorFipeVeic = valorFipeVeic;
        this.dispVeic = false;  // Por padrão, o veículo não está vendido
        this.infOpcional = null; // Por padrão não terá nenhuma descrição a mais
        
    }
    
    
    
    public String getPlacaVeic() {
        return placaVeic;
    }

    public String getMarcaVeic() {
        return marcaVeic;
    }

    public String getModeloVeic() {
        return modeloVeic;
    }

    public int getAnoVeic() {
        return anoVeic;
    }

    public String getCorVeic() {
        return corVeic;
    }

    public double getKmRodVeic() {
        return kmRodVeic;
    }

    public double getValorVendaVeic() {
        return valorVendaVeic;
    }

    public double getValorFipeVeic() {
        return valorFipeVeic;
    }

    public boolean isDispVeic() {
        return dispVeic;
    }

    public String getInfOpcional() {
        return infOpcional;
    }
    
    
    public void setPlacaVeic(String placaVeic) {
        if (placaVeic == null || placaVeic.trim().isEmpty()){
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia!");
        }
        this.placaVeic = placaVeic;
    }

    public void setMarcaVeic(String marcaVeic) {
        if (marcaVeic == null || marcaVeic.trim().isEmpty()){
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia!");
        }
        this.marcaVeic = marcaVeic;
    }

    public void setModeloVeic(String modeloVeic) {
        if (modeloVeic == null || modeloVeic.trim().isEmpty()){
            throw new IllegalArgumentException("O modelo não pode ser nula ou vazia!");
        }
        this.modeloVeic = modeloVeic;
    }

    public void setAnoVeic(int anoVeic) {
        if (anoVeic <= 0){
            throw new IllegalArgumentException("O ano não pode ser nula ou vazia!");
        }
        this.anoVeic = anoVeic;
    }

    public void setCorVeic(String corVeic) {
        if (corVeic == null || corVeic.trim().isEmpty()){
            throw new IllegalArgumentException("A cor não pode ser nula ou vazia!");
        }
        this.corVeic = corVeic;
    }

    public void setKmRodVeic(double kmRodVeic) {
        if (kmRodVeic < 0){
            throw new IllegalArgumentException("A quilometragem rodada não pode ser nula ou vazia!");
        }
        this.kmRodVeic = kmRodVeic;
    }

    public void setValorVendaVeic(double valorVendaVeic) {
        if (valorVendaVeic <= 0){
            throw new IllegalArgumentException("O valor de venda não pode ser nula ou vazia!");
        }
        this.valorVendaVeic = valorVendaVeic;
    }

    public void setValorFipeVeic(double valorFipeVeic) {
        if (valorFipeVeic <= 0){
            throw new IllegalArgumentException("O valor do Fipe não pode ser nula ou vazia!");
        }
        this.valorFipeVeic = valorFipeVeic;
    }
    
    public void setInfOpcional(String setInfOpcional) {
        if (setInfOpcional != null){
            throw new IllegalArgumentException("O valor do Fipe não pode ser nula ou vazia!");
        }
        this.infOpcional = setInfOpcional;
    }
    
    
    public void marcarComoVendido(){
        this.dispVeic = true;
    }
    

    @Override
    public String toString(){
        String status = dispVeic ? "Vendido" : "Disponível";
        
        return
            "\n=============================="
            + "\nCarro :"
                
            + "\n\nPlaca do veículo = " + placaVeic
                
            + "\nMarca = " + marcaVeic
            + "\nModelo = " + modeloVeic
            + "\nAno = " + anoVeic 
            + "\nCor = " + corVeic
                
            + "\nQuilometragem rodada = " + kmRodVeic
                
            + "\n\nValor para venda = " + valorVendaVeic
            + "\nValor pela FIPE = " + valorFipeVeic
                
            + "\n\nVeículo está disponível? " + status
                
            + "\n\nInformações adicionais: \n" + infOpcional
            + "\n==============================\n";
    }
    
    public abstract void exibirDetalhes();

}

