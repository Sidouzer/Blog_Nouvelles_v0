package work;

import jakarta.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CreateStoryFormChecker {

    /**
     * Vérifie les données du formulaire de création d'une histoire.
     *
     * @param request La requête HTTP contenant les paramètres du formulaire.
     * @return Un map contenant les erreurs, si des erreurs existent.
     */
    public Map<String, String> validateForm(HttpServletRequest request) {
        Map<String, String> errors = new HashMap<>();

        // Vérifier le titre
        String title = request.getParameter("title");
        if (title == null || title.trim().isEmpty()) {
            errors.put("title", "Le titre ne peut pas être vide.");
        } else if (title.length() > 100) { // Limite de 100 caractères pour le titre
            errors.put("title", "Le titre ne doit pas dépasser 100 caractères.");
        }

        // Vérifier le contenu
        String content = request.getParameter("content");
        if (content == null || content.trim().isEmpty()) {
            errors.put("content", "Le contenu ne peut pas être vide.");
        } else if (content.length() > 2000) { // Limite de 2000 caractères pour le contenu
            errors.put("content", "Le contenu ne doit pas dépasser 2000 caractères.");
        }

        return errors;
    }
}
