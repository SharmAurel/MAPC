package visitors;

public interface Visitor {

    void visit(GroupeClient gclient);
    void visit(Client client);
    void visit(Commande cmd);
    void visit(Ligne lign);
    
}
