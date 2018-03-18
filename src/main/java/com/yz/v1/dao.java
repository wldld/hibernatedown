package com.yz.v1;

import com.yz.entity.Wallpaper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Queue;

public class dao {
    public static Session session;
    //获取数据库链接
    public static Session getSession(){
        Configuration configuration = new Configuration();
        configuration = configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        return session;
    }

    //数据库查询语句
    public static List<Wallpaper> select(int i){
        if (session ==null || !(session.isOpen())){
            session = getSession();
        }
        Transaction transaction = session.beginTransaction();
        String hql = "select Wallpaper from Wallpaper Wallpaper";
        Query query = session.createQuery(hql);
        query.setFirstResult(i);
        query.setMaxResults(10);
        List<Wallpaper> list = query.list();
        return list;
    }


}
