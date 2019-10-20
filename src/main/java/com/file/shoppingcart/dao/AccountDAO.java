package com.file.shoppingcart.dao;

import com.file.shoppingcart.entity.Account;

public interface AccountDAO {
	
    public Account findAccount(String userName );
    
}