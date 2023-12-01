
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas Abreu");
        pessoa.setIdade(30);
        pessoa.setSexo('M');

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Neymar Junior");
        pessoa2.setIdade(35);
        pessoa2.setSexo('M');

        pessoa.fazerAniversario();
        System.out.println("Idade atual: "+pessoa.getIdade());

        Livro livro = new Livro();
        livro.setAutor(pessoa.getNome());
        livro.setTitulo("Anel de jupiter");
        livro.setTotalPaginas(100);

        livro.detalhes();
        livro.folhear(0);
        livro.avancarPag();
        livro.avancarPag();
        livro.avancarPag();
        livro.avancarPag();
        livro.avancarPag();
        livro.avancarPag();
        livro.voltarPag();
        livro.fechar();


    }
}