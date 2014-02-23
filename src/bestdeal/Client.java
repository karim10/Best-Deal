package bestdeal;

import java.util.Objects;

public class Client
{
    private String Nom;
    private String Prenom;
    private String username;
    private String pwd;
    private String mail;

    public Client(String Nom, String Prenom, String username, String pwd, String mail) 
    {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.username = username;
        this.pwd = pwd;
        this.mail = mail;
    }
    public void setNom(String Nom) 
    {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) 
    {
        this.Prenom = Prenom;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setPwd(String pwd) 
    {
        this.pwd = pwd;
    }

    public void setAdress(String mail) 
    {
        this.mail = mail;
    }

    public String getNom() 
    {
        return Nom;
    }

    public String getPrenom() 
    {
        return Prenom;
    }

    public String getUsername() 
    {
        return username;
    }

    public String getPwd()
    {
        return pwd;
    }

    public String getMail() 
    {
        return mail;
    }
    @Override
    public int hashCode() 
    {
        int hash = 3;
        return hash;
    }
    @Override
    public boolean equals(Object obj) 
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.Nom, other.Nom)) {
            return false;
        }
        if (!Objects.equals(this.Prenom, other.Prenom)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }  
}
