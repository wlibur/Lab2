<%@page language="java" import="java.util.*" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%> 
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="Methods.method_Book,Book.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'BookList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  	<s:form action="find.action" method="post">
  		<s:textfield name="Name"/>
  		<s:submit value="查询"/>
  	</s:form>
  
  	<table align="center" width="600" border="1">
    <tr> 
    <td align="center" colspan="8" class="br_head">
    	<h2>图书管理系统<h2>
    </td>	
    </tr>
    </table>
    
    <table align="center"  width="600" border="1">
    <tr>
    	<td align="right"><b><a href="Add.action">添加</a></b></td>
    </tr>
    </table>
  
    <table align="center" width="600" border="1">
    <tr> 
    <td align="center" colspan="8" class="br_head">
    	<b>图书馆书籍信息<b>
    </td>	
    </tr>
    
    <tr align="center" >

    	<td><b>图书编号</b></td>
    	<td><b>图书名称</b></td>
    	<td><b>作者编号</b></td>
    	<td><b>出版社</b></td>
    	<td><b>出版日期</b></td>
    	<td><b>价格</b></td>
    	<td colspan="2"><b>功能操作</b></td>

    </tr>
    
    <s:iterator value="List_B">  
                <tr class="br_TR">  
 					
                    <td align="center"><s:property value="ISBN" /></td> 
                    <td align="center"><a href="detail.action?AutherID=<s:property value="AutherID"/>"><s:property value="Title" /></a></td>   
                    <td align="center"><s:property value="AutherID"/></td>
                    <td align="center"><s:property value="Publisher" /></td>  
                    <td align="center"><s:property value="PublishDate" /></td>  
                    <td align="center"><s:property value="Price" /></td>
                  	<td align="center"><a href="toupdate.action?ISBN=<s:property value="ISBN"/>">更新</a></td>
                    <td align="center"><a href="delete.action?ISBN=<s:property value="ISBN"/>">删除</a></td>
                </tr>  
     </s:iterator>  
    
    
    
    </table>
  </body>
</html>
