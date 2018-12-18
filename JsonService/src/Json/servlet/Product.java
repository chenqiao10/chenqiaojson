package Json.servlet;

import java.io.Serializable;

public class Product implements Serializable{
	String title;//����
	 String desc;//��Ʒ���
	 double price;//����
	 String imgUrl;
	public Product(String title,String desc,double price,String imgUrl){
		this.desc = desc;
		this.title = title;
		this.price = price;
		this.imgUrl=imgUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	 
}
