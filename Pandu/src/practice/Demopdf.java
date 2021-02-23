package practice;
import java.io.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Demopdf {
	public static void main(String[] args) throws FileNotFoundException {
		Document doc = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Demo.pdf"));
			doc.open();
			doc.add(new Paragraph("Hai this is Demo pdf Created by Sitaramaraju"));
			doc.close();
			writer.close();
		}
		catch(DocumentException e) {
			e.printStackTrace();
		}
	}

}