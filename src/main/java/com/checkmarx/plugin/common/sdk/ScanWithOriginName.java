package com.checkmarx.plugin.common.sdk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="args" type="{http://Checkmarx.com/v7}CliScanArgs" minOccurs="0"/&gt;
 *         &lt;element name="origName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sessionId",
        "args",
        "origName"
})
@XmlRootElement(name = "ScanWithOriginName")
public class ScanWithOriginName {

    protected String sessionId;
    protected CliScanArgs args;
    protected String origName;

    /**
     * Gets the value of the sessionId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the args property.
     *
     * @return possible object is
     * {@link CliScanArgs }
     */
    public CliScanArgs getArgs() {
        return args;
    }

    /**
     * Sets the value of the args property.
     *
     * @param value allowed object is
     *              {@link CliScanArgs }
     */
    public void setArgs(CliScanArgs value) {
        this.args = value;
    }

    /**
     * Gets the value of the origName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrigName() {
        return origName;
    }

    /**
     * Sets the value of the origName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrigName(String value) {
        this.origName = value;
    }

}
