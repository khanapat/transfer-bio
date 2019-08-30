package ktb.bio.transfer.autosys.biotransferautosys.entity;

import lombok.Cleanup;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "face_comparison_transaction")
public class TransferEntity {
    @Id
    @Column(name = "id", columnDefinition = "bigint")
    private BigInteger iD;
    @Column(name = "channel", columnDefinition = "varchar")
    private String channel;
    @Column(name = "compare_image_channel", columnDefinition = "varchar")
    private String compareImageChannel;
    @Column(name = "confidence_level", columnDefinition = "float")
    private float confidenceLevel;
    @Column(name = "create_date", columnDefinition = "datetime")
    private LocalDateTime createDate;
    @Column(name = "engine_time_used", columnDefinition = "int")
    private int engineTimeUsed;
    @Column(name = "face_image1", columnDefinition = "ntext")
    private String faceImage1;
    @Column(name = "remark", columnDefinition = "varchar")
    private String remark;
    @Column(name = "request_id", columnDefinition = "varchar")
    private String requestID;
    @Column(name = "result", columnDefinition = "varchar")
    private String result;
    @Column(name = "total_time_used", columnDefinition = "int")
    private int totalTimeUsed;
    @Column(name = "identifier", columnDefinition = "varchar")
    private String identifier;
    @Column(name = "namespace", columnDefinition = "varchar")
    private String nameSpace;
    @Column(name = "face_image2", columnDefinition = "ntext")
    private String faceImage2;
    @Column(name = "trusted_source", columnDefinition = "bit")
    private boolean trustedSource;
    @Column(name = "fingerprint", columnDefinition = "varchar")
    private String fingerPrint;
    @Column(name = "user_id", columnDefinition = "varchar")
    private String userID;
    @Column(name = "branch_id", columnDefinition = "varchar")
    private String branchID;

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
