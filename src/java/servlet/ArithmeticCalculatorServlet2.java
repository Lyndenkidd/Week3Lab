/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lynde
 */
public class ArithmeticCalculatorServlet2 extends HttpServlet {

     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      String firstNumber = request.getParameter("firstnum");
      
      String secondNumber = request.getParameter("secondnum");
      
      request.setAttribute("firstnum", firstNumber);
       request.setAttribute("secondnum", secondNumber);
       
       
       if (firstNumber == null || firstNumber.equals("") || secondNumber == null
              || secondNumber.equals("")){
             request.setAttribute("returnStatement", "Invalid Number(s)");
           
       } else if (request.getParameter("button").equals("+")){
           
           int num1 = Integer.parseInt(firstNumber);
           int num2 = Integer.parseInt(secondNumber);
           int value;
          value = num1 + num2;
          
          request.setAttribute("returnStatement", "Result: " + value);
           
           
         
       } else if (request.getParameter("button").equals("-")){
           
           int num1 = Integer.parseInt(firstNumber);
           int num2 = Integer.parseInt(secondNumber);
           int value;
          value = num1 - num2;
          
          request.setAttribute("returnStatement", "Result: " + value);
          
            } else if (request.getParameter("button").equals("*")){
           
           int num1 = Integer.parseInt(firstNumber);
           int num2 = Integer.parseInt(secondNumber);
           int value;
          value = num1 * num2;
          
          request.setAttribute("returnStatement", "Result: " + value);
          
             } else if (request.getParameter("button").equals("%")){
           
           int num1 = Integer.parseInt(firstNumber);
           int num2 = Integer.parseInt(secondNumber);
           int value;
          value = num1 % num2;
          
          request.setAttribute("returnStatement", "Result: " + value);
             }
      
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);
          return;
      
      
    }
}
 