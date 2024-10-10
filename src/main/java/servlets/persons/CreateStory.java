package servlets.persons;

import beans.Story;
import dao.DAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import work.CreateStoryFormChecker;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

/**
 * Servlet pour créer une nouvelle histoire.
 */
@WebServlet(urlPatterns = "/story/create")
public class CreateStory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/createStory.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Validation du formulaire
        CreateStoryFormChecker formChecker = new CreateStoryFormChecker();
        Map<String, String> errors = formChecker.validateForm(request);

        // Si des erreurs sont présentes, on renvoie au formulaire avec les erreurs
        if (!errors.isEmpty()) {
            request.setAttribute("errors", errors);
            request.getRequestDispatcher("/WEB-INF/jsp/createStory.jsp").forward(request, response);
            return;
        }

        // Récupération des paramètres du formulaire
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        // Création d'une nouvelle instance de Story
        Story story = new Story();
        story.setTitle(title);
        story.setContent(content);
        story.setCreated(LocalDate.now()); // Définit la date de création à aujourd'hui
        story.setId_person(1L); // Remplacez par l'ID réel de l'utilisateur connecté

        // Enregistrement de l'histoire dans la base de données
        DAOFactory.getDAOStory().create(story);

        // Redirection vers la liste des histoires après création
        response.sendRedirect(getServletContext().getContextPath() + "/home");
    }
}
