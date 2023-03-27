package com.example.exer_1_2;

import Repository.EmpresaRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "lista_empresas", value = "/lista_empresas")
public class Lista_empresas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> empresas = EmpresaRepository.getEmpresas();

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<ul>");
        for(String empresa: empresas) {
            out.println("<li>"+empresa+"</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome_da_empresa = request.getParameter("nome") == null ? "Nome EMpresa Padrao" : request.getParameter("nome");

        EmpresaRepository.addEmpresa(nome_da_empresa);
    }
}
