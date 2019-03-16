package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.User;



@WebServlet("/UserControl")
public class UserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
 		if(request.getParameter("username").equals("pasan") && request.getParameter("userpassword").equals("pasan123")){
 			
 			System.out.println("Successfully login to the system");
 			
 			//User user1 = new User();
 			
 	 		//user1.setUsername( request.getParameter("username")); 
 	 		//user1.setPassword( request.getParameter("userpassword"));
 	 		
 	 		
 	 			
 		}
 		else{
 			System.out.println("Please enter valid username and password");
 		}
 		
 		
		
	}

}
