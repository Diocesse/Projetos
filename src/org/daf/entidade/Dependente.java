/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "dependente")
@SequenceGenerator(name = "seq_Dependente", sequenceName = "seq_Dependente", initialValue = 1, allocationSize = 1)
@NamedQueries({
@NamedQuery (name ="Dependentes.todosDependentesDaPessoa",query = "SELECT dp FROM Dependente dp WHERE dp.pessoa.idPessoa =:identificador")
})
public class Dependente implements Serializable {

    @Id
    @Column(name = "idDependente", nullable = false, length = 20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_Dependente")
    private Long idDependente;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    
    @Column(name = "contato", nullable = false, unique = true)
    private String contato;
    @ManyToOne
    @JoinColumn(name = "idPessoa")
    private Pessoa pessoa;

    public Long getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(Long idDependente) {
        this.idDependente = idDependente;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   
    
}
