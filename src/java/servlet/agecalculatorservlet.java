
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lynden
 */
public class agecalculatorservlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String age = request.getParameter("age");
      request.setAttribute("Age", age);
      
      if (age == null || age.equals("")){
          
          request.setAttribute("returnStatement", "Please enter a valid age");
          
      }
      else{
            int parsedAge = Integer.parseInt(age);
            int nextBirthday = parsedAge + 1;
            
            request.setAttribute("returnStatement", "your next birthday will be " + nextBirthday);
                  
      }
          
          
          
          
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
          return;
          
      }      
    }

 

