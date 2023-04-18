package com.bookShop01.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.bookShop01.order.vo.OrderVO;

@Mapper
@Repository("orderDAO")
public interface OrderDAO {
	public List<OrderVO> listMyOrderGoods(OrderVO orderVO) throws DataAccessException;
	public void insertNewOrder(List<OrderVO> myOrderList) throws DataAccessException;
	public OrderVO findMyOrder(String order_id) throws DataAccessException;
	public void removeGoodsFromCart(List<OrderVO> myOrderList)throws DataAccessException;
	public int selectOrderID() throws DataAccessException;
}
