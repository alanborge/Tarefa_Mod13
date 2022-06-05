package br.com.borges;

/**
 * classe concreta que herda da classe Pai
 */
public class PessoaFisica extends Pessoa  {
    private String cpf;

    /**
     * tentetiva da inserção do construtor sem sucesso ao inserir lista de pessoa
     * @param nome
     * @param sobrenome
     * @param identidade
     */
    public PessoaFisica(String nome, String sobrenome, String identidade) {
        super();
    }

    /**
     *
     * @param nome
     * @param sobrenome
     * @param identidade
     * @param cpf
     */
    public PessoaFisica(String nome, String sobrenome, String identidade, String cpf) {
        this.cpf = cpf;
    }

    /**
     * construtor vazio
     */
    public PessoaFisica() {

    }


    /**
     *
     * sobre-escrita ToString
     */
    @Override
    public String toString() {
        return "{" + this.getNome()  + " - " + this.getSobrenome() + " - " + this.getIdentidade() + "}";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
