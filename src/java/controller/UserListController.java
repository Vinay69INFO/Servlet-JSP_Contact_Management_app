
package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

@WebServlet(name="UserList", urlPatterns = {"/userlist"})
public class UserListController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        UserDao userDao=new UserDaoImpl();
        List<User> userlist=userDao.findAll();
        req.setAttribute("userlist", userlist);
        System.out.println(req.getAttribute("users")+"=======User List: "+userlist);
        res.sendRedirect("userList.jsp");
    }
}
