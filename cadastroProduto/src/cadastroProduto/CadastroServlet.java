package cadastroProduto;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Cadastro Servlet", urlPatterns = "/cadastro")
public class CadastroServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String cod = req.getParameter("cod");
		String descricao = req.getParameter("descricao");
		String valor = req.getParameter("valor");
		
		System.out.println("Insert into produtos(CODIGO,DESCRICAO,VALOR) values("+cod+","+descricao+","+valor+")");

		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.println("<h3>Produto Cadastrado com Sucesso</h3>");
		writer.println("<ul>");
		writer.println("<li>Código: " + cod + "</li>");
		writer.println("<li>Descrição: " + descricao + "</li>");
		writer.println("<li>Valor: " + valor + "</li>");
		writer.println("</ul>");

	}
}
