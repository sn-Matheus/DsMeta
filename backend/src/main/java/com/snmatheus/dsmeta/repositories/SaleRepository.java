/*Componente do sistema responsável para acessar o Banco de Dados
Ex: Consultar, Salvar, Atualizar, Deletar uma venda.
*/
package com.snmatheus.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.snmatheus.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
	
}
