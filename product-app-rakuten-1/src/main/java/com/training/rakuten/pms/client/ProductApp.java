package com.training.rakuten.pms.client;

import java.util.Scanner;

import com.training.rakuten.pms.dao.ProductDAO;
import com.training.rakuten.pms.dao.ProductDAOImpl;
import com.training.rakuten.pms.model.Product;

public class ProductApp {

	Scanner scanner = new Scanner(System.in);
	ProductDAO productDAO = new ProductDAOImpl();
	int choice = 0;
	int pId, qoh, pr;
	String pName;

	public void startMyProductApp() {
		while (true) {
			System.out.println("===============Product Application=============\r\n" + "\r\n" + "\r\n" + "\r\n"
					+ "1. Add Product \r\n" + "2. Update Product\r\n" + "3. Delete Product\r\n"
					+ "5. Find Product by Id\r\n" + "6. Find Product By product name\r\n" + "7. Find all products\r\n"
					+ "0. E X I T ");

			System.out.println("Please your enter your choice : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("==========Add product section=========");
				System.out.println("Enter product id to add :");
				pId = scanner.nextInt();
				System.out.println("Enter product name to add :");
				pName = scanner.next();
				System.out.println("Enter product qoh to add :");
				qoh = scanner.nextInt();
				System.out.println("Enter product price to add :");
				pr = scanner.nextInt();

				Product product = new Product(pId, pName, qoh, pr);
				productDAO.addProduct(product);
				System.out.println("Saved successfully ");

				break;
			case 2:
				System.out.println("==========Update product section=========");
				System.out.println("Enter product id to update :");
				pId = scanner.nextInt();
				System.out.println("Enter new product name to update :");
				pName = scanner.next();
				System.out.println("Enter new product qoh to update :");
				qoh = scanner.nextInt();
				System.out.println("Enter new product price to update :");
				pr = scanner.nextInt();

				product = new Product(pId, pName, qoh, pr);
				productDAO.updateProduct(pId, product);
				System.out.println("Updated successfully ");
				break;
				
			case 3 :
				System.out.println("Product delete section :  ");
				System.out.println("Enter product id to delete :");
				pId = scanner.nextInt();
				productDAO.deleteProduct(pId);
				System.out.println("Product with product id : "+pId+ " deleted successfully");
				break;
			case 5 :
				System.out.println("Product find by id  section :  ");
				System.out.println("Enter product id to search :");
				pId = scanner.nextInt();
				Product foundProduct = productDAO.findByProduct(pId);
				if(foundProduct == null)
					System.out.println("Product with product id : "+pId+ " does not exists ");
				else
				System.out.println(foundProduct);
				break;
			case 6 :
				System.out.println("Product find by name  section :  ");
				System.out.println("Enter product name to search :");
				pName = scanner.next();
				productDAO.findByProduct(pName);
				break;
			case 7:
				System.out.println("All the products");
				productDAO.findByProduct();
				break;
			case 0:
				System.out.println("Thanks for using my product app");
				System.exit(0);

			default:
				break;
			}
		}
	}

	public static void main(String[] args) {

		ProductApp app = new ProductApp();
		app.startMyProductApp();

	}

}
