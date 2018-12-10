package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name, String password) throws SQLException {
		LoginDTO dto = new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "select * from user where user_name=? and password=?";

	try {
		PreparedStatement ps = con.prepareStatement(sql);

//	SQL分の「？」パラメータに指定した値を挿入する
		ps.setString(1, name);
		ps.setString(2, password);
//	SQL文実行
		ResultSet rs = ps.executeQuery();

//	select文でDBから取得した情報をDTOクラスに格納する
		if(rs.next()) {
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}
	} catch(SQLException e){
		e.printStackTrace();

//　必ず実行する処理
//　DB接続を切断する
	} finally{
		con.close();
	}

	return dto;
	}

}
