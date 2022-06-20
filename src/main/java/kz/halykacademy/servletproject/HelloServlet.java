package kz.halykacademy.servletproject;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/user")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String position = request.getParameter("position");

        out.println("<html><body>");
        out.println("Post request<br />");
        out.printf("<h3>Name of employee %s, position %s</h3>", name, position);
        out.println("</body></html>");

        out.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String position = request.getParameter("position");

        out.println("<html><body>");
        out.println("Get request<br />");
        out.printf("<h3>Name of employee %s, position %s</h3>", name, position);
        out.println("</body></html>");

        out.close();
    }

    public void destroy() {
    }
}