package com.company.NetSDK;

import java.io.Serializable;

public class CFG_NETAPP_WLAN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                     nNum;                               // stuWlanInfoSPP'5DWLANEdVC8vJ}
    public CFG_WLAN_INFO           stuWlanInfo[] = new CFG_WLAN_INFO[8];                     // WLANEdVCPEO"
    
    public CFG_NETAPP_WLAN() {
    	for (int i = 0; i < 8; i++) {
    		stuWlanInfo[i] = new CFG_WLAN_INFO();
    	}
    }
}
