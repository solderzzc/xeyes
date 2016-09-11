package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Obtain the calling state of video phone (Corresponding to SDK_DEVSTATE_VTP_CALLSTATE)
 * \else
 * 获取视频电话呼叫状态 (对应 SDK_DEVSTATE_VTP_CALLSTATE)
 * \endif
 */
public class NET_GET_VTP_CALLSTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the call type to be queried, input parameter
	 * \else
	 * 待查询的呼叫类型, EM_NET_VTP_CALL_TYPE, 输入参数
	 * \endif
	 */
	public int      emCallType; 
	
	/**
	 * \if ENGLISH_LANG
	 * the unique identification to be queried, input parameter
	 * \else
	 * 待查询的对讲唯一标识, 输入参数
	 * \endif
	 */
	public byte                        szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128]; 
	
	/**
	 * \if ENGLISH_LANG
	 * the device to be transmit,  ID= NULL equals to no transmitting,  input parameter
	 * \else
	 * 待转发的设备ID, 为NULL表示不转发, 输入参数
	 * \endif
	 */
	public String   szTargetID; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling
	 * \else
	 * 呼叫状态, EM_NET_VTP_CALL_STATE_TYPE, 输出参数
	 * \endif
	 */
	public int      emCallState; 
}
