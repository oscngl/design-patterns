package com.oscngl.design.patterns.factory;

class ExcelExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "EXCEL: " + content;
    }

}
