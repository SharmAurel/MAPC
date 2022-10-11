package mapc.td2.Fichier;

public class ComposantImpl implements Composant{

    String name;
    Owner owner;

    public ComposantImpl(String name,Owner owner) {
        this.name = name;
        this.owner = owner;
    }


    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getContent() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Owner getOwner() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void appendContent() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Owner setOwner() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
