package store.ae.dao.mall.order;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import store.ae.pojo.mall.order.Order;
import store.ae.pojo.mall.order.OrderBuyer;
import store.ae.pojo.mall.order.OrderGoods;


@RunWith(SpringJUnit4ClassRunner.class)

//告诉junit spring配置文件
@ContextConfiguration({"classpath:store/ae/dao/mall/config/mall-dao.xml"})
public class OrderDaoTest {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private OrderDao orderDao;
	
	@Test
	public void testQueryOrderByOrderId() {
		Long orderId = 1000L;
		Order order = orderDao.queryOrderByOrderId(orderId);
		
		logger.info("order is :" + order);
	}

	@Test
	public void testQueryOrderAllByUserId() {
		Long userId = 1000L;
		List<Order> orderList = orderDao.queryOrderAllByUserId(userId);
		
		logger.info("orderList is :" + orderList);
	}

	@Test
	public void testQueryOrderBuyerByOrderId() {
		Long orderId = 1000L;
		OrderBuyer orderBuyer = orderDao.queryOrderBuyerByOrderId(orderId);
		
		logger.info("orderBuyer is :" + orderBuyer);
	}

	@Test
	public void testQueryOrderGoodsByOrderId() {
		Long orderId = 1000L;
		OrderGoods orderGoods = orderDao.queryOrderGoodsByOrderId(orderId);
		
		logger.info("orderGoods is :" + orderGoods);
	}
}
