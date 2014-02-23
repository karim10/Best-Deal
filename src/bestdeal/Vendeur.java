package bestdeal;

public class Vendeur extends Client 
{
    private int numtel;
    private int cin;

    public Vendeur(String Nom, String Prenom, String username, String pwd, String Adress,int cin,int numtel) 
    {
        super(Nom, Prenom, username, pwd, Adress);
        this.cin=cin;
        this.numtel=numtel;
    }

    public int getNumtel() 
    {
        return numtel;
    }

    public int getCin() 
    {
        return cin;
    }

    public void setNumtel(int numtel) 
    {
        this.numtel = numtel;
    }

    public void setCin(int cin) 
    {
        this.cin = cin;
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
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
        final Vendeur other = (Vendeur) obj;
        if (this.cin != other.cin)
        {
            return false;
        }
        return true;
    }
    
}
