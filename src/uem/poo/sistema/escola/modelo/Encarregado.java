/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author claucio
 */
@Entity
public class Encarregado implements Serializable{
    @Id @GeneratedValue()
    private Long codigo;
    @Column(nullable = false ,unique = true)
    private String profissao;
    @Column(nullable = false ,unique = true)
    private String localTrabalho;
    @Column(nullable = false ,unique = true)
    private String grauParentestico;
    @Column(nullable = false ,unique = true)
    private String nome;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    
    @OneToMany(mappedBy = "encarregado")
    private List<Aluno> alunos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getGrauParentestico() {
        return grauParentestico;
    }

    public void setGrauParentestico(String grauParentestico) {
        this.grauParentestico = grauParentestico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}
