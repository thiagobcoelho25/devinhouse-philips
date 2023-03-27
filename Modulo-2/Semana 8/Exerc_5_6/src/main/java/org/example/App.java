package org.example;

import org.example.configuration.BeanConfig;
import org.example.service.ClienteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        ClienteService clienteService = applicationContext.getBean("clienteService", ClienteService.class);

        clienteService.criarCliente("thiago", "12222222222");
        clienteService.criarCliente("thiago", "122222");
        clienteService.criarCliente("Guto", "12222222222");
        clienteService.criarCliente("maria", "12222222222");

        System.out.println(clienteService.retornaListaClientes());

        clienteService.deletarCliente(3);

        System.out.println(clienteService.retornaListaClientes());

    }
}
