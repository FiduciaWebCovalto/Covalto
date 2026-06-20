package mx.com.inscitech.hsbc.services.v1.dtos.hogan;


public class HoganInvestmenTransfer {
    
    private String url = "http://localhost:8080/";
    private String path = "/v1/investment-accounts/transfer/";
    private String description = "TRANSFER DE INVERS A VISTA REF-00000000001";
    private String date = "11028";
    private String time = "301011";
    private String amount = "10003";
    private String sourceAccount = "6000004523";
    private String destinationAccount = "6000008789";
    private String locale = "en_MX";
    private String camLevel = "40";
    private String channelId = "WEB";
    private String chnlCountrycode = "MX";
    private String chnlGroupMember = "HBMX";
    private String ipId = "1.1.1.1";
    private String requestCorrelationId = "1345";
    private String sessionCorrelationId = "1234";
    private String srcDeviceId = "1234";
    private String srcUseragent = "Mozilla/5.0 (iPad; U; CPU OS 3_2_1 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Mobile/7B405";
    private String userId = "C12345678";
    private String clientId = "fce792c45c51481eaf910dc705b53433";
    private String clientSecret = "1af25da0d71d4dff8F07036AA1BD6AD7";
    private String eimId = "9999999999999";
    
    public HoganInvestmenTransfer() {
        super();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }

    public void setCamLevel(String camLevel) {
        this.camLevel = camLevel;
    }

    public String getCamLevel() {
        return camLevel;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChnlCountrycode(String chnlCountrycode) {
        this.chnlCountrycode = chnlCountrycode;
    }

    public String getChnlCountrycode() {
        return chnlCountrycode;
    }

    public void setChnlGroupMember(String chnlGroupMember) {
        this.chnlGroupMember = chnlGroupMember;
    }

    public String getChnlGroupMember() {
        return chnlGroupMember;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public String getIpId() {
        return ipId;
    }

    public void setRequestCorrelationId(String requestCorrelationId) {
        this.requestCorrelationId = requestCorrelationId;
    }

    public String getRequestCorrelationId() {
        return requestCorrelationId;
    }

    public void setSessionCorrelationId(String sessionCorrelationId) {
        this.sessionCorrelationId = sessionCorrelationId;
    }

    public String getSessionCorrelationId() {
        return sessionCorrelationId;
    }

    public void setSrcDeviceId(String srcDeviceId) {
        this.srcDeviceId = srcDeviceId;
    }

    public String getSrcDeviceId() {
        return srcDeviceId;
    }

    public void setSrcUseragent(String srcUseragent) {
        this.srcUseragent = srcUseragent;
    }

    public String getSrcUseragent() {
        return srcUseragent;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setEimId(String eimId) {
        this.eimId = eimId;
    }

    public String getEimId() {
        return eimId;
    }
}
