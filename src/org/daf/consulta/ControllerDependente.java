/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.consulta;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.daf.entidade.Dependente;
import org.daf.generico.DaoGenerico;

/**
 *
 * @author leandro
 */
public class ControllerDependente extends DaoGenerico<Dependente, Serializable> {

    public static ControllerDependente instanceOF() {
        return new ControllerDependente();
    }

    public List<Dependente> todasDependentesDaPessoa(Long IdPessoa) {
        try {
            EntityManager em = getEntityManager();
            Query q = em.createNamedQuery("Dependentes.todosDependentesDaPessoa");
            q.setParameter("identificador", IdPessoa);
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<Dependente> todosDependentesCadastrados() {
        try {

            EntityManager manager = getEntityManager();
            CriteriaBuilder cb = manager.getCriteriaBuilder();
            CriteriaQuery q = cb.createQuery(Dependente.class);
            Root<Dependente> l = q.from(Dependente.class);
            q.select(l);
//  q.multiselect(l.<Long>get("idDependente"), l.<String>get("email"));
            TypedQuery<Dependente> all = manager.createQuery(q);
            List<Dependente> todos = all.getResultList();
            todos.forEach((dp) -> {
                System.out.println("Id :" + dp.getIdDependente());
                System.out.println("Nome :" + dp.getNome());
            });

            return todos;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        instanceOF().todosDependentesCadastrados();
    }

}
