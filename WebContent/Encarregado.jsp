<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page 
 	import="java.util.ArrayList" 
	import="model.Encarregado"
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Dados do Encarregado</h1>
	<form action="HEncarregado" method="post">
		<label>Nome: 
			<input type="text" name="nome"/>
		</label>
		<label>Data Nascimento: 
			<input type="text" name="dNascimento"/>
		</label>
		<label>Cartao Cidadao: 
			<input type="text" name="cCidadao"/>
		</label>
		<label>Contacto:
			<input type="text" name="contacto"/>
		</label>
		<label>Contacto Alternativo:
			<input type="text" name="contactoAlt"/>
		</label>
		<input type="submit" value="Enviar"/>
	</form>
	<br>
	<h1>LISTA ENCARREGADOS</h1><br>
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>Data Nascimento</th>
			<th>Cartao Cidadao</th>
			<th>Contacto</th>
			<th>Contacto Alternativo</th>
		</tr>
		<%
			ArrayList arE = (ArrayList) request.getAttribute("ListaEncarregados");
			for(int i=0;i<arE.size();i++){
				Encarregado e= (Encarregado) arE.get(i);
				out.append("<tr><td>"+e.getNome()+"</td><td>"+e.getData()+"</td>"+
					"<td>"+e.getCartaoCidadao()+"</td><td>"+e.getContacto()+"</td>"+
					"<td>"+e.getAltContacto()+"</td></tr>");
			}
		%>
	</table>
</body>
</html>