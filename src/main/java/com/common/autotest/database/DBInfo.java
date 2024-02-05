package com.common.autotest.database;

import com.common.autotest.utils.ConfigProperty;
import com.mysql.jdbc.StringUtils;

public class DBInfo {
    public DBInfo() {
    }

    public static String getConn() {
        String conn = "jdbc:mysql://rm-uf6mv40e7es4895h8mo.mysql.rds.aliyuncs.com:3306/?user=app&password=Cloudhis1234";
        String runmode = ConfigProperty.get("runmode");
        if (!StringUtils.isNullOrEmpty(runmode) && runmode.toLowerCase().startsWith("test")) {
            conn = "jdbc:mysql://10.0.128.115:3306/?user=tddl&password=tddl";
        }

        return conn;
    }

    public static String getConn(String connKey) {
        String dbConn = ConfigProperty.get(connKey);
        System.out.println(dbConn);
        return dbConn;
    }
}