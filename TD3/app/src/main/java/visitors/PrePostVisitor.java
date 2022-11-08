package visitors;

public interface PrePostVisitor {
    void preVisit(GroupeClient gclient);
    void preVisit(Client client);
    void preVisit(Commande cmd);
    void preVisit(Ligne ligne);
    void postVisit(GroupeClient gclient);
    void postVisit(Client client);
    void postVisit(Commande cmd);
    void postVisit(Ligne lign);

}
