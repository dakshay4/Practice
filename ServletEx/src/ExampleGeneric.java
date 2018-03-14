import java.io.*;
import javax.servlet.*;

public class ExampleGeneric extends GenericServlet{
 public void service(ServletRequest req,ServletResponse res)
throws IOException,ServletException{
   res.setContentType("text/html");
   PrintWriter pwriter=res.getWriter();
   pwriter.print("<html>");
   pwriter.print("<body>");
   pwriter.print("<h2>Generic Servlet Example</h2>");
   pwriter.print("<p>Hello!</p>");
   pwriter.print("</body>");
   pwriter.print("</html>");
 }
}