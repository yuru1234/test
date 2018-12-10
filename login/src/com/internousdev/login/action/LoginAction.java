package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String name;
	private String password;

//	実行するメソッドは、struts.xmlで指定したメソッド名を使用して実装する。(execute)
//  Struts2ではアクションの処理結果でページの遷移先を決定する
	public String execute() throws SQLException {
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

//「DAOクラス」を呼び出してDBに接続する
//今回はユーザーが入力した「ログインID」と「パスワード」に一致する情報があるか検索する
		dto = dao.select(name, password);
		if(name.equals(dto.getName())) {
			if(password.equals(dto.getPassword())) {
				ret = SUCCESS;
			}
		}
		return ret;
	}

//名前を取得します。
// Struts2がフォームに入力された値をパラメータとして処理する際、
// getterを使用するため、パラメータとして使用したい情報は、
// Actionクラスのプロパティとして宣言しておき、getterを用意する。
	public String getName() {
		return name;
	}

//	名前を設定します。
//  getter同様、ページ間で受け渡したい値はsetterを用意しておく。
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
