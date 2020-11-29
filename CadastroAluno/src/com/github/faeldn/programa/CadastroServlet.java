package com.github.faeldn.programa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet(
		name = "/CadastroServlet",
		urlPatterns = "/cadastro"
)

public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String email 	= req.getParameter("email");
		String nome 	= req.getParameter("nome");
		String matricula = req.getParameter("matricula");
		String curso 	= req.getParameter("curso");
		String instituicao = req.getParameter("instituicao");
		
		writer.write ("Nome: " + nome + "Matricula: " + matricula + "Curso: " + curso + "Email: " + email + " Instituição: " + instituicao);
		
		writer.close();
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email 	= req.getParameter("email");
		String nome 	= req.getParameter("nome");
		String matricula = req.getParameter("maticula");
		String curso 	= req.getParameter("curso");
		String instituicao = req.getParameter("instituicao");
		
		req.setAttribute("nome", nome);
		req.setAttribute("curso", curso);
		req.setAttribute("matricula", matricula);
		req.setAttribute("email", email);
		req.setAttribute("instituicao", instituicao);
		req.getRequestDispatcher("jsp-cadastro.jsp").forward(req, resp);;
		}
	
}
