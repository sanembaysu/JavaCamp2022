package oop1;
/// Object - Oriented Programming
public class main {
	public static void main(String[] args) {
		
		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setUnitPrice(7500);
		product1.setImageUrl("image.jpg");
		
		Product product2 = new Product();
		product2.setName("Semg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitInStock(3);
		product2.setUnitPrice(7500);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitInStock(3);
		product3.setUnitPrice(7500);
		product3.setImageUrl("image3.jpg");
	
		Product[] products = {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
	
/*		
		// get value
		System.out.println(product1);
*/	
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05999999999");
		individualCustomer.setCustomerNumber("556465465");
		individualCustomer.setFirstName("Sanem");
		individualCustomer.setLastName("Baysu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setPhone("05888888888");
		corporateCustomer.setTaxNumber("11111");
		
		Customer[] customer = {individualCustomer,corporateCustomer};
		
		
		
	}
}