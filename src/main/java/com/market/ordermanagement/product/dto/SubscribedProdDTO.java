package com.market.ordermanagement.product.dto;


import com.market.ordermanagement.product.entity.SubscribedProd;

public class SubscribedProdDTO {

	
	String buyerid;
	String prodid;
	Integer quantity;
	public String getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public SubscribedProdDTO() {
		super();

	}
	public SubscribedProdDTO(String buyerid, String prodid, Integer quantity) {
		this();
		this.buyerid = buyerid;
		this.prodid = prodid;
		this.quantity = quantity;
	}
	// Converts Entity into DTO
		public static SubscribedProdDTO valueOf(SubscribedProd subscribedprod) {
			SubscribedProdDTO subscribedprodDTO = new SubscribedProdDTO();
			subscribedprodDTO.setBuyerid(subscribedprod.getBuyerid());
			subscribedprodDTO.setProdid(subscribedprod.getProdid());
			subscribedprodDTO.setQuantity(subscribedprod.getQuantity());
			return subscribedprodDTO;
		}
	@Override
	public String toString() {
		return "SubscribedProdDTO [buyerid=" + buyerid + ", prodid=" + prodid + ", quantity=" + quantity + "]";
	}
	
}
