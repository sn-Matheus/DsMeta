/*Componente do sistema responsável para acessar o Banco de Dados
Ex: Consultar, Salvar, Atualizar, Deletar uma venda.
*/
package com.snmatheus.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snmatheus.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
