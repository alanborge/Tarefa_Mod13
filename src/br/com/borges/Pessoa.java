package br.com.borges;

/**
 * @author Allan-PC
 * Classe abstrata
 */
public abstract class Pessoa {

    /**
     * propriedades da classe
     */
    private String nome;
    private String sobrenome;
    private String identidade;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{" + nome  + " - " + sobrenome + " - " + identidade + "}";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
}
