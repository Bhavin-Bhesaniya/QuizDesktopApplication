package techBlogServlet;

import techBlogDatabase.UserDao;
import techBlogEntity.Message;
import techBlogEntity.User;
import techBlogHelper.ConnectionProvider;
import techBlogHelper.Helper;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@MultipartConfig
public class EditServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditServlet</title>");
            out.println("</head>");
            out.println("<body>");

//            fetch all data
            String userName = request.getParameter("user_name");
            String userPass = request.getParameter("user_password");
            String userAbout = request.getParameter("user_about");
            Part part = request.getPart("updateImage");
            String imgName = part.getSubmittedFileName();

//        get the user from seesion
            HttpSession s = request.getSession();
            User user = (User) s.getAttribute("currentUser");
            user.setname(userName);
            user.setemail(userPass);
            user.setabout(userAbout);
            String oldFile = user.getprofile();

            user.setprofile(imgName);

            //update in database
            UserDao userDao = new UserDao(ConnectionProvider.getConnection());
            boolean ans = userDao.updateUser(user);

            if (ans) {

                String path = request.getRealPath("/") + "pics" + File.separator + user.getprofile();

                String oldPathFile = request.getRealPath("/") + "pics" + File.separator + oldFile;
                if (!oldFile.equals("default.png")) {
                    Helper.deleteFile(oldPathFile);
                }

                if (Helper.saveFile(part.getInputStream(), path)) {
                    out.println("Updated Successfully");
                    Message msg = new Message("Profile Updates", "success", "alert-success");
                    s.setAttribute("msg", msg);

                }

            } else {
                out.println("Not Updated");
                Message msg = new Message("Something Gone Wrong", "error", "alert-danger");
                s.setAttribute("msg", msg);
            }
            response.sendRedirect("profile.jsp");

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
