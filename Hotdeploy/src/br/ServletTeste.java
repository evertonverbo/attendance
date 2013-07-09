package br;

import java.io.File;
import java.io.IOException;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTeste extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		File file = new File("C://Users//everton.farias//Desktop//arquivo//arquivo_novo.txt");
		file.createNewFile();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		File file = new File("C://Users//everton.farias//Desktop//arquivo//arquivo_novo.txt");
		file.createNewFile();
		
	}
	
}
