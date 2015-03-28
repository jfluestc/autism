package com.example3.demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter3 {
	public static final String KEY_ROWID = "id";
	public static final String Row = "con";
	private static final String TAG = "DBAdapter3" ;
	private static final String Database_name = "user3";
	private static final int Database_version = 1;
	private static final String Database_table = "introduce";
	private static final String CREATE_TABLE = "create table introduce(id integer primary key autoincrement,"
			+ "con text not null);";
	private DataBaseHelper DBHelper;
	private SQLiteDatabase db;
	private final Context context;
	public DBAdapter3(Context con){
		this.context = con;
	    DBHelper = new DataBaseHelper(context);
	}
	public class DataBaseHelper extends SQLiteOpenHelper{

		public DataBaseHelper(Context context) {
			super(context, Database_name, null,Database_version);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL(CREATE_TABLE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			Log.w(TAG, "Upgrading database from version"+oldVersion+"to"
			      + newVersion+"which destory all old data");
			db.execSQL("DROP TABLE IF EXISTS titles");
			onCreate(db);
		}
	}
	//打开数据库
	public DBAdapter3 open(){
		db = DBHelper.getWritableDatabase();
		return this;
	}
	//关闭数据库
	 public void close(){
		 DBHelper.close();
	 }
	 //插入一行数据
	 public void Insert(String content){
		 ContentValues cv = new ContentValues();
		 cv.put(Row,content);
		 db.insert(Database_table,null, cv);
	 }
	 //删除一行数据
	 public boolean Detele(int num){
		 db.delete(Database_table, KEY_ROWID+ "=" +num, null);
		 return true;
	 }
	 //按照序号查询一行数据
	 public Cursor getContent(int num) throws SQLException{
		 Cursor cs = db.query(Database_table, new String[]{KEY_ROWID,Row}, KEY_ROWID +"="+num,null, null,  null,  null,  null);
		return cs;
	 }
}
