
package bestdeal.entities;


public class Deal {
     private int idDeal;
    private String nomDeal;
    private String descDeal;
    private String dateDebut;
    private String dateFin;
    private float prix;
    private float remise;
    private int quantite;
    private Vendeur v;

    public Deal(int idDeal, String nomDeal, String descDeal, String dateDebut, String dateFin, float prix, float remise, int quantite, Vendeur v) {
        this.idDeal = idDeal;
        this.nomDeal = nomDeal;
        this.descDeal = descDeal;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
        this.remise = remise;
        this.quantite = quantite;
        this.v = v;
    }

    @Override
    public String toString() {
        return "Deal{" + "nomDeal=" + nomDeal + ", descDeal=" + descDeal + ", remise=" + remise + ", quantite=" + quantite + ", v=" + v + '}';
    }

    public Deal() {
     
    }

    public int getIdDeal() {
        return idDeal;
    }

    public Deal(String nomDeal, String descDeal, String dateDebut, String dateFin, float prix, float remise, int quantite, Vendeur v) {
        this.nomDeal = nomDeal;
        this.descDeal = descDeal;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
        this.remise = remise;
        this.quantite = quantite;
        this.v = v;
    }

    public Deal(String nomDeal, String descDeal, String dateDebut, String dateFin, float prix, float remise, int quantite) {
        this.nomDeal = nomDeal;
        this.descDeal = descDeal;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
        this.remise = remise;
        this.quantite = quantite;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public String getNomDeal() {
        return nomDeal;
    }

    public void setNomDeal(String nomDeal) {
        this.nomDeal = nomDeal;
    }

    public String getDescDeal() {
        return descDeal;
    }

    public void setDescDeal(String descDeal) {
        this.descDeal = descDeal;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getRemise() {
        return remise;
    }

    public void setRemise(float remise) {
        this.remise = remise;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Vendeur getV() {
        return v;
    }

    public void setV(Vendeur v) {
        this.v = v;
    }
    
    
    
    
}
