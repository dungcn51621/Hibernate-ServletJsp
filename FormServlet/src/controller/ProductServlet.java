package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;

@WebServlet("/formdemo")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		Product product = new Product(name, description, image);
		
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
			
			List<Product> productList = new ArrayList<>();
			productList.add(product);
			productList.add(product);
			productList.add(product);
			productList.add(product);
			productList.add(product);
			productList.add(product);
			
			req.setAttribute("productList", productList);
			req.getRequestDispatcher("/views/productList.jsp").forward(req, resp);
		}

	}
}
