package com.yuxue.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_plate_type
 * @author yuxue
 * 2020-09-30 16:54:41.815
 */
@Data
@NoArgsConstructor
public class PlateTypeEntity implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(example="Integer-id")
    private Integer id;

    /**
     * typeName
     */
    @ApiModelProperty(example="String-typeName")
    private String typeName;

    /**
     * plateColor
     */
    @ApiModelProperty(example="String-plateColor")
    private String plateColor;

    /**
     * charColor
     */
    @ApiModelProperty(example="String-charColor")
    private String charColor;

    /**
     * charCount
     */
    @ApiModelProperty(example="Integer-charCount")
    private Integer charCount;

    /**
     * chIndex
     */
    @ApiModelProperty(example="String-chIndex")
    private String chIndex;

    /**
     * lineCount
     */
    @ApiModelProperty(example="Integer-lineCount")
    private Integer lineCount;

    /**
     * heightPx
     */
    @ApiModelProperty(example="Integer-heightPx")
    private Integer heightPx;

    /**
     * widthPx
     */
    @ApiModelProperty(example="Integer-widthPx")
    private Integer widthPx;

    /**
     * heightGb
     */
    @ApiModelProperty(example="Integer-heightGb")
    private Integer heightGb;

    /**
     * widthGb
     */
    @ApiModelProperty(example="Integer-widthGb")
    private Integer widthGb;

    /**
     * plateMinH
     */
    @ApiModelProperty(example="Integer-plateMinH")
    private Integer plateMinH;

    /**
     * plateMaxH
     */
    @ApiModelProperty(example="Integer-plateMaxH")
    private Integer plateMaxH;

    /**
     * charMinH
     */
    @ApiModelProperty(example="Integer-charMinH")
    private Integer charMinH;

    /**
     * charMaxH
     */
    @ApiModelProperty(example="Integer-charMaxH")
    private Integer charMaxH;

    /**
     * remark
     */
    @ApiModelProperty(example="String-remark")
    private String remark;

    /**
     * createTime
     */
    @ApiModelProperty(example="String-createTime")
    private String createTime;

    /**
     * creatorId
     */
    @ApiModelProperty(example="Integer-creatorId")
    private Integer creatorId;

    /**
     * version
     */
    @ApiModelProperty(example="Integer-version")
    private Integer version;

    /**
     * delFlag
     */
    @ApiModelProperty(example="Integer-delFlag")
    private Integer delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public String getCharColor() {
        return charColor;
    }

    public void setCharColor(String charColor) {
        this.charColor = charColor;
    }

    public Integer getCharCount() {
        return charCount;
    }

    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }

    public String getChIndex() {
        return chIndex;
    }

    public void setChIndex(String chIndex) {
        this.chIndex = chIndex;
    }

    public Integer getLineCount() {
        return lineCount;
    }

    public void setLineCount(Integer lineCount) {
        this.lineCount = lineCount;
    }

    public Integer getHeightPx() {
        return heightPx;
    }

    public void setHeightPx(Integer heightPx) {
        this.heightPx = heightPx;
    }

    public Integer getWidthPx() {
        return widthPx;
    }

    public void setWidthPx(Integer widthPx) {
        this.widthPx = widthPx;
    }

    public Integer getHeightGb() {
        return heightGb;
    }

    public void setHeightGb(Integer heightGb) {
        this.heightGb = heightGb;
    }

    public Integer getWidthGb() {
        return widthGb;
    }

    public void setWidthGb(Integer widthGb) {
        this.widthGb = widthGb;
    }

    public Integer getPlateMinH() {
        return plateMinH;
    }

    public void setPlateMinH(Integer plateMinH) {
        this.plateMinH = plateMinH;
    }

    public Integer getPlateMaxH() {
        return plateMaxH;
    }

    public void setPlateMaxH(Integer plateMaxH) {
        this.plateMaxH = plateMaxH;
    }

    public Integer getCharMinH() {
        return charMinH;
    }

    public void setCharMinH(Integer charMinH) {
        this.charMinH = charMinH;
    }

    public Integer getCharMaxH() {
        return charMaxH;
    }

    public void setCharMaxH(Integer charMaxH) {
        this.charMaxH = charMaxH;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    private static final long serialVersionUID = 1L;
}