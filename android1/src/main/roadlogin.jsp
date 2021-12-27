<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="java.sql.*"%> 

<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
		
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;			
	
	String url = "jdbc:mysql://localhost:3306/androiddb?serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(url, user, password);

	System.out.print("\nlogin.jsp==============\n"+id+pwd);
		
	try {
		String sql = "select name from user1 where id='" + id +"' and pwd='" + pwd +"';";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

		if (rs.next()) {
			out.print(rs.getString("name"));
			System.out.print(rs.getString("name"));
		}else{
			out.print("아이디비번확인");
			System.out.print(rs.getString("아이디비번확인"));
		}
	} catch (SQLException ex) {
		out.println("Member 테이블 호출이 실패했습니다.<br>");
		out.println("SQLException: " + ex.getMessage());
	} finally {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
%>