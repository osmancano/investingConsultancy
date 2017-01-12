package com.ironyard.servlet;

import com.ironyard.data.Investor;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by osmanidris on 1/11/17.
 */
public class invServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String investment;

        // create investor object
        Investor i = new Investor();
        i.setName(request.getParameter("iName"));
        i.setiAmount(Double.parseDouble(request.getParameter("iAmount")));
        i.setiProfit(Double.parseDouble(request.getParameter("iProfit")));
        i.setNoOfWeeks(Integer.parseInt(request.getParameter("noOfWeeks")));
        i.calcPercent();
        if(i.getPercent() <= 5){
            investment = "likely";
        }else if(i.getPercent() > 5 && i.getPercent() <= 80){
            investment = "greedy";
        }else {
            investment = "super duper greedy";
        }
        String msg = String.format("%s, you are looking to make a %d%% return on $%.2f. This sounds %s, and you will get %d%% per week.",
                i.getName(), (int)i.getPercent(), i.getiAmount(), investment, (int)i.getPercentPerWeek());

        request.setAttribute("msg",msg);
        // forward to display JSP
        String nextJSP = "/showResult.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
