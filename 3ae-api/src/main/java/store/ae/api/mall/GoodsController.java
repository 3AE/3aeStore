package store.ae.api.mall;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import store.ae.dto.mall.goods.CategoryExposer;
import store.ae.pojo.mall.goods.Brand;
import store.ae.pojo.mall.goods.Goods;
import store.ae.pojo.mall.goods.GoodsEvaluate;
import store.ae.pojo.mall.goods.GoodsSku;
import store.ae.service.mall.goods.GoodsService;
import store.ae.vo.mall.goods.category.CategoryVo;

@Controller
@RequestMapping("/goods") // url:/模块/资源/{id}/细分
public class GoodsController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(value = "/category", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public CategoryExposer categorieList() {
		
		CategoryExposer result;
		
		List<CategoryVo> categoryVoList = goodsService.getCategoryList();
		
		try {
			if(null == categoryVoList || categoryVoList.size() ==0 ){
				return new CategoryExposer(-1, "数据库数据为空");
			}

			result = new CategoryExposer(0, "成功", categoryVoList);
		} catch (Exception e) {
			logger.info("【商品管理】类目列表获取失败: "+ e.getMessage());
			result = new CategoryExposer(-1, "失败");
		}
		return result;
	}
	
	
	
	@RequestMapping(value = "/list/{category}/{offset}/{limit}", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public List<Goods> goodsListByCategory(@PathVariable("category") Long category,
										   @PathVariable("offset") int offset,
										   @PathVariable("limit") int limit) {
		// 获取列表json

		return goodsService.getGoodsListByCategory(category, offset, limit);
	}
	
	@RequestMapping(value = "/brand", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public List<Brand> brandList() {
		// 获取列表json

		return goodsService.getBrandList();
	}
	
	
	
	@RequestMapping(value = "/list/{brandId}/{offset}/{limit}", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public List<Goods> goodsListByBrand(@PathVariable("brandId") Long brandId,
										   @PathVariable("offset") int offset,
										   @PathVariable("limit") int limit) {
		// 获取列表json

		return goodsService.getGoodsListByBrandId(brandId, offset, limit);
	}
	
	
	@RequestMapping(value = "/detail/{goodsId}", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public Goods goodsDetail(@PathVariable("goodsId") Long goodsId) {

		// 获取列表json

		return goodsService.getGoodsDetailById(goodsId);
	}
	
	@RequestMapping(value = "/detail/{goodsId}/{goodsSkuId}", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public GoodsSku goodsSku(@PathVariable("goodsId") Long goodsId,
											 @PathVariable("goodsSkuId") Long goodsSkuId) {

		// 获取列表json

		return goodsService.getGoodsSkuById(goodsSkuId);
	}
	
	
	@RequestMapping(value = "/evaluate/{goodsId}", 
			method = RequestMethod.GET,
			produces= {"application/json;charset=UTF-8"})
	@ResponseBody
	public List<GoodsEvaluate> goodsEvaluate(@PathVariable("goodsId") Long goodsId) {
		// 获取列表json

		return goodsService.getGoodsEvaluateById(goodsId);
	}
}
