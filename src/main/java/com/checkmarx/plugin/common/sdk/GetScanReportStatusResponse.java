package com.checkmarx.plugin.common.sdk;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="GetScanReportStatusResult" type="{http://Checkmarx.com/v7}CxWSReportStatusResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getScanReportStatusResult"
})
@XmlRootElement(name = "GetScanReportStatusResponse")
public class GetScanReportStatusResponse {

    @XmlElement(name = "GetScanReportStatusResult")
    protected CxWSReportStatusResponse getScanReportStatusResult;

    /**
     * Gets the value of the getScanReportStatusResult property.
     *
     * @return possible object is
     * {@link CxWSReportStatusResponse }
     */
    public CxWSReportStatusResponse getGetScanReportStatusResult() {
        return getScanReportStatusResult;
    }

    /**
     * Sets the value of the getScanReportStatusResult property.
     *
     * @param value allowed object is
     *              {@link CxWSReportStatusResponse }
     */
    public void setGetScanReportStatusResult(CxWSReportStatusResponse value) {
        this.getScanReportStatusResult = value;
    }

}
