package com.example3.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


@SuppressLint("SdCardPath")
public class Loggin extends ActionBarActivity {

	ProgressDialog pd;
	public static String dbName="user";//数据库的名字
	public static String dbName2="user2";//数据库的名字
	public static String dbName3="user3";//数据库的名字
	public static String dbName4="user4";//数据库的名字
	private static String DATABASE_PATH="/data/data/com.example3.demo/databases/";//数据库在手机里的路径
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loggin);	
		pd = new ProgressDialog(Loggin.this);
		pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		pd.setTitle("提示");
		pd.setMessage("Loading...");
		pd.show();
		
		boolean dbExist = checkDataBase();
        if(dbExist){
             
        }else{//不存在就把assets里的数据库写入手机
            try{
                copyDataBase();
            }catch(IOException e){
                throw new Error("Error copying database");
            }
        }
         
        new Thread(new Runnable() {
        	int count = 1;
            public void run() {                  
                while (count<=100) {
                    try {
                    	Thread.sleep(30);
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                    pd.setProgress(count++);
                }
                updateApp();
            }
        }).start();     
    }

    public void updateApp() {
    	try{
    		Intent in = new Intent(Loggin.this,MainActivity.class);
    		Loggin.this.startActivity(in);
    		Loggin.this.finish();
    		}catch(Exception e){}    
    }
    /**
     * 判断数据库是否存在
     * @return false or true
     */
    public boolean checkDataBase(){
        SQLiteDatabase checkDB = null;
        SQLiteDatabase checkDB2 = null;
        SQLiteDatabase checkDB3 = null;
        SQLiteDatabase checkDB4 = null;
        try{
            String databaseFilename = DATABASE_PATH+dbName;
            checkDB =SQLiteDatabase.openDatabase(databaseFilename, null,
                    SQLiteDatabase.OPEN_READONLY);
        }catch(SQLiteException e){
             
        }
        if(checkDB!=null){
            checkDB.close();
        }
        try{
            String databaseFilename2 = DATABASE_PATH+dbName2;
            checkDB2 =SQLiteDatabase.openDatabase(databaseFilename2, null,
                    SQLiteDatabase.OPEN_READONLY);
        }catch(SQLiteException e){
             
        }
        if(checkDB2!=null){
            checkDB2.close();
        }
        try{
            String databaseFilename3 = DATABASE_PATH+dbName3;
            checkDB3 =SQLiteDatabase.openDatabase(databaseFilename3, null,
                    SQLiteDatabase.OPEN_READONLY);
        }catch(SQLiteException e){
             
        }
        if(checkDB3!=null){
            checkDB3.close();
        }
        try{
            String databaseFilename4 = DATABASE_PATH+dbName4;
            checkDB4 =SQLiteDatabase.openDatabase(databaseFilename4, null,
                    SQLiteDatabase.OPEN_READONLY);
        }catch(SQLiteException e){
             
        }
        if(checkDB4!=null){
            checkDB4.close();
        }
        return (checkDB !=null)&&(checkDB2 !=null)&&(checkDB3 !=null)&&(checkDB4 !=null)?true:false;
    }
    /**
     * 复制数据库到手机指定文件夹下
     * @throws IOException
     */
    public void copyDataBase() throws IOException{
        String databaseFilenames  =DATABASE_PATH+dbName;
        String databaseFilenames2 =DATABASE_PATH+dbName2;
        String databaseFilenames3 =DATABASE_PATH+dbName3;
        String databaseFilenames4 =DATABASE_PATH+dbName4;
        File dir = new File(DATABASE_PATH);
        if(!dir.exists())//判断文件夹是否存在，不存在就新建一个
            dir.mkdir();
        FileOutputStream os = null;
        FileOutputStream os2 = null;
        FileOutputStream os3 = null;
        FileOutputStream os4 = null;
        try{
            os = new FileOutputStream(databaseFilenames);//得到数据库文件的写入流
            os2 = new FileOutputStream(databaseFilenames2);//得到数据库文件的写入流
            os3 = new FileOutputStream(databaseFilenames3);//得到数据库文件的写入流
            os4 = new FileOutputStream(databaseFilenames4);//得到数据库文件的写入流
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        InputStream is = getResources().getAssets().open(dbName);
        InputStream is2 = getResources().getAssets().open(dbName2);
        InputStream is3 = getResources().getAssets().open(dbName3);
        InputStream is4 = getResources().getAssets().open(dbName4);
        /*InputStream is = Loggin.this.getResources().openRawResource(R.raw.test);//得到数据库文件的数据流
*/      int length = is.available();
        int length2 = is2.available();
        int length3 = is3.available();
        int length4 = is4.available();
        byte[] buffer = new byte[length];
        byte[] buffer2 = new byte[length2];
        byte[] buffer3 = new byte[length3];
        byte[] buffer4 = new byte[length4];
        int count = 0;
        try{
             
            while((count=is.read(buffer))>0){
                os.write(buffer, 0, count);
                os.flush();
            }
        }catch(IOException e){
             
        }
        try{
            is.close();
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        count = 0;
        try{
            
            while((count=is2.read(buffer2))>0){
                os2.write(buffer2, 0, count);
                os2.flush();
            }
        }catch(IOException e){
             
        }
        try{
            is2.close();
            os2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        count = 0;
        try{
             
            while((count=is3.read(buffer3))>0){
                os3.write(buffer3, 0, count);
                os3.flush();
            }
        }catch(IOException e){
             
        }
        try{
            is3.close();
            os3.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        count = 0;
        try{
             
            while((count=is4.read(buffer4))>0){
                os4.write(buffer4, 0, count);
                os4.flush();
            }
        }catch(IOException e){
             
        }
        try{
            is4.close();
            os4.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}