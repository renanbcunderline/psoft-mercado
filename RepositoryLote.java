import java.util.HashSet;

public class RepositoryLote {
    private HashSet lotes;

    public RepositoryLote() {
        this.lotes = new HashSet<Lote>();
    }

    public void addLote(Lote lote) {
        lotes.add(lote);
    }

    public String listLotes() {
        return lotes.toString();
    }
}
