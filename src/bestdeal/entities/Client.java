package bestdeal.entities;

import java.util.Objects;
import java.util.Date;

public class Client {

    private int Id;
    private String Nom;
    private String Prenom;
    private String username;
    private int Tel;
    private String pwd;
    private String mail;
    private String Code_postal;
    private String Adresse;
    private String Ville;
    private Date Date_naissance;

    public Client(int Id, String Nom, String Prenom, String username, int Tel, String pwd, String mail, String Code_postal, String Adresse, String Ville, Date Date_naissance) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.username = username;
        this.pwd = pwd;
        this.mail = mail;
        
        this.Code_postal = Code_postal;
        this.Adresse = Adresse;
        this.Ville = Ville;
        this.Date_naissance = Date_naissance;
    }

    

    public Client() {
        
    }

    public Client(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public Client(String login, char[] pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getUsername() {
        return username;
    }

    public String getPwd() {
        return pwd;
    }

    public String getMail() {
        return mail;
    }

    public String getCode_postal() {
        return Code_postal;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getVille() {
        return Ville;
    }

    public Date getDate_naissance() {
        return Date_naissance;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCode_postal(String Code_postal) {
        this.Code_postal = Code_postal;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setDate_naissance(Date Date_naissance) {
        this.Date_naissance = Date_naissance;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public String toString() {
        return "Client{" + "Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", username=" + username + ", pwd=" + pwd + ", mail=" + mail + ", Code_postal=" + Code_postal + ", Adresse=" + Adresse + ", Ville=" + Ville + ", Date_naissance=" + Date_naissance + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.pwd, other.pwd)) {
            return false;
        }
        return true;
    }

    

    
    
}
