/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daf.view;

import java.util.ArrayList;
import java.util.List;
import org.daf.consulta.ControllerDependente;
import org.daf.consulta.ControllerPessoa;
import org.daf.entidade.Dependente;
import org.daf.entidade.Pessoa;

/**
 *
 * @author leandro
 */
public class Testar {

    static ControllerPessoa dao_Pessoa = ControllerPessoa.instanceOF();
    static ControllerDependente dao_Dependente = ControllerDependente.instanceOF();

    public static void main(String[] args) {
        /* Dependente dp = new Dependente();
        dp.setNome("ISABELA FERREIRA");
        dp.setContato("(75) 93277-9590");
        dp.setEmail("bela@gmail.com");
        
        Dependente dp2 = new Dependente();
        dp2.setNome("SANDRA ASTADS DIAS");
        dp2.setContato("(75) 1239-9590");
        dp2.setEmail("diocesse@gmail.com");
        
        List<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dp);
        dependentes.add(dp2);
        //Pessoa responsavel
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("LEANDRO DE SOUZA");
        pessoa.setEmail("diocesse@gmail.com");
        dp.setPessoa(pessoa);
        dp2.setPessoa(pessoa);
        
        pessoa.setDependentes(dependentes);
        
        dao_Pessoa.save(pessoa);
         */
        Pessoa pessoa = dao_Pessoa.consultarPessoaId(1L);
        System.out.println("Pessoa: " + pessoa.getNome());
       
        dao_Dependente.listaGenerica(Dependente.class).forEach((p) -> {
            System.out.println("Id: " + p.getIdDependente());
            System.out.println("Nome: " + p.getNome());
        });

        //dao_Pessoa.save(pessoa);
        // dao_Dependente.save(dp);
    }

}
