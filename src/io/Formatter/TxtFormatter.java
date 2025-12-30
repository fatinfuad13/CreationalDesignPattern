package io.Formatter;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class TxtFormatter implements Formatter {
    private final DateTimeFormatter dateFormatter;
    private final DateTimeFormatter monthFormatter;

    public TxtFormatter() {
        this.dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.monthFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
    }

    @Override
    public String formatDate(LocalDate date) {
        return date.format(dateFormatter);
    }

    @Override
    public String formatMonth(YearMonth month) {
        return month.format(monthFormatter);
    }

    @Override
    public String formatAmount(double amount) {
        return String.format("%.2f", amount);
    }
}
