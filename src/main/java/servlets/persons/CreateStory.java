package servlets.persons;

import beans.Story;
import dao.DAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Servlet pour créer une nouvelle histoire.
 */
@WebServlet(urlPatterns = "/story/create")
public class CreateStory extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Redirige vers la page JSP de création d'une nouvelle histoire
        request.getRequestDispatcher("/WEB-INF/jsp/createStory.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Récupération des paramètres du formulaire
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        // Création d'une nouvelle instance de Story
        Story story = new Story();
        story.setTitle(title);
        story.setContent(content);
        story.setCreated(LocalDate.now()); // Définit la date de création à aujourd'hui
        story.setId_person(1L);

        // Enregistrement de l'histoire dans la base de données
        DAOFactory.getDAOStory().create(story);

        // Redirection vers la liste des histoires après création
        response.sendRedirect(
            getServletContext().getContextPath() + "/back/story");
    }
}
