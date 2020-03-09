package com.gmail.sergick6690;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AnketaServlet extends HttpServlet {
   private static final String html = "<html>" +
            "<head><title>Anketa</title></head>" +
            "<body  ><h1 align = \"center\">Your Anketa</h1>" +
            "<p size= \"20\">%s</p></body></html>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Your name: " +req.getParameter("name")+"<br>");
        sb.append("Your last name: "+req.getParameter("lastName")+"<br>");
        sb.append( "Your age: " +  req.getParameter("age")+"<br>");
        sb.append("Your country: " + req.getParameter("country")+"<br>");
        sb.append( "Do you like Java: " + req.getParameter("java")+"<br>");
        String anketa= sb.toString();

        resp.getWriter().println(String.format(html, anketa));

    }
}
