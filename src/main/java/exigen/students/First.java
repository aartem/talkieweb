package exigen.students;

import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
import exigen.students.DefaultReplyGenerator;

public class First extends HttpServlet {

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

        ReplyGenerator rg = new DefaultReplyGenerator();

        PrintWriter writer = response.getWriter();

        String q = request.getParameter("q");

        writer.println("<html><body>");

        if (q != null) {
            writer.println("Answer: " + rg.generate() + "<br>");
        }

        writer.println("<input type=\"text\" id=\"request\" name=\"request\" value=\"\">\n");
        writer.println("<button onclick=\"window.location=window.location.pathname+'?q='+document.getElementById('request').value;\">Submit</button>");
        writer.println("</body></html>");
        writer.close();

    }
}