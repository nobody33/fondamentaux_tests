package main.java.com.github.jmaillard.mockito.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;

import junit.framework.Assert;

public class OrderTest {

	@Test
	public void should_get_8_99_if_add_3_99_and_5() throws Exception {
				
		// GIVEN
		Product product1 = Mockito.mock(Product.class);
		Product product2 = Mockito.mock(Product.class);
		
		Order order  = Mockito.spy(new Order(null));
		
		//List<Product> products = new ArrayList();
		order.products.add(product1);
		order.products.add(product2);
		//Order order = new Order(products);

		// WHEN
		
		Mockito.when(product1.getPrice()).thenReturn(new BigDecimal("3.99"));
		Mockito.when(product2.getPrice()).thenReturn(new BigDecimal("5.00"));

		// THEN
		Assert.assertEquals(new BigDecimal("8.99"), order.getTotalPrice());
		
	}

}
