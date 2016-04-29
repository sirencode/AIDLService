package com.braincol.aidl.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class RemoteService extends Service {
	private final static String TAG = "RemoteService";
	@Override
	public IBinder onBind(Intent intent) {
		Log.i(TAG, "ִOnBind");
		return new MyBinder();
	}

	private class MyBinder extends RemoteBeauty.Stub{
		@Override
		public String getAllInfo() throws RemoteException{
			return "名字:feifei 年龄:21  女";
		}
		@Override
		public Beauty getBeauty() throws RemoteException {
			Beauty beauty = new Beauty();
			beauty.setName("feifei");
			beauty.setAge(21);
			beauty.setSex("female");
			return beauty;
		}}
}
