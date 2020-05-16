package com.icebns.utils;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtils {
    //静态代码块，只执行一次
    private static final String URL="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8";
    private static final String USER="root";
    private static final String PWD="123456";

    static {
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static void close(ResultSet rs,PreparedStatement pstmt,Connection conn){

        try {
            if(rs != null) {
                rs.close();
            }
            if (pstmt!=null){
                pstmt.close();
            }
            if (conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static int excuteUpdate(String sql,Object...objs){
        int result = 0;
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            for (int i=0;i<objs.length;i++){
                pstm.setObject(i+1,objs[i]);
            }
            result = pstm.executeUpdate();
            System.out.println("excuteUpdate result:"+result+"pstm:"+pstm+"conn:"+conn);
            System.out.println("pstm:"+pstm);
            System.out.println("conn:"+conn);
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            close(null,pstm,conn);
        }
        return result;
    }
    // 泛型<T>
    public static <T> List<T> excuteQuery(String sql,RowMap<T> rowMap,Object...objs){
        List<T> lists = new ArrayList<T>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PWD);
            pstm = conn.prepareStatement(sql);
            if (objs!=null){
                for (int i=0;i<objs.length;i++){
                    pstm.setObject(i+1,objs[i]);
                }
            }
            rs = pstm.executeQuery();
            while (rs.next()){
                T t = rowMap.rowMapping(rs);
                lists.add(t);
            }
            //查询
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(null,pstm,conn);
        }
        return lists;
    }

    public static <T> T queryOne(String sql,RowMap<T> rowMap,Object...objs){
        T t = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PWD);
            pstm = conn.prepareStatement(sql);
            if (objs!=null){
                for (int i=0;i<objs.length;i++){
                    pstm.setObject(i+1,objs[i]);
                }
            }
            rs = pstm.executeQuery();
            while (rs.next()){
                t = rowMap.rowMapping(rs);
            }
            //查询
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(null,pstm,conn);
        }
        return t;
    }


}


//    static {
//        //加载驱动
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
////        try {
////            Class.forName("com.mysql.jdbc.Driver");
////        } catch (ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////        try {
////            new Driver();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
//    }
//    private static Connection getConnection(){
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(URL,USER,PWD);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return conn;
//    }
//    private static void close(ResultSet rs,PreparedStatement pstmt,Connection conn){
//        try {
//            if(rs != null){
//                rs.close();
//            }
//            if(pstmt != null){
//                pstmt.close();
//            }
//            if (conn != null){
//                conn.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void add(String sql, Object... objs) {
//        System.out.println(sql);
//        Connection conn = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement(sql);
//            for(int i =0;i<objs.length;i++){
//                pstm.setObject(i+1,objs[i]);
//            }
//            int result=pstm.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(null,pstm,conn);
//        }
//    }
//    public void update() {
//        Connection conn = null;
////        Statement state = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement("update `test`.`names` set name=? where id = ?");
//            pstm.setString(1,"b5");
//            pstm.setInt(2,5);
////            String sql = "update `test`.`names` set name='张武阳' where id = 2";
////            int result = state.executeUpdate(sql);
//            int result = pstm.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(null,pstm,conn);
//        }
//    }
//    public void delete() {
//        Connection conn = null;
////        Statement state = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement("delete from `test`.`names` where id = ?");
//            pstm.setInt(1,6);
////            String sql = "delete from `test`.`names` where id = 1";
//            int result = pstm.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(null,pstm,conn);
//        }
//    }
//
//    //泛型，定义时不指定数据实际类型，在使用时再指明实际类型。
////    public interface List<E> extends Collection<E> {
////        int size();
////    }
//    public static <T> List<T> excuteQuery(String sql, RowMap<T> rowMap, Object... objs) {
//        List<T> lists = new ArrayList<T>();
//        Connection conn = null;
////        Statement state = null;
//        ResultSet rs = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement(sql);
//            if(objs!=null){
//                for(int i =0;i<objs.length;i++){
//                    pstm.setObject(i+1,objs[i]);
//                }
//            }
//            rs = pstm.executeQuery();
//            while (rs.next()){
//                T t = rowMap.rowMapping(rs);
//                lists.add(t);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rs,pstm,conn);
//        }
//        return lists;
//    }
//
//
//    public static <T> List<T> excuteQuery(String sql, RowMap<T> rowMap, Object... objs) {
//        List<T> t = new ArrayList<T>();
//        Connection conn = null;
////        Statement state = null;
//        ResultSet rs = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement(sql);
//            if(objs!=null){
//                for(int i =0;i<objs.length;i++){
//                    pstm.setObject(i+1,objs[i]);
//                }
//            }
//            rs = pstm.executeQuery();
//            while (rs.next()){
//                T t = rowMap.rowMapping(rs);
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rs,pstm,conn);
//        }
//        return t;
//    }
//
//    public static int excuteUpdate(String sql,Object... objs) {
//        int result = 0;
//        Connection conn = null;
////        Statement state = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement("update `test`.`names` set name=? where id = ?");
//            pstm.setString(1,"b5");
//            pstm.setInt(2,5);
//            result = pstm.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(null,pstm,conn);
//        }
//        return result;
//    }
//    public void insert() {
//        Connection conn = null;
//        PreparedStatement pstm = null;
//        try {
//            conn = getConnection();
//            pstm = conn.prepareStatement("insert into `test`.`names`(name,age) value(?,?)");
//            pstm.setString(1,"ab3");
//            pstm.setInt(2,5);
//            int result=pstm.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(null,pstm,conn);
//        }
//    }
//}
