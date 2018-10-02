package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Product;
import services.ProductService;

@WebServlet("/formdemo")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	ProductService productService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/createProduct.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//post form
		//1. Retrieve data from form
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		String image = req.getParameter("image");
		Product product = new Product();
		
		product.setName(name);
		product.setDescription(description);
		product.setImage(image);
		
		boolean error = false;
		// 2. Validate data
		if(name.trim().isEmpty()) {
			req.setAttribute("nameError", "Name can not is blank");
			error = true;
		}
		if(description.trim().isEmpty()) {
			req.setAttribute("descError", "Description can not is blank");
			error = true;
		} 
		if(image.trim().isEmpty()) {
			req.setAttribute("imageError", "Image can not is blank");
			error = true;
		}
		
		// 2.1 Error =>return messages "/views/createProduct.jsp"
		if (error == true) {
			req.getRequestDispatcher("/views/createProduct.jsp").forward(req, resp);
		// 2.2 Not Error => show data productList.jsp
		} else {
			
			//insert product into Product Table => insert into
			productService.createtProduct(product);
			
			// get data from Product Table = >> select 
			List<Product> productList = productService.getAllProducts();
			
			req.setAttribute("productList", productList);
			req.getRequestDispatcher("/views/productList.jsp").forward(req, resp);
		}

	}
}
