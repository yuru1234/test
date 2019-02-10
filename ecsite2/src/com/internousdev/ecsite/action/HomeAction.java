package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDAO;
import com.internousdev.ecsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private ItemDAO ItemDAO = new ItemDAO();
	private ArrayList<ItemDTO> ItemList = new ArrayList<ItemDTO>();

	public String execute() throws SQLException {
		String result = "login";
		if(session.containsKey("id")) {

			ItemList = ItemDAO.getItemInfo();

		    result = SUCCESS;
		}
		return result;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public ArrayList<ItemDTO> getItemList() {
		return ItemList;
	}

}
