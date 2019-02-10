package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDAO;
import com.internousdev.ecsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private ItemDAO ItemDAO = new ItemDAO();
	private ArrayList<ItemDTO> ItemList = new ArrayList<ItemDTO>();

	public String execute() throws SQLException {

			ItemList = ItemDAO.getItemInfo();

		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ItemDTO> getItemList() {
		return this.ItemList;
	}

}


