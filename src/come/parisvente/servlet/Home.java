package come.parisvente.servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String FILENAME = "C:\\Users\\Administrateur\\Desktop\\4eme_intervenant\\JeeCool\\TomCatProjet8.5\\WebContent\\WEB-INF\\articles.txt";

		
    public Home() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String setlist=  readfile(request, response);
		
		request.setAttribute("Liste", setlist);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}



public static String readfile(HttpServletRequest request, HttpServletResponse response) {


String html = null;;

	try {
		List<String> allLines= Files.readAllLines(Paths.get(FILENAME));
			for (String line : allLines) {
				
				String[] arr = line.split("\\|");
				 
				//System.out.println(line);
				 html += "<article><h4>" +arr[1]+ "</h4><fieldset disabled=\"disabled\"><figure><a href=\""+request.getContextPath()+"/Article?id="+arr[0]+"\"><img src=\"";
				 html += request.getContextPath() +"/img/"+ arr[2]+ "\"alt=\"\"></a></figure><figcaption>";
				 html += arr[3]+ "</figcaption></fieldset><span name=\"prix1\">";
				 html += arr[4]+ "</span></article>";
				 

				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	return html;

}
}
