package com.file.shoppingcart.dao;

import java.util.List;

import com.file.shoppingcart.model.CartInfo;
import com.file.shoppingcart.model.OrderDetailInfo;
import com.file.shoppingcart.model.OrderInfo;
import com.file.shoppingcart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}