/*
 *  UVCCamera
 *  library and sample to access to UVC web camera on non-rooted Android device
 *
 * Copyright (c) 2014-2017 saki t_saki@serenegiant.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  All files in the folder are under this Apache License, Version 2.0.
 *  Files in the libjpeg-turbo, libusb, libuvc, rapidjson folder
 *  may have a different license, see the respective files.
 */

package com.example.mav_mr_fpv_osu_2020.lib.usb;

import android.util.SparseArray;

public class USBVendorId {
	private static final SparseArray<String> IDS = new SparseArray<String>();

	public static String vendorName(final int vendor_id) {
		return IDS.get(vendor_id);
	}

	static {
		IDS.put(10006, "YUEN DA ELECTRONIC PRODUCTS FACTORY");
		IDS.put(10013, "Gionee Communication Equipment Co., Ltd. ShenZhen");
		IDS.put(10022, "Universal Electronics Inc. (dba: TVIEW)");
		IDS.put(1003, "Atmel Corporation");
		IDS.put(1006, "Mitsumi");
		IDS.put(1008, "HP Inc.");
		IDS.put(10112, "M31 Technology Corp.");
		IDS.put(10113, "Liteconn Co., Ltd.");
		IDS.put(10121, "Suzhou WEIJU Electronics Technology Co., Ltd.");
		IDS.put(10144, "Mondokey Limited");
		IDS.put(10149, "Advantest Corporation");
		IDS.put(10150, "iRobot Corporation");
		IDS.put(1020, "Elitegroup Computer Systems");
		IDS.put(1021, "Xilinx Inc.");
		IDS.put(10226, "Sibridge Tech.");
		IDS.put(1026, "ALi Corporation");
		IDS.put(1027, "Future Technology Devices International Limited");
		IDS.put(10275, "Dongguan Jiumutong Industry Co., Ltd.");
		IDS.put(10289, "Power Integrations");
		IDS.put(10291, "Oculus VR, Inc.");
		IDS.put(10300, "HIGH TEK HARNESS ENTERPRISE CO., LTD.");
		IDS.put(10316, "Full in Hope Co., Ltd.");
		IDS.put(1032, "Quanta Computer Inc.");
		IDS.put(10329, "Viconn Technology (HK) Co., Ltd.");
		IDS.put(1033, "NEC Corporation");
		IDS.put(1035, "Weltrend Semiconductor");
		IDS.put(1037, "VIA Technologies, Inc.");
		IDS.put(10374, "Seeed Technology Co., Ltd.");
		IDS.put(10375, "Specwerkz");
		IDS.put(1038, "MCCI Corporation");
		IDS.put(10398, "Esselte Leitz GmbH & Co. KG");
		IDS.put(10406, "E-SEEK Inc.");
		IDS.put(1041, "BUFFALO INC.");
		IDS.put(10423, "Pleora Technologies Inc.");
		IDS.put(10431, "Vitetech Int'l Co., Ltd.");
		IDS.put(1044, "Giga-Byte Technology Co., Ltd.");
		IDS.put(10446, "Changzhou Shi Wujin Miqi East Electronic Co., Ltd.");
		IDS.put(10457, "Shenzhen Ourconn Technology Co., Ltd.");
		IDS.put(10458, "G.SKILL Int'l Enterprice Co., Ltd.");
		IDS.put(1046, "Nuvoton Technology Corp.");
		IDS.put(10466, "Surplus Electronic Technology Co., Ltd.");
		IDS.put(10470, "BIAMP SYSTEMS");
		IDS.put(10509, "IBCONN Technologies (Shenzhen) Co., Ltd.");
		IDS.put(10510, "Fugoo Inc.");
		IDS.put(10519, "Pan Xin Precision Electronics Co., Ltd.");
		IDS.put(10530, "Dongguan Digi-in Digital Technology Co., Ltd.");
		IDS.put(1054, "Creative Labs");
		IDS.put(10540, "GENUSION, Inc.");
		IDS.put(10544, "Ineda Systems Inc.");
		IDS.put(10545, "Jolla Ltd.");
		IDS.put(10546, "Peraso Technologies, Inc.");
		IDS.put(10549, "Nanjing Magewell Electronics Co., Ltd.");
		IDS.put(10560, "Shenzhen Yiwanda Electronics Co., Ltd.");
		IDS.put(1057, "Nokia Corporation");
		IDS.put(10575, "Dollar Connection Ltd.");
		IDS.put(10595, "BIO-key International, Inc.");
		IDS.put(1060, "Microchip-SMSC");
		IDS.put(10603, "Xacti Corporation");
		IDS.put(10615, "Shenzhen Zowee Technology Co., Ltd.");
		IDS.put(10643, "ADPlaus Technology Limited");
		IDS.put(10646, "Unwired Technology");
		IDS.put(1065, "Cirrus Logic Inc.");
		IDS.put(10657, "Union Electric Plug & Connector Corp.");
		IDS.put(10674, "Canova Tech");
		IDS.put(10685, "Silicon Works");
		IDS.put(10695, "HANRICO ANFU ELECTRONICS CO., LTD.");
		IDS.put(10700, "Kodak Alaris");
		IDS.put(10702, "JGR Optics Inc.");
		IDS.put(10703, "Richtek Technology Corporation");
		IDS.put(10705, "Binatone Electronics Int. Ltd.");
		IDS.put(1071, "Molex Inc.");
		IDS.put(10715, "Shenzhen iBoard Technology Co., Ltd.");
		IDS.put(10719, "SMIT(HK) Limited");
		IDS.put(1072, "Fujitsu Component Limited");
		IDS.put(10725, "Dongguan Kechenda Electronic Technology Co., Ltd.");
		IDS.put(10726, "Fengshun Peiying Electro-Acoustic Co., Ltd.");
		IDS.put(10744, "MD ELEKTRONIK GmbH");
		IDS.put(10749, "Bad Elf, LLC");
		IDS.put(10770, "Vreo Limited");
		IDS.put(10772, "Kanex");
		IDS.put(10781, "Oxford Nanopore Technologies");
		IDS.put(10782, "Obsidian Technology");
		IDS.put(10783, "Lucent Trans Electronics Co., Ltd.");
		IDS.put(10784, "GUOGUANG GROUP CO., LTD.");
		IDS.put(10788, "CNPLUS");
		IDS.put(10789, "Fourstar Group");
		IDS.put(10790, "Tragant International Co., Ltd.");
		IDS.put(10791, "DongGuan LianGang Optoelectronic Technology Co., Ltd.");
		IDS.put(10797, "Atrust Computer Corp.");
		IDS.put(10798, "VIA Alliance Semiconductor Co., Ltd.");
		IDS.put(10799, "BSUN Electronics Co., Ltd.");
		IDS.put(1080, "Advanced Micro Devices");
		IDS.put(10807, "RTD Embedded Technologies, Inc.");
		IDS.put(10816, "Shenzhen Choseal Industrial Co., Ltd.");
		IDS.put(10817, "Canyon Semiconductor");
		IDS.put(10818, "Spectra7 Microsystems Corp.");
		IDS.put(10821, "Meizu Technology Co., Ltd.");
		IDS.put(10822, "Hubei Yingtong Telecommunication Cable Inc.");
		IDS.put(10829, "Wilder Technologies");
		IDS.put(10837, "Diodes Inc.");
		IDS.put(10846, "DuPont");
		IDS.put(1085, "Lexmark International Inc.");
		IDS.put(10852, "Zhejiang Songcheng Electronics Co., Ltd.");
		IDS.put(10859, "VSN Mobil");
		IDS.put(10875, "Bellwether Electronic Corp.");
		IDS.put(10878, "VAIO Corporation");
		IDS.put(10879, "Perixx Computer GmbH");
		IDS.put(10885, "HANK ELECTRONICS CO., LTD");
		IDS.put(10892, "Sonnet Technologies, Inc.");
		IDS.put(10893, "Keysight Technologies Inc.");
		IDS.put(10895, "Manutronics Vietnam Joint Stock Company");
		IDS.put(10900, "G2 Touch Co., Ltd.");
		IDS.put(10902, "Micromax Informatics Ltd");
		IDS.put(10910, "SEIKO SOLUTIONS Inc.");
		IDS.put(10912, "Casco Products Corp.");
		IDS.put(10922, "Virtium Technology, Inc.");
		IDS.put(10923, "Field and Company LLC, dba Leef USA");
		IDS.put(10928, "GM Global Technology Operations LLC");
		IDS.put(10931, "Key Asic Inc.");
		IDS.put(10943, "Revolabs, Inc.");
		IDS.put(10945, "Lattice Semiconductor Corp");
		IDS.put(10947, "Foshan Nanhai Saga Audio Equipment Co., Ltd.");
		IDS.put(10957, "Silergy Corp.");
		IDS.put(10963, "Shenzhen Hali-Power Industrial Co., Ltd.");
		IDS.put(10971, "I-PEX (Dai-ichi Seiko)");
		IDS.put(10973, "SEE-PLUS INDUSTRIAL LTD.");
		IDS.put(10990, "Adapt-IP Company");
		IDS.put(10997, "Libratone A/S");
		IDS.put(10999, "Shenzhen Hazens Automotive Electronics (SZ) Co., Ltd.");
		IDS.put(11000, "Jiangsu Toppower Automotive Electronics Co., Ltd.");
		IDS.put(11001, "Drapho Electronics Technology Co., Ltd.");
		IDS.put(1102, "Alps Electric Co., Ltd.");
		IDS.put(11022, "Le Shi Zhi Xin Electronic Technology (Tian Jin) Limited");
		IDS.put(11024, "Cardiac Insight, Inc.");
		IDS.put(11028, "EverPro Technologies Company, Ltd.");
		IDS.put(11029, "Rosenberger Hochfrequenztechnik");
		IDS.put(11035, "Dongguan City Sanji Electronics Co., Ltd.");
		IDS.put(11037, "Lintes Technology Co., Ltd.");
		IDS.put(11039, "KinnexA, Inc.");
		IDS.put(11042, "Metra Electronics Corp.");
		IDS.put(11044, "KeepKey, LLC");
		IDS.put(11047, "FluxData Incorporated");
		IDS.put(1105, "Texas Instruments");
		IDS.put(11061, "Assem Technology Co., Ltd.");
		IDS.put(11062, "Dongguan City Jianghan Electronics Co., Ltd.");
		IDS.put(11063, "Huizhou Desay SV Automotive Co., Ltd.");
		IDS.put(11064, "Ningbo Rixing Electronics Co., Ltd.");
		IDS.put(11069, "GuangDong YuanFeng Automotive Electroics Co., Ltd.");
		IDS.put(11080, "Sounding Audio Industrial Limited");
		IDS.put(11082, "Yueqing Huaxin Electronic Co., Ltd.");
		IDS.put(11098, "Universal Audio, Inc.");
		IDS.put(11111, "Lifesize, Inc.");
		IDS.put(11123, "Pioneer DJ Corporation");
		IDS.put(11124, "Embedded Intelligence, Inc.");
		IDS.put(11125, "New Matter");
		IDS.put(11126, "Shanghai Wingtech Electronic Technology Co., Ltd.");
		IDS.put(11127, "Epiphan Systems Inc.");
		IDS.put(11130, "Spin Master Far East Ltd.");
		IDS.put(11131, "Gigaset Digital Technology (Shenzhen) Co., Ltd.");
		IDS.put(11132, "Noveltek Semiconductor Corp.");
		IDS.put(11139, "Silicon Line GmbH");
		IDS.put(11140, "Ever Win International Corp.");
		IDS.put(11144, "Socionext Inc.");
		IDS.put(11145, "Ugreen Group Limited");
		IDS.put(11146, "Shanghai Pateo Electronic Equipment Mfg. Co., Ltd.");
		IDS.put(1115, "Renesas Electronics Corp.");
		IDS.put(11154, "i-BLADES, Inc.");
		IDS.put(11155, "Altia Systems Inc.");
		IDS.put(11156, "ShenZhen Baoyuanda Electronics Co., Ltd.");
		IDS.put(11157, "iST - Integrated Service Technology Inc.");
		IDS.put(11158, "HYUNDAI MOBIS Co., Ltd.");
		IDS.put(11161, "360fly, Inc.");
		IDS.put(11162, "HUIZHOU CHENG SHUO HARDWARE PLASTIC CO., LTD.");
		IDS.put(11163, "Zhongshan Aute Electronics Technology Co., Ltd.");
		IDS.put(11164, "Guangdong King Link Industrial Co., Ltd.");
		IDS.put(11167, "Scietera Technologies, Inc.");
		IDS.put(11168, "InVue Security Products");
		IDS.put(11169, "I-Sheng Electric Wire & Cable Co., Ltd.");
		IDS.put(11170, "China Daheng Group Inc Beijing Image Vision Tech Branch");
		IDS.put(11171, "Shenzhen FeiTianXia Technology Ltd.");
		IDS.put(11172, "Shenzhen HengJia New Energy Auto Part Co., Ltd.");
		IDS.put(11175, "77 Elektronika Kft.");
		IDS.put(11176, "YUDU EASON ELECTRONIC CO., LTD.");
		IDS.put(1118, "Microsoft Corporation");
		IDS.put(11181, "XIN JI (SHENZHEN) COMPUTER PARTS CO., LTD.");
		IDS.put(11189, "Silk ID Systems");
		IDS.put(11190, "3D Imaging & Simulations Corp. (3DISC)");
		IDS.put(11191, "Dongguan ChengXiang Industrial Co., Ltd.");
		IDS.put(11192, "OCC (Zhuhai) Electronic Co., Ltd.");
		IDS.put(11194, "Sinseader Electronic Co., Ltd.");
		IDS.put(11195, "DONGGUAN YELLOWKNIFE Industrial Co., Ltd.");
		IDS.put(11197, "RF Creations Ltd.");
		IDS.put(11198, "Chengyi Semiconductors (Shanghai) Co., Ltd.");
		IDS.put(11199, "Shenzhen Shinning Electronic Co., Ltd.");
		IDS.put(11200, "Shenzhen WFD Electronics Co., Ltd.");
		IDS.put(11201, "Dongguan Sino Syncs Industrial Co., Ltd.");
		IDS.put(11202, "JNTC Co., Ltd.");
		IDS.put(11208, "DONGGUAN POLIXIN ELECTRIC CO., LTD.");
		IDS.put(11209, "Tama Electric (Suzhou) Co., Ltd.");
		IDS.put(1121, "Primax Electronics");
		IDS.put(11210, "Exvision, Inc.");
		IDS.put(11216, "mophie, LLC");
		IDS.put(11219, "Dongguan ULT-unite electronic technology co., LTD");
		IDS.put(11220, "JL Audio, Inc.");
		IDS.put(11221, "Cable Matters Inc.");
		IDS.put(11222, "CoroWare, Inc.");
		IDS.put(11229, "Charm Sciences Inc.");
		IDS.put(1123, "EATON");
		IDS.put(11230, "Pickering Interfaces Limited");
		IDS.put(11231, "Hangzhou Hikvision Digital Technology Co., Ltd.");
		IDS.put(11232, "FULLINK ELECTRONICS TECHNOLOGY (SZ) LTD");
		IDS.put(11233, "AutoChips Inc.");
		IDS.put(11234, "Electric Connector Technology Co., Ltd.");
		IDS.put(11237, "LELTEK");
		IDS.put(11238, "Dongguan KaiWin Electronics Co., Ltd.");
		IDS.put(11239, "BEFS Co., Ltd.");
		IDS.put(11240, "Archisite, Inc.");
		IDS.put(11241, "Magneti Marelli S.p.A Electr BL");
		IDS.put(11246, "Ventev Mobile");
		IDS.put(11247, "Quanta Storage Inc.");
		IDS.put(11248, "Tech-Top Technology Limited");
		IDS.put(11253, "Shenzhen YOOBAO Technology Co., Ltd.");
		IDS.put(11254, "Shenzhen Sinotek Technology Co., Ltd.");
		IDS.put(11255, "KEYW");
		IDS.put(11256, "Visual Land Inc.");
		IDS.put(11264, "MEEM SL Ltd");
		IDS.put(11265, "Dongguan Arin Electronics Technology Co., Ltd.");
		IDS.put(11266, "DongGuan City JianNuo Electronics Co., Ltd.");
		IDS.put(11268, "Shenzhen XOX Electronics Co., Ltd.");
		IDS.put(11269, "Protop International Inc.");
		IDS.put(11270, "Microsemi Semiconductor (US) Inc.");
		IDS.put(11271, "Webcloak LLC");
		IDS.put(11272, "INVECAS INC.");
		IDS.put(11274, "ATANS Technology Inc.");
		IDS.put(11275, "Triple Win Precision Technology Co., Ltd.");
		IDS.put(11276, "IC Realtech");
		IDS.put(11277, "Embrava Pty Ltd");
		IDS.put(1128, "Wieson Technologies Co., Ltd.");
		IDS.put(11280, "Sinotronics Co., Ltd.");
		IDS.put(11281, "ALLBEST ELECTRONICS TECHNOLOGY CO., LTD.");
		IDS.put(11282, "Shenzhen Xin Kai Feng Electronics Factory");
		IDS.put(11283, "MOST WELL Technology Corp.");
		IDS.put(11284, "Buffalo Memory Co., Ltd.");
		IDS.put(11285, "Xentris Wireless");
		IDS.put(11286, "Priferential Accessories Ltd");
		IDS.put(11289, "Sunlike Technology Co., Ltd.");
		IDS.put(11290, "Young Fast Optoelectronics Co., Ltd.");
		IDS.put(11291, "ISAW Camera Inc");
		IDS.put(11298, "Qanba USA, LLC");
		IDS.put(11299, "Super Micro Computer Inc.");
		IDS.put(11302, "Micromax International Corporation");
		IDS.put(11304, "Granite River Labs Japan Ltd.");
		IDS.put(11305, "Coagent Enterprise Limited");
		IDS.put(11306, "LEIA Inc.");
		IDS.put(11309, "Shenzhen Ebull Technology Limited");
		IDS.put(1131, "American Megatrends");
		IDS.put(11310, "Hualun Technology Co., Ltd.");
		IDS.put(11311, "Sensel, Inc.");
		IDS.put(11319, "Shenzhen Adition Audio Science & Technology Co., Ltd.");
		IDS.put(11320, "Goldenconn Electronics Technology (Suzhou) Co., Ltd.");
		IDS.put(11321, "JIB Electronics Technology Co., Ltd.");
		IDS.put(11322, "Changzhou Shinco Automotive Electronics Co., Ltd.");
		IDS.put(11323, "Shenzhen Hangsheng Electronics Corp., Ltd.");
		IDS.put(11324, "Beartooth Radio, Inc.");
		IDS.put(11325, "Audience, A Knowles Company");
		IDS.put(11327, "Nextbit Systems, Inc.");
		IDS.put(11328, "Leadtrend");
		IDS.put(11329, "Adaptertek Technology Co., Ltd.");
		IDS.put(1133, "Logitech Inc.");
		IDS.put(11330, "Feature Integration Technology Inc.");
		IDS.put(11331, "Avegant Corporation");
		IDS.put(11335, "Chunghsin International Electronics Co., Ltd.");
		IDS.put(11336, "Delphi Electrical Centers (Shanghai) Co., Ltd.");
		IDS.put(11341, "VVETEK DOO");
		IDS.put(11347, "Huizhou Foryou General Electronics Co., Ltd.");
		IDS.put(11348, "LifeWatch Technologies Ltd.");
		IDS.put(11349, "Magicleap");
		IDS.put(11355, "Dongguan City Shenglan Electronics Co., LTD.");
		IDS.put(11356, "Neusoft Corporation");
		IDS.put(11357, "SIP Simya Electronics Technology Co., Ltd.");
		IDS.put(11358, "GNSD Automotive Co., Ltd.");
		IDS.put(11359, "YOODS Co., Ltd.");
		IDS.put(11360, "Sirin Mobile Technologies AG");
		IDS.put(11361, "Jadmam Corporation dba: Boytone");
		IDS.put(11373, "Gibson Innovations");
		IDS.put(11374, "Shen Zhen Xian Shuo Technology Co. LTD");
		IDS.put(11375, "PST Eletronica LTDA");
		IDS.put(11376, "PERI, Inc.");
		IDS.put(11377, "Bozhou BoTong Information Technology Co., Ltd.");
		IDS.put(11383, "Profindustry GmbH");
		IDS.put(11384, "BRAGI GmbH");
		IDS.put(11385, "WAWGD, Inc. (DBA: Foresight Sports)");
		IDS.put(11390, "Dongguan Allpass Electronic Co., Ltd.");
		IDS.put(11391, "SHENZHEN D-VITEC INDUSTRIAL CO., LTD.");
		IDS.put(11392, "motomobile AG");
		IDS.put(11393, "Indie Semiconductor");
		IDS.put(11397, "Audientes");
		IDS.put(11403, "Huizhou Dehong Technology Co., Ltd.");
		IDS.put(11404, "PowerCenter Technology Limited");
		IDS.put(11405, "Mizco International, Inc.");
		IDS.put(11408, "I. AM. PLUS, LLC");
		IDS.put(11409, "Corigine, Inc.");
		IDS.put(11410, "Ningbo Yinzhou Shengke Electronics Co., Ltd.");
		IDS.put(11417, "Prusa Research s.r.o.");
		IDS.put(11423, "e-Smart Systems Pvt. Ltd.");
		IDS.put(11424, "Leagtech Jiangxi Electronic Co., Ltd.");
		IDS.put(11425, "Dongguan Yujia Electronics Technology Co., Ltd.");
		IDS.put(11426, "GuangZhou MingPing Electronics Technology");
		IDS.put(11427, "DJI Technology Co., Ltd.");
		IDS.put(11428, "Shenzhen Alex Technology Co., Ltd.");
		IDS.put(11433, "JITS TECHNOLOGY CO., LIMITED");
		IDS.put(11434, "LIVV Brand llc");
		IDS.put(11444, "Ava Enterprises, Inc. dba: Boss Audio Systems");
		IDS.put(11448, "Shenzhen Sydixon Electronic Technology Co., Ltd.");
		IDS.put(11449, "On-Bright Electronics (Shanghai) Co., Ltd.");
		IDS.put(11450, "Dongguan Puxu Industrial Co., Ltd.");
		IDS.put(11451, "Shenzhen Soling Indusrtial Co., Ltd.");
		IDS.put(11453, "EGGCYTE, INC.");
		IDS.put(11455, "Donggguan Yuhua Electronic Co., Ltd.");
		IDS.put(11456, "Hangzhou Zero Zero Technology Co., Ltd.");
		IDS.put(11462, "Prodigy Technovations Pvt Ltd");
		IDS.put(11463, "EmergiTech, Inc");
		IDS.put(11464, "Hewlett Packard Enterprise");
		IDS.put(11465, "Monolithic Power Systems Inc.");
		IDS.put(11467, "USB Memory Direct");
		IDS.put(11468, "Silicon Mitus Inc.");
		IDS.put(11472, "Technics Global Electronics & JCE Co., Ltd.");
		IDS.put(11478, "Immersive Media");
		IDS.put(11479, "Cosemi Technologies Inc.");
		IDS.put(11481, "Cambrionix Ltd");
		IDS.put(11482, "CXUN Co. Ltd.");
		IDS.put(11483, "China Tsp Inc");
		IDS.put(11490, "Yanfeng Visteon (Chongqing) Automotive Electronics Co");
		IDS.put(11491, "Alcorlink Corp.");
		IDS.put(11492, "ISBC Ltd.");
		IDS.put(11493, "InX8 Inc dba: AKiTiO");
		IDS.put(11494, "SDAN Tecchnology Co., Ltd.");
		IDS.put(11495, "Lemobile Information Technology (Beijing) Co., Ltd.");
		IDS.put(11496, "GongGuan HWX Electronic Technology Co., Ltd.");
		IDS.put(11497, "Suzhu Jingshi Electronic Technology Co., Ltd.");
		IDS.put(11498, "Zhong Shan City Richsound Electronic Industrial Ltd.");
		IDS.put(11499, "Dongguang Kangbang Electronics Co., Ltd.");
		IDS.put(1151, "Plantronics, Inc.");
		IDS.put(1154, "Kyocera Corporation");
		IDS.put(1155, "STMicroelectronics");
		IDS.put(1161, "Foxconn / Hon Hai");
		IDS.put(1165, "ITE Tech Inc.");
		IDS.put(1177, "Yamaha Corporation");
		IDS.put(1188, "Hitachi, Ltd.");
		IDS.put(1191, "Visioneer");
		IDS.put(1193, "Canon Inc.");
		IDS.put(1200, "Nikon Corporation");
		IDS.put(1201, "Pan International");
		IDS.put(1204, "Cypress Semiconductor");
		IDS.put(1205, "ROHM Co., Ltd.");
		IDS.put(1207, "Compal Electronics, Inc.");
		IDS.put(1208, "Seiko Epson Corp.");
		IDS.put(1211, "I-O Data Device, Inc.");
		IDS.put(1221, "Fujitsu Ltd.");
		IDS.put(1227, "FUJIFILM Corporation");
		IDS.put(1238, "Mentor Graphics");
		IDS.put(1240, "Microchip Technology Inc.");
		IDS.put(1241, "Holtek Semiconductor, Inc.");
		IDS.put(1242, "Panasonic Corporation");
		IDS.put(1245, "Sharp Corporation");
		IDS.put(1250, "Exar Corporation");
		IDS.put(1254, "Identiv, Inc.");
		IDS.put(1256, "Samsung Electronics Co., Ltd.");
		IDS.put(1260, "Tokyo Electron Device Limited");
		IDS.put(1266, "Chicony Electronics Co., Ltd.");
		IDS.put(1271, "Newnex Technology Corp.");
		IDS.put(1273, "Brother Industries, Ltd.");
		IDS.put(1276, "SUNPLUS TECHNOLOGY CO., LTD.");
		IDS.put(1278, "PFU Limited");
		IDS.put(1281, "Fujikura/DDK");
		IDS.put(1282, "Acer, Inc.");
		IDS.put(1287, "Hosiden Corporation");
		IDS.put(1293, "Belkin International, Inc.");
		IDS.put(1300, "FCI Electronics");
		IDS.put(1302, "Longwell Electronics/Longwell Company");
		IDS.put(1305, "Star Micronics Co., LTD");
		IDS.put(1309, "American Power Conversion");
		IDS.put(1314, "ACON, Advanced-Connectek, Inc.");
		IDS.put(1343, "Synopsys, Inc.");
		IDS.put(1356, "Sony Corporation");
		IDS.put(1360, "Fuji Xerox Co., Ltd.");
		IDS.put(1367, "ATEN International Co. Ltd.");
		IDS.put(1369, "Cadence Design Systems, Inc.");
		IDS.put(1386, "WACOM Co., Ltd.");
		IDS.put(1389, "EIZO Corporation");
		IDS.put(1390, "Elecom Co., Ltd.");
		IDS.put(1394, "Conexant Systems, Inc.");
		IDS.put(1398, "BAFO/Quality Computer Accessories");
		IDS.put(1403, "Y-E Data, Inc.");
		IDS.put(1404, "AVM GmbH");
		IDS.put(1410, "Roland Corporation");
		IDS.put(1412, "RATOC Systems, Inc.");
		IDS.put(1419, "Infineon Technologies");
		IDS.put(1423, "Alcor Micro, Corp.");
		IDS.put(1424, "OMRON Corporation");
		IDS.put(1447, "Bose Corporation");
		IDS.put(1449, "OmniVision Technologies, Inc.");
		IDS.put(1452, "Apple");
		IDS.put(1453, "Y.C. Cable U.S.A., Inc");
		IDS.put(14627, "National Instruments");
		IDS.put(1470, "Tyco Electronics Corp., a TE Connectivity Ltd. company");
		IDS.put(1473, "MegaChips Corporation");
		IDS.put(1478, "Qualcomm, Inc");
		IDS.put(1480, "Foxlink/Cheng Uei Precision Industry Co., Ltd.");
		IDS.put(1482, "Ricoh Company Ltd.");
		IDS.put(1498, "Microtek International Inc.");
		IDS.put(1504, "Symbol Technologies");
		IDS.put(1507, "Genesys Logic, Inc.");
		IDS.put(1509, "Fuji Electric Co., Ltd.");
		IDS.put(1525, "Unixtar Technology Inc.");
		IDS.put(1529, "Datalogic ADC");
		IDS.put(1535, "LeCroy Corporation");
		IDS.put(1539, "Novatek Microelectronics Corp.");
		IDS.put(1545, "SMK Manufacturing Inc.");
		IDS.put(1551, "Joinsoon Electronics Mfg. Co., Ltd.");
		IDS.put(1555, "TransAct Technologies Incorporated");
		IDS.put(1561, "Seiko Instruments Inc.");
		IDS.put(1582, "JPC/MAIN SUPER Inc.");
		IDS.put(1583, "Sin Sheng Terminal & Machine Inc.");
		IDS.put(1593, "Chrontel, Inc.");
		IDS.put(1611, "Analog Devices, Inc. Development Tools");
		IDS.put(1612, "Ji-Haw Industrial Co., Ltd");
		IDS.put(1614, "Suyin Corporation");
		IDS.put(1621, "Space Shuttle Hi-Tech Co.,Ltd.");
		IDS.put(1622, "Glory Mark Electronic Ltd.");
		IDS.put(1623, "Tekcon Electronics Corp.");
		IDS.put(1624, "Sigma Designs, Inc.");
		IDS.put(1631, "Good Way Technology Co., Ltd. & GWC technology Inc");
		IDS.put(1632, "TSAY-E (BVI) International Inc.");
		IDS.put(1633, "Hamamatsu Photonics K.K.");
		IDS.put(1642, "Total Technologies, Ltd.");
		IDS.put(1659, "Prolific Technology, Inc.");
		IDS.put(16700, "Dell Inc.");
		IDS.put(1680, "Golden Bridge Electech Inc.");
		IDS.put(1689, "Tektronix, Inc.");
		IDS.put(1690, "Askey Computer Corporation");
		IDS.put(1709, "Greatland Electronics Taiwan Ltd.");
		IDS.put(1710, "Eurofins Digital Testing Belgium");
		IDS.put(1720, "Pixela Corporation");
		IDS.put(1724, "Oki Data Corporation");
		IDS.put(1727, "Leoco Corporation");
		IDS.put(1732, "Bizlink Technology, Inc.");
		IDS.put(1736, "SIIG, Inc.");
		IDS.put(1747, "Mitsubishi Electric Corporation");
		IDS.put(1758, "Heisei Technology Co., Ltd.");
		IDS.put(1802, "Oki Electric Industry Co., Ltd.");
		IDS.put(1805, "Comoss Electronic Co., Ltd.");
		IDS.put(1809, "Magic Control Technology Corp.");
		IDS.put(1816, "Imation Corp.");
		IDS.put(1838, "Sunix Co., Ltd.");
		IDS.put(1846, "Lorom Industrial Co., Ltd.");
		IDS.put(1848, "Mad Catz, Inc.");
		IDS.put(1899, "HID Global GmbH");
		IDS.put(1901, "Denso Corporation");
		IDS.put(1913, "Fairchild Semiconductor");
		IDS.put(1921, "SanDisk Corporation");
		IDS.put(1937, "Copartner Technology Corporation");
		IDS.put(1954, "National Technical Systems");
		IDS.put(1971, "Plustek, Inc.");
		IDS.put(1972, "OLYMPUS CORPORATION");
		IDS.put(1975, "TIME Interconnect Ltd.");
		IDS.put(1994, "AVerMedia Technologies, Inc.");
		IDS.put(1999, "Casio Computer Co., Ltd.");
		IDS.put(2015, "David Electronics Company, Ltd.");
		IDS.put(2039, "Century Corporation");
		IDS.put(2058, "Evermuch Technology Co., Ltd.");
		IDS.put(2101, "Action Star Enterprise Co., Ltd.");
		IDS.put(2112, "Argosy Research Inc.");
		IDS.put(2122, "Wipro Limited");
		IDS.put(2159, "MEC IMEX INC/HPT");
		IDS.put(2205, "Icron Technologies Corporation");
		IDS.put(2247, "TAI TWUN ENTERPRISE CO., LTD.");
		IDS.put(2276, "Pioneer Corporation");
		IDS.put(2278, "Gemalto SA");
		IDS.put(2310, "FARADAY Technology Corp.");
		IDS.put(2313, "Audio-Technica Corp.");
		IDS.put(2316, "Silicon Motion, Inc. - Taiwan");
		IDS.put(2334, "Garmin International");
		IDS.put(2352, "Toshiba Corporation");
		IDS.put(2362, "Pixart Imaging, Inc.");
		IDS.put(2363, "Plextor LLC");
		IDS.put(2366, "J.S.T. Mfg. Co., Ltd.");
		IDS.put(2385, "Kingston Technology Company");
		IDS.put(2389, "NVIDIA");
		IDS.put(2395, "Medialogic Corporation");
		IDS.put(2397, "Polycom, Inc.");
		IDS.put(2468, "Contech Research, Inc.");
		IDS.put(2472, "Lin Shiung Enterprise Co., Ltd.");
		IDS.put(2475, "Japan Cash Machine Co., Ltd.");
		IDS.put(2498, "NISCA Corporation");
		IDS.put(2511, "Electronics Testing Center, Taiwan");
		IDS.put(2522, "A-FOUR TECH CO., LTD.");
		IDS.put(2555, "Altera");
		IDS.put(2578, "Cambridge Silicon Radio Ltd.");
		IDS.put(2583, "HOYA Corporation");
		IDS.put(2631, "Hirose Electric Co., Ltd.");
		IDS.put(2636, "COMPUTEX Co., Ltd.");
		IDS.put(2640, "Mimaki Engineering Co., Ltd.");
		IDS.put(2652, "Broadcom Corp.");
		IDS.put(2667, "Green House Co., Ltd.");
		IDS.put(2702, "Japan Aviation Electronics Industry Ltd. (JAE)");
		IDS.put(2727, "Wincor Nixdorf GmbH & Co KG");
		IDS.put(2733, "Rohde & Schwarz GmbH & Co. KG");
		IDS.put(2787, "Allion Labs, Inc.");
		IDS.put(2821, "ASUSTek Computer Inc.");
		IDS.put(2849, "Yokogawa Electric Corporation");
		IDS.put(2851, "Pan-Asia Electronics Co., Ltd.");
		IDS.put(2894, "Musical Electronics Ltd.");
		IDS.put(2907, "Anritsu Corporation");
		IDS.put(2922, "Maxim Integrated Products");
		IDS.put(2965, "ASIX Electronics Corporation");
		IDS.put(2967, "O2Micro, Inc.");
		IDS.put(3010, "Seagate Technology LLC");
		IDS.put(3034, "Realtek Semiconductor Corp.");
		IDS.put(3035, "Ericsson AB");
		IDS.put(3044, "Elka International Ltd.");
		IDS.put(3056, "Pace Micro Technology PLC");
		IDS.put(3108, "Taiyo Yuden Co., Ltd.");
		IDS.put(3129, "Aeroflex");
		IDS.put(3132, "Radius Co., Ltd.");
		IDS.put(3141, "Sonix Technology Co., Ltd.");
		IDS.put(3158, "Billion Bright (HK) Corporation Limited");
		IDS.put(3161, "Dong Guan Shinko Wire Co., Ltd.");
		IDS.put(3170, "Chant Sincere Co., Ltd");
		IDS.put(3190, "Solid State System Co., Ltd.");
		IDS.put(3209, "Honda Tsushin Kogyo Co., Ltd");
		IDS.put(3245, "Motorola Solutions");
		IDS.put(3255, "Singatron Enterprise Co. Ltd.");
		IDS.put(3268, "emsys Embedded Systems GmbH");
		IDS.put(32902, "Intel Corporation");
		IDS.put(3294, "Z-Com INC.");
		IDS.put(3313, "e-CONN ELECTRONIC CO., LTD.");
		IDS.put(3314, "ENE Technology Inc.");
		IDS.put(3351, "NALTEC, Inc.");
		IDS.put(3402, "NF Corporation");
		IDS.put(3403, "Grape Systems Inc.");
		IDS.put(3409, "Volex (Asia) Pte Ltd");
		IDS.put(3425, "MEILU ELECTRONICS (SHENZHEN) CO., LTD.");
		IDS.put(3441, "Hirakawa Hewtech Corp.");
		IDS.put(3452, "Taiwan Line Tek Electronic Co., Ltd.");
		IDS.put(3463, "Dolby Laboratories Inc.");
		IDS.put(3468, "C-MEDIA ELECTRONICS INC.");
		IDS.put(3472, "Sure-Fire Electrical Corporation");
		IDS.put(3495, "IOGEAR, Inc.");
		IDS.put(3504, "Micro-Star International Co., Ltd.");
		IDS.put(3537, "Contek Electronics Co., Ltd.");
		IDS.put(3540, "Custom Engineering SPA");
		IDS.put(3641, "Smart Modular Technologies, Inc.");
		IDS.put(3658, "Shenzhen Bao Hing Electric Wire & Cable Mfr. Co.");
		IDS.put(3673, "Bourns, Inc.");
		IDS.put(3690, "Megawin Technology Co., Ltd.");
		IDS.put(3698, "Hsi-Chin Electronics Co., Ltd.");
		IDS.put(3714, "Ching Tai Electric Wire & Cable Co., Ltd.");
		IDS.put(3724, "Well Force Electronic Co., Ltd");
		IDS.put(3725, "MediaTek Inc.");
		IDS.put(3728, "CRU");
		IDS.put(3744, "Ours Technology Inc.");
		IDS.put(3762, "Y-S ELECTRONIC CO., LTD.");
		IDS.put(3778, "Sweetray Industrial Ltd.");
		IDS.put(3779, "Axell Corporation");
		IDS.put(3782, "InnoVISION Multimedia Limited");
		IDS.put(3790, "TaiSol Electronics Co., Ltd.");
		IDS.put(3812, "Sunrich Technology (H.K.) Ltd.");
		IDS.put(3868, "Funai Electric Co., Ltd.");
		IDS.put(3873, "IOI Technology Corporation");
		IDS.put(3890, "YFC-BonEagle Electric Co., Ltd.");
		IDS.put(3896, "Nien-Yi Industrial Corp.");
		IDS.put(3916, "WORLDWIDE CABLE OPTO CORP.");
		IDS.put(3923, "Taiyo Cable (Dongguan) Co. Ltd.");
		IDS.put(3924, "Kawai Musical Instruments Mfg. Co., Ltd.");
		IDS.put(3936, "GuangZhou Chief Tech Electronic Technology Co. Ltd.");
		IDS.put(3944, "UQUEST, LTD.");
		IDS.put(3991, "CviLux Corporation");
		IDS.put(4003, "Chief Land Electronic Co., Ltd.");
		IDS.put(4046, "Sony Mobile Communications");
		IDS.put(4087, "CHI SHING COMPUTER ACCESSORIES CO., LTD.");
		IDS.put(4096, "Speed Tech Corp.");
		IDS.put(4100, "LG Electronics Inc.");
		IDS.put(4101, "Apacer Technology Inc.");
		IDS.put(4134, "Newly Corporation");
		IDS.put(4168, "Targus Group International");
		IDS.put(4172, "AMCO TEC International Inc.");
		IDS.put(4183, "ON Semiconductor");
		IDS.put(4184, "Western Digital Technologies, Inc.");
		IDS.put(4227, "CANON ELECTRONICS INC.");
		IDS.put(4235, "Grand-tek Technology Co., Ltd.");
		IDS.put(4236, "Robert Bosch GmbH");
		IDS.put(4238, "Lotes Co., Ltd.");
		IDS.put(4266, "Cables To Go");
		IDS.put(4267, "Universal Global Scientific Industrial Co., Ltd.");
		IDS.put(4292, "Silicon Laboratories, Inc.");
		IDS.put(4301, "Kycon Inc.");
		IDS.put(4362, "Moxa Inc.");
		IDS.put(4370, "Golden Bright (Sichuan) Electronic Technology Co Ltd");
		IDS.put(4382, "VSO ELECTRONICS CO., LTD.");
		IDS.put(4398, "Master Hill Electric Wire and Cable Co., Ltd.");
		IDS.put(4477, "Santa Electronic Inc.");
		IDS.put(4505, "Sierra Wireless Inc.");
		IDS.put(4522, "GlobalMedia Group, LLC");
		IDS.put(4528, "ATECH FLASH TECHNOLOGY");
		IDS.put(4643, "SKYCABLE ENTERPRISE CO., LTD.");
		IDS.put(4703, "ADATA Technology Co., Ltd.");
		IDS.put(4716, "Aristocrat Technologies");
		IDS.put(4717, "Bel Stewart");
		IDS.put(4742, "MARVELL SEMICONDUCTOR, INC.");
		IDS.put(4756, "RISO KAGAKU CORP.");
		IDS.put(4792, "Zhejiang Xinya Electronic Technology Co., Ltd.");
		IDS.put(4817, "Huawei Technologies Co., Ltd.");
		IDS.put(4823, "Better Holdings (HK) Limited");
		IDS.put(4907, "Konica Minolta, Inc.");
		IDS.put(4925, "Jasco Products Company");
		IDS.put(4989, "Pericom Semiconductor Corp.");
		IDS.put(5008, "TomTom International B.V.");
		IDS.put(5075, "AzureWave Technologies, Inc.");
		IDS.put(5117, "Initio Corporation");
		IDS.put(5118, "Phison Electronics Corp.");
		IDS.put(5134, "Telechips, Inc.");
		IDS.put(5145, "ABILITY ENTERPRISE CO., LTD.");
		IDS.put(5148, "Leviton Manufacturing");
		IDS.put(5271, "Panstrong Company Ltd.");
		IDS.put(5293, "CTK Corporation");
		IDS.put(5296, "StarTech.com Ltd.");
		IDS.put(5376, "Ellisys");
		IDS.put(5404, "VeriSilicon Holdings Co., Ltd.");
		IDS.put(5421, "JMicron Technology Corp.");
		IDS.put(5422, "HLDS (Hitachi-LG Data Storage, Inc.)");
		IDS.put(5440, "Phihong Technology Co., Ltd.");
		IDS.put(5451, "PNY Technologies Inc.");
		IDS.put(5453, "Rapid Conn, Connect County Holdings Bhd");
		IDS.put(5454, "D & M Holdings, Inc.");
		IDS.put(5480, "Sunf Pu Technology Co., Ltd");
		IDS.put(5488, "ALLTOP TECHNOLOGY CO., LTD.");
		IDS.put(5510, "Palconn Technology Co., Ltd.");
		IDS.put(5528, "Kunshan Guoji Electronics Co., Ltd.");
		IDS.put(5546, "DongGuan Ya Lian Electronics Co., Ltd.");
		IDS.put(5645, "Samtec");
		IDS.put(5694, "HongLin Electronics Co., Ltd.");
		IDS.put(5753, "Total Phase");
		IDS.put(5766, "ZOOM Corporation");
		IDS.put(5836, "silex technology, Inc.");
		IDS.put(5946, "F. Hoffmann-La Roche AG");
		IDS.put(5960, "MQP Electronics Ltd.");
		IDS.put(5964, "ASMedia Technology Inc.");
		IDS.put(5998, "UD electronic corp.");
		IDS.put(6001, "Shenzhen Alex Connector Co., Ltd.");
		IDS.put(6002, "System Level Solutions, Inc.");
		IDS.put(6018, "Spreadtrum Hong Kong Limited");
		IDS.put(6024, "ShenZhen Litkconn Technology Co., Ltd.");
		IDS.put(6053, "Advanced Connection Technology Inc.");
		IDS.put(6095, "Hip Hing Cable & Plug Mfy. Ltd.");
		IDS.put(6121, "DisplayLink (UK) Ltd.");
		IDS.put(6127, "Lenovo");
		IDS.put(6133, "K.K. Rocky");
		IDS.put(6160, "Wanshih Electronic Co., Ltd.");
		IDS.put(6185, "Dongguan YuQiu Electronics Co., Ltd.");
		IDS.put(6193, "Gwo Jinn Industries Co., Ltd.");
		IDS.put(6297, "Linkiss Co., Ltd.");
		IDS.put(6353, "Google Inc.");
		IDS.put(6394, "Kuang Ying Computer Equipment Co., Ltd.");
		IDS.put(6421, "Nordic Semiconductor ASA");
		IDS.put(6448, "Shenzhen Xianhe Technology Co., Ltd.");
		IDS.put(6449, "Ningbo Broad Telecommunication Co., Ltd.");
		IDS.put(6470, "Irisguard UK Ltd");
		IDS.put(6473, "Lab126");
		IDS.put(6481, "Hyperstone GmbH");
		IDS.put(6487, "BIOS Corporation");
		IDS.put(6626, "Solomon Systech Limited");
		IDS.put(6639, "Pak Heng Technology (Shenzhen) Co., Ltd.");
		IDS.put(6655, "Best Buy China Ltd.");
		IDS.put(6666, "USB-IF non-workshop");
		IDS.put(6709, "Artesyn Technologies Inc.");
		IDS.put(6720, "TERMINUS TECHNOLOGY INC.");
		IDS.put(6766, "Global Unichip Corp.");
		IDS.put(6786, "Proconn Technology Co., Ltd.");
		IDS.put(6794, "Simula Technology Inc.");
		IDS.put(6795, "SGS Taiwan Ltd.");
		IDS.put(6830, "Johnson Component & Equipments Co., Ltd.");
		IDS.put(6834, "Allied Vision Technologies GmbH");
		IDS.put(6859, "Salcomp Plc");
		IDS.put(6865, "Desan Wire Co., Ltd.");
		IDS.put(6944, "MStar Semiconductor, Inc.");
		IDS.put(6984, "Plastron Precision Co., Ltd.");
		IDS.put(7013, "The Hong Kong Standards and Testing Centre Ltd.");
		IDS.put(7048, "ShenMing Electron (Dong Guan) Co., Ltd.");
		IDS.put(7086, "Vuzix Corporation");
		IDS.put(7108, "Ford Motor Co.");
		IDS.put(7118, "Contac Cable Industrial Limited");
		IDS.put(7119, "Sunplus Innovation Technology Inc.");
		IDS.put(7120, "Hangzhou Riyue Electronics Co., Ltd.");
		IDS.put(7158, "Orient Semiconductor Electronics, Ltd.");
		IDS.put(7207, "SHENZHEN DNS INDUSTRIES CO., LTD.");
		IDS.put(7217, "LS Mtron Ltd.");
		IDS.put(7229, "NONIN MEDICAL INC.");
		IDS.put(7275, "Philips & Lite-ON Digital Solutions Corporation");
		IDS.put(7310, "ASTRON INTERNATIONAL CORP.");
		IDS.put(7320, "ALPINE ELECTRONICS, INC.");
		IDS.put(7347, "Aces Electronics Co., Ltd.");
		IDS.put(7348, "OPEX CORPORATION");
		IDS.put(7390, "Telecommunications Technology Association (TTA)");
		IDS.put(7434, "Visteon Corporation");
		IDS.put(7465, "Horng Tong Enterprise Co., Ltd.");
		IDS.put(7501, "Pegatron Corporation");
		IDS.put(7516, "Fresco Logic Inc.");
		IDS.put(7529, "Walta Electronic Co., Ltd.");
		IDS.put(7543, "Yueqing Changling Electronic Instrument Corp., Ltd.");
		IDS.put(7584, "Parade Technologies, Inc.");
		IDS.put(7647, "L&T Technology Services");
		IDS.put(7649, "Actions Microelectronics Co., Ltd.");
		IDS.put(7666, "China Telecommunication Technology Labs - Terminals");
		IDS.put(7668, "SHEN ZHEN FORMAN PRECISION INDUSTRY CO., LTD.");
		IDS.put(7682, "GLOBEMASTER TECHNOLOGIES CO., LTD.");
		IDS.put(7696, "Point Grey Research Inc.");
		IDS.put(7751, "HUNG TA H.T.ENTERPRISE CO., LTD.");
		IDS.put(7758, "Etron Technology, Inc.");
		IDS.put(7795, "COMLINK ELECTRONICS CO., LTD.");
		IDS.put(7818, "HIBEST Electronic (DongGuan) Co., Ltd.");
		IDS.put(7825, "Other World Computing");
		IDS.put(7863, "WIN WIN PRECISION INDUSTRIAL CO., LTD.");
		IDS.put(7879, "Gefen Inc.");
		IDS.put(7881, "MOSER BAER INDIA LIMITED");
		IDS.put(7898, "AIRTIES WIRELESS NETWORKS");
		IDS.put(7956, "Astoria Networks GmbH");
		IDS.put(7969, "Scosche Industries");
		IDS.put(7976, "Cal-Comp Electronics & Communications");
		IDS.put(7977, "Analogix Semiconductor, Inc.");
		IDS.put(7989, "Amphenol ShouhMin Industry (ShenZhen) Co., Ltd");
		IDS.put(7996, "Chang Yang Electronics Company Ltd.");
		IDS.put(8073, "Dongguan Goldconn Electronics Co., Ltd.");
		IDS.put(8074, "Morning Star Industrial Co., Ltd.");
		IDS.put(8117, "Unify Software and Solutions GmbH & Co. KG");
		IDS.put(8137, "NXP Semiconductors");
		IDS.put(8181, "Changzhou Wujin BEST Electronic Cables Co., Ltd.");
		IDS.put(8205, "Belkin Electronic (Changzhou) Co., Ltd.");
		IDS.put(8220, "Freeport Resources Enterprises Corp.");
		IDS.put(8222, "Qingdao Haier Telecom Co., Ltd.");
		IDS.put(8284, "Shenzhen Tronixin Electronics Co., Ltd.");
		IDS.put(8294, "Unicorn Electronics Components Co., Ltd.");
		IDS.put(8334, "Luxshare-ICT");
		IDS.put(8341, "CE LINK LIMITED");
		IDS.put(8342, "Microconn Electronic Co., Ltd.");
		IDS.put(8367, "Shenzhen CARVE Electronics Co., Ltd.");
		IDS.put(8382, "BURY GmbH & Co. KG");
		IDS.put(8384, "FENGHUA KINGSUN CO., LTD.");
		IDS.put(8386, "Sumitomo Electric Ind., Ltd., Optical Comm. R&D Lab");
		IDS.put(8439, "XIMEA s.r.o.");
		IDS.put(8457, "VIA Labs, Inc.");
		IDS.put(8492, "Shenzhen Linoya Electronic Co., Ltd.");
		IDS.put(8494, "Amphenol AssembleTech (Xiamen) Co., Ltd.");
		IDS.put(8524, "Y Soft Corporation");
		IDS.put(8550, "JVC KENWOOD Corporation");
		IDS.put(8564, "Transcend Information, Inc.");
		IDS.put(8566, "TMC/Allion Test Labs");
		IDS.put(8613, "Genesis Technology USA, Inc.");
		IDS.put(8627, "Dongguan Teconn Electronics Technology Co., Ltd.");
		IDS.put(8644, "Netcom Technology (HK) Limited");
		IDS.put(8659, "Compupack Technology Co., Ltd.");
		IDS.put(8667, "G-Max Technology Co., Ltd.");
		IDS.put(8679, "Sagemcom Broadband SAS");
		IDS.put(8695, "Wuerth-Elektronik eiSos GmbH & Co. KG");
		IDS.put(8707, "Shin Shin Co., Ltd.");
		IDS.put(8709, "3eYamaichi Electronics Co., Ltd.");
		IDS.put(8710, "Wiretek International Investment Ltd.");
		IDS.put(8711, "Fuzhou Rockchip Electronics Co., Ltd.");
		IDS.put(8752, "Plugable Technologies");
		IDS.put(8756, "T-CONN PRECISION CORPORATION");
		IDS.put(8831, "Granite River Labs");
		IDS.put(8842, "Hotron Precision Electronic Ind. Corp.");
		IDS.put(8875, "Trigence Semiconductor, Inc.");
		IDS.put(8888, "Motorola Mobility Inc.");
		IDS.put(8904, "Karming Electronic (Shenzhen) Co., Ltd.");
		IDS.put(8981, "Avery Design Systems, Inc.");
		IDS.put(8993, "iKingdom Corp. (d.b.a. iConnectivity)");
		IDS.put(9051, "KangXiang Electronic Co., Ltd.");
		IDS.put(9068, "ZheJiang Chunsheng Electronics Co., Ltd.");
		IDS.put(9130, "DOK (HK) Trading Limited");
		IDS.put(9132, "Marunix Electron Limited");
		IDS.put(9165, "Avconn Precise Connector Co., Ltd.");
		IDS.put(9184, "BitifEye Digital Test Solutions GmbH");
		IDS.put(9205, "Speed Conn Co., Ltd.");
		IDS.put(9222, "INSIDE Secure");
		IDS.put(9292, "Minebea Co., Ltd.");
		IDS.put(9299, "BAANTO");
		IDS.put(9338, "Suzhou Jutze Technologies Co., Ltd");
		IDS.put(9355, "DONGGUAN SYNCONN PRECISION INDUSTRY CO. LTD.");
		IDS.put(9382, "Shenzhen Pangngai Industrial Co., Ltd.");
		IDS.put(9422, "Shenzhen Deren Electronic Co., Ltd.");
		IDS.put(9424, "Smith Micro Software, Inc.");
		IDS.put(9453, "ZEN FACTORY GROUP (ASIA) LTD.");
		IDS.put(9481, "Chain-In Electronic Co., Ltd.");
		IDS.put(9514, "SUZHOU KELI TECHNOLOGY DEVELOPMENT CO., LTD.");
		IDS.put(9515, "TOP Exactitude Industry (ShenZhen) Co., Ltd.");
		IDS.put(9525, "ShenZhen Hogend Precision Technology Co., Ltd.");
		IDS.put(9527, "Norel Systems Ltd.");
		IDS.put(9556, "ASSA ABLOY AB");
		IDS.put(9575, "DongGuan LongTao Electronic Co., Ltd.");
		IDS.put(9577, "DongGuan City MingJi Electronics Co., Ltd.");
		IDS.put(9589, "Weida Hi-Tech Co., Ltd.");
		IDS.put(9593, "Dongguan Wisechamp Electronic Co., Ltd.");
		IDS.put(9613, "Sequans Communications");
		IDS.put(9636, "ALGOLTEK, INC.");
		IDS.put(9651, "DongGuan Elinke Industrial Co., Ltd.");
		IDS.put(9679, "Corning Optical Communications LLC");
		IDS.put(9714, "Dongguan Jinyue Electronics Co., Ltd.");
		IDS.put(9723, "RICOH IMAGING COMPANY, LTD.");
		IDS.put(9742, "DongGuan HYX Industrial Co., Ltd.");
		IDS.put(9753, "Advanced Silicon SA");
		IDS.put(9756, "EISST Limited");
		IDS.put(9771, "YTOP Electronics Technical (Kunshan) Co., Ltd.");
		IDS.put(9841, "Innovative Logic");
		IDS.put(9842, "GoPro");
		IDS.put(9846, "Basler AG");
		IDS.put(9851, "Palpilot International Corp.");
		IDS.put(9896, "UNIREX CORPORATION");
		IDS.put(9917, "Integral Memory Plc.");
		IDS.put(9973, "Morning Star Digital Connector Co., Ltd.");
		IDS.put(9984, "MITACHI CO., LTD.");
		IDS.put(9999, "HGST, a Western Digital Company");
	}
}
