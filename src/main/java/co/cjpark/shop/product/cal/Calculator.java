package co.cjpark.shop.product.cal;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int sum(int n, int m) {
		return n+m;
	}
}
