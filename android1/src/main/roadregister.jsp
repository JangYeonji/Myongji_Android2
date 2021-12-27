<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import = "org.json.simple.*"%>
 <%@ page import="java.sql.*"%> 
<%

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String mail = request.getParameter("mail");
	String tel = request.getParameter("tel");
	
	Connection conn = null;
	Statement stmt = null;
	
	String url = "jdbc:mysql://localhost:3306/androiddb?serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(url, user, password);
	
		System.out.print("\n==============\n"+id+pwd+name+mail);
		
		try {
			String sql2 = "INSERT INTO user1(id, pwd, name, mail, tel) VALUES('" + id + "','" + pwd + "', '" + name +"', '" + mail +"', '"+tel+"');";
			String sql="INSERT INTO user1 (id, pwd, name) VALUES ('aaa', 'abc', '관리자');";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql2);
			out.println("Member 테이블 삽입이 성공했습니다.");
		} catch (SQLException ex) {
			out.println("Member 테이블 삽입이 실패했습니다.");
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
%>
