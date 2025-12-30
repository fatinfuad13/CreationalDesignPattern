package io.Formatter;

import java.time.LocalDate;
import java.time.YearMonth;

public interface Formatter {
    String formatDate(LocalDate date);
    String formatMonth(YearMonth month);
    String formatAmount(double amount);
}
