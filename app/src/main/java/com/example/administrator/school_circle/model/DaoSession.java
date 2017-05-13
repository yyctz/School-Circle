package com.example.administrator.school_circle.model;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.school_circle.model.User;
import com.example.administrator.school_circle.model.CourseTable;

import com.example.administrator.school_circle.model.UserDao;
import com.example.administrator.school_circle.model.CourseTableDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig courseTableDaoConfig;

    private final UserDao userDao;
    private final CourseTableDao courseTableDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        courseTableDaoConfig = daoConfigMap.get(CourseTableDao.class).clone();
        courseTableDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        courseTableDao = new CourseTableDao(courseTableDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(CourseTable.class, courseTableDao);
    }
    
    public void clear() {
        userDaoConfig.clearIdentityScope();
        courseTableDaoConfig.clearIdentityScope();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public CourseTableDao getCourseTableDao() {
        return courseTableDao;
    }

}