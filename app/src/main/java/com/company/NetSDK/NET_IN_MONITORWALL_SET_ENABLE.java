package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_SET_ENABLE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int                 nMonitorWallNum;                // R*IhVC5D5gJSG=J}A?
	public NET_MONITORWALL_ENABLE_INFO[] stuEnable = new NET_MONITORWALL_ENABLE_INFO[FinalVar.SDK_MAX_MONITORWALL_NUM];  // 5gJSG=J9D\

	public NET_IN_MONITORWALL_SET_ENABLE() {
		for(int i = 0; i < FinalVar.SDK_MAX_MONITORWALL_NUM; ++i) {
			stuEnable[i] = new NET_MONITORWALL_ENABLE_INFO();
		}	
	}
}
