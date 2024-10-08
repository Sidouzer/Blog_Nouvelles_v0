package dao;

import beans.Story;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOStory extends DAO<Story> {

    // Constructeur, on passe le nom de la table en paramètre
    public DAOStory() {
        super("stories"); // "stories" correspond à votre table dans la BDD
    }

    // Méthode pour créer un objet Story à partir du ResultSet
    @Override
    protected Story createObject(ResultSet rs) {
        Story story = null;
        try {
            story = new Story();
            story.setId(rs.getLong("id_story"));
            story.setTitle(rs.getString("title"));
            story.setContent(rs.getString("content"));
            story.setCreated(rs.getDate("created").toLocalDate());
            story.setId_person(rs.getLong("id_person"));
        } catch (SQLException ex) {
            Logger.getLogger(DAOStory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return story;
    }

    // Méthode pour créer une nouvelle entrée dans la base de données
    @Override
    protected void create(Story story) {
        try {
            String req = "INSERT INTO " + table
                + " (title, content, created, id_person)"
                + " VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = this.connection.prepareStatement(
                    req, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, story.getTitle());
            pstmt.setString(2, story.getContent());
            pstmt.setDate(3, Date.valueOf(story.getCreated())); // Conversion LocalDate -> Date SQL
            pstmt.setLong(4, story.getId_person());

            // Exécution de la requête
            pstmt.executeUpdate();

            // Récupération de l'id généré
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                long lastInsertedId = rs.getLong(1);
                story.setId(lastInsertedId); // On assigne l'ID généré à l'objet Story
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOStory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Méthode pour mettre à jour une entrée dans la base de données
    @Override
    protected void update(Story story) {
        try {
            String req = "UPDATE " + table
                + " SET title = ?, content = ?, created = ?, id_person = ?"
                + " WHERE id_story = ?";
            PreparedStatement pstmt = this.connection.prepareStatement(req);
            pstmt.setString(1, story.getTitle());
            pstmt.setString(2, story.getContent());
            pstmt.setDate(3, Date.valueOf(story.getCreated()));
            pstmt.setLong(4, story.getId_person());
            pstmt.setLong(5, story.getId());

            // Exécution de la requête de mise à jour
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOStory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Story find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
