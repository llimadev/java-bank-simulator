package com.leonel.javabank.model;

public class User {
    private String name;
    private String cpf;
    private String email;
    private String senha;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String newEmail) {
        this.email = newEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String newSenha) {
        this.senha = newSenha;
    }
}
