import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="helloservlet", urlPatterns = "/helloservlet.php")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nama = request.getParameter("nama");
        String asal = request.getParameter("asal");

        String output = "<html>"
                +"<head>"
                +"<title>Hello Servlet</title>"
                +"</head>"
                +"<body>"
                +"<h2>Hello "+nama+"</h2>"
                +"<p>Apakah kamu berasal dari "+asal+"?</p>"
                +"</body>"
                +"</html>";

        response.setContentType("text/html");
        response.getWriter().print(output);
    }

}
