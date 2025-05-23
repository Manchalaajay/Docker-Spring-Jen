/*
 * package com.finsol.service;
 * 
 * import java.io.ByteArrayOutputStream; import java.io.FileOutputStream; import
 * java.io.OutputStream; import java.util.ArrayList; import java.util.Arrays;
 * import java.util.List; import java.util.stream.Stream;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.itextpdf.kernel.pdf.PdfDocument; import
 * com.itextpdf.kernel.pdf.PdfWriter; import com.itextpdf.layout.Document;
 * import com.itextpdf.layout.element.AreaBreak; import
 * com.itextpdf.layout.element.Cell; import
 * com.itextpdf.layout.element.Paragraph; import
 * com.itextpdf.layout.element.Table; import
 * com.itextpdf.layout.properties.UnitValue;
 * 
 * @Service public class PdfReportService {
 * 
 * public void generateMultipleUsersPdf(List<Long> userIds, OutputStream
 * outputStream) throws Exception { List<User> users = getUsersByIds(userIds);
 * 
 * ByteArrayOutputStream pdfOut = new ByteArrayOutputStream(); PdfWriter writer
 * = new PdfWriter(pdfOut); PdfDocument pdfDoc = new PdfDocument(writer);
 * Document doc = new Document(pdfDoc);
 * 
 * doc.add(new Paragraph("TDS Salary Summary Report")
 * .setFontSize(20).setBold()); doc.add(new
 * Paragraph("Financial Year 2023–2024") .setFontSize(14));
 * 
 * 
 * for (User user : users) { List<SalaryDetail> salaryDetails =
 * getSalaryForUser(user.getId());
 * 
 * doc.add(new Paragraph("Employee: " +
 * user.getFullName()).setFontSize(16).setBold()); doc.add(new
 * Paragraph("Employee Code: " + user.getEmployeeCode())); doc.add(new
 * Paragraph("Designation: " + user.getDesignation())); doc.add(new
 * Paragraph("\n"));
 * 
 * Table table = new Table(new float[]{2, 2, 2, 2, 2});
 * table.setWidth(UnitValue.createPercentValue(100)); Stream.of("Month",
 * "Gross Salary", "Net Income", "Tax Paid", "Balance") .forEach(col ->
 * table.addHeaderCell(new Cell().add(new Paragraph(col).setBold())));
 * 
 * double totalGross = 0, totalNet = 0, totalTax = 0, totalBalance = 0;
 * 
 * for (SalaryDetail s : salaryDetails) { table.addCell(new
 * Paragraph(s.getMonth())); table.addCell(new
 * Paragraph(String.valueOf(s.getGrossSalary()))); table.addCell(new
 * Paragraph(String.valueOf(s.getNetIncome()))); table.addCell(new
 * Paragraph(String.valueOf(s.getTaxPaid()))); table.addCell(new
 * Paragraph(String.valueOf(s.getBalance())));
 * 
 * totalGross += s.getGrossSalary(); totalNet += s.getNetIncome(); totalTax +=
 * s.getTaxPaid(); totalBalance += s.getBalance(); }
 * 
 * // Total row table.addCell(new Cell().add(new Paragraph("Total").setBold()));
 * table.addCell(new Paragraph(String.format("%.2f", totalGross)).setBold());
 * table.addCell(new Paragraph(String.format("%.2f", totalNet)).setBold());
 * table.addCell(new Paragraph(String.format("%.2f", totalTax)).setBold());
 * table.addCell(new Paragraph(String.format("%.2f", totalBalance)).setBold());
 * 
 * doc.add(table); doc.add(new AreaBreak()); }
 * 
 * doc.close(); outputStream.write(pdfOut.toByteArray()); }
 * 
 * // Mock data private List<User> getUsersByIds(List<Long> userIds) { return
 * Arrays.asList( new User(1L, "Rahul Sharma", "EMP101", "Developer"), new
 * User(2L, "Anita Roy", "EMP102", "Manager") ); }
 * 
 * private List<SalaryDetail> getSalaryForUser(Long userId) { String[] months =
 * {"Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan", "Feb",
 * "Mar"}; List<SalaryDetail> list = new ArrayList<>(); for (String month :
 * months) { list.add(new SalaryDetail(month, 60000 + userId * 1000, 50000 +
 * userId * 800, 8000 + userId * 100, 2000 + userId * 50)); } return list; }
 * 
 * // Run manually for test public static void main(String[] args) throws
 * Exception { OutputStream out = new FileOutputStream("output.pdf"); new
 * PdfReportService().generateMultipleUsersPdf(Arrays.asList(1L, 2L), out);
 * out.close(); System.out.println("PDF generated: output.pdf"); }
 * 
 * // Models static class User { private Long id; private String fullName;
 * private String employeeCode; private String designation;
 * 
 * public User(Long id, String fullName, String employeeCode, String
 * designation) { this.id = id; this.fullName = fullName; this.employeeCode =
 * employeeCode; this.designation = designation; }
 * 
 * public Long getId() { return id; } public String getFullName() { return
 * fullName; } public String getEmployeeCode() { return employeeCode; } public
 * String getDesignation() { return designation; } }
 * 
 * static class SalaryDetail { private String month; private double grossSalary;
 * private double netIncome; private double taxPaid; private double balance;
 * 
 * public SalaryDetail(String month, double grossSalary, double netIncome,
 * double taxPaid, double balance) { this.month = month; this.grossSalary =
 * grossSalary; this.netIncome = netIncome; this.taxPaid = taxPaid; this.balance
 * = balance; }
 * 
 * public String getMonth() { return month; } public double getGrossSalary() {
 * return grossSalary; } public double getNetIncome() { return netIncome; }
 * public double getTaxPaid() { return taxPaid; } public double getBalance() {
 * return balance; } } }
 */