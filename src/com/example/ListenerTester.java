package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Юра on 03.09.2017.
 */
@WebServlet(name = "ListenerTester")
public class ListenerTester extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("test context attribute set by listener <br>");

        out.println("br");

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("Dog's breed is: " + dog.getBreed());
    }
}
