<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page 
 	import="java.util.ArrayList" 
	import="model.Crianca"
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Dados da Crianca</h1>
	<form action="HandlerCrianca" method="post">
		<label>Nome: 
			<input type="text" name="nome"/>
		</label>
		<label>Data Nascimento: 
			<input type="text" name="dNascimento"/>
		</label>
		<label>Cartao Cidadao: 
			<input type="text" name="cCidadao"/>
		</label>
		<label>Observacoes:
			<textarea rows="4" cols="10" name="observacoes"></textarea>
		</label>
		<input type="submit" value="Enviar"/>
	</form>
	<br>
	<h1>LISTA CRIANCAS</h1><br>
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>Data Nascimento</th>
			<th>Cartao Cidadao</th>
			<th>Observacoes</th>
		</tr>
		<%
			ArrayList arC = (ArrayList) request.getAttribute("ListaCriancas");
			for(int i=0;i<arC.size();i++){
				Crianca c= (Crianca) arC.get(i);
				out.append("<tr><td>"+c.getNome()+"</td><td>"+c.getData()+"</td>"+
					"<td>"+c.getCartaoCidadao()+"</td><td>"+c.getObservacao()+"</td></tr>");
			}
		%>
	</table>
</body>
</html>