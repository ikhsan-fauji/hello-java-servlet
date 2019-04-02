package servlet.controller;

import servlet.entity.CustomerEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Customer", urlPatterns = "/customers")
public class Customer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerEntity customers = new CustomerEntity();
        customers.setNama(request.getParameter("nama"));

        request.setAttribute("customer", customers);
        RequestDispatcher view = request.getRequestDispatcher("/jsp/customer.jsp");
        view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("/jsp/customer-input.jsp");
        view.forward(request, response);
    }
}
