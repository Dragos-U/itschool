package org.session11.onlinepractice.datatransformationsystem;

import java.util.List;

class PDFReport extends Report implements PDFExportable {

    public PDFReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportToPdf() {

    }
}
