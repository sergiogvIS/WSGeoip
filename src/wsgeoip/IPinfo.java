/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsgeoip;

import org.simpleframework.xml.Element;

/**
 *
 * @author sergio
 */
public class IPinfo {
    @Element
    private String ReturnCode;
    @Element
    private String ReturnCodeDetails;
    @Element
    private String CountryName;
    @Element
    private String CountryCode;
    @Element
    private String IP;

    public String getReturnCode() {
        return ReturnCode;
    }

    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    public String getReturnCodeDetails() {
        return ReturnCodeDetails;
    }
    
    public String getCountryName() {
        return CountryName;
    }
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }


}
