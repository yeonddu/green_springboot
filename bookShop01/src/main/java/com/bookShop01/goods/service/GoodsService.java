package com.bookShop01.goods.service;

import java.util.List;
import java.util.Map;

import com.bookShop01.goods.vo.GoodsVO;


public interface GoodsService {
	
	/*��ǰ�˻� �߰�*/
	public List<GoodsVO> sortByGoods(String goodsSort) throws Exception;
	public Map<String,List<GoodsVO>> listGoods() throws Exception;
	public Map goodsDetail(String _goods_id) throws Exception;
	
	public List<String> keywordSearch(String keyword) throws Exception;
	public List<GoodsVO> searchGoods(String searchWord) throws Exception;
}
