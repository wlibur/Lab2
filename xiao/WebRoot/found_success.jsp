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
  
  
  
 
    
    <table align="center" width="600" border="1">
    <tr> 
    <td align="center" colspan="6" class="br_head">
    	<b>��ѯ�������Ϣ����<b>
    </td>	
    </tr>
    
    <tr align="center" >
    	<td><b>ͼ����</b></td>
    	<td><b>ͼ������</b></td>
    	<td><b>������</b></td>
    	<td><b>��������</b></td>
    	<td><b>�۸�</b></td>

    </tr>
    
    <s:iterator value="list_F">  
                <tr class="br_TR">  
                    <td align="center"><s:property value="ISBN" /></td> 
                    <td align="center"><a href="detail.action?AutherID=<s:property value="AutherID"/>"><s:property value="Title" /></a></td>   
                    <td align="center"><s:property value="Publisher" /></td>  
                    <td align="center"><s:property value="PublishDate" /></td>  
                    <td align="center"><s:property value="Price" /></td>
                </tr>  
     </s:iterator>  
    
    
    
    </table>
    <table align="center" width="600" border="1">
    	<tr align="center"><td align="center"><a href="bookshow.action"><b>������ҳ</b></a></td></tr>
    
     </table>
  </body>
</html>
