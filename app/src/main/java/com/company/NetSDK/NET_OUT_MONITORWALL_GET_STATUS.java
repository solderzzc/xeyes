package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_MONITORWALL_GET_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

    public int                emMatrixStatus;     // TKPPW4L, @see NET_MATRIX_STATUS
    public NET_MONITORWALL_STATUS_INFO     stuStatusInfo;      // W4L,PEO"
    
    public NET_OUT_MONITORWALL_GET_STATUS() {
    	stuStatusInfo = new NET_MONITORWALL_STATUS_INFO();
    }
}
