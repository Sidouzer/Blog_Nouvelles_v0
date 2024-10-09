package servlets.persons;   //SID

import dao.DAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Servlet pour afficher la liste des histoires.
 */
@WebServlet(urlPatterns = "/stories")
public class Story extends HttpServlet {
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
        // Récupération de la liste des histoires depuis la base de données
        Collection<beans.Story> stories = DAOFactory.getDAOStory().all();

        // Ajout de la liste des histoires à l'objet request
        request.setAttribute("stories", stories);

        // Redirection vers la page JSP pour afficher les histoires
        request.getRequestDispatcher("/WEB-INF/jsp/story.jsp").forward(request, response);
    }
}
