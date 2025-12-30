package io.ReportWriter;

import io.Formatter.Formatter;
import io.Formatter.HtmlFormatter;
import io.Writer.HtmlWriter;
import io.Writer.Writer;

public class HtmlReportWriter extends ReportWriter {
    @Override
    protected Writer createWriter(Formatter formatter) {
        return new HtmlWriter(formatter);
    }

    @Override
    protected Formatter createFormatter() {
        return new HtmlFormatter();
    }

    @Override
    protected String createReportType() {
        return "HTML";
    }
}
