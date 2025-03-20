package com.mycompany.trabalho1bim3sem.view;

import com.mycompany.trabalho1bim3sem.controller.VeiculoController;
import java.util.Scanner;

/**
 *
 * @author alunoADM
 */

public class VeiculoView {
    private Scanner sc;
    private VeiculoController controller;
    
//  Para iniciar os imports e deixar separado
    public VeiculoView(){
        this.controller = new VeiculoController();
        this.sc = new Scanner(System.in);
    }
    
    public void VeiculoView(){
        chamarMenu();
    }

    public void chamarMenu(){
        
        int escolha;

//      Menu interativo para usuário escolher o que deseja fazer na aplicação            
        do {

            System.out.println(
        "=============================="
        + "\nMenu de Interação"
        + "\n1. Cadastrar Veículo"
        + "\n2. Consultar Veículo Cadastrados"
        + "\n3. Editar Veículo"
        + "\n4. Excluir Veículo"
        + "\n5. Marcar Veículo Como Vendido"
        + "\n0. Sair"
        + "\n=============================="

        + "\n\nO que deseja fazer? "
        + "\nDigite uma opção para continuar: ");
        escolha = sc.nextInt();
        sc.nextLine(); // Limpar buffer

            switch(escolha){
                case 1: 
                    System.out.println("\nVocê escolheu a opção de cadastrar veículo!\n");
                    adicionarVeiculo();
                    break;

                case 2:
                    System.out.println("\nVocê escolheu a opção de consultar veículo!\n");
                    exibirVeiculos();
                    break;

                case 3:
                    System.out.println("\nVocê escolheu a opção de editar veículo!\n");
                    editarVeiculo();
                    break;

                case 4:
                    System.out.println("\nVocê escolheu a opção de excluir veículo!\n");
                    break;
                
                case 5:
                    System.out.println("\nVocê escolheu a opção para marcar a venda de um veículo!\n");
                    marcarComoVendido();
                    break;

                case 0:
                    System.out.println("Foi bom te ter conosco!");
                    System.out.println("Desligando sistema...");
                    break;

                default: System.out.println("\nEntrada inválida, tente novamente.\n");

            }
        } while(escolha != 0); // Quando for ==0 irá sair do loop e fechar o sistema
    }
    
    
    public void adicionarVeiculo(){
        
        
        System.out.println("Digite a placa do carro: ");
        String placaVeic = sc.nextLine();
        
        System.out.println("Digite a marca do veículo: ");
        String marcaVeic = sc.nextLine();
        
        
        System.out.println("Digite o modelo do veículo: ");
        String modeloVeic = sc.nextLine();
        
        
        System.out.println("Digite o ano do veículo: ");
        int anoVeic = sc.nextInt();
        sc.nextLine(); // Para limpar o buffer
        
        System.out.println("Digite a cor do veículo: ");
        String corVeic = sc.nextLine();
        
        System.out.println("Digite a quilometragem rodada do veículo: ");
        double kmRodVeic = sc.nextDouble();
        
        System.out.println("Digite o valor de venda do veículo: ");
        double valorVendaVeic = sc.nextDouble(); 
        
        System.out.println("Digite o valor do FIPE do veículo: ");
        double valorFipeVeic = sc.nextDouble();
        
        
        System.out.print("Deseja adicionar informações adicionais? (s/n): ");
        String resposta = sc.nextLine();

        String infOpcional = null;

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("\nDigite as informações que deseja adicionar: "
                    + "\n(Aperte ENTER quando finalizar para prossegui)");
            infOpcional = sc.nextLine();
            sc.nextLine();
        }
        
        
        controller.adicionarVeiculo(placaVeic, marcaVeic, modeloVeic, anoVeic, corVeic, kmRodVeic, valorVendaVeic, valorFipeVeic, infOpcional);

//      Verifica se o usuário deseja voltar ao menu
        System.out.println(
            "\n\nDeseja adicionar outro veículo?"
            + "\n1. Sim"
            + "\n0. Não"
            + "\nDigite uma opção para continuar: ");
        int opcao = sc.nextInt();
        
        switch (opcao) {
            
            case 0:
                chamarMenu();
                break;
                
            case 1:
                adicionarVeiculo();
                break;
                
            default:
                System.out.println(
                    "\n\nEntrada inválida!"
                    + "\n\nDeseja adicionar outro veículo?"
                    + "\n0. Não"
                    + "\n1. Sim"
                    + "\n\nDigite uma opção para continuar: ");
                opcao = sc.nextInt();
                sc.nextInt();
                break;
        }
    }
    
    private void exibirVeiculos() {
        controller.exibirVeiculos();
    }
    
    private void editarVeiculo() {
        controller.exibirVeiculos();

        System.out.print("Digite o índice do veículo a ser editado: ");
        int indice = sc.nextInt();
        sc.nextLine(); // Limpa o buffer
        
        System.out.print("Digite a nova placa" 
            + "\n(ou pressione Enter para manter)");
        String placaVeic = sc.nextLine();
        if (placaVeic.isEmpty()) placaVeic = null;

        System.out.print("Digite a nova marca" 
            + "\n(ou pressione Enter para manter)");
        String marcaVeic = sc.nextLine();
        if (marcaVeic.isEmpty()) marcaVeic = null;

        System.out.print("Digite o novo modelo" 
            + "\n(ou pressione Enter para manter)");
        String modeloVeic = sc.nextLine();
        if (modeloVeic.isEmpty()) modeloVeic = null;

        Integer anoVeic = null;
            do{
                System.out.println("Digite o novo ano: ");
                if (sc.hasNextInt()){
                    anoVeic = sc.nextInt();
                    
                    if (anoVeic <= 0){
                    System.out.println("O ano deve ser positivo: ");
                    }
                    anoVeic = null; // Para reiniciar o loop até ser positivo
                    
                } else {
                    System.out.println("Valor inválido. Digite um número inteiro: ");
                    sc.nextLine(); // Limpar o buffer
                }
            
            } while (anoVeic == null);
            sc.nextLine(); // Limpar o buffer
        
        System.out.println("Digite a nova cor do veículo:" 
            + "\n(ou pressione Enter para manter)");
        String corVeic = sc.nextLine();
        if (corVeic.isEmpty()) corVeic = null;
        
        Double kmRodVeic = null;
            do{
                System.out.println("Digite o novo ano: ");
                if (sc.hasNextInt()){
                    kmRodVeic = sc.nextDouble();
                    
                    if (kmRodVeic <= 0){
                    System.out.println("A quilometragem deve ser positiva: ");
                    }
                    kmRodVeic = null; // Para reiniciar o loop até ser positivo
                    
                } else {
                    System.out.println("Valor inválido. Digite um número positivo: ");
                    sc.nextLine(); // Limpar o buffer
                }
            
            } while (kmRodVeic == null);
            sc.nextLine(); // Limpar o buffer
            
            Double valorVendaVeic = null;
            do{
                System.out.println("Digite o novo ano: ");
                if (sc.hasNextInt()){
                    valorVendaVeic = sc.nextDouble();
                    
                    if (valorVendaVeic <= 0){
                    System.out.println("A quilometragem deve ser positiva: ");
                    }
                    valorVendaVeic = null; // Para reiniciar o loop até ser positivo
                    
                } else {
                    System.out.println("Valor inválido. Digite um número positivo: ");
                    sc.nextLine(); // Limpar o buffer
                }
            
            } while (valorVendaVeic == null);
            sc.nextLine(); // Limpar o buffer
                        
            Double valorFipeVeic = null;
            do{
                System.out.println("Digite o novo ano: ");
                if (sc.hasNextInt()){
                    valorFipeVeic = sc.nextDouble();
                    
                    if (valorFipeVeic <= 0){
                    System.out.println("A quilometragem deve ser positiva: ");
                    }
                    valorFipeVeic = null; // Para reiniciar o loop até ser positivo
                    
                } else {
                    System.out.println("Valor inválido. Digite um número positivo: ");
                    sc.nextLine(); // Limpar o buffer
                }
            
            } while (valorFipeVeic == null);
            sc.nextLine(); // Limpar o buffer

        // Solicita informações adicionais (opcional)
        System.out.print("Deseja editar as informações adicionais também? (s/n): ");
        String resposta = sc.nextLine();
        String infOpcional = null;

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite as novas informações: ");
            infOpcional = sc.nextLine();
            if (infOpcional.isEmpty()) infOpcional = null;
           
            if (infOpcional != null) {
            System.out.println("Informações adicionais atualizadas: " + infOpcional);
            } else {
            System.out.println("Nenhuma informação adicional foi editada.");
            }
        }

        // Chama o método editarVeiculo (versão modular)
        controller.editarVeiculo(indice, placaVeic, marcaVeic, modeloVeic, anoVeic, corVeic, kmRodVeic, valorVendaVeic, valorFipeVeic, infOpcional);
    }
    
    
    
//  Irá levar a informação do indice para o controller verificar qual o veículo1
    private void marcarComoVendido() {
        controller.exibirVeiculos();
        System.out.print("Digite o índice do veículo a ser marcado como vendido: ");
        int indice = sc.nextInt();
        sc.nextLine(); // Limpa o buffer
        controller.marcarComoVendido(indice);
    }
    
    
    
}
