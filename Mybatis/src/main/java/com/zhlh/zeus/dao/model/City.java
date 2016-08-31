package com.zhlh.zeus.dao.model;

public class City extends BaseModel {
    private Integer id;

    private String regionCode;

    private String regionName;

    private String code;

    private String cityLevel;

    private String shortNameSpell;

    private String name;

    private String provinceShortName;

    private String supCityCode;

    private String shortName;

    private String licenseInfo;

    private String startLicense;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(String cityLevel) {
        this.cityLevel = cityLevel == null ? null : cityLevel.trim();
    }

    public String getShortNameSpell() {
        return shortNameSpell;
    }

    public void setShortNameSpell(String shortNameSpell) {
        this.shortNameSpell = shortNameSpell == null ? null : shortNameSpell.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProvinceShortName() {
        return provinceShortName;
    }

    public void setProvinceShortName(String provinceShortName) {
        this.provinceShortName = provinceShortName == null ? null : provinceShortName.trim();
    }

    public String getSupCityCode() {
        return supCityCode;
    }

    public void setSupCityCode(String supCityCode) {
        this.supCityCode = supCityCode == null ? null : supCityCode.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getLicenseInfo() {
        return licenseInfo;
    }

    public void setLicenseInfo(String licenseInfo) {
        this.licenseInfo = licenseInfo == null ? null : licenseInfo.trim();
    }

    public String getStartLicense() {
        return startLicense;
    }

    public void setStartLicense(String startLicense) {
        this.startLicense = startLicense == null ? null : startLicense.trim();
    }
}