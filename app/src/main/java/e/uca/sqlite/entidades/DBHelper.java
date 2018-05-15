package e.uca.sqlite.entidades;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import e.uca.sqlite.Datos.Persona;

/**
 * Created by uca on 05-15-18.
 */

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_Name="bd_usuarios";
    public static final String TABLA_USUARIO="Persona";
    public static final String CAMPO_ID="dui";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CREAR_TABLA_USUARIO="CREATE TABLE"+TABLA_USUARIO+"("+CAMPO_ID+" TEXT,"+ CAMPO_NOMBRE+"TEXT)";
    public static DBHelper myDB = null;
    private Context context;
    SQLiteDatabase db;
    public static DBHelper getInstance(Context ctx){
        if (myDB == null){
            myDB =new DBHelper(ctx.getApplicationContext());
        }
        return myDB;
    }
    public DBHelper(Context context){
        super(context,DB_Name, null, 1);
        this.context=context;
        db=this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +CAMPO_NOMBRE);
        onCreate(db);
    }
    public boolean add(Persona p){
        ContentValues values = new ContentValues();
        values.put(CAMPO_ID,p.getDui());
        values.put(CAMPO_NOMBRE,p.getNombre());
        db.insert(TABLA_USUARIO,null,values);
        Toast.makeText(context, "Insertando con exito", Toast.LENGTH_SHORT).show();
        return true;
    }
    public Persona findUser(String dui){
        Persona p;
        String [] parametros = {dui};
        String [] campos = {CAMPO_NOMBRE};
        try{
            Cursor cursor =
        }
    }
}
