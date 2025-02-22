public class Produit {

    public int id;
    public String nom;
    public String marque;
    public double prix;
    public String description;
    public int nbr_stock;

    public Produit(int id, String nom, String marque, double prix, String description, int nbr_stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbr_stock = nbr_stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbr_stock() {
        return nbr_stock;
    }

    public void setNbr_stock(int nbr_stock) {
        this.nbr_stock = nbr_stock;
    }

    @Override
      String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nombreEnStock=" + nbr_stock +
                '}';
    }
}
