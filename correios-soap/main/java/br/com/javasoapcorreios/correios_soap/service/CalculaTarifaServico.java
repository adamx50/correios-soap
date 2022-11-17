
package br.com.javasoapcorreios.correios_soap.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calculaTarifaServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="calculaTarifaServico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFormato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="comprimento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="largura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="diametro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="codMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorDeclarado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="codAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaTarifaServico", propOrder = {
    "codAdministrativo",
    "usuario",
    "senha",
    "codServico",
    "cepOrigem",
    "cepDestino",
    "peso",
    "codFormato",
    "comprimento",
    "altura",
    "largura",
    "diametro",
    "codMaoPropria",
    "valorDeclarado",
    "codAvisoRecebimento"
})
public class CalculaTarifaServico {

    protected String codAdministrativo;
    protected String usuario;
    protected String senha;
    protected String codServico;
    protected String cepOrigem;
    protected String cepDestino;
    protected String peso;
    protected Integer codFormato;
    protected Double comprimento;
    protected Double altura;
    protected Double largura;
    protected Double diametro;
    protected String codMaoPropria;
    protected Double valorDeclarado;
    protected String codAvisoRecebimento;

    /**
     * Obtém o valor da propriedade codAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Define o valor da propriedade codAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdministrativo(String value) {
        this.codAdministrativo = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade codServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodServico() {
        return codServico;
    }

    /**
     * Define o valor da propriedade codServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodServico(String value) {
        this.codServico = value;
    }

    /**
     * Obtém o valor da propriedade cepOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepOrigem() {
        return cepOrigem;
    }

    /**
     * Define o valor da propriedade cepOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepOrigem(String value) {
        this.cepOrigem = value;
    }

    /**
     * Obtém o valor da propriedade cepDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestino() {
        return cepDestino;
    }

    /**
     * Define o valor da propriedade cepDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestino(String value) {
        this.cepDestino = value;
    }

    /**
     * Obtém o valor da propriedade peso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Obtém o valor da propriedade codFormato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodFormato() {
        return codFormato;
    }

    /**
     * Define o valor da propriedade codFormato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodFormato(Integer value) {
        this.codFormato = value;
    }

    /**
     * Obtém o valor da propriedade comprimento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComprimento() {
        return comprimento;
    }

    /**
     * Define o valor da propriedade comprimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComprimento(Double value) {
        this.comprimento = value;
    }

    /**
     * Obtém o valor da propriedade altura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltura(Double value) {
        this.altura = value;
    }

    /**
     * Obtém o valor da propriedade largura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLargura() {
        return largura;
    }

    /**
     * Define o valor da propriedade largura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLargura(Double value) {
        this.largura = value;
    }

    /**
     * Obtém o valor da propriedade diametro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiametro() {
        return diametro;
    }

    /**
     * Define o valor da propriedade diametro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiametro(Double value) {
        this.diametro = value;
    }

    /**
     * Obtém o valor da propriedade codMaoPropria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMaoPropria() {
        return codMaoPropria;
    }

    /**
     * Define o valor da propriedade codMaoPropria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMaoPropria(String value) {
        this.codMaoPropria = value;
    }

    /**
     * Obtém o valor da propriedade valorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define o valor da propriedade valorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorDeclarado(Double value) {
        this.valorDeclarado = value;
    }

    /**
     * Obtém o valor da propriedade codAvisoRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAvisoRecebimento() {
        return codAvisoRecebimento;
    }

    /**
     * Define o valor da propriedade codAvisoRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAvisoRecebimento(String value) {
        this.codAvisoRecebimento = value;
    }

}
