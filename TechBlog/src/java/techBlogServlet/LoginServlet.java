package techBlogServlet;

import techBlogDatabase.UserDao;
import techBlogEntity.Message;
import techBlogEntity.User;
import techBlogHelper.ConnectionProvider;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                        
            String username = request.getParameter("email");
            String userpassword = request.getParameter("password");
            
            UserDao dao = new UserDao(ConnectionProvider.getConnection());
            User u = dao.getUserByEmailAndPassword(username, userpassword);
            if(u==null)
            {
                Message msg = new Message("Invalid email and password","error","alert-danger");
                HttpSession ses = request.getSession();
                ses.setAttribute("msg", msg);
                response.sendRedirect("LoginPage.jsp");
            }
            else
            {
                HttpSession ses = request.getSession();
                ses.setAttribute("currentUser", u);
                response.sendRedirect("profile.jsp");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
