package com.example.administrator.school_circle.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Telephone = new Property(0, String.class, "telephone", false, "TELEPHONE");
        public final static Property UserName = new Property(1, String.class, "userName", false, "USER_NAME");
        public final static Property Email = new Property(2, String.class, "email", false, "EMAIL");
        public final static Property Age = new Property(3, int.class, "age", false, "AGE");
        public final static Property RealName = new Property(4, String.class, "realName", false, "REAL_NAME");
        public final static Property Id = new Property(5, long.class, "id", true, "_id");
        public final static Property Account = new Property(6, String.class, "account", false, "ACCOUNT");
        public final static Property Password = new Property(7, String.class, "password", false, "PASSWORD");
        public final static Property CreateOn = new Property(8, java.util.Date.class, "createOn", false, "CREATE_ON");
        public final static Property Status = new Property(9, String.class, "status", false, "STATUS");
        public final static Property Birthday = new Property(10, java.util.Date.class, "birthday", false, "BIRTHDAY");
        public final static Property Avatar = new Property(11, String.class, "avatar", false, "AVATAR");
        public final static Property Token = new Property(12, String.class, "token", false, "TOKEN");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"TELEPHONE\" TEXT," + // 0: telephone
                "\"USER_NAME\" TEXT," + // 1: userName
                "\"EMAIL\" TEXT," + // 2: email
                "\"AGE\" INTEGER NOT NULL ," + // 3: age
                "\"REAL_NAME\" TEXT," + // 4: realName
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 5: id
                "\"ACCOUNT\" TEXT," + // 6: account
                "\"PASSWORD\" TEXT," + // 7: password
                "\"CREATE_ON\" INTEGER," + // 8: createOn
                "\"STATUS\" TEXT," + // 9: status
                "\"BIRTHDAY\" INTEGER," + // 10: birthday
                "\"AVATAR\" TEXT," + // 11: avatar
                "\"TOKEN\" TEXT);"); // 12: token
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(1, telephone);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(3, email);
        }
        stmt.bindLong(4, entity.getAge());
 
        String realName = entity.getRealName();
        if (realName != null) {
            stmt.bindString(5, realName);
        }
        stmt.bindLong(6, entity.getId());
 
        String account = entity.getAccount();
        if (account != null) {
            stmt.bindString(7, account);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(8, password);
        }
 
        java.util.Date createOn = entity.getCreateOn();
        if (createOn != null) {
            stmt.bindLong(9, createOn.getTime());
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(10, status);
        }
 
        java.util.Date birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindLong(11, birthday.getTime());
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(12, avatar);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(13, token);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(1, telephone);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(3, email);
        }
        stmt.bindLong(4, entity.getAge());
 
        String realName = entity.getRealName();
        if (realName != null) {
            stmt.bindString(5, realName);
        }
        stmt.bindLong(6, entity.getId());
 
        String account = entity.getAccount();
        if (account != null) {
            stmt.bindString(7, account);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(8, password);
        }
 
        java.util.Date createOn = entity.getCreateOn();
        if (createOn != null) {
            stmt.bindLong(9, createOn.getTime());
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(10, status);
        }
 
        java.util.Date birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindLong(11, birthday.getTime());
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(12, avatar);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(13, token);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 5);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // telephone
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // email
            cursor.getInt(offset + 3), // age
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // realName
            cursor.getLong(offset + 5), // id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // account
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // password
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // createOn
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // status
            cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)), // birthday
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // avatar
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // token
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setTelephone(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setUserName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setEmail(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAge(cursor.getInt(offset + 3));
        entity.setRealName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setId(cursor.getLong(offset + 5));
        entity.setAccount(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPassword(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCreateOn(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setStatus(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setBirthday(cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)));
        entity.setAvatar(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setToken(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
