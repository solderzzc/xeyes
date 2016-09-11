package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Old log structure 
 * \else
 * 旧的日志结构体
 * \endif
 */
public class SDK_LOG_ITEM_OLD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Old log structure 
	 * \else
	 * 旧的日志结构体
	 * \endif
	 */
	public SDK_LOG_ITEM			stuLog;								
	/**
	 * \if ENGLISH_LANG
	 * Reserved
	 * \else
	 * 保留
	 * \endif
	 */
	public byte                bReserved[] = new byte[48];			
	
	public SDK_LOG_ITEM_OLD()
	{
		stuLog = new SDK_LOG_ITEM();
	}
}
