package com.senac.rolealeatorio;

import java.util.Date;

public class Usuario {
    String nome;
    String sobrenome;
    String email;
    String senha;
    Date dataNascimento;
    String CPF;

    //Alt + Insert
    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
