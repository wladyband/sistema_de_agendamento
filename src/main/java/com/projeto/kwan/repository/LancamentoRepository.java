package com.projeto.kwan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.kwan.model.Lancamento;
import com.projeto.kwan.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
