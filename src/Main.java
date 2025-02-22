import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("-----MENu-----");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");
            System.out.println("Votre choix :");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    List<Produit> produits = metier.getAll();
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        for (Produit p : produits) {
                            System.out.println(p);
                        }
                    } break;

                case 2:
                    System.out.println("Entrez l'id du produit:");
                    int id = scanner.nextInt();
                    Produit produit = metier.findById(id);
                    if (produit != null){
                        System.out.println("Produit trouvé : " +produit);
                    } else {
                        System.out.println("Aucun produit trouvé avec cette id");
                    } break;
                case 3:
                    System.out.println("Entrez l'id du produit:");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Entrez le nom du produit:");
                    String nom = scanner.nextLine();
                    System.out.println("Entrez la marque du produit:");
                    String marque = scanner.nextLine();
                    System.out.println("Entrez le prix du produit:");
                    double prix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Entrez la description du produit:");
                    String description = scanner.nextLine();
                    System.out.println("Entrez le nombre de stock :");
                    int nbr_stock = scanner.nextInt();

                    Produit nouveauProduit = new Produit(newId, nom,marque,prix, description, nbr_stock);
                    metier.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès");
                    break;

                case 5:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Au revoir ");
            }

        } while (choix != 5);

        scanner.close();


    }
}
