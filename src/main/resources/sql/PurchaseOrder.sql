/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
        CREATE TABLE OCRD(
                    "CardCode" NVARCHAR(30) ,
                    "CardType" NVARCHAR(10) ,
                    "CardName" NVARCHAR(100) ,
                    "GroupCode" NVARCHAR(10) ,
                    "U_BLD" NVARCHAR(100) ,
                    "ValidFor" NVARCHAR(2) ,
                    "QryGroup1" NVARCHAR(2) ,
                    "QryGroup2" NVARCHAR(2) ,
                    "QryGroup3" NVARCHAR(2) ,
                    "QryGroup4" NVARCHAR(2) ,
                    "QryGroup5" NVARCHAR(2) ,
                    "QryGroup6" NVARCHAR(2) ,
                    "U_Field1" NVARCHAR(100) ,
                    "U_Field2" NVARCHAR(100) ,
                    "U_Field3" NVARCHAR(100) ,
                    "U_BUOP" NVARCHAR(100) ,
                    "sipcode" NVARCHAR(100) ,
                    "GTSRegNum" NVARCHAR(100) ,
                    "GTSBankAct" NVARCHAR(100) ,
                    "GTSBilAddr" NVARCHAR(100) ,
                    "Tell" NVARCHAR(100) ,
                    "Tel2" NVARCHAR(100) ,
                    "Cellular" NVARCHAR(100) ,
                    "U_ProLicense" NVARCHAR(100) ,
                    "U_Licedate" DATE(8) 
        );
        CREATE TABLE CRD1(
                    "CardCode" NVARCHAR(100) ,
                    "Address" NVARCHAR(200) ,
                    "street" NVARCHAR(200) 
        );
