package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Random random = new Random();
        res.setContentType("text/html;charset=UTF-8");
        res.getWriter().printf("<html><body>");
        for (int i = 0; i < 10; i++) {
            res.getWriter().printf("<h1>"
                    + new Product(i, "laptop" + i, random.nextInt(1000) + 100.0)
                    + "</h1>");
        }
        res.getWriter().printf("</body></html>");

        res.getWriter().close();
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
