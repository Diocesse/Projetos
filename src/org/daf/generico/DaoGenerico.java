/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.generico;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author leandro
 * @param <T>
 * @param <I>
 */
public abstract class DaoGenerico<T, I extends Serializable> implements Dao<T, I> {

    @Override
    public void save(T entity) {
       
        EntityManager e = getEntityManager();
        e.getTransaction().begin();
        e.persist(entity);
        e.getTransaction().commit();
        
    }

    @Override
    public void remove(Class<T> classe, long pk) {

        EntityManager e = getEntityManager();
        e.getTransaction().begin();
        T reference = e.getReference(classe, pk);
        e.remove(reference);
        e.getTransaction().commit();

        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getById(Class<T> classe, I pk) {
        EntityManager em = getEntityManager();
        try {
            return em.getReference(classe, pk);
        } finally {
            em.close();
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> listaGenerica(Class<T> classe) {
        Query e = getEntityManager().createQuery("From " + classe.getSimpleName() + " o ");
        return e.getResultList();
    }

    @Override
    public EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MinicursoJPA");

        return emf.createEntityManager();
    }

}
