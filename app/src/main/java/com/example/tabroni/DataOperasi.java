package com.example.tabroni;

public class DataOperasi {
    String name, desc, late,logo,develover,web,source;

    public DataOperasi(String name, String desc, String late, String logo, String develover, String web, String source) {
        this.name = name;
        this.desc = desc;
        this.late = late;
        this.logo = logo;
        this.develover = develover;
        this.web = web;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getLate() {
        return late;
    }

    public String getLogo() {
        return logo;
    }

    public String getDevelover() {
        return develover;
    }

    public String getWeb() {
        return web;
    }

    public String getSource() {
        return source;
    }
}

