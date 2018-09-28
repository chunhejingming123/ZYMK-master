package top.wzmyyj.zymk.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import top.wzmyyj.zymk.model.db.dao.FavorDb;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FAVOR_DB".
*/
public class FavorDbDao extends AbstractDao<FavorDb, Long> {

    public static final String TABLENAME = "FAVOR_DB";

    /**
     * Properties of entity FavorDb.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Update_time = new Property(2, long.class, "update_time", false, "UPDATE_TIME");
        public final static Property Chapter_name = new Property(3, String.class, "chapter_name", false, "CHAPTER_NAME");
        public final static Property Chapter_id = new Property(4, long.class, "chapter_id", false, "CHAPTER_ID");
        public final static Property IsUnRead = new Property(5, boolean.class, "isUnRead", false, "IS_UN_READ");
    }


    public FavorDbDao(DaoConfig config) {
        super(config);
    }
    
    public FavorDbDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FAVOR_DB\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TITLE\" TEXT NOT NULL ," + // 1: title
                "\"UPDATE_TIME\" INTEGER NOT NULL ," + // 2: update_time
                "\"CHAPTER_NAME\" TEXT," + // 3: chapter_name
                "\"CHAPTER_ID\" INTEGER NOT NULL ," + // 4: chapter_id
                "\"IS_UN_READ\" INTEGER NOT NULL );"); // 5: isUnRead
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FAVOR_DB\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FavorDb entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getTitle());
        stmt.bindLong(3, entity.getUpdate_time());
 
        String chapter_name = entity.getChapter_name();
        if (chapter_name != null) {
            stmt.bindString(4, chapter_name);
        }
        stmt.bindLong(5, entity.getChapter_id());
        stmt.bindLong(6, entity.getIsUnRead() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FavorDb entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getTitle());
        stmt.bindLong(3, entity.getUpdate_time());
 
        String chapter_name = entity.getChapter_name();
        if (chapter_name != null) {
            stmt.bindString(4, chapter_name);
        }
        stmt.bindLong(5, entity.getChapter_id());
        stmt.bindLong(6, entity.getIsUnRead() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public FavorDb readEntity(Cursor cursor, int offset) {
        FavorDb entity = new FavorDb( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // title
            cursor.getLong(offset + 2), // update_time
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // chapter_name
            cursor.getLong(offset + 4), // chapter_id
            cursor.getShort(offset + 5) != 0 // isUnRead
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FavorDb entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.getString(offset + 1));
        entity.setUpdate_time(cursor.getLong(offset + 2));
        entity.setChapter_name(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setChapter_id(cursor.getLong(offset + 4));
        entity.setIsUnRead(cursor.getShort(offset + 5) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FavorDb entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FavorDb entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FavorDb entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
