package org.session11.onlinepractice.datatransformationsystem;

import java.util.List;

class CSVReport extends Report implements CSVExportable {

    public CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportToCSV() {

    }
}
