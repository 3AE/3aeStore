package store.ae.vo.mall.goods.category;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class CategoryVo {
	
	@SerializedName("name")
	private String categoryName;
	
	@SerializedName("type")
	private long categoryType;
}