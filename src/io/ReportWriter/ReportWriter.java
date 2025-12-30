package io.ReportWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import io.Formatter.Formatter;
import io.Writer.Writer;
import model.Expense;
import service.ExpenseRepository;
import service.Summarizer;

public abstract class ReportWriter {
    protected abstract Writer createWriter(Formatter formatter);
    protected abstract Formatter createFormatter();
    protected abstract String createReportType();

    public void writeReport(String filePath, ExpenseRepository repository) throws IOException {

        System.out.println("Using report generator");
        
        List<Expense> allExpenses = repository.findAll();
        Summarizer summarizer = new Summarizer(allExpenses);

        
        Formatter reportFormatter = createFormatter();
        Writer reportWriter = createWriter(reportFormatter);
        String reportType = createReportType();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            reportWriter.writeHeader(writer);
            reportWriter.writeMonthlySummary(writer, summarizer);
            reportWriter.writeCategoryBreakdown(writer, summarizer);
            reportWriter.writeGrandTotal(writer, summarizer);
            reportWriter.writeRecentEntries(writer, allExpenses);
            reportWriter.writeFooter(writer);
        }

        System.out.println(reportType + " report written to: " + filePath);
    }
    
}
