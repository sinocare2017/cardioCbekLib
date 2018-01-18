# cardioCbekLib
三诺卡迪克设备接入lib

一，接入说明：
本jar包只包含蓝牙数据协议解析部分，不包含蓝牙连接功能实现。demo中蓝牙连接是参考android 蓝牙官方demo
对应的卡迪克蓝牙设备编号：ORNW40  

二，接入流程
1.集成jar到项目libs中
2.在项目接收到蓝牙广播过来数据的地方，
		   
		final byte[] data = characteristic.getValue();
		BaseData baseData  = CardioChekBlack.getInstance().parse(data);
		if(baseData != null){
		//获取到数据去执行你的业务逻辑
		}

（设备的蓝牙数据是分多次广播的，jar包中已经处理，集成jar只需要把每次收到数据传入parse中处理，会在数据接收完整时，返回给调用者一个完整的javaBean）

三，javaBean字段说明
    public String testTime;//测量时间
    public String unit;//测量单位
    public String valueChol;//总胆固醇
    public String valueTrig;//甘油三酯
    public String valueHdlChol;//高密度脂蛋白胆固醇
    public String valueCalcLdl;//低密度脂蛋白胆固醇
    public String valueTcHdl;//总胆/高密比值
