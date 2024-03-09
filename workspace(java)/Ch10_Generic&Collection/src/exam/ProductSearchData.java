package exam;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData {
	Map<String, String> product = new HashMap<String, String>();
	

	public ProductSearchData() {
		product.put("세탁기", "드럼 세탁기 최신형");
		product.put("냉장고", "지펠 냉장고 최신형");
		product.put("TV", "HDTV 150인치 최신 모델");
	}
	
	String search(String productName) {
		if(product.containsKey(productName)) {
			return product.get(productName);
		}
		return null;
	}
}
