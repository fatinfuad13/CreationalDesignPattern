package io.Writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

import io.Formatter.Formatter;
import model.Expense;
import service.Summarizer;

public interface Writer {
    void writeHeader(BufferedWriter var1) throws IOException;
    void writeFooter(BufferedWriter writer) throws IOException;

    void writeMonthlySummary(BufferedWriter writer, Summarizer summarizer) throws IOException;
    void writeCategoryBreakdown(BufferedWriter writer, Summarizer summarizer) throws IOException;
    void writeGrandTotal(BufferedWriter writer, Summarizer summarizer) throws IOException;
    void writeRecentEntries(BufferedWriter writer, List<Expense> expenses) throws IOException;

}
