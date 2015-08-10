package org.succlz123.AxBTube.support.helper.acfun;

import org.succlz123.AxBTube.MyApplication;
import org.succlz123.AxBTube.support.utils.GlobalUtils;

/**
 * Created by succlz123 on 2015/7/27.
 */
public class AcString {

	public static final String TITLE_HOT = "热门焦点";
	public static final String TITLE_ANIMATION = "动画";
	public static final String TITLE_FUN = "娱乐";
	public static final String TITLE_MUSIC = "音乐";
	public static final String TITLE_GAME = "游戏";
	public static final String TITLE_SCIENCE = "科学";
	public static final String TITLE_SPORT = "体育";
	public static final String TITLE_TV = "影视";

	public static final String VIDEO_ID = "videoId";
	public static final String DANMAKU_ID = "danmakuId";
	public static final String SOURCE_ID = "sourceId";
	public static final String SOURCE_TYPE = "sourceType";

	public static final String[] MAIN_TITLES = new String[]{
			"首页推荐", "分区导航", "新番专题", "文章专区"};

	public static final String[] CONTENT_VIEW_PAGER_TITLE = new String[]{"视频详情", "评论列表"};

	public static String getTitle(int position) {
		switch (position) {
			case 1:
				return TITLE_HOT;
			case 6:
				return TITLE_ANIMATION;
			case 9:
				return TITLE_FUN;
			case 12:
				return TITLE_MUSIC;
			case 15:
				return TITLE_GAME;
			case 18:
				return TITLE_SCIENCE;
			case 21:
				return TITLE_SPORT;
			case 24:
				return TITLE_TV;
		}
		return null;
	}

	/*请求基础url*/
	public static final String URL_BASE = "http://api.acfun.tv/apiserver";
	/*请求首页banner*/
	public static final String RECOMMEND_LIST = "/recommend/list";
	/*请求首页数据*/
	public static final String RECOMMEND_PAGE = "/recommend/page";
	/*请求分区数据*/
	public static final String CONTENT_CHANNEL = "/content/channel";
	/*请求视频数据*/
	public static final String CONTENT_INFO = "/content/info";

	/*各分区id*/
	public static final String CHANNEL_IDS = "channelIds";
	/*视频id*/
	public static final String CONTENT_ID = "contentId";

	/*动画区*/
	public static final String ANIMATION = "106,107,108,109,67,120";
	/*新番连载*/
	public static final String BANGUMI = "67";
	/*旧番补档*/
	public static final String BANGUMI_END = "109";
	/*动画短片*/
	public static final String SHORT_ANIMATION = "106";
	/*MAD.AMV*/
	public static final String MAD_AMV = "107";
	/*MAD.3D*/
	public static final String MAD_3D = "108";
	/*国产动画*/
	public static final String CHINA_ANIMATION = "120";
	/*动画区标题*/
	public static final String[] ANIMATION_TITLES = new String[]{
			"新番连载", "旧番补档", "动画短片", "MAD·AMV", "MAD·3D", "国产动画"};
	public static final String[] ANIMATION_TITLES_ID = new String[]{
			"67", "109", "106", "107", "108", "120"};

	/*娱乐区数据*/
	public static final String FUN = "86,87,88,89,121";
	/*生活娱乐*/
	public static final String LIVE_ENTERTAINMENT = "86";
	/*鬼畜调教*/
	public static final String OTO_MAD = "87";
	/*萌宠*/
	public static final String PET = "88";
	/*美食*/
	public static final String FOOD = "89";
	/*原创*/
	public static final String ORIGINAL = "121";
	/*娱乐区标题*/
	public static final String[] FUN_TITLES = new String[]{
			"生活娱乐", "鬼畜调教", "萌宠", "美食", "原创"};
	public static final String[] FUN_TITLES_ID = new String[]{
			"86", "87", "88", "89", "121"};

	/*音乐区*/
	public static final String MUSIC = "101,102,103,104,105";
	/*演唱.乐器*/
	public static final String SING_MUSICAL = "101";
	/*宅舞*/
	public static final String HOME_DANCE = "102";
	/*Vocaloid*/
	public static final String VOCALOID = "103";
	/*ACG音乐*/
	public static final String ACG_MUSIC = "104";
	/*流行音乐*/
	public static final String POP_MUSCI = "105";
	/*音乐区标题*/
	public static final String[] MUSIC_TITLES = new String[]{
			"演唱·乐器", "宅舞", "Vocaloid", "ACG音乐", "流行音乐"};
	public static final String[] MUSIC_TITLES_ID = new String[]{
			"101", "102", "103", "104", "105"};

	/*游戏区*/
	public static final String GAME = "83,84,85,72";
	/*游戏集锦*/
	public static final String GAME_HIGHLIGHTS = "83";
	/*实况解说*/
	public static final String LIVE_COMMENTARY = "84";
	/*英雄联盟*/
	public static final String LOL = "85";
	/*Mugen*/
	public static final String MUGEN = "72";
	/*游戏区标题*/
	public static final String[] GAME_TITLES = new String[]{
			"游戏集锦", "实况解说", "英雄联盟", "Mugen"};
	public static final String[] GAME_TITLES_ID = new String[]{
			"83", "84", "85", "82"};

	/*科学区*/
	public static final String SCIENCE = "90,91,92,122";
	/*科学技术*/
	public static final String SCIENCE_TECHNOLOGY = "90";
	/*数码*/
	public static final String DIGITAL = "91";
	/*军事*/
	public static final String MILITARY = "92";
	/*汽车*/
	public static final String CAR = "122";
	/*科学区标题*/
	public static final String[] SCIENCE_TITLES = new String[]{
			"科学技术", "数码", "军事", "汽车"};
	public static final String[] SCIENCE_TITLES_ID = new String[]{
			"90", "91", "92", "122"};

	/*体育区*/
	public static final String SPORT = "93,94,95";
	/*惊奇体育*/
	public static final String SURPRISE_SPORTS = "93";
	/*足球*/
	public static final String FOOTBALL = "94";
	/*篮球*/
	public static final String BASKETBALL = "95";
	/*体育区标题*/
	public static final String[] SPORT_TITLES = new String[]{
			"惊奇体育", "足球", "篮球"};
	public static final String[] SPORT_TITLES_ID = new String[]{
			"93", "94", "95"};

	/*影视区*/
	public static final String TV = "96,97,98,99,100";
	/*电影*/
	public static final String FILM = "96";
	/*剧集*/
	public static final String EPISODES = "97";
	/*综艺*/
	public static final String VARIETY = "98";
	/*特摄.霹雳*/
	public static final String SFX_PILI = "99";
	/*纪录片*/
	public static final String DOCUMENTARY = "100";
	/*影视区标题*/
	public static final String[] TV_TITLES = new String[]{
			"电影", "剧集", "综艺", "特摄·霹雳", "纪录片"};
	public static final String[] TV_TITLES_ID = new String[]{
			"96", "97", "98", "99", "100"};

	/*应用版本 ?app_version=118*/
	public static final String APP_VERSION = "app_version";
	public static final String APP_NUM = "118";
	/*? &version=2*/
	public static final String VERSION = "version";
	public static final String VERSION_NUM = "2";
	/*请求响应的设备系统 sys_name=android*/
	public static final String SYS_NAME = "sys_name";
	public static final String SYS_NAME_ANDROID = "android";
	/*android版本 sys_version=5.1.1*/
	public static final String SYS_VERSION = "sys_version";
	public static final String SYS_VERSION_ANDROID = android.os.Build.VERSION.RELEASE;
	/*应用市场 market=m360*/
	public static final String MARKET = "market";
	public static final String MARKET_NAME = "succlz123";
	/*请求响应的设备分辨率 resolution=1080x1776*/
	public static final String RESOLUTION = "resolution";
	public static final String RESOLUTION_WIDTH_HEIGHT = GlobalUtils.getScreenWidthxHeight(MyApplication.getsInstance().getApplicationContext());
	/*请求页数 pageSize=10*/
	public static final String PAGE_SIZE = "pageSize";
	public static final String PAGE_SIZE_NUM = "10";

	/*pageNo=1*/
	public static final String PAGE_NO = "pageNo";
	public static final String PAGE_NO_NUM = "1";

	/*orderBy=4 最后回复 orderBy=5 时间排序  orderBy=6 评论最多 orderBy=7 人气最旺 */
	public static final String ORDER_BY = "orderBy";
	public static final String LAST_POST = "4";
	public static final String TIME_ORDER = "5";
	public static final String MOST_REPLY = "6";
	public static final String POPULARITY = "7";

	/*range=604800000 一周以内 range=2592000000 一月以内 range=7776000000 三月以内 不带range参数 全部*/
	public static final String RANGE = "range";
	public static final String ONE_WEEK = "604800000";
	public static final String ONE_MONTH = "2592000000";
	public static final String THREE_MONTH = "7776000000";

	/*乐视tv*/
	/*请求基础url*/
	public static final String LETV_URL_BASE = "http://api.letvcloud.com";
	public static final String LETV_URL_GPC = "/gpc.php";

	public static final String UU = "uu";
	public static final String UU_STRING = "2d8c027396";

	public static final String VU = "vu";

	public static final String CF = "cf";
	public static final String CF_TYPE = "android";

	public static final String FORMAT = "format";
	public static final String FORMAT_TYPE = "json";

	public static final String SIGN = "sign";
	public static final String SIGNXXXXX = "signxxxxx";

	public static final String LETV_VER = "ver";
	public static final String LETV_VER_NUM = "2.0";


}
