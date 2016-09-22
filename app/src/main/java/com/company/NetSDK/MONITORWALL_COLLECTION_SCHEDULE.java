package com.company.NetSDK;

import java.io.Serializable;

public class MONITORWALL_COLLECTION_SCHEDULE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public byte[] 			szName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];     // T$08C{3F
	public SDK_TSECT[][]    stuSchedule = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM];   // J1<d1m, 5ZR;N,8wT*KX1mJ>V\HU~V\Ay:M=Z<YHU

	public MONITORWALL_COLLECTION_SCHEDULE() {
		for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; ++i){
			for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; ++j) {
				stuSchedule[i][j] = new SDK_TSECT();
			}
		}
	}
}
