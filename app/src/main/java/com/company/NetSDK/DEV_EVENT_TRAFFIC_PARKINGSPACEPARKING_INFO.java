package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type  EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING(parking space parking)corresponding data block description info
 * \else
 * JB<~@`PM EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING(35N;SP35JB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Time stamp(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public int               PTS;

	/**
	 * \if ENGLISH_LANG
	 * Event occurred time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * JB<~ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * Corresponding lane No.
	 * \else
	 * 6TS&355@:E
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Detected object
	 * \else
	 * <l2b5=5DNoLe
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * Vehicle body info
	 * \else
	 * 35ImPEO"
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * The corresponding file info of the event
	 * \else
	 * JB<~6TS&ND<~PEO"
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 1mJ>W%EDPr:E#,Hg3,2,1,11mJ>W%ED=aJx,01mJ>Rl3#=aJx
	 * \endif
	 */
	public int                 nSequence;

	/**
	 * \if ENGLISH_LANG
	 * Event operation.0=pulse event,1=begin of the durative event,2=end of the durative event;
	 * \else
	 * JB<~6/Ww#,01mJ>Bv3eJB<~,11mJ>3VPxPTJB<~?*J<,21mJ>3VPxPTJB<~=aJx;
	 * \endif
	 */
	public byte                bEventAction;

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * M<F,5DPr:E, M,R;J1<dDZ(>+H75=Ck)?ID\SP6`UEM<F,, 4S0?*J<
	 * \endif
	 */
	public byte                byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * Snap flag(by bit),please refer to NET_RESERVED_COMMON
	 * \else
	 * W%M<1jV>(04N;)#,>_Le<{NET_RESERVED_COMMON
	 * \endif
	 */
	public int               dwSnapFlagMask;

	/**
	 * \if ENGLISH_LANG
	 * picture resolution
	 * \else
	 * 6TS&M<F,5D7V1fBJ
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info
	 * \else
	 * =;M(35A>PEO"
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 * public info
	 * \else
	 * 9+92PEO"
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
}
