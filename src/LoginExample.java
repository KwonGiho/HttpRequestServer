

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginExample
 */
public class LoginExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login - post");
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		String id = request.getParameter("id");
		PrintWriter pw = response.getWriter();
		pw.write(id);
		pw.flush();
		pw.close();
		
	}

}
