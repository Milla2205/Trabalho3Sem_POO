package com.mycompany.trabalho1bim3sem;


import com.mycompany.trabalho1bim3sem.view.VeiculoView;


/** cadastrar e gerenciar os veículos disponíveis para venda
 *  deve permitir a inserção, edição, listagem e exclusão de veículos
 *  funcionalidades específicas para organização dos registros
 *  utilizar interfaces e classes abstratas
 *  utilizar  ArrayList para armazenar veículos
 *
 * 
 * Requisitos do Sistema:  
 * 
 * Cadastro de Veículos: Marca; Modelo; Ano; Cor do Veículo; 
 * Quilometragem rodada, Valor de Venda do Veiculo, Valor de FIPE do Veiculo; 
 * Descrição dos opcionais (ex: ar condicionado, direção hidráulica); 
 * Placa do Veículo (com validação do formato correto: ex: "AAA-1234" ou "AAA1B23"); 
 * 
 * Edição de Dados de um veículo cadastrado. 
 * 
 * Exclusão de Veículos cadastrados.
 * 
 * Marcar um Veículo como Vendido (não podendo ser editado ou removido depois).
 * 
 * Listagem de Veículos, permitindo: Listar todos os veículos disponíveis; 
 * Filtrar veículos por marca; 
 * Filtrar veículos por ano.
 */

public class Trabalho1Bim3Sem {

    public static void main(String[] args) {

        VeiculoView view = new VeiculoView();


        view.chamarMenu();

        
        
        
        
        
    }
}
