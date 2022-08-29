package com.oscngl.design.patterns.factory;

public class FileExporterFactory {

    public static FileExporter getInstance(FileType fileType) {
        return switch (fileType) {
            case PDF -> new PdfExporter();
            case EXCEL -> new ExcelExporter();
        };
    }

    public enum FileType {
        PDF,
        EXCEL
    }

}
