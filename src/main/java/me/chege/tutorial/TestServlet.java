/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.chege.tutorial;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chege
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/abc"})
public class TestServlet extends HttpServlet {

    @Inject
    private Test test;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println(test.add(Integer.valueOf(request.getParameter("a")), Integer.valueOf(request.getParameter("b"))));
    }

}
