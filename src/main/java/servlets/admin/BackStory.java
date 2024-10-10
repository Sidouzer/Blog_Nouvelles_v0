package servlets.admin;

import dao.DAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Herbert Caffarel
 */
@WebServlet(urlPatterns = "/back/articles")
public class BackStory extends HttpServlet {

    private final String VIEW = "/WEB-INF/jsp/back/articles.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute(
            "articles", DAOFactory.getDAOStory().all()
        );
        getServletContext().getRequestDispatcher(VIEW)
            .forward(request, response);
    }

}
