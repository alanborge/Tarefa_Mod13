package br.com.borges;

import java.util.*;


/**
 * Classe principal onde executa o codigo fonte
 */

public class Principal {

    /**
     * 
     * @hidden listaPessoaFisica
     *
     */
    public static void main(String[] args) {

       PessoaFisica pessoa = new PessoaFisica();
       pessoa.setNome(" Allan ");
       pessoa.setSobrenome(" Borges ");
       pessoa.setIdentidade(" 156686816 ");
       pessoa.setCpf(" 123.519.847-17 ");
       imprimirPessoFisica(pessoa);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome(" Jurandir ");
        pessoaJuridica.setSobrenome(" Da Cunha ");
        pessoaJuridica.setIdentidade(" 15475263 ");
        pessoaJuridica.setCnpj(" 124.516.0001-37 ");
        imprimirPessoJuridica(pessoaJuridica);
        /**
         * metodo comentado para não ser executado
          */
        //listaPessoaFisica();

    }

    public static void imprimirPessoFisica(PessoaFisica pessoa){
        System.out.println(pessoa.getNome() + pessoa.getSobrenome() + pessoa.getIdentidade() + pessoa.getCpf());
    }

    public static void imprimirPessoJuridica(PessoaJuridica pessoa){
        System.out.println(pessoa.getNome() + pessoa.getSobrenome() + pessoa.getIdentidade() + pessoa.getCnpj());
    }

    /**
     * @hidden listaPessoaFisica
     * Metodo inconclusivo, trazedo a lista vazia de objetos.
     */
   private static void listaPessoaFisica() {
        Scanner input = new Scanner(System.in);
        PessoaFisica pessoa = new PessoaFisica();
        List<PessoaFisica> lista = new ArrayList<>();
        int vet[] = new int[4];
        for (int i = 0; i < vet.length ; i++) {
            System.out.println("Pessoa " + i);
            System.out.println("Informe o nome: ");
            pessoa.setNome(input.nextLine());
            pessoa.getNome();
            System.out.println("informe o sobrenome: ");
            pessoa.setSobrenome(input.nextLine());
            pessoa.getNome();
            System.out.println("Informe a identidade: ");
            pessoa.setIdentidade(input.nextLine());
            pessoa.getIdentidade();
            System.out.println("informe seu cpf");
            pessoa.setCpf(input.nextLine());
            pessoa.getCpf();
            System.out.println("*******************************************************");
            PessoaFisica pessoa1 = new PessoaFisica(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdentidade(), pessoa.getCpf());
            PessoaFisica pessoa2 = new PessoaFisica(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdentidade(), pessoa.getCpf());
            PessoaFisica pessoa3 = new PessoaFisica(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdentidade(), pessoa.getCpf());
            PessoaFisica pessoa4 = new PessoaFisica(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdentidade(), pessoa.getCpf());
            lista.add(pessoa1);
            lista.add(pessoa2);
            lista.add(pessoa3);
            lista.add(pessoa4);
        }
           String pfisica = ",";
           String[] nomes = pfisica.split(";");
        System.out.println("********** Lista de Pessoas Fisicas**************");
        System.out.println("" + lista + nomes[0]);

    }
}
