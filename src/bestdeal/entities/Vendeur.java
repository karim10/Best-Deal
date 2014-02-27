

package bestdeal.entities;


import java.util.Objects;
import java.util.Date;


public class Vendeur {
    private int idVendeur;
    private String NomVendeur;
    private int numPersmission;
    private String datePermission;
    private String username;
    private String pswd;
    private String mail;

    public Vendeur(int idVendeur, String NomVendeur, int numPersmission, String datePermission, String username, String pswd, String mail) {
        this.idVendeur = idVendeur;
        this.NomVendeur = NomVendeur;
        this.numPersmission = numPersmission;
        this.datePermission = datePermission;
        this.username = username;
        this.pswd = pswd;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "NomVendeur=" + NomVendeur + ", numPersmission=" + numPersmission + '}';
    }

    public Vendeur() {
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    public String getNomVendeur() {
        return NomVendeur;
    }

    public void setNomVendeur(String NomVendeur) {
        this.NomVendeur = NomVendeur;
    }

    public int getNumPersmission() {
        return numPersmission;
    }

    public void setNumPersmission(int numPersmission) {
        this.numPersmission = numPersmission;
    }

    public String getDatePermission() {
        return datePermission;
    }

    public void setDatePermission(String datePermission) {
        this.datePermission = datePermission;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendeur other = (Vendeur) obj;
        if (this.idVendeur != other.idVendeur) {
            return false;
        }
        if (!Objects.equals(this.NomVendeur, other.NomVendeur)) {
            return false;
        }
        return true;
    }

    public Vendeur(String NomVendeur, int numPersmission, String datePermission, String username, String pswd, String mail) {
        this.NomVendeur = NomVendeur;
        this.numPersmission = numPersmission;
        this.datePermission = datePermission;
        this.username = username;
        this.pswd = pswd;
        this.mail = mail;
    }
    
    
}
