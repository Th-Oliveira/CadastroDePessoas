package com.thiago.CadastroDePessoas.trabalho.entity;

import com.thiago.CadastroDePessoas.pessoa.entity.PessoaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_trabalho")
public class TrabalhoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "profissao")
    private String profissao;

    @Column(name="graduacao")
    private String graduacao;

    private PessoaEntity pessoa;

    @OneToMany(mappedBy = "trabalho")
    private List<PessoaEntity> listaDePessoas;

    public TrabalhoEntity(String profissao, String graduacao) {
        this.profissao = profissao;
        this.graduacao = graduacao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
}
