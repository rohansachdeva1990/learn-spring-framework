package com.rohan.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by rohan on 05/02/2017.
 */
@WebServlet("/somePath")
public class TestDBServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       // Setup connection variables
        String user = "springstudent";
        String password = "springstudent";
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";

        Connection myConn = null;
        try {
            PrintWriter pw = response.getWriter();

            pw.println("Connecting to database: " + jdbcUrl);

            Class.forName(driver);

            myConn = DriverManager.getConnection(jdbcUrl, user, password);

            pw.println("Connection successful !!");

            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

/*
        // Step 1: set the content type
        response.setContentType("text/html");

        // Step 2: get the printwriter
        PrintWriter out = response.getWriter();

        // Step 3: generate the HTML content

        out.println("<html> <body>");

        out.println("<h2>Hello World from servlet in intelli IDEA bahin chodd</h2>");

        out.println("<hr>");

        out.println("Time on the server is:" + new java.util.Date());

        out.println("<body></html>");*/
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}