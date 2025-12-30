package io.ReportWriter;

import io.Formatter.Formatter;
import io.Formatter.TxtFormatter;
import io.Writer.TxtWriter;
import io.Writer.Writer;

public class TxtReportWriter extends ReportWriter{
    @Override
    protected Writer createWriter(Formatter formatter) {
        return new TxtWriter(formatter);
    }

    @Override
    protected Formatter createFormatter() {
        return new TxtFormatter();
    }

    @Override
    protected String createReportType() {
        return "Text";
    }
}
