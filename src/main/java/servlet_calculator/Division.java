package servlet_calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/div")
public class Division extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double num1=Double.parseDouble(req.getParameter("num1"));
	int num2=Integer.parseInt(req.getParameter("num2"));
	resp.getWriter().print("<h1 style='color:blue'>The Division of "+num1+" and "+num2+" is "+(num1/num2));
}
}
