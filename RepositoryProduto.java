import java.util.HashSet;

public class RepositoryProduto {
    private HashSet produtos;

    public RepositoryProduto() {
        this.produtos = new HashSet<Produto>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public String listProdutos() {
        return produtos.toString();
    }
}