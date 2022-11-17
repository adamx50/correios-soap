
package br.com.javasoapcorreios.correios_soap.service;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "ErroMontagemRelatorio", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class ErroMontagemRelatorio_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ErroMontagemRelatorio faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ErroMontagemRelatorio_Exception(String message, ErroMontagemRelatorio faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ErroMontagemRelatorio_Exception(String message, ErroMontagemRelatorio faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.javasoapcorreios.correios_soap.service.ErroMontagemRelatorio
     */
    public ErroMontagemRelatorio getFaultInfo() {
        return faultInfo;
    }

}
