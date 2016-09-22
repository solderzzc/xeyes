package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_WM_ATTACH_TOUR implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall ID
	 * \else
	 * 5gJSG=ID
	 * \endif
	 */
    public int             nMonitorWallID;            
    
	/**
	 * \if ENGLISH_LANG
	 * tour status  call function
	 * \else
	 * BVQ2W4L,;X5w:/J}
	 * \endif
	 */
    public CB_fMonitorWallTourStatusCallBack cbStatus;    
}
