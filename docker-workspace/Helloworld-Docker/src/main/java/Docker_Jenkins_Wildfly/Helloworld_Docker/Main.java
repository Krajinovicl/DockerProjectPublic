package Docker_Jenkins_Wildfly.Helloworld_Docker;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * <p>
 * The servlet is registered and mapped to /HelloServlet using the HttpServlet.
 * </p>
 */
@SuppressWarnings("serial")
@WebServlet("/HelloWorld")
public class Main extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";

    static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);
        writer.println("<h1>Hello World!</h1>");
        writer.println(PAGE_FOOTER);
        writer.close();
    }

}