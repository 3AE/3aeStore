package store.ae.pojo.mall.goods;

import java.util.Date;

public class Category {
	
	private long categoryId;
	
	private String name;
	
	private String category;
	
	private String gradeType;
	
	private String seriesType;
	
	/**
	 * 格林时间，创建日期
	 */
	private Date gmtCreate;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGradeType() {
		return gradeType;
	}

	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}

	public String getSeriesType() {
		return seriesType;
	}

	public void setSeriesType(String seriesType) {
		this.seriesType = seriesType;
	}
	

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + 
				", name=" + name + 
				", category=" + category + 
				", gradeType=" + gradeType + 
				", seriesType=" + seriesType + 
				", gmtCreate=" + gmtCreate + "]";
	}
	
}