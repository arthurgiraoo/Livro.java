public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual = 0;
    private boolean aberto = false;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }


    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de paginas: "+this.getTotalPaginas());
    }

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("O livro está aberto.");
    }

    @Override
    public void fechar() {

        this.aberto = false;
        System.out.println("O livro esta fechado");

    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
        System.out.println("Pagina atual apos folhear livro: "+this.pagAtual);
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        System.out.println("Pagina atual apos avanço: "+this.pagAtual);
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        System.out.println("Pagina atual apos volta: "+this.pagAtual);
    }
}
