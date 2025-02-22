import java.util.List;
import java.util.ArrayList;
public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit o){
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }
    @Override
    public Produit findById(int id){
        for (Produit p: produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    @Override
    public void delete(int id){
        Produit produit = findById(id);
        if (produit != null) {
            produits.remove(produit);
        }
    }
}
