package exam;

import javax.swing.JOptionPane;

public class ProductSearch {

	public static void main(String[] args) {
		ProductSearchData psd = new ProductSearchData();
		String productName = JOptionPane.showInputDialog("검색할 상품명을 입력하세요");
		try {
			String pInfo = psd.search(productName);
			pInfo.length();
			JOptionPane.showMessageDialog(null, pInfo);
		} catch (NullPointerException ne) {
			JOptionPane.showMessageDialog(null, "해당 상품이 없습니다");
			ne.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"기타 예외가 발생하였습니다");
		}
	}
}
