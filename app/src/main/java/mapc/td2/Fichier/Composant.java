package mapc.td2.Fichier;

public interface Composant {

    String getName();
    String getContent();
    Owner getOwner();
    int getSize();
    void appendContent();
    Owner setOwner();
    
}
