package interfaces;

/**
 *
 * @author stag
 * @param <T>
 */
public interface Crudable<T> {
    /**
     * Permet de récupérer un objet via son ID. C'est "l'hydratation"
     *
     * @param id: l'id de l'enregistrement dans la BD
     * @return Un objet hydraté depuis la BD
     */
    public abstract T find(Long id);

    /**
     * Permet de persister un enregistrement dans la base de données
     * correspondant à l'objet passé en paramètre
     *
     * @param obj: l'objet représentant l'enregistrement à insérer dans la BD
     */
    public abstract void persist(T obj);

    /**
     * Permet la suppression d'une entrée de la BD
     *
     * @param obj: L'objet à supprimer dans la BD
     */
    public abstract void delete(T obj);
}
