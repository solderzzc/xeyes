package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_TRAFFICACCIDENT's data
 * \else
 * 事件类型EVENT_IVS_TRAFFICACCIDENT(交通事故事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFICACCIDENT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              PTS;

	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * have being detected object number
	 * \else
	 * 检测到的物体个数
	 * \endif
	 */
	public int                 nObjectNum;

	/**
	 * \if ENGLISH_LANG
	 * have being detected object list
	 * \else
	 * 检测到的物体列表
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];

	/**
	 * \if ENGLISH_LANG
	 * event file info
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                bEventAction;

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte                byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * 抓图标志(按位)，具体见NET_RESERVED_COMMON
	 * \endif
	 */
	public int               dwSnapFlagMask;
	
	public DEV_EVENT_TRAFFICACCIDENT_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
			stuObjectIDs[i] = new SDK_MSG_OBJECT();
		}
	}
}
