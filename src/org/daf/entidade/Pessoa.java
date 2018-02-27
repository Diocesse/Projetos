/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = "seq_Pessoa",sequenceName = "seq_Pessoa",initialValue = 1,allocationSize = 1)
@NamedQueries({
@NamedQuery(name = "Pessoa.consultaPorId", 
            query = " SELECT p FROM Pessoa p WHERE p.idPessoa =:Cod")


})
public class Pessoa implements Serializable {
    
    @Id
    @Column(name = "idPessoa",nullable = false,length = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_Pessoa")
    private Long idPessoa;
    @Column(name = "nome",nullable = false)
    private String nome ;
    @Column(name = "email",nullable = false)
    private String email;
    
    @OneToMany(mappedBy = "pessoa",cascade = CascadeType.ALL)
    private List<Dependente> dependentes  ;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    

   
    
    
    
}
