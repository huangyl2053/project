package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.eclipse.egit.github.core.client.GitHubClient;;

public class dbLinkController {
	Statement _Stmt;
	Connection _Conn;

	public Statement getStatement(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/nature";
			_Conn = DriverManager.getConnection(url,"root","");
			_Stmt = _Conn.createStatement(); 
			GitHubClient GitHubClient=new GitHubClient();
			GitHubClient.setUserAgent("");
			return _Stmt;
		}catch(Exception e1){
			System.out.print("数据库连接失败。");
			return null;
		}
	}
}
