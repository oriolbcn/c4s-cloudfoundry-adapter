/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudfoundry;

/**
 *
 * @author jled
 */
public class DatabaseObject {

    public static final String MYSQL = "MySQL";
    public static final String ORACLE = "Oracle";
    public static final String REDIS = "Redis";
    
    
    
    private String dbname;
    //private String dbuser;
   // private String dbpassword;
    private String dbidentifier;
    private String dbhost;
    private String dbtype=MYSQL;
    private Integer port=3306;

    /**
     * @return the dbname
     */
    public String getDbname() {
        return dbname;
    }

    /**
     * @param dbname the dbname to set
     */
    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    /**
     * @return the dbidentifier
     */
    public String getDbidentifier() {
        return dbidentifier;
    }

    /**
     * @param dbidentifier the dbidentifier to set
     */
    public void setDbidentifier(String dbidentifier) {
        this.dbidentifier = dbidentifier;
    }

    /**
     * @return the dbhost
     */
    public String getDbhost() {
        return dbhost;
    }

    /**
     * @param dbhost the dbhost to set
     */
    public void setDbhost(String dbhost) {
        this.dbhost = dbhost;
    }

    /**
     * @return the dbtype
     */
    public String getDbtype() {
        return dbtype;
    }

    /**
     * @param dbtype the dbtype to set
     */
    public void setDbtype(String dbtype) {
        this.dbtype = dbtype;
    }

    /**
     * @return the port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(Integer port) {
        this.port = port;
    }


    
}
