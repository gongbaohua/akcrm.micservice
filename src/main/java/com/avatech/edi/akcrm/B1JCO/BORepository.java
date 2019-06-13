package com.avatech.edi.akcrm.B1JCO;


import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.SBOCOMUtil;
import com.sap.smb.sbo.api.SBOErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BORepository {

    private final Logger logger = LoggerFactory.getLogger(BORepository.class);

    private volatile static ICompany company = null;
    private volatile static BORepository boRepository = null;

    private String server;
    private String companyDB;
    private String userName;
    private String password;
    private Integer laguage;
    private String licenseServer;
    private String sldServer;
    private Integer dbServerType;
    private String dbUsername;
    private String dbPassword;
    private Boolean useTrusted;

    public final static BORepository getInstance(B1Connection ib1Connection) {
        synchronized (BORepository.class) {
            if (null == boRepository ) {
                boRepository = new BORepository(ib1Connection);
            }else if( boRepository != null && !boRepository.getCompany().getCompanyDB().equals(ib1Connection.getCompanyDB())){
                boRepository.server = ib1Connection.getServer();
                boRepository.companyDB = ib1Connection.getCompanyDB();
                boRepository.userName = ib1Connection.getUserName();
                boRepository.password = ib1Connection.getPassword();
                boRepository.laguage = ib1Connection.getLanguage();
                boRepository.licenseServer = ib1Connection.getLicenseServer();
                boRepository.sldServer = ib1Connection.getSLDServer();
                boRepository.dbServerType = ib1Connection.getDBServerType();
                boRepository.dbUsername = ib1Connection.getDBUserName();
                boRepository.dbPassword = ib1Connection.getDBPassword();
                boRepository.useTrusted = ib1Connection.getIsUserTrusted();
            }
        }
        return boRepository;
    }

    private BORepository(B1Connection connection){
        this.server = connection.getServer();
        this.companyDB = connection.getCompanyDB();
        this.userName = connection.getUserName();
        this.password = connection.getPassword();
        this.laguage = connection.getLanguage();
        this.licenseServer = connection.getLicenseServer();
        this.sldServer = connection.getSLDServer();
        this.dbServerType = connection.getDBServerType();
        this.dbUsername = connection.getDBUserName();
        this.dbPassword = connection.getDBPassword();
        this.useTrusted = connection.getIsUserTrusted();
    }
    public final ICompany getCompany() throws B1Exception {
        synchronized (BORepository.class) {
            if (null == company) {
                return this.connect();
            } else {
                if(!companyDB.equals(company.getCompanyDB())){
                    company.disconnect();
                    return this.connect();
                }
                if(!company.isConnected())
                    return this.connect();
                return company;
            }
        }
    }
    private ICompany connect() throws B1Exception{
        if(company == null)
            company = SBOCOMUtil.newCompany();
        company.setServer(this.server);
        company.setCompanyDB(this.companyDB);
        company.setUserName(this.userName);
        company.setPassword(this.password);
        company.setDbServerType(this.dbServerType);
        company.setUseTrusted(this.useTrusted);
        company.setLanguage(this.laguage);
        company.setDbUserName(this.dbUsername);
        company.setDbPassword(this.dbPassword);
        company.setSLDServer(this.sldServer);
        company.setLicenseServer(this.licenseServer);
        int connectionResult = company.connect();
        if (connectionResult == 0) {
            logger.info("Successfully connected to " + company.getCompanyName());
        } else {
            SBOErrorMessage errMsg = company.getLastError();
            throw new B1Exception("Cannot connect to server: " + this.companyDB
                    + errMsg.getErrorMessage()
                    + " "
                    + errMsg.getErrorCode());
        }
        return company;
    }

    public void dispose(){
        if(company!=null ){
            if(company.isConnected()){
                company.disconnect();
                company.release();
            }
        }
    }
}
