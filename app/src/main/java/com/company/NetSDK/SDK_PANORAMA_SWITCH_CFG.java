package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Panorama switch alarm configuration
 * \else
 * H+>0GP;;1(>/EdVC
 * \endif
 */
public class SDK_PANORAMA_SWITCH_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enabled
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process way
	 * \else
	 * 1(>/A*6/
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE(); 
	
	public SDK_PANORAMA_SWITCH_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
