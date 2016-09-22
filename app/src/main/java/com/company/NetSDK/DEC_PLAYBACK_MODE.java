package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Play back mode for decoder
 * \else
 * =bBkFw;X7E7=J=
 * \endif
 */
public class DEC_PLAYBACK_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * by file mode
	 * \else
	 * 04ND<~7=J=
	 * \endif
	 */
	public static final int     Dec_By_Device_File = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * by time mode
	 * \else
	 * 04J1<d7=J=
	 * \endif
	 */
	public static final int     Dec_By_Device_Time = 1;
}
