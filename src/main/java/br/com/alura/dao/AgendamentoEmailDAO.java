package br.com.alura.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.alura.entidade.AgendamentoEmail;

@Stateless
public class AgendamentoEmailDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<AgendamentoEmail> listar() {

		List<AgendamentoEmail> resultado = entityManager
				.createNamedQuery("SELECT ae FROM AgendamentoEmail ae", AgendamentoEmail.class).getResultList();

		return resultado;
	}
}
