/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsgeoip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import net.webservicex.GeoIP;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author entrar
 */
public class WSGeoip {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        String a = "http://www.webservicex.net/geoipservice.asmx/GetGeoIPContext";
        URL url = new URL(a);
        String source = new String();
        Scanner scan = new Scanner(url.openStream());
        while(scan.hasNext()){
            source += scan.nextLine();
        }
        //System.out.println(source);
        Serializer serializer = new Persister();
        IPinfo geoip = new IPinfo();
        serializer.read(geoip,source);
        System.out.println("ReturnCode: " + geoip.getCountryName());
        //Crear serializer.
        /*Serializer serializer = new Persister();
        GeoIP geoip = new GeoIP();
        serializer.read(geoip,source);
        System.out.println("ReturnCode: "+ geoip.getCountryName);*/
        
    }

    private static GeoIP getGeoIP(java.lang.String ipAddress) {
        net.webservicex.GeoIPService service = new net.webservicex.GeoIPService();
        net.webservicex.GeoIPServiceSoap port = service.getGeoIPServiceSoap();
        return port.getGeoIP(ipAddress);
    }
    
}
