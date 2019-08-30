package ktb.bio.transfer.autosys.biotransferautosys.model;

import javax.persistence.Column;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class TransferResponse {

    private BigInteger iD;
    private String channel;
    private String compareImageChannel;
    private float confidenceLevel;
    private LocalDateTime createDate;
    private int engineTimeUsed;
    private String faceImage1;
    private String remark;
    private String requestID;
    private String result;
    private int totalTimeUsed;
    private String identifier;
    private String nameSpace;
    private String faceImage2;
    private boolean trustedSource;
    private String fingerPrint;
    private String userID;
    private String branchID;

    public TransferResponse() {
    }

    public BigInteger getiD() {
        return iD;
    }

    public void setiD(BigInteger iD) {
        this.iD = iD;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCompareImageChannel() {
        return compareImageChannel;
    }

    public void setCompareImageChannel(String compareImageChannel) {
        this.compareImageChannel = compareImageChannel;
    }

    public float getConfidenceLevel() {
        return confidenceLevel;
    }

    public void setConfidenceLevel(float confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public int getEngineTimeUsed() {
        return engineTimeUsed;
    }

    public void setEngineTimeUsed(int engineTimeUsed) {
        this.engineTimeUsed = engineTimeUsed;
    }

    public String getFaceImage1() {
        return faceImage1;
    }

    public void setFaceImage1(String faceImage1) {
        this.faceImage1 = faceImage1;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getTotalTimeUsed() {
        return totalTimeUsed;
    }

    public void setTotalTimeUsed(int totalTimeUsed) {
        this.totalTimeUsed = totalTimeUsed;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getFaceImage2() {
        return faceImage2;
    }

    public void setFaceImage2(String faceImage2) {
        this.faceImage2 = faceImage2;
    }

    public boolean isTrustedSource() {
        return trustedSource;
    }

    public void setTrustedSource(boolean trustedSource) {
        this.trustedSource = trustedSource;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }
}
