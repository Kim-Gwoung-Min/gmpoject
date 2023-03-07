package hashMapTest;


public class Product{
	private static Long sequence;
	private Long productId;
	private String productName;
	private int productPrice;
	private int productStock;
//중복없는 값은 숫자 타입 -> 2003년도 데이터를 없애자 -> 
	// 1씩 증가 ,  보통은 실무에서 Long  , byte가 모자랄 경우 없애기위해 
						//				Long 클래스타입 null 허용하기 위해서 , 검증할때 
	
// static 블록 : 단 한 번만 실행
	static {
		sequence = 0L;
	}
	
//	초기화 블록 :  생성자를 호출하 때 마다 실행 
	{
		sequence++;	
	}
	public Product() {;	}
	public Product( String productName, int productPrice, int productStock) {
		this.productId = sequence;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + "]";
	}
	
	
}