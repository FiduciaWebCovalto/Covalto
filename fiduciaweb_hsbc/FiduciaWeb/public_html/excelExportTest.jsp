<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>excelExportTest</title>
  </head>
  <body>
    
    <form action="multiSheetExcel.do" method="POST">
	<p>SQL Uno: <input type="text" name="sqlA" value="select * from EMISION" size="250" /></p>
	<p>SQL Dos: <input type="text" name="sqlB" value="select * from OPERACIO" size="250" /></p>
	<p>SQL Tres: <input type="text" name="sqlC" value="select * from ESTADOS" size="250" /></p>
	<p>Nombre Hoja Excel: <input type="text" name="sheetName" value="Data" size="50" /></p>
	<input type="submit" value="Enviar" />
    </form>
    
  </body>
</html>