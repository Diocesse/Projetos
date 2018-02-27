/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.consulta;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import org.daf.entidade.Pessoa;
import org.daf.generico.DaoGenerico;

/**
 *
 * @author leandro
 */
public class ControllerPessoa extends DaoGenerico<Pessoa, Serializable> {

    public static ControllerPessoa instanceOF() {
        return new ControllerPessoa();
    }

    public List<Pessoa> consultarPessoaPorEmail(String email) {
        try {
            return null;
        } catch (Exception e) {
            return null;
        }

    }

    public Pessoa consultarPessoaId(Long Id) {
        try {
            EntityManager em = getEntityManager();          
            Pessoa p = em.find(Pessoa.class, Id);
          
            return p;
        } catch (Exception e) {
            return null;
        }

    }

}
