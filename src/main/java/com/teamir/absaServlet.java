package com.teamir;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet("/cal")
public class absaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sen =request.getParameter("sen");
        String pet = request.getParameter("pet");
        String def = request.getParameter("def");

        ArrayList<HashMap<String, String>> output = null;
        try {
            output = Annotator.annotates(sen,pet,def);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        response.getWriter().println("Sum of " + a + " and " + b + " is " + sum) ;
        request.setAttribute("output",output);
//        request.setAttribute("b",b);
//        request.setAttribute("sum",sum);

        request.getRequestDispatcher("results.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
