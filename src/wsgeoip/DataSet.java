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
public class DataSet {
        @Element
    private IPinfo Table;

    public IPinfo getTable() {
        return Table;
    }

    public void setTable(IPinfo Table) {
        this.Table = Table;
    }
    
}
