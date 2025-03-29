package com.thiago.CadastroDePessoas.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_pessoa")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private int cpf;
    @Column(name = "email")
    private String email;
    @Column(name = "data_nascimento")
    private String dataNascimento;

    public PessoaEntity(String nome, int cpf, String email, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
