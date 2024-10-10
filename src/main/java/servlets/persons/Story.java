package servlets.persons;

import dao.DAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * authors: Sid et Florine
 *
 */
@WebServlet(urlPatterns = "/stories")
public class Story extends HttpServlet {
//    Long id;
//    int quality;
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private final String VIEW = "/WEB-INF/jsp/back/story.jsp";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setAttribute("stories", DAOFactory.getDAOStory().all());
        getServletContext()
                .getRequestDispatcher(VIEW)
                .forward(request, response);
    }
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Récupération de la liste des histoires depuis la base de données
//        Collection<beans.Story> stories = DAOFactory.getDAOStory().all();
//        String idParam = request.getParameter("id");
//        try {
//            id = Long.valueOf(idParam);
//        } catch (NumberFormatException ex) {
//            id = null;
//        }
//        if (id != null) {
//            request.setAttribute(
//                "quality",
//                DAOFactory.getDAOVote().findByQuality(0));
//            // Ajout de la liste des histoires à l'objet request
//            request.setAttribute("stories", stories);
//        }
//        getServletContext().getRequestDispatcher(VIEW)
//            .forward(request, response);
//        request.getRequestDispatcher("/WEB-INF/jsp/story.jsp").forward(request, response);
//    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
//        throws ServletException, IOException {
//        //je veux que mon dopost renvoi mon vote.quality dans countLikeByIdStory
//        // mon countLikeByIdStory enregiste le nombre de votes
//        //il prend le nombre de Like(quality 1) et divise le nb de Like par le nb de votes
//        int totalLikes = DAOVote.countLikeByIdStory(id, quality);
//
//        }
//    }
}
