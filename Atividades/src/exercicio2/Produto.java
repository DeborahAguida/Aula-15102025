package exercicio2;
public class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, String codigo, int quantidade, double precoUnitario){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade;}
    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario;}

    //public int adicionarEstoque(){
       // int incrementarEstoque = 5;
        //int totalEstoque = quantidade + incrementarEstoque;
       // return totalEstoque;
    }
//}
