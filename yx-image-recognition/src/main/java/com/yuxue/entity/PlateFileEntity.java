package com.yuxue.entity;

import java.io.Serializable;
import java.util.Vector;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_plate_file
 * @author yuxue
 * 2020-04-30 11:04:47.169
 */
@Data
@NoArgsConstructor
public class PlateFileEntity implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * fileName
     */
    private String fileName;

    /**
     * filePath
     */
    private String filePath;

    /**
     * fileType
     */
    private String fileType;

    /**
     * fileLength
     */
    private Integer fileLength;

    /**
     * plate
     */
    private String plate;

    /**
     * plateColor
     */
    private String plateColor;

    /**
     * lastRecoTime
     */
    private String lastRecoTime;

    /**
     * tempPath
     */
    private String tempPath;

    /**
     * recoPlate
     */
    private String recoPlate;

    /**
     * recoColor
     */
    private String recoColor;

    /**
     * recoCorrect
     * 0未识别 1正确 2错误 3未检测到车牌
     */
    private Integer recoCorrect;
    
    private Vector<String> debugFiles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getFileLength() {
        return fileLength;
    }

    public void setFileLength(Integer fileLength) {
        this.fileLength = fileLength;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public String getLastRecoTime() {
        return lastRecoTime;
    }

    public void setLastRecoTime(String lastRecoTime) {
        this.lastRecoTime = lastRecoTime;
    }

    public String getTempPath() {
        return tempPath;
    }

    public void setTempPath(String tempPath) {
        this.tempPath = tempPath;
    }

    public String getRecoPlate() {
        return recoPlate;
    }

    public void setRecoPlate(String recoPlate) {
        this.recoPlate = recoPlate;
    }

    public String getRecoColor() {
        return recoColor;
    }

    public void setRecoColor(String recoColor) {
        this.recoColor = recoColor;
    }

    public Integer getRecoCorrect() {
        return recoCorrect;
    }

    public void setRecoCorrect(Integer recoCorrect) {
        this.recoCorrect = recoCorrect;
    }

    public Vector<String> getDebugFiles() {
        return debugFiles;
    }

    public void setDebugFiles(Vector<String> debugFiles) {
        this.debugFiles = debugFiles;
    }

    private static final long serialVersionUID = 1L;
}