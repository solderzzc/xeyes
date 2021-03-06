package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Interface type,responding to the interface CLIENT_SetSubconnCallBack
 * \else
 * =S?Z@`PM#,6TS&CLIENT_SetSubconnCallBack=S?Z
 * \endif
 */
public class EM_INTERFACE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown interface
	 * \else
	 * N4V*=S?Z
	 * \endif
	 */
	public static int 		SDK_INTERFACE_OTHER = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Realtime monitoring interface
	 * \else
	 * J5J1<`JS=S?Z
	 * \endif
	 */
	public static int 		SDK_INTERFACE_REALPLAY = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Realtime multiple-window preview
	 * \else
	 * 6`;-CfT$@@=S?Z
	 * \endif
	 */
	public static int 		SDK_INTERFACE_PREVIEW = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback interface
	 * \else
	 * 6K;X7E=S?Z
	 * \endif
	 */
	public static int 		SDK_INTERFACE_PLAYBACK = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Download interface
	 * \else
	 * OBTX=S?Z
	 * \endif
	 */
	public static int 		SDK_INTERFACE_DOWNLOAD = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Download picture interface
	 * \else
	 * OBTXVGD\M<F,=S?Z
	 * \endif
	 */
	public static int 		SDK_INTERFACE_REALLOADPIC = 5;
}
