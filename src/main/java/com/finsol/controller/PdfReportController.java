/*
 * package com.finsol.controller;
 * 
 * import java.io.ByteArrayOutputStream; import java.util.ArrayList; import
 * java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.MediaType; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.finsol.service.PdfReportService;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/reports") public class PdfReportController {
 * 
 * @Autowired private PdfReportService pdfReportService;
 * 
 * @GetMapping("/tds-summary") public ResponseEntity<byte[]>
 * generateTdsSummaryReport( ) {
 * 
 * try (ByteArrayOutputStream out = new ByteArrayOutputStream()) { List<Long>
 * userIds =new ArrayList<>(); // Generate the PDF
 * pdfReportService.generateMultipleUsersPdf(userIds,out);
 * 
 * byte[] pdfBytes = out.toByteArray();
 * 
 * HttpHeaders headers = new HttpHeaders();
 * headers.setContentType(MediaType.APPLICATION_PDF);
 * headers.setContentDispositionFormData("attachment",
 * "TDS_Salary_Summary_Report.pdf");
 * 
 * return ResponseEntity .ok() .headers(headers) .body(pdfBytes);
 * 
 * } catch (Exception e) { e.printStackTrace(); return
 * ResponseEntity.internalServerError().build(); } } }
 */