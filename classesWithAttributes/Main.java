package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	

		Product product = new Product(1, "siyah","Laptop", "Asus Laptop", 3000, 2);
		
		

		ProductManger productManger = new ProductManger();
		productManger.Add(product); 

		System.out.println(product.getKod());

	}

}
