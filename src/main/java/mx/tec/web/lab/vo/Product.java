package mx.tec.web.lab.vo;

import java.util.List;

public class Product {
	private String  id;
	private String name;
	private String description;
	private String largeImgUrl;
	private String mediumImgUrl;
	private String smallImgUrl;
	private List<Sku> childSkus;
	
	/**
	 * 
	 */
	public Product() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param largeImgUrl
	 * @param mediumImgUrl
	 * @param smallImgUrl
	 * @param childSkus
	 */
	public Product(String id, String name, String description, String largeImgUrl, String mediumImgUrl, String smallImgUrl, List<Sku> childSkus) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.childSkus = childSkus;
		this.largeImgUrl = largeImgUrl;
		this.mediumImgUrl = mediumImgUrl;
		this.smallImgUrl = smallImgUrl;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the largeImgUrl
	 */
	public String getLargeImgUrl() {
		return largeImgUrl;
	}

	/**
	 * @param largeImgUrl the largeImgUrl to set
	 */
	public void setLargeImgUrl(String largeImgUrl) {
		this.largeImgUrl = largeImgUrl;
	}

	/**
	 * @return the mediumImgUrl
	 */
	public String getMediumImgUrl() {
		return mediumImgUrl;
	}

	/**
	 * @param mediumImgUrl the mediumImgUrl to set
	 */
	public void setMediumImgUrl(String mediumImgUrl) {
		this.mediumImgUrl = mediumImgUrl;
	}

	/**
	 * @return the smallImgUrl
	 */
	public String getSmallImgUrl() {
		return smallImgUrl;
	}

	/**
	 * @param smallImgUrl the smallImgUrl to set
	 */
	public void setSmallImgUrl(String smallImgUrl) {
		this.smallImgUrl = smallImgUrl;
	}

	/**
	 * @return the childSkus
	 */
	public List<Sku> getChildSkus() {
		return childSkus;
	}
	
	/**
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(List<Sku> childSkus) {
		this.childSkus = childSkus;
	}
	
}
