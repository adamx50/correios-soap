package br.com.javasoapcorreios.correios_soap;

import java.net.URL;

import javax.xml.namespace.QName;

import br.com.javasoapcorreios.correios_soap.service.AtendeCliente;
import br.com.javasoapcorreios.correios_soap.service.EnderecoERP;
import jakarta.xml.ws.Service;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	URL urlCooreios = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
        
        QName qnameCorreios = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");
  
        Service serviceCorreios = Service.create(urlCooreios, qnameCorreios);
        
        AtendeCliente correios = serviceCorreios.getPort(AtendeCliente.class);
        
        //EnderecoERP endereco = correios.consultaCEP("87023150"); //Maringá / Parque Residencial Cidade Nova
        EnderecoERP endereco = correios.consultaCEP("74495613");
        System.out.println(endereco.getCidade());
        System.out.println(endereco.getBairro());
        System.out.println(endereco.getComplemento2());
        System.out.println(endereco.getEnd());
        System.out.println(endereco.getUf());
    }
}
