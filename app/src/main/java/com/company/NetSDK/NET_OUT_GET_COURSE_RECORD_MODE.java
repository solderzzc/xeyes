package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about getting mode of course record 
 * \else
 * ;qH!B<OqD#J=3v2N
 * \endif
 */

public class NET_OUT_GET_COURSE_RECORD_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * record mode
	 * \else
	 * B<OqD#J=
	 * \endif
	 * @see NET_EM_RECORD_MODE
	 */
	public int	emRecordMode;       
}
